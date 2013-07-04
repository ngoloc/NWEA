public with sharing class ZuoraRepository {

 	private IZAPI api;
    
	private boolean isLoggedIn;

	public ZuoraRepository(){
		this(new ZAPIAdapter());
	}

	public ZuoraRepository(IZAPI api){
		isLoggedIn = false;
		this.api = api;
	}

	public List<Zuora.zObject> getSubscriptionsForAccount(string accountId)
	{
		checkLogin();
		string zoql = 'SELECT Id, Name, Status, ContractEffectiveDate FROM Subscription WHERE AccountId = \'' + accountId + '\'';
		return this.api.zquery(zoql);
	}

	public Zuora.zObject getSubscription(string subscriptionId)
	{
		checkLogin();
		string zoql = 'SELECT Id, Name FROM Subscription WHERE Id = \'' + subscriptionId + '\'';
		List<Zuora.zObject> objs = this.api.zquery(zoql);
		return checkReturnSingle(objs);
	}
	
	public Zuora.zObject getAccount(string accountId)
	{
		checkLogin();
		string zoql = 'SELECT Id, Name, AccountNumber, BillToId, SoldToId FROM Account WHERE Id = \'' + accountId + '\'';
		List<Zuora.zObject> objs = this.api.zquery(zoql);
		return checkReturnSingle(objs);
	}
	
	public Zuora.zObject getContact(string contactId)
	{
		checkLogin();
		string zoql = 'SELECT Id, FirstName, LastName FROM Contact WHERE Id = \'' + contactId + '\'';
		List<Zuora.zObject> objs = this.api.zquery(zoql);
		return checkReturnSingle(objs);
	}
	
	public Zuora.zObject getAccountByNumber(string accountNumber)
	{
		checkLogin();
		string zoql = 'SELECT Id FROM Account WHERE AccountNumber = \'' + accountNumber + '\'';
		List<Zuora.zObject> objs = this.api.zquery(zoql);
		return checkReturnSingle(objs);
	}
	
	public Zuora.zObject getRatePlanCharge(string ratePlanChargeId){
		checkLogin();
		string zoql = 'SELECT Id, Name,ProductRatePlanChargeId FROM RatePlanCharge WHERE Id = \'' + ratePlanChargeId + '\'';
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
	
	public List<Zuora.zApi.SaveResult> zCreateMultiple(List<Zuora.zObject> tocreate){
		checkLogin();
		List<Zuora.zApi.SaveResult> results = this.api.zcreate(tocreate);
		return results;
	}
	
	public Zuora.zApi.SaveResult zCreate(Zuora.zObject toCreate){
		checkLogin();
		List<Zuora.zObject> objs = new List<Zuora.zObject>();
		objs.add(toCreate);
		List<Zuora.zApi.SaveResult> results = this.api.zcreate(objs);
		return results[0];
	}
	
	public List<Zuora.zApi.SaveResult> zUpdateMultiple(Zuora.zObject toUpdate){
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
	
	public Zuora.zApi.SaveResult zUpdate(Zuora.zObject obj){
		List<Zuora.zObject> toupdate = new List<Zuora.zObject>();
		toupdate.add(obj);
		checkLogin();
		List<Zuora.zApi.SaveResult> results = this.api.zupdate(toupdate);
		return results[0];
	}

}