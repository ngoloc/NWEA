public with sharing class CustomQuoteEnhancementController {

	public List<string> pageErrorMessages {get;set;}

	public string selectedAccountType {get;set;}

	public string newAccItemLabel {get;set;}
	
	public string existingAccItemLabel {get;set;}
	
	public List<SelectOption> billingAccountOptions {get;set;}

	public string selectedAccountId {get;set;}

	public string selectedSubscriptionType {get;set;}

	public string newSubItemLabel {get;set;}
	
	public string existingSubItemLabel {get;set;}
	
	public List<SelectOption> subscriptionOptions {get;set;}

	public string selectedSubscriptionId {get;set;}
	
	public string amendSubItemLabel {get;set;}

	public string renewSubItemLabel {get;set;}
	
	public SubscriptionOption selectedSusbcriptionOption {get;set;}

	public string selectedAmendmentType {get;set;}

	private string oppId;

	//existing,new
	public CustomQuoteEnhancementController(ApexPages.Standardcontroller controller){
		pageErrorMessages = new List<String>();
		this.billingAccountOptions = new List<SelectOption>();
		this.subscriptionOptions = new List<SelectOption>();
		this.oppId = ApexPages.currentPage().getParameters().get('oppId');
	}
	
	public PageReference onload(){
		return null;
	}
	
	public void onSelectAccountType(){
	
	}
	
	public void onSelectAccount(){
	
	}
	
	public void onSelectSubscription(){
	
	}
	
	public void onSelectSubscriptionType(){
	
	}
	
	public void createQuote(){
	
	}
	
	public PageReference cancel(){
		return new PageReference('/' + this.oppId);
	}

}