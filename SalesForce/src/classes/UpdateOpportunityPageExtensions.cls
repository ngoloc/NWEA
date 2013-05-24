public with sharing class UpdateOpportunityPageExtensions {
	
	public String viewOpportunityUrl {get;set;}
	
	private String quoteId;
	
	public String error {get;set;}
	
	private Repository repo;
	
	public UpdateOpportunityPageExtensions(ApexPages.Standardcontroller controller){
		this.quoteId = controller.getId();
		System.debug('quote id: ' + quoteId);
		repo =  new Repository();
	}
	
	public PageReference updateopp(){
		UpdateOpportunityFromQuoteAction action = new UpdateOpportunityFromQuoteAction();
		
		string err = action.Execute(this.quoteId);
		if(err == null){
			zqu__Quote__c quote = repo.getQuote(quoteId);
			PageReference pr = new PageReference('/' + quote.zqu__Opportunity__c);
			pr.setRedirect(true);
			return pr;
		}
		else{
			this.error = err;
		}
		return null;
	}
	
	public PageReference exit(){
		PageReference pr = new PageReference('/' + this.quoteId);
		pr.setRedirect(true);
		return pr;
	}
	
}