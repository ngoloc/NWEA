public with sharing class SetComponentActionCallout {

	public SetComponentActionCallout(){
	
	}
	
	public void Execute(){
		System.debug('syncing components via callout');
		List<Zuora__SubscriptionProductCharge__c> charges = [SELECT Id,Zuora__Zuora_Id__c FROM Zuora__SubscriptionProductCharge__c WHERE RPC_Component_1__c= null LIMIT 1];
			for(Zuora__SubscriptionProductCharge__c charge : charges){
				SetComponentActionCallout.SetComponentFuture(charge.Id, charge.Zuora__Zuora_Id__c);
			}
	}
	
	@future(callout=true)
	private static void SetComponentFuture(string spcId,string zuoraId){
		//callout to zuora to get the ProductRatePlanChargeId
		ZuoraRepository zr = new ZuoraRepository();
		Zuora.zObject rpc = zr.getRatePlanCharge(zuoraId);
		string productRatePlanChargeId = (string)rpc.getValue('ProductRatePlanChargeId');
		Repository repo = new Repository();
		//get the ProductRatePlanCharge
		zqu__ProductRatePlanCharge__c prpc = repo.getProductRatePlanChargeByZuoraId(productRatePlanChargeId);
		List<ZuoraBridge__c> bridges = repo.getBridgesByPRPC(prpc.Id);
		System.debug('found ' + bridges.size() + ' bridges.');
		for(ZuoraBridge__c bridge : bridges){
			System.debug('quote to opp enabled?: ' + bridge.Quote_Opp__c);
			if(bridge.Quote_Opp__c){
				System.debug('bridge: ' + bridge.Name);
				
				Product2 product = repo.getProduct(bridge.Product__c);
				System.debug('product: ' + product.Name);
				System.debug('c1: ' + product.Component_1__c);
				System.debug('c2: ' + product.Component_2__c);

				Zuora__SubscriptionProductCharge__c spc = new Zuora__SubscriptionProductCharge__c();
				spc.Id = 			spcId;	
				spc.RPC_Component_1__c = product.Component_1__c;
				spc.RPC_Component_2__c = product.Component_2__c;
				update spc;
				return;
			}
		}
	}

}