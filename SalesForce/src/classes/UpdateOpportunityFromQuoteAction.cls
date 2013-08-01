public with sharing class UpdateOpportunityFromQuoteAction {

private zqu__Quote__c quote;
    
    private Opportunity opp;
    
    private Repository repo;

    public UpdateOpportunityFromQuoteAction(){
        this.repo =  new Repository();
    }
    
    public string Execute(string quoteId){
        this.quote = repo.getQuote(quoteId);
        System.debug('quote: ' + this.quote);
        this.opp = repo.getOpportunity(this.quote.zqu__Opportunity__c);
        
	    System.debug('updating opportunity from quote charges');
        
        List<zqu__Quote__c> quotes = [SELECT Id FROM zqu__Quote__c WHERE zqu__Opportunity__c = :this.opp.Id];
        
        if(quotes.size() == 0){
            return 'No quotes for opportunity found';
        }
        
        List<zqu__Quote__c> quotesfind = [SELECT Id FROM zqu__Quote__c WHERE Id=:quoteId];
        
        if(quotesfind.size() != 1){
        	return 'Quote not found';
        }       
        
        List<MyChargeAdapter> quoteCharges = new List<MyChargeAdapter>();
        System.debug('getting quote charges for quote ' + this.quote.Id);
        List<zqu__QuoteCharge__c> qcs = [SELECT Id, zqu__ProductRatePlanCharge__c, zqu__Quantity__c, zqu__EffectivePrice__c,zqu__Model__c,zqu__Total__c, zqu__ChargeType__c FROM zqu__QuoteCharge__c WHERE zqu__Quote__c=:this.quote.Id];
        for(zqu__QuoteCharge__c qcs1 : qcs){
        	zqu__ProductRatePlanCharge__c prpc = this.repo.getProductRatePlanCharge(qcs1.zqu__ProductRatePlanCharge__c);
        	System.debug('using quote charge ' + qcs1.Id);
        	MyChargeAdapter adapter = new MyChargeAdapter();
        	adapter.ProductRatePlanChargeId = qcs1.zqu__ProductRatePlanCharge__c;
        	adapter.Model=qcs1.zqu__Model__c;
        	adapter.Quantity=qcs1.zqu__Quantity__c;
        	adapter.Total = qcs1.zqu__Total__c;
        	adapter.ChargeType = qcs1.zqu__ChargeType__c;
            quoteCharges.Add(adapter);
        }
        
        if(quoteCharges.size() == 0){
        	System.debug('quote charges was empty,looking at zcharges');
        	List<zqu.zChargeGroup> cgs = zqu.zQuoteUtil.getChargeGroups(quoteId);
        	for(zqu.zChargeGroup cg : cgs){
        		if(cg.groupType != zqu.zChargeGroup.TYPE_RENEWAL_REMOVEPRODUCT && cg.groupType != zqu.zChargeGroup.TYPE_AMENDMENT_REMOVEPRODUCT ){
	        		for(zqu.zCharge c : cg.zCharges){
	        			MyChargeAdapter adapter = new MyChargeAdapter();
	        			adapter.ProductRatePlanChargeId = c.PRODUCT_RATE_PLAN_CHARGE_SFDC_ID;
	        			adapter.Model  =c.MODEL;
	        			try{
	        			adapter.Quantity = decimal.valueOf(c.QUANTITY);
	        			}
	        			catch(Exception e){
	        				adapter.Quantity = 1;
	        			}
	        			try{
	        			adapter.Total = decimal.valueOf(c.TOTAL);
	        			}
	        			catch(Exception e){
	        				adapter.Total = 0;
	        			}
	        			
	        			adapter.ChargeType = c.CHARGE_TYPE;
	        			System.debug('adding adapter: ' + adapter);
	        			quoteCharges.add(adapter);
	        		}
        		}
        	}
        }
        
        if(quoteCharges.size() == 0){
        	return 'No quote charges found';
        }
        
        System.debug('getting product rate plan charges...');
        
        List<zqu__ProductRatePlanCharge__c> prpcs = new List<zqu__ProductRatePlanCharge__c>();
        Map<Id, MyChargeAdapter> quoteChargeMap = new Map<Id, MyChargeAdapter>();
        for(MyChargeAdapter quoteCharge: quoteCharges){
            zqu__ProductRatePlanCharge__c prpc = [SELECT Id, Name,zqu__ProductRatePlan__c FROM zqu__ProductRatePlanCharge__c WHERE Id =:quoteCharge.ProductRatePlanChargeId];
            System.debug('using product rate plan charge ' + prpc.Id);
            prpcs.Add(prpc);
            quoteChargeMap.put(prpc.Id, quoteCharge);
        }
        
        if(prpcs.size() == 0){
            return 'No product rate plan charges found.';
        }
        
        System.debug('getting products...');
        
        List<Id> products = new List<Id>();
        Map<Id, MyChargeAdapter> quoteChargeMap2 = new Map<Id, MyChargeAdapter>();
        for(zqu__ProductRatePlanCharge__c prpc : prpcs){
 
 			System.debug('getting bridges for prpc: ' + prpc.Name + ' (' + prpc.Id + ')');
        	
            List<ZuoraBridge__c> zbs = [SELECT Product__c, Quote_Opp__c, Name FROM ZuoraBridge__c WHERE Product_Rate_Plan_Charge__c = :prpc.Id];
            
            if(zbs.size() == 0){
                System.debug('No bridge item found for product rate plan charge ' + prpc.Name + ' (' + prpc.Id +')');
            }
            
            boolean productAdded = false;
            for(ZuoraBridge__c zb : zbs){
                if(zb.Quote_Opp__c){
                    Product2 productAdding = this.repo.getProduct(zb.Product__c);
                    System.debug('adding product ' + productAdding.Name);
                    products.Add(zb.Product__c);
                    MyChargeAdapter adapter = quoteChargeMap.get(prpc.Id);
                    System.debug('mapping product ' + zb.Product__c + ' to ' + adapter);
                    quoteChargeMap2.put(zb.Product__c, adapter);
                	productAdded = true;
                }
                else{
                	System.debug('skipping ' + zb);
                }
            }
            if(!productAdded && zbs.size() > 0){
            	return 'All bridges have Quote to Opportunity disabled';
            }
        }
        
        if(products.size() == 0){
            String names = '';
            for(zqu__ProductRatePlanCharge__c prpc : prpcs){
                zqu__ProductRatePlan__c prp = this.repo.getProductRatePlan(prpc.zqu__ProductRatePlan__c);
                names = names + ' ' + prpc.Name + '(' + prp.Name + ')';
            }
            return 'No products found in bridge that match product rate plan charge ' + names;
        }
        
        List<OpportunityLineItem> lineItems = [SELECT Id FROM OpportunityLineItem WHERE OpportunityId =:this.opp.Id];
        for(OpportunityLineItem oli:lineItems){
            System.debug('removing line item ' + oli.Id);
            delete oli;
        }
        
        this.opp.Pricebook2Id = null;
        update this.opp;
        
        boolean productsadded = false;
        System.debug('adding products ' + products.size());
        
        
        
        for(Id p : products){
            System.debug('product: ' + p);
            Product2 product = this.repo.getProduct(p);
            System.debug('product name: ' + product.Name);
            List<PricebookEntry> pbes = [SELECT Id, UnitPrice, Pricebook2Id FROM PricebookEntry WHERE Product2Id = :p ];
            
            if(pbes.size() ==0){
                return 'No pricebook entries found for ' + product.Name; 
            }
            else{
                System.debug('found pbes: ' + pbes.size());
            }
            
            System.debug('setting Pricebook2');
            System.debug('current pb: ' + this.opp.Pricebook2Id);
            for(PricebookEntry pbe : pbes){
            	Pricebook2 pricebooktemp = this.repo.getPricebook(pbe.Pricebook2Id);
                if(this.opp.Pricebook2Id == null && pricebooktemp.IsActive){
                	System.debug('setting pricebook2id to ' + pricebooktemp.Name);
                	this.opp.Pricebook2Id = pbe.Pricebook2Id;
                    update this.opp;
                }
            }
            
            if(this.opp.Pricebook2Id == null){
                return 'Opportunity has no pricebook selected';
            }
            
            for(PricebookEntry pbe : pbes){
                if(pbe.Pricebook2Id == this.opp.Pricebook2Id){
                	System.debug('getting charge for ' + p);
                    MyChargeAdapter cqc = quoteChargeMap2.get(p);
                    System.debug('found charge adapter: ' + cqc);
                    System.debug('pbe: ' + pbe.Id);
                    OpportunityLineItem oli = new OpportunityLineItem();
                    oli.PricebookEntryId = pbe.Id;
                    oli.OpportunityId = this.opp.Id;
                    
                    //NWEA-144
                    //oli.Description = cqc.zqu__ProductName__c + ' ' + ' quantity: ' + cqc.zqu__Quantity__c + ' model: ' + cqc.zqu__Model__c; 
                    //System.debug('quantity: ' + cqc.zqu__Quantity__c);
                    //System.debug('effective price: ' + cqc.zqu__EffectivePrice__c);
                    //System.debug('term: ' + this.quote.zqu__InitialTerm__c);
                    //System.debug('denom: ' + 12);
                    oli.Quantity = cqc.Quantity;
                    
                    // this should probably not be static
                    decimal finalPrice;
                    System.debug('charge type: ' + cqc.ChargeType);
                    if(cqc.ChargeType == 'One-Time'){
                    	System.debug('setting final price to ' + cqc.Total);
                    	finalPrice = cqc.Total;
                    }
                    else{
                    	System.debug('this quote ' + this.quote);
                    	if(this.quote.zqu__InitialTerm__c!= null){
                    	finalPrice = cqc.Total * (this.quote.zqu__InitialTerm__c / 12);
                    	}
                    	else{
                    	finalPrice = cqc.Total;
                    	}
                    	
                    }
                    
                    System.debug('total price: ' + finalPrice);
                    oli.TotalPrice = finalPrice;
                    
                    insert oli;
                    System.debug('oli id: ' + oli.Id);
                    productsadded = true;
                }
            }
            
            System.debug('using product id: ' + p);
            PricebookEntry pbe = new PricebookEntry();  
        }
        if(!productsadded){
            return 'Product rate plan charges did not match any products in the selected price book.';
        }
        
        UpdateOpportunityAmountAction setamount = new UpdateOpportunityAmountAction();
        setamount.Execute(this.opp.Id);
        
        return null;
    }
    
    
    public class MyChargeAdapter{
    
    	public string ProductRatePlanChargeId;
    	
    	public decimal Quantity;
    	
    	public string Model;
    	
    	public string ChargeType;
    	
    	public decimal Total;
    
    }
}