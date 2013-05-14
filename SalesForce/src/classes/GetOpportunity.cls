public with sharing class GetOpportunity {

	public Opportunity Execute(Id opportunityId){
		Opportunity opp = [SELECT AccountId FROM Opportunity WHERE Id = :opportunityId];
		return opp;
	}
}