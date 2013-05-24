public with sharing class GetLegacyProductsForQuoteAction {

	private Repository repo;

	private zqu__Quote__c quote;
	
	private Opportunity opp;

	public GetLegacyProductsForQuoteAction(){
		this.repo = new Repository();
	}
	
	public List<string> ExecuteList(zqu__Quote__c q)
	{
	System.debug('Migrating products form opportunity ' + q.zqu__Opportunity__c + ' to quote ' + q.Id);
		this.quote = this.repo.getQuote(q.Id);
		System.debug('getting opportunity id: ' + q.zqu__Opportunity__c);
		this.opp = this.repo.getOpportunity(q.zqu__Opportunity__c);
		
		if(this.opp == null){
			System.debug('opportunity was null...?');
			return new List<string>();
		}
		
		List<OpportunityLineItem> lineItems = this.repo.getLineItemsForOpportunity(this.opp.Id);
		System.debug('found ' + lineItems.size() + ' legacy line items to migrate.');
		
		List<string> prpcs = new List<string>();
		
		for(OpportunityLineItem li : lineItems){
			if(li == null){
				System.debug('line item was null');
			}
			else if(this.quote == null){
				System.debug('quote was null');
			}
			else{
				PricebookEntry pbe = this.repo.getPricebookEntry(li.PricebookEntryId);
				Product2 product = this.repo.getProduct(pbe.Product2Id);
				List<ZuoraBridge__c> bridges = this.repo.getBridgesByProduct(product.Id);
		
				for(ZuoraBridge__c bridge : bridges){
					System.debug('bridge: ' + bridge.Quote_Opp__c);
					System.debug('prpc id: ' + bridge.Product_Rate_Plan_Charge__c);
					prpcs.add(bridge.Product_Rate_Plan_Charge__c);
				}
			}
		}
		return prpcs;	
	}
	
	public Map<string, OpportunityLineItem> ExecuteLineItems(zqu__Quote__c q){
		System.debug('Migrating products form opportunity ' + q.zqu__Opportunity__c + ' to quote ' + q.Id);
		this.quote = this.repo.getQuote(q.Id);
		System.debug('getting opportunity id: ' + q.zqu__Opportunity__c);
		this.opp = this.repo.getOpportunity(q.zqu__Opportunity__c);
		
		if(this.opp == null){
			System.debug('opportunity was null...?');
			return new Map<string, OpportunityLineItem>();
		}
		
		List<OpportunityLineItem> lineItems = this.repo.getLineItemsForOpportunity(this.opp.Id);
		System.debug('found ' + lineItems.size() + ' legacy line items to migrate.');
		
		List<string> prpcs = new List<string>();
		Map<string, OpportunityLineItem> prpcToLiMap = new Map<string, OpportunityLineItem>();
		for(OpportunityLineItem li : lineItems){
			if(li == null){
				System.debug('line item was null');
			}
			else if(this.quote == null){
				System.debug('quote was null');
			}
			else{
				PricebookEntry pbe = this.repo.getPricebookEntry(li.PricebookEntryId);
				Product2 product = this.repo.getProduct(pbe.Product2Id);
				List<ZuoraBridge__c> bridges = this.repo.getBridgesByProduct(product.Id);
		
				for(ZuoraBridge__c bridge : bridges){
					System.debug('bridge: ' + bridge.Quote_Opp__c);
					System.debug('prpc id: ' + bridge.Product_Rate_Plan_Charge__c);
					prpcs.add(bridge.Product_Rate_Plan_Charge__c);
					prpcToLiMap.put(bridge.Product_Rate_Plan_Charge__c, li);
				}
			}
		}
		return prpcToLiMap;	
	
	}
	
	public boolean Execute(zqu__Quote__c q){
		List<string> prpcs = ExecuteList(q);
		return prpcs != null && prpcs.size() > 0;
	}
}