public with sharing class ZuoraRepository {

 	private Zuora.zApi api;
    
	private boolean isLoggedIn;

	public ZuoraRepository(){
		isLoggedIn = false;
		api = new Zuora.zApi();
	}
	
	public Zuora.zObject getAccountByNumber(string accountNumber)
	{
		checkLogin();
		string zoql = 'SELECT Id FROM Account WHERE AccountNumber = \'' + accountNumber + '\'';
		List<Zuora.zObject> objs = this.api.zquery(zoql);
		return checkReturnSingle(objs);
	}
	
	
	public List<Zuora.zObject> getPaymentMethodsByAccountId(string accountId)
	{
		checkLogin();
		string zoql = 'SELECT AccountId,AchAbaCode, AchAccountName, AchAccountNumberMask, AchAccountType, AchBankName, Type FROM PaymentMethod WHERE AccountId = \'' + accountId + '\'';
		List<Zuora.zObject> objs = this.api.zquery(zoql);
		System.debug('found ' + objs.size() + ' payment methods for account ' + accountId);
		return checkReturnMultiple(objs);
	}
	
	public List<Zuora.zApi.SaveResult> create(Zuora.zObject toCreate){
		checkLogin();
		List<Zuora.zApi.SaveResult> results = this.api.zcreate(new List<Zuora.zObject>{ toCreate});
		return results;
	}
	
	public List<Zuora.zApi.SaveResult> zupdate(Zuora.zObject toUpdate){
		checkLogin();
		List<Zuora.zApi.SaveResult> results = this.api.zupdate(new List<Zuora.zObject>{ toUpdate});
		return results;
	}
	
	public List<string> GetErrors(List<Zuora.zApi.SaveResult> saveResults){
		List<string> errs = new List<string>();
		for (Zuora.zApi.SaveResult result : saveResults) {
			if (!result.Success){
				Zuora.zObject[] errors = result.errors;
				for (Zuora.zObject error : errors) {
					errs.add((string)error.getValue('Message'));
				}
			}
		}
		return errs;
	}
	
	private Zuora.zObject checkReturnSingle(List<Zuora.zObject> results){
		if(results.size() == 0){
			return null;
		}
		return results[0];
	}
	
	private List<Zuora.zObject> checkReturnMultiple(List<Zuora.zObject> results){
		return results;
	}
	
	private void checkLogin()
	{
		if(!this.isLoggedIn){
			this.api.zlogin();
			this.isLoggedIn = true;
		}
	}

}