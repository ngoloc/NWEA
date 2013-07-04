public with sharing class SyncAccountAction {

	private Repository repo;

	private ZuoraRepository zrepo;

	public SyncAccountAction(){
		this.repo = new Repository();
		this.zrepo = new ZuoraRepository();
	}
	
	public string Execute(Id accountId, zqu__Quote__c quote){
		Account account = this.repo.getAccount(accountId);
		if(account.Agency_Code__c == null){
			return null;
		}
		Zuora.zObject zaccount = this.zrepo.getAccountByNumber(account.Agency_Code__c);
		string zaccountid = null;
		if(zaccount == null){
			zaccountid = Sync(account, quote);
		}
		else{
			zaccountid = (string)zaccount.getValue('Id');
		}
		return zaccountid;
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
        return sr.Id;
	}

}