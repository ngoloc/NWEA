public with sharing class UpdateOpportunityFromQuoteAction {

private zqu__Quote__c quote;
	
	private Opportunity opp;
	
	private Repository repo;

	public UpdateOpportunityFromQuoteAction(){
		this.repo =  new Repository();

	}
	
	public string Execute(string quoteId){
		this.quote = repo.getQuote(quoteId);
		this.opp = repo.getOpportunity(this.quote.zqu__Opportunity__c);
		
		if(this.opp.Pricebook2Id == null){
			return 'Select a pricebook first';
		}
		
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
		Map<Id, string> quoteChargeMap = new Map<Id, string>();
		for(zqu__QuoteCharge__c quoteCharge: quoteCharges){
			zqu__ProductRatePlanCharge__c prpc = [SELECT Id, Name FROM zqu__ProductRatePlanCharge__c WHERE Id =:quoteCharge.zqu__ProductRatePlanCharge__c];
			System.debug('using product rate plan charge ' + prpc.Id);
			prpcs.Add(prpc);
			System.debug('product rate plan charge has price of ' + quoteCharge.zqu__EffectivePrice__c);
			quoteChargeMap.put(prpc.Id, (string)quoteCharge.Id);
		}
		
		System.debug('getting products...');
		
		List<Id> products = new List<Id>();
		Map<Id, string> quoteChargeMap2 = new Map<Id, string>();
		for(zqu__ProductRatePlanCharge__c prpc : prpcs){
			List<ZuoraBridge__c> zbs = [SELECT Product__c, Quote_Opp__c FROM ZuoraBridge__c WHERE Product_Rate_Plan_Charge__c = :prpc.Id];
			if(zbs.size() == 0){
				System.debug('no bridge item found for product rate plan charge ' + prpc.Name);
			}
			
			for(ZuoraBridge__c zb : zbs){
				if(zb.Quote_Opp__c){
					System.debug('adding product ' + zb);
					products.Add(zb.Product__c);
					quoteChargeMap2.put(zb.Product__c, quoteChargeMap.get(prpc.Id));
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

		for(Id p : products){
			System.debug('product: ' + p);
			List<PricebookEntry> pbes = [SELECT Id, UnitPrice, Pricebook2Id FROM PricebookEntry WHERE Product2Id = :p ];
			
			boolean oneInPb = false;
			for(PricebookEntry pbe : pbes){
				if(pbe.Pricebook2Id == this.opp.Pricebook2Id){
					oneInPb = true;
				}
			}
			
			if(oneInPb == false){
				Product2 product = this.repo.getProduct(p);
				return product.Name + ' is not in the pricebook';
			}
			
			for(PricebookEntry pbe : pbes){
				if(pbe.Pricebook2Id == this.opp.Pricebook2Id){
					string cqcid = quoteChargeMap2.get(p);
					zqu__QuoteCharge__c cqc = this.repo.getQuoteCharge(cqcid); 
					System.debug('pbe: ' + pbe.Id);
					OpportunityLineItem oli = new OpportunityLineItem();
					oli.PricebookEntryId = pbe.Id;
					oli.OpportunityId = this.opp.Id;
					oli.Quantity = cqc.zqu__Quantity__c;
					oli.UnitPrice = (cqc.zqu__EffectivePrice__c / cqc.zqu__Quantity__c) * (this.quote.zqu__InitialTerm__c / 12);
					System.debug('unit price: ' + oli.UnitPrice);
					insert oli;
					System.debug('oli id: ' + oli.Id);
				}
			}
			
			System.debug('using product id: ' + p);
			PricebookEntry pbe = new PricebookEntry();	
		}
		
		return null;
	}
}