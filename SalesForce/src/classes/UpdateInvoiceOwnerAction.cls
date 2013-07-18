public with sharing class UpdateInvoiceOwnerAction {

	public UpdateInvoiceOwnerAction(){
	
	}
	
	public void Execute(string subscriptionId, string accountId){
		Account account = [SELECT Agency_Code__c FROM Account WHERE Id=:accountId];
		UpdateInvoiceOwnerAction.ExecuteFuture(subscriptionId, account.Agency_Code__c);
	}

	@future(callout=true)
	private static void ExecuteFuture(string subscriptionId, string agencyCode){
		System.debug('setting invoice owner on sub ' + subscriptionId + ' to ' + agencyCode);
		
		ZuoraRepository zr = new ZuoraRepository();
		Zuora.zObject account = zr.getAccountByNumber(agencyCode);
		
		Zuora.zObject sub  = new Zuora.zObject('Subscription');
		sub.setValue('Id', subscriptionId);
		sub.setValue('InvoiceOwnerId', account.getValue('Id'));
		Zuora.zApi.SaveResult result= zr.zUpdate(sub);
		System.debug('save succeed? ' + result.Success);
		 if (result.Success){
			System.debug('save success');
		}else{
			Zuora.zObject[] errors = result.errors;				
			for (Zuora.zObject error : errors) {
				String errorCode = (String)error.getValue('Code');
				String message = (String)error.getValue('Message');
				System.debug(errorCode + ':'+  message);
			}
		 }
	}

}