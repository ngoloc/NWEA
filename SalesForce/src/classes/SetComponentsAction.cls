public with sharing class SetComponentsAction {

	private Repository repo;

	public SetComponentsAction(){
		this.repo = new Repository();
	}
	
	public void Execute(Zuora__SubscriptionProductCharge__c spc){
		
		List<zqu__ProductRatePlan__c> prps = [SELECT Id FROM zqu__ProductRatePlan__c WHERE Name=:spc.Zuora__ProductName__c];
		
		List<zqu__ProductRatePlanCharge__c> charges = new List<zqu__ProductRatePlanCharge__c>();
		for(zqu__ProductRatePlan__c prp : prps){
			List<zqu__ProductRatePlanCharge__c> c2 = [SELECT Id FROM zqu__ProductRatePlanCharge__c WHERE zqu__ProductRatePlan__c =:prp.Id];
			for(zqu__ProductRatePlanCharge__c prpc : c2){
				charges.add(prpc);
			}
		}
		
		for(zqu__ProductRatePlanCharge__c charge : charges){
			List<ZuoraBridge__c> bridges = this.repo.getBridgesByPRPC(charge.Id);
		
			for(ZuoraBridge__c bridge : bridges){
				if(bridge.Quote_Opp__c){
					System.debug('bridge: ' + bridge.Name);
					
					Product2 product = repo.getProduct(bridge.Product__c);
					System.debug('product: ' + product.Name);
					System.debug('c1: ' + product.Component_1__c);
					System.debug('c2: ' + product.Component_2__c);
					
					spc.RPC_Component_1__c = product.Component_1__c;
					spc.RPC_Component_2__c = product.Component_2__c;
					return;
				}
			}
		}
	}
}