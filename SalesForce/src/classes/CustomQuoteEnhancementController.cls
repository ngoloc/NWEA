public with sharing class CustomQuoteEnhancementController {

public string newAccItemLabel {get;set;}
	
	public string existingAccItemLabel {get;set;}
	
	public string newSubItemLabel {get;set;}
	
	public string existingSubItemLabel {get;set;}

	private string oppId;

	private Repository repo;

	private ZuoraRepository zrepo;

	private Opportunity opp;
	
	public List<string> pageErrorMessages {get;set;}
	
	public string renewSubItemLabel {get;set;}
	
	public string selectedAccountType {get;set;}
	
	public string selectedSubscriptionType {get;set;}
	
	public string selectedAccountId {get;set;}
	
	public List<SelectOption> billingAccountOptions {get;set;}
	
	/*****************************************/
	
	public List<SelectOption> subscriptionOptions {get;set;}

	public string selectedSubscriptionId {get;set;}
	
	public string amendSubItemLabel {get;set;}

	public SubscriptionOption selectedSusbcriptionOption {get;set;}

	public string selectedAmendmentType {get;set;}

	//existing,new
	public CustomQuoteEnhancementController(ApexPages.Standardcontroller controller){
		pageErrorMessages = new List<String>();
		this.billingAccountOptions = new List<SelectOption>();
		this.subscriptionOptions = new List<SelectOption>();
		this.oppId = controller.getId();
		this.repo = new Repository();
		this.opp = this.repo.getOpportunity(this.oppId);
		this.pageErrorMessages = new List<string>();
		this.zrepo = new ZuoraRepository(new ZAPIAdapter());
		this.subscriptionOptions = new List<SelectOption>();
	}
	
	public PageReference onload(){
		GetZAccountsForSFAccountAction action = new GetZAccountsForSFAccountAction();
		List<string> zuoraAccountIds = action.Execute(this.opp.Account.Id);
		if(zuoraAccountIds.size() > 0){
			initialize(zuoraAccountIds);
			return null;
		}
		PageReference pr = new PageReference('/apex/CustomQuoteEdit?eid=' + this.oppId);
		pr.setRedirect(true);
		return pr;
	}
	
	private void initialize(List<string> zuoraAccountIds){
		this.newAccItemLabel = '<b>new</b> billing account';
		this.existingAccItemLabel = '<b>existing</b> billing account';
		this.newSubItemLabel = '<b>new</b> subscription for this account';
		this.existingSubItemLabel = '<b>existing</b> subscription';
		this.renewSubItemLabel = '<b>renew</b> this subscription';
		this.amendSubItemLabel = '<b>amend</b> this subscription';
		this.selectedAccountType = 'existing';
		this.selectedSubscriptionType = 'existing';
		this.selectedAmendmentType = 'amend';
		this.getBillingAccountOptions(zuoraAccountIds);
	}
	
	private void getSubscriptionOptions(){
		if(this.selectedAccountId == null){
			return;
		}
		System.debug('get subscriptions');
		this.subscriptionOptions = new List<SelectOption>();
		GetSubscriptionForSFAccount g = new GetSubscriptionForSFAccount();
		List<Zuora.zObject> subs = g.Execute(selectedAccountId);
		for(Zuora.zObject sub : subs){
			string name = (string)sub.getValue('Name');
			name = name + ', Status: ' + sub.getValue('Status');
			Date mydate = date.valueOf(sub.getValue('ContractEffectiveDate'));
			name = name + ', Contract Effective Date: ' + myDate.format();
			this.subscriptionOptions.add(new SelectOption((string)sub.getValue('Id'), name));
		}
		onSelectSubscription();
	}
	
	private void getBillingAccountOptions(List<string> zuoraAccountIds){
		this.billingAccountOptions = new List<SelectOption>();
		for(string accId : zuoraAccountIds){
			Zuora.zObject acc = this.zrepo.getAccount(accId);
			string name = (string)acc.getValue('Name');
			name = name + ', Acct#: ' + acc.getValue('AccountNumber');
			Zuora.zObject billto = this.zrepo.getContact((string)acc.getValue('BillToId'));
			name = name + ', Bill to: ' + billto.getValue('FirstName') + ' ' + billto.getValue('LastName');
			Zuora.zObject soldto = this.zrepo.getContact((string)acc.getValue('SoldToId'));
			name = name + ', Sold to: ' + soldto.getValue('FirstName') + ' ' + soldto.getValue('LastName');
			
			this.billingAccountOptions.add(new SelectOption(accId, name));
			if(this.selectedAccountId == null){
				this.selectedAccountId = accId;
				this.getSubscriptionOptions();
			}
		}
	}
	
	public void onSelectAccountType(){
		if(this.selectedAccountType == 'new'){
			this.selectedSubscriptionType = 'new';
			onSelectSubscriptionType();
		}
		if(this.selectedAccountType == 'existing'){
			this.getSubscriptionOptions();
		}
	}
	
	public void onSelectAccount(){
			this.getSubscriptionOptions();
	}
	
	public void onSelectSubscription(){
		SubscriptionOption opt = new SubscriptionOption();
		opt.renewalable = true;
		this.selectedSusbcriptionOption = opt;
	}
	
	public void onSelectSubscriptionType(){
		if(selectedSubscriptionType == 'new'){
		
		}
		if(selectedSubscriptionType == 'existing'){
		
		}
	}
	
	public PageReference createQuote(){
		PageReference pr  =null;
		
		if(this.selectedSubscriptionType == 'new'){
			string url = '/apex/CustomQuoteEdit?eid=' + this.oppId;
			if(this.selectedAccountType == 'existing'){
				url = url + '&accid=' + this.selectedAccountId;
			}
			pr = new PageReference(url);
		}
		else{
			//so /apex/myVFPage?id={!Opportunity.Id} becomes /apex/myPackage__myVFPage?id={!Opportunity.Id}
			pr = new PageReference('/apex/zqu__zqamendment');
			pr.getParameters().put('oppid', this.oppId);
			if(this.selectedAccountType == 'existing'){
				pr.getParameters().put('billingAccountId', this.selectedAccountId);
			}
			if(this.selectedSubscriptionType == 'existing'){
				pr.getParameters().put('subscriptionId', this.selectedSubscriptionId);
			}
		}
		pr.setRedirect(true);
		return pr;
	}
	
	public PageReference cancel(){
		return new PageReference('/' + this.oppId);
	}

}