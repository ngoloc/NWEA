public with sharing class UpdateOpportunityAmountAction {

	private Repository repo;

	public UpdateOpportunityAmountAction(){
		this.repo = new Repository();
	}
	
	public void Execute(string oppId){
		decimal amount = 0;
		List<OpportunityLineItem> lineItems = 
			[SELECT 
				Id, 
				TotalPrice, 
				PricebookEntryId, 
				PricebookEntry.Product2Id, 
				PricebookEntry.Product2.ProductCode 
			FROM 
				OpportunityLineItem 
			WHERE 
				Opportunity.Id=:oppId];
		
		for(OpportunityLineItem li : lineItems){
			System.debug('product ' + li.PricebookEntry.Product2.ProductCode);
			boolean isCustomerCare = li.PricebookEntry.Product2.ProductCode.indexOf('CUST-CARE') >= 0;
			System.debug('is customer care: ' + isCustomerCare);
			if(!isCustomerCare){
				amount += li.TotalPrice;
			}
		}
		Opportunity opp = new Opportunity();
		opp.Id = oppId;		
		opp.Net_Amount__c = amount;
		update opp;
	}
}