trigger SubscriptionProductChargeInsertTrigger on Zuora__SubscriptionProductCharge__c (after insert, after update) {
	for(Zuora__SubscriptionProductCharge__c spc : trigger.new){
		SetComponentsAction action = new SetComponentsAction();
		if(!Test.isRunningTest()){
			action.Execute(spc.Id);
		}
	}
}