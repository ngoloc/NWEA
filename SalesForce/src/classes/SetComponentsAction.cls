public with sharing class SetComponentsAction {

	private Repository repo;

	public SetComponentsAction(){
		this.repo = new Repository();
	}
	
	public void Execute(Zuora__SubscriptionProductCharge__c spc){
		if(spc.RPC_Component_1__c != null && spc.RPC_Component_2__c != null){
			return;
		}
		System.debug('getting product rate plans with product name ' + spc.Zuora__ProductName__c);
		//List<zqu__ProductRatePlan__c> prps = [SELECT Id FROM zqu__ProductRatePlan__c WHERE zqu__ZProduct__r.Name =: spc.Zuora__ProductName__c];
		//System.debug('found ' + prps.size() + 'product rate plans');
		List<zqu__ProductRatePlanCharge__c> charges = [SELECT Id FROM zqu__ProductRatePlanCharge__c WHERE zqu__ProductRatePlan__r.zqu__ZProduct__r.Name = :spc.Zuora__ProductName__c];
		System.debug('found charges: ' + charges.size());
		for(zqu__ProductRatePlanCharge__c charge : charges){
			
			System.debug('getting bridges for product rate plan charge ' + charge.Id );
			List<ZuoraBridge__c> bridges = this.repo.getBridgesByPRPC(charge.Id);
			System.debug('found ' + bridges.size() + ' bridges.');
			for(ZuoraBridge__c bridge : bridges){
				System.debug('quote to opp enabled?: ' + bridge.Quote_Opp__c);
				if(bridge.Quote_Opp__c && spc.RPC_Component_1__c != null && spc.RPC_Component_2__c != null){
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