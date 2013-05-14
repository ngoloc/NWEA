public with sharing class UpdateOpportunityPageExtensions {
	
	public String viewOpportunityUrl {get;set;}
	
	private zqu__Quote__c quote;
	
	private Opportunity opp;
	
	public UpdateOpportunityPageExtensions(ApexPages.Standardcontroller controller){
		String quoteId = controller.getId();
		System.debug('quote id: ' + quoteId);
		this.quote = [SELECT Id, zqu__Opportunity__c FROM zqu__Quote__c WHERE Id=: quoteId];
		this.opp = [SELECT Id, Name FROM Opportunity WHERE Id=:this.quote.zqu__Opportunity__c];
	}
	
	public PageReference updateopp(){
		System.debug('updating opportunity from quote charges');
		
		List<zqu__Quote__c> quotes = [SELECT Id FROM zqu__Quote__c WHERE zqu__Opportunity__c = :this.opp.Id];
		List<zqu__QuoteCharge__c> quoteCharges = new List<zqu__QuoteCharge__c>();
		for(zqu__Quote__c quote: quotes){
			List<zqu__QuoteCharge__c> qcs = [SELECT Id, zqu__ProductRatePlanCharge__c, zqu__Quantity__c, zqu__EffectivePrice__c FROM zqu__QuoteCharge__c WHERE zqu__Quote__c=:quote.Id];
			for(zqu__QuoteCharge__c qcs1 : qcs){
				System.debug('using quote charge ' + qcs1.Id);
				quoteCharges.Add(qcs1);
			}
		}
		
		System.debug('getting product rate plan charges...');
		
		List<zqu__ProductRatePlanCharge__c> prpcs = new List<zqu__ProductRatePlanCharge__c>();
		Map<Id, Decimal> prices = new Map<Id, Decimal>();
		Map<Id, Double> quantities = new Map<Id, Double>();
		for(zqu__QuoteCharge__c quoteCharge: quoteCharges){
			zqu__ProductRatePlanCharge__c prpc = [SELECT Id FROM zqu__ProductRatePlanCharge__c WHERE Id =:quoteCharge.zqu__ProductRatePlanCharge__c];
			System.debug('using product rate plan charge ' + prpc.Id);
			prpcs.Add(prpc);
			System.debug('product rate plan charge has price of ' + quoteCharge.zqu__EffectivePrice__c);
			prices.put(prpc.Id, quoteCharge.zqu__EffectivePrice__c);
			quantities.put(prpc.Id, quoteCharge.zqu__Quantity__c);
		}
		
		System.debug('getting products...');
		
		List<Id> products = new List<Id>();
		Map<Id, Decimal> prices2 = new Map<Id, Decimal>();
		Map<Id, Double> quantities2 = new Map<Id, Double>();
		for(zqu__ProductRatePlanCharge__c prpc : prpcs){
			List<ZuoraBridge__c> zbs = [SELECT Product__c, Quote_Opp__c FROM ZuoraBridge__c WHERE Product_Rate_Plan_Charge__c = :prpc.Id];
			for(ZuoraBridge__c zb : zbs){
				if(zb.Quote_Opp__c){
					System.debug('adding product ' + zb);
					products.Add(zb.Product__c);
					System.debug('product has price of ' + prices.get(prpc.Id));
					prices2.put(zb.Product__c, (Decimal)prices.get(prpc.Id));
					quantities2.put(zb.Product__c, quantities.get(prpc.Id));
				}
				else{
					System.debug('skipping product ' + zb);
				}
			}
		}
		
		List<OpportunityLineItem> lineItems = [SELECT Id FROM OpportunityLineItem WHERE OpportunityId =:this.opp.Id];
		for(OpportunityLineItem oli:lineItems){
			System.debug('removing line item ' + oli.Id);
			delete oli;
		}

		List<Pricebook2> pbs = [SELECT Id FROM Pricebook2 WHERE Name=:this.opp.Name];
		Pricebook2 pb = null;
		if(pbs.size() == 0){
			pb = new Pricebook2();
			pb.Name = this.opp.Name;
			insert pb;
		}
		else{
			pb = pbs[0];
		}
		
		this.opp.Pricebook2Id = pb.Id;
		update this.opp;
		
		List<PricebookEntry> pbes = [SELECT Id FROM PricebookEntry WHERE Pricebook2Id = :pb.Id];
		
		for(PricebookEntry pbe : pbes){
			delete pbe;
		}
		
		for(Id p : products){
			System.debug('using product id: ' + p);
			PricebookEntry pbe = new PricebookEntry();
			pbe.Product2Id = p;
			pbe.Pricebook2Id = pb.Id;
			pbe.IsActive = true;
			pbe.UnitPrice = prices2.get(p);
			System.debug('unit price: ' + prices2.get(p));
			insert pbe;
			
			OpportunityLineItem oli = new OpportunityLineItem();
			oli.PricebookEntryId = pbe.Id;
			oli.OpportunityId = this.opp.Id;
			System.debug('oli quantity: ' + quantities2.get(p));
			oli.Quantity = quantities2.get(p);
			oli.TotalPrice = oli.Quantity * pbe.UnitPrice;
			insert oli;
			
			System.debug('oli id: ' + oli.Id);
		}
		
		PageReference pr = new PageReference('/' + this.opp.Id);
		pr.setRedirect(true);
		return pr;
	}
	
}