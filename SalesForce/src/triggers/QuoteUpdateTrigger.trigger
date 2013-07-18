trigger QuoteUpdateTrigger on zqu__Quote__c (after update) {
	for(zqu__Quote__c q : trigger.new){
		if(q.zqu__ZuoraSubscriptionID__c != null && q.InvoiceOwner__c != null){
			UpdateInvoiceOwnerAction action = new UpdateInvoiceOwnerAction();
			action.Execute(q.zqu__ZuoraSubscriptionID__c, q.InvoiceOwner__c);
		}
	}
}