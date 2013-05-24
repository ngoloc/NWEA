public with sharing class MigrateLegacyProductToQuoteAction {

	private Repository repo;
	
	public MigrateLegacyProductToQuoteAction(){
		this.repo = new Repository();
	}
	
	public void Execute(String opportunityLineItemId, String quoteId){
		OpportunityLineItem oli = this.repo.getOpportunityLineItem(opportunityLineItemId);
		
		PricebookEntry pbe = this.repo.getPricebookEntry(oli.PricebookEntryId);
		
		Product2 product = this.repo.getProduct(pbe.Product2Id);
		
		List<ZuoraBridge__c> bridges = this.repo.getBridgesByProduct(product.Id);

		
		for(ZuoraBridge__c bridge : bridges){
			System.debug('bridge: ' + bridge.Quote_Opp__c);

				System.debug('prpc id: ' + bridge.Product_Rate_Plan_Charge__c);

			zqu__ProductRatePlanCharge__c prpc = this.repo.getProductRatePlanCharge(bridge.Product_Rate_Plan_Charge__c);
			
			if(prpc == null){
				System.debug('prpc was null');
			}
			
			zqu__QuoteCharge__c qc = new zqu__QuoteCharge__c();
			System.debug('setting new charge id to ' + quoteId);
			qc.zqu__Quote__c = quoteId;
			qc.zqu__EffectivePrice__c = oli.TotalPrice;
			qc.zqu__Quantity__c = oli.Quantity;
			qc.zqu__ProductRatePlanCharge__c = bridge.Product_Rate_Plan_Charge__c;
			System.debug('adding quote charge');
			insert qc;
		}
	}	
}