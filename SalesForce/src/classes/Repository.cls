public with sharing class Repository {

	public Account getAccount(string accountId){
		List<Account> accounts = [SELECT Id, Name, Agency_Code__c FROM Account WHERE Id = :accountId];
		return accounts[0];
	}
	
	public Opportunity getOpportunity(Id opportunityId){
		List<Opportunity> opps = [SELECT Id, Account.Id, Name FROM Opportunity WHERE Id = :opportunityId];
		System.debug('found ' + opps.size() + ' opportunites');
		if(opps.size() == 0){
			return null;
		}
		return opps[0];
	}
	
	public zqu__QuoteCharge__c getQuoteCharge(Id id)
	{
		List<zqu__QuoteCharge__c> quoteCharges = [SELECT Id, Perpetual__c FROM zqu__QuoteCharge__c WHERE Id = :id];
		System.debug('found ' + quoteCharges.size() + ' quote charges.');
		if(quoteCharges.size() == 0){
			return null;
		}
		return quoteCharges[0];
	}
	
	public zqu__Quote__c getQuote(Id id){
		List<zqu__Quote__c> quotes = [
			SELECT 
				Id,
				Name,
				zqu__Currency__c, 
				zqu__Opportunity__r.Id,
				zqu__PaymentTerm__c,
				zqu__PaymentMethod__c,
				zqu__StartDate__c,
				zqu__Service_Activation_Date__c,
				zqu__Customer_Acceptance_Date__c,
				zqu__Subscription_Term_Type__c,
				zqu__InitialTerm__c,
				zqu__RenewalTerm__c,
				zqu__BillingMethod__c,
				zqu__AutoRenew__c,
				zqu__SoldToContact__r.Id,
				zqu__BillToContact__r.Id,
				zqu__ZuoraAccountId__c,
				zqu__InvoiceID__c
			FROM 
				zqu__Quote__c 
			WHERE 
				Id = :id];
		return quotes[0];
	}
}