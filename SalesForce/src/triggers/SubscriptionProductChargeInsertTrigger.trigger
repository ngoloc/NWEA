trigger SubscriptionProductChargeInsertTrigger on Zuora__SubscriptionProductCharge__c (before insert, before update) {
	for(Zuora__SubscriptionProductCharge__c spc : trigger.new){
		SetComponentsAction action = new SetComponentsAction();
		action.Execute(spc);
	}
}