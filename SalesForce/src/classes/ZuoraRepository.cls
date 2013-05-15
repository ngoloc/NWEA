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
	
	private Zuora.zObject checkReturnSingle(List<Zuora.zObject> results){
		if(results.size() == 0){
			return null;
		}
		return results[0];
	}
	
	private void checkLogin()
	{
		if(!this.isLoggedIn){
			this.api.zlogin();
			this.isLoggedIn = true;
		}
	}

}