public with sharing class CustomZQQuoteEditController {

	public String subTitle {get;set;}
	
	public boolean renderTerms {get;set;}

	public List<string> pageErrorMessages {get;set;}

	public string accountURL {get;set;}

	public string accountName {get;set;}

	public string billToContact {get;set;}

	public string billToContactName {get;set;}
	
	public string soldToContact {get;set;}

	public string soldToContactName {get;set;}

	public boolean isBillToNull {get;set;}
	
	public boolean isSoldtoNull {get;set;}

	public string valueRequiredMessage {get;set;}

	public boolean requireServiceActivation {get;set;}
	
	public boolean requireCustomerAcceptance {get;set;}

	public boolean isCurrencyNull {get;set;}

	private zqu__Quote__c quote;

	public List<SelectOption> contacts {get;set;}

	private Repository repo;

	public CustomZQQuoteEditController(ApexPages.Standardcontroller controller){
		this.repo = new Repository();
		string id = controller.getId();
		this.quote = (zqu__Quote__c)controller.getRecord();
		System.debug('id is ' + quote.Id);
		System.debug('controller');
		String eid = ApexPages.currentPage().getParameters().get('eid');
		System.debug('eid: ' + eid);
		
		this.quote.zqu__Opportunity__c = eid;
		this.subTitle = '';
		this.renderTerms = true;
		this.pageErrorMessages = new List<string>();		
		this.accountURL = '';
		this.accountName = '';
		this.billToContact = null;
		this.billToContactName = null;
		this.isBillToNull = true;
		this.soldToContact = null;
		this.soldToContactName = null;
		this.isSoldtoNull = true;
		quote.zqu__InitialTerm__c = 12;
		quote.zqu__RenewalTerm__c = 12;
		getOpportunity(eid);
		List<Contact> cts = [SELECT Id, Name FROM Contact LIMIT 500];
		this.contacts = new List<SelectOption>();
		for(Contact c : cts){
			SelectOption opt = new SelectOption(c.Id, c.Name);
			this.contacts.Add(opt);
		}
	}

	private void getOpportunity(string oppId)
	{
		Opportunity opp = this.repo.getOpportunity(oppId);
		Account acc = this.repo.getAccount(opp.AccountId);
		this.accountName = acc.Name;
	}

	public pageReference termTypeChanged(){
		System.debug('term type is ' + this.quote.zqu__Subscription_Term_Type__c);
		this.renderTerms = this.quote.zqu__Subscription_Term_Type__c == 'Termed';
		return null;
	}

	public void changeBillTo(){
		System.debug('change bill to ');
	}
	
	public void changeSoldTo(){
		System.debug('change sold to ');
	}
	
	public void onCurrencyChange(){
		System.debug('currency change');
	}

	public PageReference save(){
		System.debug('save');
		this.quote.zqu__SoldToContact__c = soldToContact;
		this.quote.zqu__BillToContact__c = billToContact;
		insert this.quote;
		
		MigrateLegacyProductsToQuoteAction migrate = new MigrateLegacyProductsToQuoteAction();
		migrate.Execute(this.quote);
		
		System.debug('new quote id is ' + this.quote.Id);
		PageReference pageRef = new PageReference('/apex/CustomProductSelector?id=' + this.quote.Id);		
		return pageRef;
	}
	
	public PageReference cancel(){
		System.debug('cancel');
		Opportunity opportunity;
        PageReference oppPage = new ApexPages.StandardController(opportunity).view();
        oppPage.setRedirect(true);
        return oppPage;
	}
}