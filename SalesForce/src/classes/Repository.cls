public with sharing class Repository {

	public List<OpportunityLineItem> getLineItemsForOpportunity(string opportunityId){
	  	List<OpportunityLineItem> lineItems = [SELECT Id,PricebookEntryId FROM OpportunityLineItem WHERE OpportunityId =:opportunityId];
		return lineItems;
	}
	
	public Product2 getProduct(String productId){
		List<Product2> products = [SELECT Id, Name FROM PRODUCT2 WHERE Id =: productId];
		if(products.size() == 0){
			return null;
		}
		return products[0];
	}
	
	public PricebookEntry getPricebookEntry(String pricebookEntryId){
		List<PricebookEntry> pricebookEntry = [SELECT Product2Id, Pricebook2Id, IsActive, UnitPrice FROM PricebookEntry WHERE Id =: pricebookEntryId];
		if(pricebookEntry.size() != 1){
			return null;
		}
		return pricebookEntry[0];
	}
	
	public Pricebook2 getPricebook(string pricebook2Id){
		List<Pricebook2> pricebooks = [SELECT Id, Name, IsActive FROM Pricebook2 WHERE Id = :pricebook2Id];
		if(pricebooks.size() != 1){
			return null;
		}
		return pricebooks[0]; 
	}
	
	public List<ZuoraBridge__c> getBridgesByPRPC(string productRatePlanChargeId){
		List<ZuoraBridge__c> zbs = [SELECT Product__c, Quote_Opp__c, Product_Rate_Plan_Charge__c FROM ZuoraBridge__c WHERE Product_Rate_Plan_Charge__c = :productRatePlanChargeId];
		return zbs;
	}
	
	public List<ZuoraBridge__c> getBridgesByProduct(string productId){
		List<ZuoraBridge__c> zbs = [
			SELECT 
				Product__c, 
				Quote_Opp__c, 
				Product_Rate_Plan_Charge__c 
			FROM 
				ZuoraBridge__c 
			WHERE 
				Product__c =: productId];
		return zbs;
	}
	
	public OpportunityLineItem getOpportunityLineItem(string opportunityLineItemId){
	  	List<OpportunityLineItem> lineItems = [
	  		SELECT 
	  			Id, 
	  			OpportunityId, 
	  			PricebookEntryId, 
	  			Quantity, 
	  			TotalPrice 
  			FROM 
  				OpportunityLineItem 
  			WHERE 
  				Id =:opportunityLineItemId];
		if(lineItems.size() == 0){
			return null;
		}
		return lineItems[0];
	}

	public Account getAccount(string accountId){
		List<Account> accounts = [SELECT 
			Id, 
			Name, 
			Agency_Code__c 
		FROM 
			Account 
		WHERE 
			Id = :accountId];
			if(accounts.size() == 0){
				return null;
			}
		return accounts[0];
	}
	
	public Contact getContact(string contactId){
		List<Contact> contacts = [SELECT Id, Name, FirstName, LastName, AccountId FROM Contact WHERE Id =: contactId];
		if(contacts.size() == 0){
			return null;
		}
		return contacts[0];
	}
	
	public Contact getContactByName(Id accountId, string firstName, string lastName){
		List<Contact> contacts = [SELECT Id, Name, FirstName, LastName, AccountId FROM Contact WHERE AccountId =: accountId AND FirstName = :firstName AND LastName =: lastName];
		if(contacts.size() == 0){
			return null;
		}
		return contacts[0];
	}
	
	public Opportunity getOpportunity(Id opportunityId){
		List<Opportunity> opps = [SELECT 
			Id, 
			Account.Id, 
			Name, 
			Pricebook2Id,
			License_Start_Date__c
		FROM 
			Opportunity 
		WHERE 
			Id = :opportunityId];
		System.debug('found ' + opps.size() + ' opportunites');
		if(opps.size() == 0){
			return null;
		}
		return opps[0];
	}
	
	public zqu__QuoteCharge__c getQuoteCharge(Id id)
	{
		List<zqu__QuoteCharge__c> quoteCharges = [SELECT Id, Perpetual__c, zqu__Quantity__c, zqu__EffectivePrice__c, zqu__ProductRatePlanCharge__c  FROM zqu__QuoteCharge__c WHERE Id = :id];
		System.debug('found ' + quoteCharges.size() + ' quote charges.');
		if(quoteCharges.size() == 0){
			return null;
		}
		return quoteCharges[0];
	}
	
	public zqu__ProductRatePlanCharge__c getProductRatePlanCharge(String productRatePlanChargeId){
		List<zqu__ProductRatePlanCharge__c> prpcs = [SELECT Id, Name, zqu__ProductRatePlan__c FROM zqu__ProductRatePlanCharge__c WHERE Id =: productRatePlanChargeId];
		if(prpcs.size() == 0){
			return null;
		}
		return prpcs[0];
	}
	
		public zqu__ProductRatePlan__c getProductRatePlan(String productRatePlanId){
		List<zqu__ProductRatePlan__c> prpcs = [SELECT Id, Name, zqu__ZProduct__c FROM zqu__ProductRatePlan__c WHERE Id =: productRatePlanId];
		if(prpcs.size() == 0){
			return null;
		}
		return prpcs[0];
	}
	
	public zqu__ZProduct__c getZProduct(String productId){
		List<zqu__ZProduct__c> prpcs = [SELECT Id, Name  FROM zqu__ZProduct__c WHERE Id =: productId];
		if(prpcs.size() == 0){
			return null;
		}
		return prpcs[0];
	}
	
	public zqu__Quote__c getQuote(Id id){
		List<zqu__Quote__c> quotes = [
			SELECT 
				Id,
				Name,
				zqu__Currency__c, 
				zqu__Opportunity__c,
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
		if(quotes.size() == 0){
			return null;
		}
		return quotes[0];
	}
}