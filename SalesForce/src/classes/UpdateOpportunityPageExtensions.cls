public with sharing class UpdateOpportunityPageExtensions {
	
	public String viewOpportunityUrl {get;set;}
	
	private String quoteId;
	
	public String error {get;set;}
	
	private Repository repo;
	
	public boolean iserror {get;set;}
	
	public boolean issuccess {get;set;}
	
	public UpdateOpportunityPageExtensions(ApexPages.Standardcontroller controller){
		this.quoteId = controller.getId();
		System.debug('quote id: ' + quoteId);
		repo =  new Repository();
	}
	
	public PageReference updateopp(){
		UpdateOpportunityFromQuoteAction action = new UpdateOpportunityFromQuoteAction();
		
		string err = action.Execute(this.quoteId);
		System.debug('error: ' + err);
		if(err == null){
			zqu__Quote__c quote = repo.getQuote(quoteId);
			this.iserror = false;
			this.issuccess = true;
		}
		else{
			this.error = err;
			this.iserror = true;
			this.issuccess = false;
		}
		
		return null;
	}
	
	public PageReference exit(){
		PageReference pr = new PageReference('/' + this.quoteId);
		pr.setRedirect(true);
		return pr;
	}
	
}