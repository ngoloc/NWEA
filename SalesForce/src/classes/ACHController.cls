public with sharing class ACHController extends PageControllerBase{


	public string routing {get;set;}
	
	public string account {get;set;}
	
	public string accountType {get;set;}
	
	public string bank {get;set;}
	
	public string name {get;set;}

	private string quoteId;

	private Repository repo;

	private zqu__Quote__c quote;

	public boolean accountExists {get;set;}

	private ZuoraRepository zuoraRepo;

	private string paymentMethodId;

	public ACHController(ApexPages.StandardController controller){
		this.quoteId = controller.getRecord().Id;
		this.repo = new Repository();
		this.zuoraRepo = new ZuoraRepository();
		this.quote = repo.getQuote(this.quoteId);
		this.paymentMethodId = null;
		if(quote.zqu__ZuoraAccountID__c == null){
			super.appendErrorMessage('Quote must be sent to Z-Billing first.');
			this.accountExists = false;
		}
		else{
			setupExisting();
			this.accountExists = true;
		}
	}
	
	private void setupExisting(){
		 List<Zuora.zObject> paymentMethods = this.zuoraRepo.getPaymentMethodsByAccountId(this.quote.zqu__ZuoraAccountId__c);
		 if(paymentMethods != null && paymentMethods.size() > 0){
		 	for(Zuora.zObject pm : paymentMethods){
		 		System.debug('type: ' + pm.getValue('Type'));
		 		System.debug('active: ' + pm.getValue('active'));
		 		if(pm.getValue('Type') == 'ACH'){
		 			this.routing = (string)pm.getValue('AchAbaCode');
		 			this.account = (string)pm.getValue('AchAccountNumberMask');
		 			this.accountType = (string)pm.getValue('AchAccountType');
		 			this.bank = (string)pm.getValue('AchBankName');
		 			this.name = (string)pm.getValue('AchAccountName');
		 			this.paymentMethodId = (string)pm.getValue('Id');
		 		}
		 	}
		 }
	}
	
	public PageReference save(){
		List<Zuora.zApi.SaveResult> results;
		Zuora.zObject pm = new Zuora.zObject('PaymentMethod');
		pm.setValue('AccountId', this.quote.zqu__ZuoraAccountId__c);
		pm.setValue('AchAbaCode', this.routing);
		pm.setValue('AchAccountType', this.accountType);
		pm.setValue('AchBankName', this.bank);
		pm.setValue('AchAccountName', this.name);
		
		if(this.paymentMethodId == null){
			pm.setValue('AchAccountNumber', this.account);
			pm.setValue('Type', 'ACH');
			System.debug('creating payment method');
			results = this.zuoraRepo.create(pm);
		}
		else{
			pm.setValue('Id', this.paymentMethodId);
			System.debug('updating payment method ' + this.paymentMethodId);
			results = this.zuoraRepo.zupdate(pm);
		}
		List<string> errors = this.zuoraRepo.GetErrors(results);
		for(string e : errors){
			super.appendErrorMessage(e);
		}
		if(errors.size() == 0){
			return new PageReference('/' + this.quoteId);
		}		
		return null;
	}
	
	public List<SelectOption> getItems(){
		List<SelectOption> options = new List<SelectOption>();
		options.add(new SelectOption('Checking', 'Checking'));
		options.add(new SelectOption('Saving', 'Saving'));
		options.add(new SelectOption('BusinessChecking', 'Business Checking'));
		return options;
	}
	
	public PageReference cancel(){
		return new PageReference('/' + this.quoteId);
	}
}