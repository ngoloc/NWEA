public with sharing class SetComponentsAction {

	public SetComponentsAction(){
	}
	
	public void Execute(Id subscriptionProductChargeId){
		if(!SubscriptionProductChargeTriggerMutex.PreventTriggers){
			SetComponentsAction.ExecuteFuture(subscriptionProductChargeId);
		}
	}
	
	@future(callout=true)
	private static void ExecuteFuture(string subscriptionProductChargeId){
		IZAPI api = new ZAPIAdapter();
		ZuoraRepository zrepo = new ZuoraRepository(api);
		Repository repo = new Repository();
		Zuora__SubscriptionProductCharge__c spc = repo.getSubscriptionProductCharge(subscriptionProductChargeId);
		System.debug('zuora id: ' + spc.Zuora__Zuora_Id__c);
		Zuora.zObject ratePlanCharge = zrepo.getRatePlanCharge(spc.Zuora__Zuora_Id__c); 
		System.debug('rate plan charge: ' + ratePlanCharge);
		
		zqu__ProductRatePlanCharge__c prpc  = repo.getProductRatePlanChargeByZuoraId((string)ratePlanCharge.getValue('ProductRatePlanChargeId'));
		System.debug('prpc: ' + prpc);
		
		System.debug('gtting bridges by prpcid: ' + prpc.Id);
		List<ZuoraBridge__c> bridges = repo.getBridgesByPRPC(prpc.Id);
		System.debug('bridges found: ' + bridges.size());
		for(ZuoraBridge__c bridge : bridges){
			if(bridge.Quote_Opp__c){
				System.debug('bridge: ' + bridge.Name);
				
				Product2 product = repo.getProduct(bridge.Product__c);
				System.debug('product: ' + product.Name);
				System.debug('c1: ' + product.Component_1__c);
				System.debug('c2: ' + product.Component_2__c);
				
				spc.RPC_Component_1__c = product.Component_1__c;
				spc.RPC_Component_2__c = product.Component_2__c;
				SubscriptionProductChargeTriggerMutex.PreventTriggers = true;
				update spc;
				SubscriptionProductChargeTriggerMutex.PreventTriggers = true;
				return;
			}
		}
		
	}
}