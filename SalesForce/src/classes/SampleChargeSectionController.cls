public with sharing class SampleChargeSectionController{
       
    public ID myquoteid { get; set; }
    public zqu.zChargeGroup currentChargeGroup 
    { 
    	get; 
    	set { 
    		System.debug('setting current charge group');
    		this.currentChargeGroup = value; 
    		}
	}
	
    public List<zqu.zChargeGroup> chargeGroups { get; set; }
   
    public void discountChange() {
        List<zqu.zCharge> charges = zqu.zQuoteUtil.calculateChargesOnDiscountChange(currentChargeGroup.zCharges);
        currentChargeGroup.zCharges = charges;
    }
    public void quntityChange() {
        List<zqu.zCharge> charges = zqu.zQuoteUtil.calculateChargesOnQuantityChange(currentChargeGroup.zCharges);
        currentChargeGroup.zCharges = charges;
    }
    public void effectiveChange() {
        List<zqu.zCharge> charges = zqu.zQuoteUtil.calculateChargesOnEffectivePriceChange(currentChargeGroup.zCharges);
        currentChargeGroup.zCharges = charges;
    }
    public void totalChange() {
        List<zqu.zCharge> charges = zqu.zQuoteUtil.calculateChargesOnTotalChange(currentChargeGroup.zCharges);
        currentChargeGroup.zCharges = charges;
    }
    public List<WrapperForCustomField> listWrappedCharges {
        get{
        		     System.debug('get list wrapped charges');
                //If the wrapper class list is empty, populate it with zCharges list
                if ( listWrappedCharges == null ){
                	        		     System.debug('list wrapped charges is null');
                        if (currentChargeGroup != null && currentChargeGroup.zCharges.size() > 0){
                        		     System.debug('current charge group has items');
                                listWrappedCharges = new List<WrapperForCustomField>();
                                for ( zqu.zCharge zc : currentChargeGroup.zCharges ){
                                        listWrappedCharges.add(GetWrapper(zc));
                                }
                        }      
                //If the wrapper class list is not empty, update it with the new calculated values      
                }else{
                	System.debug('list wrapped charges not null');
                        for ( WrapperForCustomField wc : listWrappedCharges ){
                                for ( zqu.zCharge zc : currentChargeGroup.zCharges ){
                                        if ( wc.wCharge.PRODUCT_RATE_PLAN_CHARGE_SFDC_ID  == zc.PRODUCT_RATE_PLAN_CHARGE_SFDC_ID ){
                                                System.debug('setting charge');
                                                wc.wCharge = zc;
                                                System.debug('perpetual is ' + wc.quoteCharge.Perpetual__c);
                                        }
                                }
                        }
                }
                return listWrappedCharges;
        } set;}
       
       private WrapperForCustomField GetWrapper(zqu.zCharge zc){
       	     System.debug('get wrapper');
       	WrapperForCustomField wc = new WrapperForCustomField();
       	wc.wCharge = zc;
       	wc.quoteCharge = new zqu__QuoteCharge__c();
       	wc.quoteCharge.Perpetual__c = 'Yes';
       	return wc;
       }
       
   public PageReference saveAndNewCharges(){
       	saveCharges();
       	PageReference pr = new PageReference('/apex/CustomProductSelector?new=true&id=' + this.myquoteid);
       	pr.setRedirect(true);
       	return pr;
       }
       
    public PageReference saveCharges(){
        //Use global method to add zCharges with the Quote.
        final zqu.ZChargeGroup chargeGroup;
        System.debug('save charges');
        if( listWrappedCharges != null && listWrappedCharges.size() > 0 ){
                 try {
                           chargeGroup = zqu.ZQuoteUtil.addChargeGroup(this.currentChargeGroup);
                     } catch(zqu.ZQException e) {
                            System.debug('error in add charge group ' + e.getMessage());
                            ApexPages.Message msg = new ApexPages.Message(ApexPages.Severity.ERROR, e.getMessage());
                            ApexPages.addMessage(msg);
                            return null;
                    }
                    //Save the custom field value given in UI
                    Set<ID> setOfQCIds = new Set<ID>();
                    for ( zqu.zCharge zc : chargeGroup.zCharges ){
                        setOfQCIds.add(zc.Id);
                    }
                    //Query the just inserted QuoteCharges via global method and update the QuoteCharge records with custom field values.
                    List<zqu__QuoteCharge__c> listOfJustSavedQCs = [select Perpetual__c,zqu__ProductRatePlanCharge__c from zqu__QuoteCharge__c where Id in :setOfQCIds];
                    List<zqu__QuoteCharge__c> toBeUpdatedList = new List<zqu__QuoteCharge__c>();
                System.debug('wrapped charges: ' + listWrappedCharges.size());
                for ( WrapperForCustomField wc : listWrappedCharges ){
                        System.debug('listofjustsavedqcs: ' + listOfJustSavedQCs.size());
                        for ( zqu__QuoteCharge__c qc : listOfJustSavedQCs ){
                        		System.debug('wc.wCharge.PRODUCT_RATE_PLAN_CHARGE_SFDC_ID:  ' + wc.wCharge.PRODUCT_RATE_PLAN_CHARGE_SFDC_ID);
                                System.debug('zqu__ProductRatePlanCharge__c:  ' + qc.zqu__ProductRatePlanCharge__c);
                                boolean isSame = wc.wCharge.PRODUCT_RATE_PLAN_CHARGE_SFDC_ID == qc.zqu__ProductRatePlanCharge__c;
                                System.debug('isSame: ' + isSame);
                                if (isSame){
                                		System.debug('current quote id is ' + qc.Id);
                                		System.debug('setting perpetual to ' + wc.quoteCharge.Perpetual__c);
                                        qc.Perpetual__c = wc.quoteCharge.Perpetual__c;
                                        toBeUpdatedList.add(qc);
                                }
                        }
                }
                try {
                            update toBeUpdatedList;
                    } catch(Exception e) {
                            ApexPages.Message msg = new ApexPages.Message(ApexPages.Severity.ERROR, e.getMessage());
                            ApexPages.addMessage(msg);
                            return null;
                    }
        }
        Repository repo = new Repository();
        zqu__Quote__c q = repo.getQuote(this.myquoteid);
        GetLegacyProductsForQuoteAction getLegacy = new GetLegacyProductsForQuoteAction();
    	boolean hasLegacy = getLegacy.Execute(q);
    	System.debug('has legacy products to port?: ' + hasLegacy);
        if(!hasLegacy){
        	return new PageReference('/'+this.myquoteid);
        }
        string url =  '/apex/AddLegacyProduct?id=' + this.myquoteid;
		System.debug('transitioning to ' + url);
		PageReference r = new PageReference(url);
		r.setredirect(true);
    	return r;
        
        
    }
    //Wrapper class for holding your custom field value in QuoteCharge and global data structure class zCharge
    public class WrapperForCustomField{
        public zqu.zCharge wCharge { get; set; }
        public zqu__QuoteCharge__c quoteCharge {get;set;}
    }
}