public with sharing class MigrateLegacyProductsToQuoteAction {

	private Repository repo;

	private zqu__Quote__c quote;
	
	private Opportunity opp;

	public MigrateLegacyProductsToQuoteAction(){
		this.repo = new Repository();
	}
	
	public void Execute(zqu__Quote__c q){
		System.debug('Migrating products form opportunity ' + q.zqu__Opportunity__c + ' to quote ' + q.Id);
		this.quote = this.repo.getQuote(q.Id);
		System.debug('getting opportunity id: ' + q.zqu__Opportunity__c);
		this.opp = this.repo.getOpportunity(q.zqu__Opportunity__c);
		
		if(this.opp == null){
			System.debug('opportunity was null...?');
			return;
		}
		
		List<OpportunityLineItem> lineItems = this.repo.getLineItemsForOpportunity(this.opp.Id);
		System.debug('found ' + lineItems.size() + ' legacy line items to migrate.');
		
		for(OpportunityLineItem li : lineItems){
			if(li == null){
				System.debug('line item was null');
			}
			else if(this.quote == null){
				System.debug('quote was null');
			}
			else{
				MigrateLegacyProductToQuoteAction migrator = new MigrateLegacyProductToQuoteAction();
				migrator.Execute(li.Id, this.quote.Id);
			}
		}	
	}
}