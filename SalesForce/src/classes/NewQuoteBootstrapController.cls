public with sharing class NewQuoteBootstrapController {

	private string oppId;
	
	private ZuoraRepository zrepo;
	
	private Repository repo;

	private string url;

	public NewQuoteBootstrapController(ApexPages.Standardcontroller controller){
		this.zrepo = new ZuoraRepository();
		this.url = '/' + controller.getId();
	}
	
	public PageReference onload(){
		return new PageReference(url);
	}

}