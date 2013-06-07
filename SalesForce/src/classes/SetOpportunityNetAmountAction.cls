public with sharing class SetOpportunityNetAmountAction {

	private Repository repo;

	private zqu__Quote__c quote;

	private Opportunity opp;

	public SetOpportunityNetAmountAction(string quoteId){
		this.repo = new Repository();
		this.quote = this.repo.getQuote(quoteId);
		this.opp = this.repo.getOpportunity(this.quote.zqu__Opportunity__c);
	}
	
	public void Execute(){
		decimal amount = this.opp.Amount;
		
		List<zqu__QuoteCharge__c> qcs = this.repo.getQuoteChargesByQuote(this.quote.Id);
 		
 		for(zqu__QuoteCharge__c qc : qcs){
 			zqu__ProductRatePlanCharge__c prpc = this.repo.getProductRatePlanCharge(qc.zqu__ProductRatePlanCharge__c);
 			System.debug('checking for customer care: ' + prpc.Name);
 			if(prpc.Name == 'Customer Care'){
 				System.debug('adding ' + qc.zqu__Total__c);
 				amount = amount + qc.zqu__Total__c;
 			}
 		}
		
		this.opp.Net_Amount__c = amount;
		update this.opp;
	}
}