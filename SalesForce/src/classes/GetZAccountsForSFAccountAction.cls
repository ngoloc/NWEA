public with sharing class GetZAccountsForSFAccountAction {

	public GetZAccountsForSFAccountAction(){
	
	}
	
	public List<string> Execute(string accountId){
		List<Opportunity> opps = [SELECT Id FROM Opportunity WHERE Account.Id = :accountId];
		List<string> zuoraAccountIds = new List<string>();
		Map<string,integer> mapzz = new Map<string,integer>();
		for(Opportunity opp : opps){
			List<zqu__Quote__c> quotes = [SELECT zqu__ZuoraAccountId__c FROM zqu__Quote__c WHERE zqu__Opportunity__c =:opp.Id AND zqu__ZuoraAccountId__c != null];
			for(zqu__Quote__c quote : quotes){
				mapzz.put(quote.zqu__ZuoraAccountId__c, 0);
			}
		}
		
		for (String fieldName : mapzz.keySet()){
        	zuoraAccountIds.add(fieldName);
        }
		
		return zuoraAccountIds;
	}

}