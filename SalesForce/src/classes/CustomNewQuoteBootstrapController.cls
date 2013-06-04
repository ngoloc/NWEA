public with sharing class CustomNewQuoteBootstrapController {
	
	private string quoteId;

	private Repository repo;

	public CustomNewQuoteBootstrapController(ApexPages.Standardcontroller controller){
		this.repo = new Repository();
		this.quoteId = controller.getId();
	}
	
	public PageReference decide(){
		PageReference pr = new PageReference('/apex/CustomNewQuote?id=' + this.quoteId);	
		pr.setRedirect(true);
		return pr;
	}

}