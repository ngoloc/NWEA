public with sharing virtual class CustomProductSelectorController{
       
    public List<zqu.zChargeGroup> chargeGroupList           {get; set;}
    public Boolean   editMode                               {get; set;}
    public String    currentChargeGroupId                   {get; set;}
    public zqu.zChargeGroup currentChargeGroup              {get; set;}
    private final zqu__Quote__c quote                       {get; set;}
    private List<ID> productIDs;
    private List<ID> ratePlanIDs;
   
    // Table data share
    public zqu.zComponentDataShare productDataShare         {get; set;}
    public zqu.zComponentDataShare rateplanDataShare        {get; set;}
    public zqu.zChargeGroup chargeGroup                     {get; set;}
    public Boolean selectNewProductViewMode                 {get; private set;}
    public Boolean initFailed                               {get; private set;}

    public final static Integer PRODUCT_TABLE_PAGE_SIZE = 10;
    
    public final static Integer RATEPLAN_TABLE_PAGE_SIZE = 8;
   
   public string exitLocation = 'legacyproducts';
   
   private Repository repo;
   
     public String searchString {
    get;
    set;
  }
   
      public String searchStringRatePlan {
    get;
    set;
  }
   
    public CustomProductSelectorController theController{
        get{
            return this;
        }
    }
   
    private String productFilterFragment = ' ';
  private String rateplanFilterFragment = ' ';
   
    private List < Id > getFilteredRatePlanIds(Id zProductId, String zCurrency, Date zStartDate) {
    AggregateResult[] groupedResults = [SELECT zqu__ProductRatePlanCharge__r.zqu__ProductRatePlan__r.Id
    FROM zqu__ProductRatePlanChargeTier__c
    WHERE zqu__Currency__c = : zCurrency
    AND zqu__ProductRatePlanCharge__r.zqu__ProductRatePlan__r.zqu__zProduct__r.Id = : zProductID
    GROUP BY zqu__ProductRatePlanCharge__r.zqu__ProductRatePlan__r.Id];
    List < ID > ratePlanIds = new List < ID > ();
    for (AggregateResult gr: groupedResults) {
      ratePlanIds.add(gr.Id);
    }

    String baseSoql = 'SELECT Id FROM zqu__ProductRatePlan__c WHERE Id IN :ratePlanIds AND zqu__Deleted__c = false AND zqu__EffectiveStartDate__c <= :zStartDate AND zqu__EffectiveEndDate__c >= :zStartDate ';
    baseSoql += rateplanFilterFragment;
    baseSoql += ' ORDER BY Name ASC LIMIT 10000 ';

    List < zqu__ProductRatePlan__c > ratePlans = Database.query(baseSoql);
    ratePlanIds = new List < Id > ();
    for (zqu__ProductRatePlan__c ratePlan: ratePlans) {
      ratePlanIds.add(ratePlan.Id);
    }

    return ratePlanIds;
  }
   
   
     private List < Id > getFilteredZProductIds(String zCurrency, Date zStartDate) {
    List < zqu__ZProduct__c > products;
    AggregateResult[] groupedResults = [SELECT zqu__ProductRatePlanCharge__r.zqu__ProductRatePlan__r.zqu__zProduct__r.Id
    FROM zqu__ProductRatePlanChargeTier__c
    WHERE zqu__Currency__c = : zCurrency
    AND zqu__Deleted__c = false
    GROUP BY zqu__ProductRatePlanCharge__r.zqu__ProductRatePlan__r.zqu__zProduct__r.Id];

    List < Id > productIds = new List < Id > ();
    for (AggregateResult result: groupedResults) {
      productIds.add(result.Id);
    }

    String baseSoql = 'SELECT Id FROM zqu__ZProduct__c WHERE Id IN :productIds AND zqu__Deleted__c = false AND zqu__EffectiveStartDate__c <= :zStartDate AND zqu__EffectiveEndDate__c >= :zStartDate ';
    baseSoql += productFilterFragment;
    baseSoql += ' ORDER BY Name ASC LIMIT 10000 ';

    products = Database.query(baseSoql);
    productIds = new List < Id > ();
    for (zqu__zProduct__c product: products) {
      productIds.add(product.Id);
    }

    return productIds;
  }
   
     public void refreshProducts() {
    this.productDataShare = new zqu.ZComponentDataShare();
    this.productIDs = this.getFilteredZProductIds(quote.zqu__Currency__c, quote.zqu__StartDate__c);
    if (this.searchString != null && this.searchString != '') {
      this.productIds = searchProducts(this.productIDs, quote.zqu__StartDate__c);
    }
    this.productDataShare.dataObject = zqu.zQuoteUtil.getProductSetController(this.productIDs, this.getProductDisplayFields(), PRODUCT_TABLE_PAGE_SIZE);
  }
  
    //    List<ID> rateplanIDs = zqu.zQuoteUtil.getRatePlanIds(productId, quote.zqu__Currency__c, quote.zqu__StartDate__c);
          //              this.rateplanDataShare.dataObject = zqu.zQuoteUtil.getRatePlanSetController(ratePlanIDs, getRatePlanDisplayFields(), RATEPLAN_TABLE_PAGE_SIZE);
    public void refreshRatePlans() {
    this.rateplanDataShare = new zqu.ZComponentDataShare();
    final String productId = (String) selectedProductShare.dataObject;
    this.ratePlanIDs = this.getFilteredRatePlanIds(productId, quote.zqu__Currency__c, quote.zqu__StartDate__c);
   System.debug('search string is ' + this.searchStringRatePlan);
    if (this.searchStringRatePlan != null && this.searchStringRatePlan != '') {
      this.ratePlanIDs = searchRatePlans(this.ratePlanIDs, quote.zqu__StartDate__c);
    }
    this.rateplanDataShare.dataObject = zqu.zQuoteUtil.getRatePlanSetController(this.ratePlanIDs, this.getRatePlanDisplayFields(), RATEPLAN_TABLE_PAGE_SIZE);
  }
  
   
     public List < Id > searchProducts(List < Id > prodids, Date zqStartDate) {
    List < Id > productIds = new List < Id > ();
    try {
      String searchQuery = '*' + searchString + '*';
      searchQuery = 'FIND \'' + searchQuery + '\' IN ALL FIELDS RETURNING zqu__zProduct__c(Id, Name, zqu__SKU__c, zqu__Description__c, zqu__ZuoraId__c WHERE id in :prodids AND zqu__Deleted__c = false AND zqu__EffectiveStartDate__c <= :zQStartDate AND zqu__EffectiveEndDate__c >= :zQStartDate ORDER BY Name ASC)';
      List < SObject > results = search.query(searchQuery)[0];
      for (SObject sobj: results) {
        productIds.add(sobj.Id);
      }
    } catch (Exception e) {
      ApexPages.Message msg = new ApexPages.Message(ApexPages.Severity.ERROR, e.getMessage());
      ApexPages.addMessage(msg);
    }
    return productIds;
  }
  
     public List < Id > searchRatePlans(List < Id > ratePlanids, Date zqStartDate) {
     	
    List < Id > rpIds = new List < Id > ();
    //try {
   //   String searchQuery = '*' + searchStringRatePlan + '*';
  //    searchQuery = 'FIND \'' + searchQuery + '\' IN ALL FIELDS RETURNING zqu__ProductRatePlan__c(Id, Name, zqu__Description__c, zqu__ZuoraId__c WHERE id in :ratePlanids AND zqu__Deleted__c = false AND zqu__EffectiveStartDate__c <= :zQStartDate AND zqu__EffectiveEndDate__c >= :zQStartDate ORDER BY Name ASC)';
  //    List < SObject > results = search.query(searchQuery)[0];
  //    for (SObject sobj: results) {
   //     rpIds.add(sobj.Id);
   //   }
  //  } catch (Exception e) {
  //    ApexPages.Message msg = new ApexPages.Message(ApexPages.Severity.ERROR, e.getMessage());
  //    ApexPages.addMessage(msg);
 //   }
 
 List<zqu__ProductRatePlan__c> ratePlans = [SELECT Id, Name FROM zqu__ProductRatePlan__c WHERE Id in :ratePlanIds];
 System.debug('filtering rate plans ' + ratePlans.size());
 for(zqu__ProductRatePlan__c rp : ratePlans){
 	if(rp.Name.indexOf(searchStringRatePlan) != -1){
 		rpIds.add(rp.Id);
 	}
 }
 
    return rpIds;
  }
   
   public void cancelRatePlanSearch(){
   searchStringRatePlan = '';
   refreshRatePlans();
   }
   
    public CustomProductSelectorController(ApexPages.StandardController controller) {
        initFailed = true;
        this.repo = new Repository();
        final String quoteId = controller.getId();
       
        if (null == quoteId || '' == quoteId) {
            appendErrorMessage('Need to specify the id of quote.');
            return;
        }  
        
        this.quote = this.repo.getQuote(quoteId);
       
        if(this.quote == null){
            appendErrorMessage('Invalid quote id.');
            return ;
        }
        try {        
            this.chargeGroupList = zqu.zQuoteUtil.getChargeGroups(this.quote.Id);
            this.editMode = false;
            this.selectNewProductViewMode = !(this.chargeGroupList.size() > 0);
            this.productDataShare = new zqu.zComponentDataShare();
                 
            this.productIDs = zqu.zQuoteUtil.getZProductIds(quote.zqu__Currency__c, quote.zqu__StartDate__c);        
            this.productDataShare.dataObject = zqu.ZQuoteUtil.getProductSetController(this.productIDs, this.getProductDisplayFields(), PRODUCT_TABLE_PAGE_SIZE);
        } catch(zqu.ZQException e) {
            appendErrorMessage(e.getMessage());
            return;
        }
        //
        //your setcontroller
        //this.productDataShare.dataObject = yourproductsetcontoller();
        //
        this.rateplanDataShare = new zqu.zComponentDataShare();
        this.selectedProductShare = new zqu.zComponentDataShare();
        this.selectedRatePlanShare = new zqu.zComponentDataShare();
        this.initFailed = false;
        
        string isnew = ApexPages.currentPage().getParameters().get('new');
        
        if(isnew != null && isnew == 'true'){
        	toSelectNewProductsView();
    	}
        
    }
    public PageReference saveChargeGroup(){
        System.debug('save charge group');
        if(null != this.quote && null != this.quote.Id){
            zqu.zChargeGroup updatedChargeGroup = null;
            try {
                updatedChargeGroup = zqu.zQuoteUtil.updateChargeGroup(this.currentChargeGroup);    
            } catch (zqu.ZQException e) {
                ApexPages.Message msg = new ApexPages.Message(ApexPages.Severity.ERROR, e.getMessage());
                ApexPages.addMessage(msg);
                return null;
            }
            for(Integer i =0 ; i < this.chargeGroupList.size() ; i++){
                zqu.zChargeGroup zchargeGrp = this.chargeGroupList.get(i);
                if(updatedChargeGroup.groupId == zchargeGrp.groupId){
                    this.chargeGroupList.set(i, updatedChargeGroup);
                }
            }
        }
        this.editMode = false;
        return new PageReference('/' + this.quote.Id);
    }
    
    public void cancelEditing(){
        this.editMode = false;
        this.selectNewProductViewMode = false;
    }
    
    public void editChargeGroup(){
        if(this.currentChargeGroupId != null && this.quote.Id != null){
            for(Integer i =0 ; i < this.chargeGroupList.size() ; i++){
                zqu.zChargeGroup zchargeGrp = this.chargeGroupList.get(i);
                if(this.currentChargeGroupId == zchargeGrp.groupId){
                    this.currentChargeGroup = zchargeGrp.deepclone();
                    break;
                }
            }
            this.editMode = true;
        }
    }
    public PageReference deleteChargeGroup(){
        if(this.currentChargeGroupId != null && this.quote.Id != null){
            for(Integer i =0 ; i < this.chargeGroupList.size() ; i++){
                zqu.zChargeGroup zchargeGrp = this.chargeGroupList.get(i);
                if(this.currentChargeGroupId == zchargeGrp.groupId){
                    this.currentChargeGroup = zchargeGrp;
                    zqu.zChargeGroup deletedChargeGroup = null;
                    try {
                        deletedChargeGroup = zqu.ZQuoteUtil.deleteChargeGroup(zchargeGrp);
                    } catch(zqu.ZQException e) {
                        appendErrorMessage(e.getMessage());
                        return null;
                    }
                    if(deletedChargeGroup != null){
                        this.chargeGroupList.set(i, deletedChargeGroup);
                    }else{
                        this.chargeGroupList.remove(i);
                    }
                    break;
                }
            }
        }
        return null;
    }
    public zqu.zComponentDataShare selectedProductShare {
        get{
            //when select product happening, get the related rateplans
            if( null != selectedProductShare ) {
                if(selectedProductShare.dataObject != null && selectedProductShare.componentActionFlag){
                    final String productId = (String) selectedProductShare.dataObject;
                    //put your custom code here to retrieve the rateplan ids or the setcontroller for product rateplan
                    try {
                        List<ID> rateplanIDs = zqu.zQuoteUtil.getRatePlanIds(productId, quote.zqu__Currency__c, quote.zqu__StartDate__c);
                        this.rateplanDataShare.dataObject = zqu.zQuoteUtil.getRatePlanSetController(ratePlanIDs, getRatePlanDisplayFields(), RATEPLAN_TABLE_PAGE_SIZE);
                    } catch(zqu.ZQException e) {
                        appendErrorMessage(e.getMessage());
                        return null;
                    }
                    //need to disable the extra re-write to component controller here, will set to true from component action
                    selectedProductShare.componentActionFlag = false;
                    selectedRatePlanShare.dataObject = null;
                } else if (selectedProductShare.dataObject == null){
                    selectedRatePlanShare.dataObject = null;
                }
            }
            else {
                selectedProductShare = new zqu.zComponentDataShare();
            }
            return selectedProductShare;        
        }
        set;
    }
    public zqu.zComponentDataShare selectedRatePlanShare   {
        get{
            //when select rateplan happening, get the related chargegroup
            if(selectedRatePlanShare.dataObject != null && selectedRatePlanShare.componentActionFlag){
                final String rateplanId = (String) selectedRatePlanShare.dataObject;
                try {
                    this.chargeGroup= zqu.zQuoteUtil.getChargeGroup(quote.Id, ratePlanID);
                } catch(zqu.ZQException e) {
                    appendErrorMessage(e.getMessage());
                    return null;
                }
                //need to disable the extra re-write to component controller here, will set to true from component action
                selectedRatePlanShare.componentActionFlag = false;
            }
            return selectedRatePlanShare;
        }
        set;
    }  
    
    
    public PageReference addNewChargeGroupToQuote() {
        final zqu.ZChargeGroup chargeGroup;
        try {
            chargeGroup = zqu.ZQuoteUtil.addChargeGroup(this.chargeGroup);
        } catch(zqu.ZQException e) {
            ApexPages.Message msg = new ApexPages.Message(ApexPages.Severity.ERROR, e.getMessage());
            ApexPages.addMessage(msg);
            return null;
        }
        this.chargeGroupList.add(chargeGroup);
        this.selectNewProductViewMode = false;
        return null;
    }
    
    public void toSelectNewProductsView() {
        this.selectNewProductViewMode = true;
        this.rateplanDataShare = new zqu.zComponentDataShare();
        this.selectedProductShare = new zqu.zComponentDataShare();
        this.selectedRatePlanShare = new zqu.zComponentDataShare();
    }
    
    public String[] getProductDisplayFields() {
        return new String[] {'Name', 'zqu__Description__c'};
    }
    public String[] getRatePlanDisplayFields() {
        return new String[] {'Name', 'zqu__Description__c'};
    }
    public Boolean getIsRenderRatePlan(){
        return this.selectedProductShare.dataObject != null;
    }
    public Boolean getIsRenderChargeGroup(){
        return this.selectedRatePlanShare.dataObject != null;
    }
    public Boolean getNoMatchProduct() {
        return (null == this.productIDs || 0 == this.productIDs.size());
    }
    private static void appendErrorMessage(String message) {
        ApexPages.addMessage(new ApexPages.Message(ApexPages.Severity.ERROR, message));
    }  
}