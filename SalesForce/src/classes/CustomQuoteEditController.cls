public with sharing class CustomQuoteEditController {

	public String subTitle {get;set;}
	
	public boolean renderTerms {get;set;}

	public List<string> pageErrorMessages {get;set;}

	public string accountURL {get;set;}

	public string accountName {get;set;}

	public string valueRequiredMessage {get;set;}

	public boolean requireServiceActivation {get;set;}
	
	public boolean requireCustomerAcceptance {get;set;}

	public boolean isCurrencyNull {get;set;}

	private zqu__Quote__c quote;

	private Repository repo;

	private string oppId;
	
	public CustomQuoteEditController(ApexPages.Standardcontroller controller){
		this.repo = new Repository();
		string id = controller.getId();
		this.quote = (zqu__Quote__c)controller.getRecord();
		String eid = ApexPages.currentPage().getParameters().get('eid');
		this.oppId = eid;
		System.debug('opp id: ' + eid);

		this.quote.zqu__Opportunity__c = eid;
		this.subTitle = '';
		this.renderTerms = true;
		this.pageErrorMessages = new List<string>();		
		this.accountURL = '';
		this.accountName = '';

		Opportunity opp = this.repo.getOpportunity(eid);
		System.debug('opp: ' + opp);
		if(opp != null){
			System.debug('start date: ' + opp.License_Start_Date__c);
			this.quote.zqu__StartDate__c = opp.License_Start_Date__c;
		}
		
		quote.zqu__InitialTerm__c = 12;
		quote.zqu__RenewalTerm__c = 12;
		quote.zqu__ValidUntil__c = Date.today().addDays(90);
		getOpportunity(eid);
		
		string accid = ApexPages.currentPage().getParameters().get('accid');
		if(accid != null){
			this.quote.zqu__ZuoraAccountId__c = accid;
		}
		setDefaults();
	}

	private void setDefaults(){
		if(this.quote.zqu__Currency__c == null){
			this.quote.zqu__Currency__c = 'USD';
		}
		
		if(this.quote.zqu__PaymentMethod__c == null){
			this.quote.zqu__PaymentMethod__c = 'Check';
		}
		
		if(this.quote.zqu__BillingMethod__c == null){
			this.quote.zqu__BillingMethod__c = 'Both';
		}
	}

	private void getOpportunity(string oppId)
	{
		Opportunity opp = this.repo.getOpportunity(oppId);
		Account acc = this.repo.getAccount(opp.AccountId);
		this.accountName = acc.Name;
		
		//set soldto and billto accounts to accounts' Account Payable
		Contact accountsPayableContact = this.repo.getContactByName((string)acc.Id, 'Accounts', 'Payable');
		if(accountsPayableContact != null){
			this.quote.zqu__SoldToContact__c = accountsPayableContact.Id;
			this.quote.zqu__BillToContact__c = accountsPayableContact.Id;
		}
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

	private void SyncInvoiceOwnerAccount(){
		if(this.quote.InvoiceOwner__c != null){
			SyncAccountAction sync = new SyncAccountAction();
			string zaccountId = sync.Execute(this.quote.InvoiceOwner__c, this.quote);
			this.quote.zqu__InvoiceOwnerId__c = zaccountId;
		}
	}

	public PageReference save(){
		System.debug('save');
		SyncInvoiceOwnerAccount();
		insert this.quote;
		
		MigrateLegacyProductsToQuoteAction migrate = new MigrateLegacyProductsToQuoteAction();
		migrate.Execute(this.quote);
		
		System.debug('new quote id is ' + this.quote.Id);
		PageReference pageRef = new PageReference('/apex/CustomProductSelector?id=' + this.quote.Id);		
		return pageRef;
	}
	
	public PageReference cancel(){
		System.debug('cancel');
		Opportunity opp = this.repo.getOpportunity(this.oppId);
        PageReference oppPage = new ApexPages.StandardController(opp).view();
        oppPage.setRedirect(true);
        return oppPage;
	}
}