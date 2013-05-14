public with sharing class GetAccount {

	public Account Execute(Id accountId){
		List<Account> accounts = [SELECT Id, Name FROM Account WHERE Id = :accountId];
		return accounts[0];
	}

}