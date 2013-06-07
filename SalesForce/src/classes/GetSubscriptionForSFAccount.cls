public with sharing class GetSubscriptionForSFAccount {

	public GetSubscriptionForSFAccount(){
	
	}
	
	public List<Zuora.zObject> Execute(string accountId){
		ZuoraRepository zrepo = new ZuoraRepository(new ZAPIAdapter());
		List<Zuora.zObject> subs = zrepo.getSubscriptionsForAccount(accountId);
		return subs;
	}

}