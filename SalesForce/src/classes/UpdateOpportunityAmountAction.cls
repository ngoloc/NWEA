public with sharing class UpdateOpportunityAmountAction {

	private Repository repo;

	public UpdateOpportunityAmountAction(){
		this.repo = new Repository();
	}
	
	public void Execute(string oppId){
		Opportunity opp = this.repo.getOpportunity(oppId);
		
		decimal amount = 0;
		System.debug('amount is ' + amount);
		List<OpportunityLineItem> lineItems = this.repo.getLineItemsForOpportunity(oppId);
		
		for(OpportunityLineItem li : lineItems){
			PricebookEntry pbe   = this.repo.getPricebookEntry(li.PricebookEntryId);
			Product2 product = this.repo.getProduct(pbe.Product2Id);
			System.debug('product ' + product.ProductCode);
			boolean isCustomerCare = product.ProductCode.indexOf('CUST-CARE') >= 0;
			System.debug('is customer care: ' + isCustomerCare);
			if(!isCustomerCare){
				amount += li.TotalPrice;
			}
		}
		
		opp.Custom_Amount__c = amount;
		
		update opp;
	}
}