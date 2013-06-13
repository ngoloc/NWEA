public with sharing class AddLegacyProductController {
    
    public List<zqu.zChargeGroup> chargeGroupList           {get; set;}
    public Boolean   editMode                               {get; set;}
    public String    currentChargeGroupId                   {get; set;}
    public zqu.zChargeGroup currentChargeGroup              {get; set;}
    private final zqu__Quote__c quote                       {get; set;}
    private final List<ID> productIDs;
    
    // Table data share
    public zqu.zComponentDataShare productDataShare         {get; set;}
    public zqu.zComponentDataShare rateplanDataShare        {get; set;}
    public zqu.zChargeGroup chargeGroup                     {get; set;}
    public Boolean selectNewProductViewMode                 {get; private set;}
    public Boolean initFailed                               {get; private set;}
 
    public final static Integer PRODUCT_TABLE_PAGE_SIZE = 2;
    public final static Integer RATEPLAN_TABLE_PAGE_SIZE = 2;
    
    public string getProductName(){
    	return productName;
    }
    
    private boolean leavenow;
    
     private zqu__ProductRatePlanCharge__c prpc; 
     private    zqu__ProductRatePlan__c prp;
        private zqu__ZProduct__c zp;
    
    public string productName;
    
    public PageReference checkleavenow()
    {
    	//disable legacy product
    	if(this.leavenow || true)
    	{
    		PageReference r = new PageReference('/' + this.quote.Id);
    		r.setredirect(true);
    		return r;
    	}
    	return null;
    }
    
    public PageReference cancel(){
		PageReference r = new PageReference('/' + this.quote.Id);
		r.setredirect(true);
		return r;
    }
    
    public AddLegacyProductController(ApexPages.StandardController controller) {
    	System.debug('in add legacy product controller');
    	Repository repo = new Repository();
        initFailed = true;
        final String quoteId = controller.getId();
        if (null == quoteId || '' == quoteId) {
            appendErrorMessage('Need to specify the id of quote.');
            return;
        } 
        List<zqu__Quote__c> quotelist = [SELECT Id, Name, zqu__Opportunity__r.Name, zqu__Opportunity__r.Account.Name, zqu__Opportunity__r.Account.Id,
                                                 zqu__RecordReadOnly__c, zqu__Currency__c, zqu__Status__c, zqu__StartDate__c, RecordTypeId
                                          FROM
                                              zqu__Quote__c
                                          WHERE
                                              Id = :quoteId LIMIT 1];
        
        if(1 != quotelist.size()){
            appendErrorMessage('Invalid quote id.');
            return ;
        }
        this.quote = quotelist[0];
        
        GetLegacyProductsForQuoteAction action = new GetLegacyProductsForQuoteAction();
        List<string> prpcs = action.ExecuteList(this.quote);
        
        string prpcId = null;
        
        List<string> existingRPC =  new List<string>();
        List<zqu.zChargeGroup> cgs = zqu.zQuoteUtil.getChargeGroups(this.quote.Id);
        for(zqu.zChargeGroup cg : cgs){
        	for(zqu.zCharge c : cg.zCharges){
        		System.debug('found existing rate plan charge id' + c.Id);
        		existingRPC.add(c.Id);
        	}
        }
        
        for(string legacyprpc : prpcs){
        	System.debug('looking for ' + legacyprpc);
        	boolean found = false;
        	for(string exisingrpc : existingRPC){
        		zqu__QuoteCharge__c qc = repo.getQuoteCharge(exisingrpc);
        		if(qc.zqu__ProductRatePlanCharge__c == legacyprpc){
        			found = true;
        		}
        	}
        	if(found == false){
        		prpcId = legacyprpc;
        	}
        }
        
        if(prpcId == null){
        leavenow = true;
        
        }else
        {
        	leavenow = false;
         
        this.prpc = repo.getProductRatePlanCharge(prpcId); 
        this.prp = repo.getProductRatePlan(prpc.zqu__ProductRatePlan__c);
        this.zp = repo.getZProduct(prp.zqu__ZProduct__c);
        this.productName = zp.Name;
        try {       
            this.chargeGroupList = new List<zqu.zChargeGroup>();
            this.editMode = false;
            this.selectNewProductViewMode = true;
            this.productDataShare = new zqu.zComponentDataShare();
            this.productIDs = new List<Id>();
            System.debug('product id: ' + zp.Id);
            this.productIds.add(prp.zqu__ZProduct__c);       
            this.productDataShare.dataObject = zqu.ZQuoteUtil.getProductSetController(this.productIDs, this.getProductDisplayFields(), PRODUCT_TABLE_PAGE_SIZE);
        } catch(zqu.ZQException e) {
            appendErrorMessage(e.getMessage());
            return;
        }
        
        //
        //their setcontroller
        //this.productDataShare.dataObject = yourproductsetcontoller();
        //
        
        this.rateplanDataShare = new zqu.zComponentDataShare();
        this.selectedProductShare = new zqu.zComponentDataShare();
        this.selectedRatePlanShare = new zqu.zComponentDataShare();
        this.initFailed = false;
        }
        
       
    }
    
    public PageReference saveCharges()
    {
    	System.debug('save charges');
    	return null;
    }
    
    public PageReference saveChargeGroup(){
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
        return null;
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
            System.debug('setting edit mode to true');
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
                        //List<ID> rateplanIDs = zqu.zQuoteUtil.getRatePlanIds(productId, quote.zqu__Currency__c, quote.zqu__StartDate__c);
                        List<ID> rateplanIDs = new List<ID>();
                        rateplanIDs.add(this.prp.Id);
                        this.rateplanDataShare.dataObject = zqu.zQuoteUtil.getRatePlanSetController(ratePlanIDs, getRatePlanDisplayFields(),
                        RATEPLAN_TABLE_PAGE_SIZE);
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
                
                GetLegacyProductsForQuoteAction action = new GetLegacyProductsForQuoteAction();
                 Map<string, OpportunityLineItem> mapzzz = action.ExecuteLineItems(this.quote);
                OpportunityLineItem oli = mapzzz.get(this.prpc.Id);
                  for(zqu.zCharge c : this.chargeGroup.zCharges){
                  	System.debug('zcharge id' + c.Id);
                  	System.debug('prpc id' + prpc.Id);
                  	if(c.Id == this.prpc.Id){
                  		c.QUANTITY = oli.quantity.toPlainString();
                  		c.EFFECTIVE_PRICE = oli.UnitPrice.toPlainString();
                  	}
                  }
                
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
    	System.debug('to select new products view');
        this.selectNewProductViewMode = true;
        this.rateplanDataShare = new zqu.zComponentDataShare();
        this.selectedProductShare = new zqu.zComponentDataShare();
        this.selectedRatePlanShare = new zqu.zComponentDataShare();
    }
    
    public String[] getProductDisplayFields() {
        return new String[] {'Id', 'Name', 'zqu__SKU__c', 'zqu__Description__c', 'zqu__ZuoraId__c'};
    }
    
    public String[] getRatePlanDisplayFields() {
        return new String[] {'Id', 'Name', 'zqu__Description__c', 'zqu__ZuoraId__c', 'zqu__EffectiveStartDate__c', 'zqu__EffectiveEndDate__c', 'zqu__ZProduct__c'};
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