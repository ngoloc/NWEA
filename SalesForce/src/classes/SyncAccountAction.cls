public with sharing class SyncAccountAction {

	private Repository repo;

	private ZuoraRepository zrepo;

	public SyncAccountAction(){
		this.repo = new Repository();
		this.zrepo = new ZuoraRepository();
	}
	
	public string Execute(Account account, zqu__Quote__c quote){
		System.debug('syncing account with code ' + account.Agency_Code__c);
		if(account.Agency_Code__c == null){
			return null;
		}
		Zuora.zObject zaccount = this.zrepo.getAccountByNumber(account.Agency_Code__c);
		string zaccountid = null;
		if(zaccount == null){
			System.debug('creating account with code: ' + account.Agency_Code__c);
			zaccountid = Sync(account, quote);
			System.debug('created account ' + zaccountid);
			Zuora.zObject createdAccount = this.zrepo.getAccount(account.Agency_Code__c);
			if(createdAccount != null){
				System.debug('new account number ' + createdAccount.getValue('Number'));
				System.debug('new account name ' + createdAccount.getValue('Name'));
			}
		}
		else{
			zaccountid = (string)zaccount.getValue('Id');
			System.debug('found account ' + zaccountid);
		}
		return zaccountid;
	}
	
	public string Execute(Id accountId, zqu__Quote__c quote){
		Account account = this.repo.getAccount(accountId);
		return Execute(account, quote);
	}
	
	private string Sync(Account account, zqu__Quote__c quote){
		Map<String, Object> ZConfig = zqu.zQuoteUtil.getZuoraConfigInformation();
		
		Zuora.zObject acc = new Zuora.zObject('Account');
		System.debug('creating new account with agency code: ' + account.Agency_Code__c);
        acc.setValue('Name', account.Name);
        acc.setValue('Currency', quote.zqu__Currency__c);
        acc.setValue('BillCycleDay', ZConfig.get('billingaccount_billcycleday__c'));
        acc.setValue('CrmId', account.Id);
        acc.setValue('PaymentTerm', quote.zqu__PaymentTerm__c);
        acc.setValue('Batch',ZConfig.get('billingaccount_batch__c'));
        acc.setValue('AccountNumber', account.Agency_Code__c);
        acc.setValue('Status', 'Draft');
        
    	if(quote.zqu__BillingMethod__c == 'Email')
        {
            acc.setValue('InvoiceDeliveryPrefsEmail', true);
            acc.setValue('InvoiceDeliveryPrefsPrint', false);
        }
        else if(quote.zqu__BillingMethod__c == 'Print')
        {
            acc.setValue('InvoiceDeliveryPrefsEmail', false);
            acc.setValue('InvoiceDeliveryPrefsPrint', true);
        }
        else if(quote.zqu__BillingMethod__c == 'Both')
        {
            acc.setValue('InvoiceDeliveryPrefsPrint', true);
            acc.setValue('InvoiceDeliveryPrefsEmail', true);
        }
        else
        {
            acc.setValue('InvoiceDeliveryPrefsEmail', false);
            acc.setValue('InvoiceDeliveryPrefsPrint', false);
        }
        Zuora.zApi.SaveResult sr = this.zrepo.zCreate(acc);
        
        if (sr.Success){
					System.debug('save success');
				}else{
					System.debug('save failure');
					Zuora.zObject[] errors = sr.errors;				
					for (Zuora.zObject error : errors) {
						String errorCode = (String)error.getValue('Code');
						String message = (String)error.getValue('Message');
						System.debug(errorCode + ':'+  message);
					}		
				}
        
         
        return sr.Id;
	}

}