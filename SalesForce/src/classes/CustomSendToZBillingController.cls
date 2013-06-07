public with sharing class CustomSendToZBillingController {
    
    public final List<zqu.ZChargeGroup> chargeGroupList {get; set;}
    private final ApexPages.StandardController controller;
    
    //Checks to see if an account exists
    public boolean initFailed {get;set;}
    public String initFailure {get;set;}
    
    //Quote Id
    public String quoteId {get;set;}
    
    //Quote
    public zqu__Quote__c quote {get;set;}
    
    //Account Information
    public String existingAccountId{get;set;}
    public String crmId {get;set;}
    public String accountName {get;set;}
    public String paymentTerm {get;set;}
    public String curr {get;set;}
    public Integer billCycleDay {get;set;}
    public String batch {get;set;}
    public boolean InvoiceDeliveryPrefsEmail{get;set;}
    public boolean InvoiceDeliveryPrefsPrint{get;set;}
    public String AgencyCode {get;set;}
    
    //Contact Information (Used for BillToContact)
    public String firstName {get;set;}
    public String lastName {get;set;}
    public String workEmail {get;set;}
    public String country {get;set;}
    public String state {get;set;}
    public String mailingStreet{get;set;}
    public String mailingCity{get;set;}
    public String mailingPostalCode {get;set;}
    public String homePhone {get;set;}
    public String phone {get;set;}
    public String mobilePhone {get;set;}
    public String otherPhone {get;set;}
    public String mailingStreet2 {get;set;}
    
    //Contact Information (Used for SoldToContact)
    public String firstNameS {get;set;}
    public String lastNameS {get;set;}
    public String workEmailS {get;set;}
    public String countryS {get;set;}
    public String stateS {get;set;}
    public String mailingStreetS{get;set;}
    public String mailingCityS{get;set;}
    public String mailingPostalCodeS {get;set;}
    public String homePhoneS {get;set;}
    public String phoneS {get;set;}
    public String mobilePhoneS {get;set;}
    public String otherPhoneS {get;set;}
    public String mailingStreet2S {get;set;}
    
    public boolean submitQuote{get;set;}
    
    //Payment Method Id
    //public String paymentID {get;set;}
    public String paymentType{get;set;}
    
    //Subscribe message variables
    public String subscribeStatus {get;set;}
    public String subscribeMessage {get;set;}
    public String subscribeRequest {get;set;}
    public String subscribeResponse {get;set;}
    
    
    public List<RatePlanData> ratePlans {get;set;}
    public class RatePlanData {
        public String zId {get;set;}
        public String productName {get;set;}
        public List<RatePlanChargeData> ratePlanCharges {get;set;}
    }
    public class RatePlanChargeData {
        public String zId {get;set;}
        public String price {get;set;}
        public String chargeName {get;set;}
        public String model{get;set;}
        public String quantity {get;set;}
        public Decimal overagePrice {get;set;}
        public Integer includedUnits{get;set;}
        public Decimal discountAmount{get;set;}
        public Decimal discountPercentage{get;set;}
        public List<RatePlanChargeTierData> ratePlanChargeTiers {get;set;}
    }
    
    public class RatePlanChargeTierData {
        public String id{get;set;}
        public Integer tier{get;set;}
        public Decimal startingUnit{get;set;}
        public Decimal endingUnit{get;set;}
        public String priceFormat{get;set;}
        public boolean isOverage{get;set;}
        public Decimal price{get;set;}
        public String curr{get;set;}
    }
    
    //Subscription Information
    public String subType {get;set;}
    public Date effectiveDate {get;set;}
    public Date serviceActivationDate{get;set;}
    public Date customerAcceptanceDate{get;set;}
    public Decimal initialTerm {get;set;}
    public Decimal renewalTerm {get;set;}
    public boolean autoRenew {get;set;}
    
    public boolean previewMode {get;set;}
    public Decimal previewAmount {get;set;}
    
    public boolean showTermLengths {get;set;}
    
    Map<String, zqu__ProductRatePlanCharge__c> tempprpcMap;
    
    //bulkafy the query
    List<zqu__ProductRatePlanCharge__c> prpclist = [select id, zqu__ProductRatePlan__c
    from zqu__ProductRatePlanCharge__c];
    
    //make a set with the list
    Set<zqu__ProductRatePlanCharge__c> tempprpcset = new Set<zqu__ProductRatePlanCharge__c>(prpclist);
    
    public List<String> deleteChargeTiers {get;set;}
    
    private Repository repo;
    
    private ZuoraRepository zrepo;
    
    public void onload()
    {
        submitQuoteCheck();
    }
    
    public CustomSendToZBillingController(ApexPages.StandardController controller) {
        this.repo = new Repository();
        this.zrepo = new ZuoraRepository();
        System.debug('Custom send to zbilling controller constructor');
        this.controller = controller;
        
        //Get the quote id
        this.quoteId = this.controller.getRecord().Id;
        
        //make a map with the set the key is the id
        tempprpcMap = new Map<String, zqu__ProductRatePlanCharge__c>([select id, zqu__ProductRatePlan__c
        from zqu__ProductRatePlanCharge__c where id in : tempprpcset ]);
        
        //Gets the quote
        this.quote = [SELECT zqu__BillToContact__c,zqu__SoldToContact__c, zqu__StartDate__c,
        zqu__PaymentTerm__c, zqu__Currency__c, zqu__Opportunity__c, zqu__Subscription_Term_Type__c,
        zqu__InitialTerm__c, zqu__RenewalTerm__c, zqu__AutoRenew__c, zqu__Service_Activation_Date__c,
        zqu__Customer_Acceptance_Date__c, zqu__Status__c, zqu__PaymentMethod__c, zqu__ZuoraAccountID__c,
        zqu__BillingCycleDay__c, zqu__BillingMethod__c FROM zqu__Quote__c WHERE Id=:this.quoteId LIMIT 1];
        
        if (this.validate()) {
            try {
                string quoteId = this.controller.getRecord().Id;
                System.debug('quoteId: ' + quoteId);
                chargeGroupList = zqu.zQuoteUtil.getChargeGroups(quoteId);
                System.debug('found charge groups: ' + chargeGroupList.size());
                } catch(Exception e) {
                appendMessage(ApexPages.Severity.ERROR, e.getMessage());
                System.debug('' + e);
            }
        }
        
        getContactInformation();
        getSoldContactInformation();
        
        //Subscription info needs to be called before Account Info or billCycleDay will be null
        getSubscriptionInformation();
        getAccountInformation();
        
        if(this.quote.zqu__ZuoraAccountID__c != null)
        {
            existingAccountId = this.quote.zqu__ZuoraAccountID__c;
            System.debug('quote zuora account id not null: ' + existingAccountId);
        }
        else{
            existingAccountId = getExistingAccountIdFromOpp(this.quote.zqu__Opportunity__c);
            System.debug('zuora account for opportunity being used: ' + existingAccountId);
        }
        
        if(existingAccountId != null){
            this.quote.zqu__ZuoraAccountID__c = existingAccountId;
        }
        
        getRatePlanInformation();
    }
    
    private string getExistingAccountIdFromOpp(Id opportunityId){
        System.debug('looking for exising account id');
        Opportunity opp = this.repo.getOpportunity(opportunityId);
        
        Account acc = this.repo.getAccount(opp.AccountId);
        
        if(acc.Agency_Code__c == null){
            System.debug('opportunity account had empty agency code');
            return null;
        }
        
        System.debug('looking for account with account number of ' + acc.Agency_Code__c);
        Zuora.zObject account = zrepo.GetAccountByNumber(acc.Agency_Code__c);
        
        if(account == null){
            return null;
        }
        return (String)account.getValue('Id');
    }
    
    //Updating values on the quote
    public void updateCall(Zuora.zApi.SubscribeResult result)
    {
        this.quote.zqu__Status__c = 'Sent To Z-Billing';
        this.quote.zqu__ZuoraSubscriptionID__c = result.SubscriptionId;
        this.quote.zqu__SubscriptionName__c  = result.SubscriptionNumber;
        this.quote.zqu__ZuoraAccountID__c = result.AccountId;
        
        update this.quote;
    }
    
    //Updating Invoice Delivery preference
    public void updateInvoiceDeliveryPreference(Zuora.zApi zApiInstance, Zuora.zApi.SubscribeResult subResult)
    {
        // zApiInstance should be instantiated and the login() method must
        // have been invoked prior to invoking any other method on the
        // object
        try {
            Zuora.zObject acc = new Zuora.zObject('Account');
            acc.setValue('Id', subResult.AccountId);
            
            //An existing account
            acc.setValue('InvoiceDeliveryPrefsEmail', InvoiceDeliveryPrefsEmail);
            List<Zuora.zObject> objs = new List<Zuora.zObject> {acc};
            List<Zuora.zApi.SaveResult> results = zApiInstance.zupdate(objs);
            
            for (Zuora.zApi.SaveResult result : results) {
                if (result.Success){
                    //get the updated id
                    String updatedId = result.Id;
                }
                else
                {
                    Zuora.zObject[] errors = result.errors;
                    
                    for (Zuora.zObject error : errors)
                    {
                        String errorCode = (String)error.getValue('Code');
                        String message = (String)error.getValue('Message');
                    }
                }
            }
            } catch (Exception ex) {
            System.debug('exception in updateInvoiceDeliveryPreference');
            if(ex != null){
                ex.getMessage();
            }
            
        }
    }
    
    public void getAccountInformation()
    {
    	System.debug('getting account information...');
        Opportunity opp = this.repo.getOpportunity(this.quote.zqu__Opportunity__c);
        System.debug('opportunity is ' + opp.AccountId);
        Account account = this.repo.getAccount('' + opp.AccountId);
        
        crmId = account.Id;
        AgencyCode = account.Agency_Code__c;
        accountName = account.Name;
        
        paymentTerm = this.quote.zqu__PaymentTerm__c;
        curr = this.quote.zqu__Currency__c;
        
        //Creates a data object for today
        Datetime todayDate = System.today();
        
        Map<String, Object> ZConfig = zqu.zQuoteUtil.getZuoraConfigInformation();
        
        Object BCD = ZConfig.get('billingaccount_billcycleday__c');
        billCycleDay = Integer.valueOf(BCD);
        
        Object BatchNum = ZConfig.get('billingaccount_batch__c');
        batch = String.valueOf(BatchNum);
        
        if(quote.zqu__BillingMethod__c == 'Email')
        {
            InvoiceDeliveryPrefsEmail = true;
            InvoiceDeliveryPrefsPrint = false;
        }
        else if(quote.zqu__BillingMethod__c == 'Print')
        {
            InvoiceDeliveryPrefsPrint = true;
            InvoiceDeliveryPrefsEmail = false;
        }
        else if(quote.zqu__BillingMethod__c == 'Both')
        {
            InvoiceDeliveryPrefsPrint = true;
            InvoiceDeliveryPrefsEmail = true;
        }
        else
        {
            InvoiceDeliveryPrefsEmail = false;
            InvoiceDeliveryPrefsPrint = false;
        }
        
        
        /*System.debug('EN:Account crmId' + crmId);
        System.debug('EN:Account accountName' + accountName);
        System.debug('EN:Account paymentTerm' + paymentTerm);
        System.debug('EN:Account curr' + curr);
        System.debug('EN:Account billCycleDay' + billCycleDay);
        System.debug('EN:Account batch' + batch);*/
    }
    
    public void getContactInformation()
    {
        List<Contact> contacts = [Select c.MailingStreet, c.MailingState, c.MailingPostalCode, c.Email,
        c.MailingCountry, c.MailingCity, c.LastName, c.HomePhone, c.FirstName, c.Phone, c.MobilePhone,
        c.OtherStreet, c.OtherPhone From Contact c WHERE Id=:this.quote.zqu__BillToContact__c];
        
        Contact contact = contacts[0];
        
        firstName = contact.FirstName;
        lastName = contact.LastName;
        
        workEmail = contact.Email;
        
        mailingStreet = contact.MailingStreet;
        mailingStreet2 = contact.OtherStreet;
        mailingCity = contact.MailingCity;
        mailingPostalCode = contact.MailingPostalCode;
        country = contact.MailingCountry;
        state = contact.MailingState;
        
        homePhone = contact.HomePhone;
        phone = contact.Phone;
        mobilePhone = contact.MobilePhone;
        otherPhone = contact.OtherPhone;
        
        /*System.debug('EN:Contact firstName' + firstName);
        System.debug('EN:Contact lastName' + lastName);
        System.debug('EN:Contact workEmail' + workEmail);
        System.debug('EN:Contact country' + country);
        System.debug('EN:Contact state' + state);*/
    }
    
    public void getSoldContactInformation()
    {
        List<Contact> contacts = [Select c.MailingStreet, c.MailingState, c.MailingPostalCode, c.Email,
        c.MailingCountry, c.MailingCity, c.LastName, c.HomePhone, c.FirstName, c.Phone, c.MobilePhone,
        c.OtherStreet, c.OtherPhone From Contact c WHERE Id=:this.quote.zqu__SoldToContact__c];
        
        Contact contact = contacts[0];
        
        firstNameS = contact.FirstName;
        lastNameS = contact.LastName;
        
        workEmailS = contact.Email;
        
        mailingStreetS = contact.MailingStreet;
        mailingStreet2S = contact.OtherStreet;
        mailingCityS = contact.MailingCity;
        mailingPostalCodeS = contact.MailingPostalCode;
        countryS = contact.MailingCountry;
        stateS = contact.MailingState;
        
        homePhoneS = contact.HomePhone;
        phoneS = contact.Phone;
        mobilePhoneS = contact.MobilePhone;
        otherPhoneS = contact.OtherPhone;
        
        /*System.debug('EN:Contact firstName' + firstName);
        System.debug('EN:Contact lastName' + lastName);
        System.debug('EN:Contact workEmail' + workEmail);
        System.debug('EN:Contact country' + country);
        System.debug('EN:Contact state' + state);*/
    }
    
    public void getSubscriptionInformation()
    {
        subType = this.quote.zqu__Subscription_Term_Type__c;
        this.showTermLengths = subType != 'Evergreen';
        if(this.quote.zqu__StartDate__c != null)
        {
            effectiveDate = this.quote.zqu__StartDate__c;
        }
        else
        {
            effectiveDate = System.today();
        }
        
        if(this.quote.zqu__Service_Activation_Date__c != null)
        {
            serviceActivationDate = this.quote.zqu__Service_Activation_Date__c;
        }
        else
        {
            serviceActivationDate = effectiveDate;
        }
        
        if(this.quote.zqu__Customer_Acceptance_Date__c != null)
        {
            customerAcceptanceDate = this.quote.zqu__Customer_Acceptance_Date__c;
        }
        else if(this.quote.zqu__Service_Activation_Date__c != null)
        {
            customerAcceptanceDate = serviceActivationDate;
        }
        else
        {
            customerAcceptanceDate = effectiveDate;
        }
        
        //customerAcceptanceDate = this.quote.zqu__Customer_Acceptance_Date__c;
        
        //customerAcceptanceDate = System.today();
        initialTerm = this.quote.zqu__InitialTerm__c;
        renewalTerm = this.quote.zqu__RenewalTerm__c;
        autoRenew = this.quote.zqu__AutoRenew__c;
        
        /*System.debug('EN:Subscription subType' + subType);
        System.debug('EN:Subscription effectiveDate' + effectiveDate);
        System.debug('EN:Subscription initialTerm' + initialTerm);
        System.debug('EN:Subscription renewalTerm' + renewalTerm);
        System.debug('EN:Subscription autoRenew' + autoRenew);*/
    }
    
    public void getRatePlanInformation()
    {
        System.debug('getting rate plan information');
        ratePlans = new List<RatePlanData>();
        deleteChargeTiers = new List<String>();
        
        List<zqu__QuoteCharge__c> quoteCharges = [SELECT Id, zqu__ProductRatePlanCharge__c FROM zqu__QuoteCharge__c WHERE  zqu__Quote__r.Id=:quoteId];
        
        //   List<QuoteCharge__c> allTiers = [SELECT Id, Tier_From__c, Tier_To__c, List_Price__c, curr__c, IsOverageBool__c,
        //       Price_Format__c, Tier_Number__c, OveragePrice__c, QuoteChargeId__c FROM QuoteCharge__c];
        
        List<zqu__ProductRatePlan__c> prps = [ SELECT zqu__ZuoraId__c FROM zqu__ProductRatePlan__c];
        
        
        //Iterates through all the rate plans
        for(zqu.zChargeGroup ratePlan : chargeGroupList)
        {
            //Initializes a rate plan object
            RatePlanData rp = new RatePlanData();
            
            //Defines the product name
            rp.productName = ratePlan.productName;
            
            //System.debug('EN:RP productName' + rp.productName);
            //System.debug('EN:RP zId' + rp.zId);
            
            //Initializes the rate plan charges
            rp.ratePlanCharges = new List<RatePlanChargeData>();
            
            //Iterates through all the charges and assigns them to the rate plan
            for(zqu.zCharge charge : ratePlan.zCharges)
            {
                //Initializes a rate plan charge object
                RatePlanChargeData rpc = new RatePlanChargeData();
                
                //Charges tiers to delete after a successfull subscribe
                //deleteChargeTiers.add(charge.Id);
                
                //Set the charge Id
                rpc.zId = charge.PRODUCT_RATE_PLAN_CHARGE_ZUORA_ID;
                
                //Set the charge name
                rpc.chargeName = charge.NAME;
                
                //Set the price of the charge item
                rpc.price = charge.TOTAL;
                
                //Set the number of charges
                rpc.quantity = charge.QUANTITY;
                
                rpc.model = charge.MODEL;
                
                if(charge.MODEL == 'Discount-Fixed Amount' && charge.EFFECTIVE_PRICE != '-')
                {
                    rpc.discountAmount = Decimal.valueOf(charge.EFFECTIVE_PRICE);
                }
                
                if (charge.MODEL == 'Discount-Percentage' && charge.EFFECTIVE_PRICE != '-')
                {
                    rpc.discountPercentage = Decimal.valueOf(charge.EFFECTIVE_PRICE);
                }
                
                //Set the charges to the rate plan
                rp.ratePlanCharges.add(rpc);
                
                /*System.debug('EN:RPC zId' + rpc.zId);
                System.debug('EN:RPC chargeName' + rpc.chargeName);
                System.debug('EN:RPC price' + rpc.price);
                System.debug('EN:RPC quantity' + rpc.quantity);
                System.debug('EN:Custom UsageProvider' + rpc.UsageProvider);*/
                
                //Sets the rate plan Id
                try{
                    String sfId = getProductRatePlan(charge.PRODUCT_RATE_PLAN_CHARGE_SFDC_ID);
                    
                    for(zqu__ProductRatePlan__c prp: prps)
                    {
                        if(prp.Id == sfId)
                        {
                            rp.zId = prp.zqu__ZuoraId__c;
                        }
                    }
                    //zqu__ProductRatePlan__c prp= [ SELECT zqu__ZuoraId__c FROM zqu__ProductRatePlan__c WHERE Id=:sfId LIMIT 1];
                    
                }
                catch(Exception e)
                {
                    System.debug('exception in getrateplaninformation');
                    if(e != null){
                        System.Debug(e.getMessage() );
                    }
                }
                //System.debug('RatePlanCharge = ' + rpc.zId);
            }
            
            //Adds the rate plan to the list of rate plans
            ratePlans.add(rp);
        }
    }
    
    //get the SFDC product rate plan id based on the SFDC charge id
    public string getProductRatePlan(String id){
        String ratePlanId;
        //product rate plan charge
        try
        {
            ratePlanId = tempprpcMap.get(id).zqu__ProductRatePlan__c;
        }catch(Exception e)
        {
            System.debug('exception in getproductrateplan');
            if(e != null){
                System.Debug('error' + e.getMessage());
            }
            
        }
        
        if(ratePlanId != null)
        {
            //set the email on the invoice custom field
            return ratePlanId;
        }
        
        return null;
    }
    
    public void submitQuoteCheck()
    {
        if(this.quote.zqu__Status__c == 'Sent To Z-Billing')
        {
            submitQuote = false;
        }
        else
        {
            submitQuote = true;
        }
    }
    
    public void subscribe()
    {
        System.debug('subscribe');
        submitQuoteCheck();
        
        System.debug('passed check');
        if(submitQuote)
        {
            // Login Stuff for Zuora sandbox
            subscribeStatus = '---';
            subscribeMessage = '---';
            subscribeRequest = '---';
            subscribeResponse = '---';
            
            Zuora.zApi zApiInstance = new Zuora.zApi();
            
            try {
                if(!Test.isRunningTest())
                {
                    zApiInstance.zlogin();
                }
            }
            catch (Exception ex)
            {
                System.debug('exception in subscribe');
                if(ex != null){
                    subscribeMessage = ex.getMessage();
                }
                return;
            }
            
            try {
                System.debug('setting account');
                //Setting the values for account
                Zuora.zObject acc = new Zuora.zObject('Account');
                if(this.quote.zqu__ZuoraAccountID__c == null)
                {
                    System.debug('creating new account with agency code: ' + AgencyCode);
                    acc.setValue('Name', accountName);
                    acc.setValue('Currency',curr);
                    acc.setValue('BillCycleDay', billCycleDay);
                    acc.setValue('CrmId', crmId);
                    acc.setValue('PaymentTerm', paymentTerm);
                    acc.setValue('Batch',batch);
                    acc.setValue('InvoiceDeliveryPrefsPrint',
                    InvoiceDeliveryPrefsPrint);
                    acc.setValue('AccountNumber', AgencyCode);
                }
                else
                {
					System.debug('using existing account: ' + existingAccountId);
                    acc.setValue('Id', existingAccountId);
                }
                System.debug('setting billto');
                //Setting the values for bill to contact
                Zuora.zObject billToContact = new Zuora.zObject('Contact');
                billToContact.setValue('FirstName',firstName);
                billToContact.setValue('LastName',lastName);
                billToContact.setValue('WorkEmail', workEmail);
                billToContact.setValue('Country',country);
                billToContact.setValue('State',state);
                billToContact.setValue('Address1',mailingStreet);
                billToContact.setValue('Address2',mailingStreet2);
                billToContact.setValue('City',mailingCity);
                billToContact.setValue('PostalCode',mailingPostalCode);
                billToContact.setValue('HomePhone',homePhone);
                billToContact.setValue('MobilePhone',mobilePhone);
                billToContact.setValue('OtherPhone',otherPhone);
                billToContact.setValue('WorkPhone',phone);
                
                System.debug('setting sold to');
                //Setting the values for sold to contact
                Zuora.zObject soldToContact = new Zuora.zObject('Contact');
                if(this.quote.zqu__SoldToContact__c != this.quote.zqu__BillToContact__c)
                {
                    soldToContact.setValue('FirstName',firstNameS);
                    soldToContact.setValue('LastName',lastNameS);
                    soldToContact.setValue('WorkEmail', workEmailS);
                    soldToContact.setValue('Country',countryS);
                    soldToContact.setValue('State',stateS);
                    soldToContact.setValue('Address1',mailingStreetS);
                    soldToContact.setValue('Address2',mailingStreet2S);
                    soldToContact.setValue('City',mailingCityS);
                    soldToContact.setValue('PostalCode',mailingPostalCodeS);
                    soldToContact.setValue('HomePhone',homePhoneS);
                    soldToContact.setValue('MobilePhone',mobilePhoneS);
                    soldToContact.setValue('OtherPhone',otherPhoneS);
                    soldToContact.setValue('WorkPhone',phoneS);
                }
                System.debug('setting subscription');
                //subscription
                Zuora.zObject sub = new Zuora.zObject('Subscription');
                sub.setValue('ContractEffectiveDate', Zuora.zUtil.getZuoraDate(effectiveDate));
                sub.setValue('ServiceActivationDate', Zuora.zUtil.getZuoraDate(serviceActivationDate));
                sub.setValue('ContractAcceptanceDate', Zuora.zUtil.getZuoraDate(customerAcceptanceDate));
                sub.setValue('TermType', subType.toUpperCase());
                
                if(subType != 'EVERGREEN')
                {
                    sub.setValue('InitialTerm', initialTerm);
                    sub.setValue('RenewalTerm', renewalTerm);
                    sub.setValue('AutoRenew', autoRenew);
                }
                
                //subscription options
                Zuora.zApi.SubscribeOptions so= new Zuora.zApi.SubscribeOptions();
                so.GenerateInvoice = false;
                so.ProcessPayments = false;
                
                //Set up preview options
                Zuora.zApi.PreviewOptions previewOpt = new Zuora.zApi.PreviewOptions();
                previewOpt.EnablePreviewMode = previewMode;
                //previewOpt.NumberOfPeriods = 1;
                
                //subscription data
                Zuora.zApi.SubscriptionData sd = new Zuora.zApi.SubscriptionData();
                sd.Subscription = sub;
                System.debug('rate plan datas');
                //Set up rate plan datas
                List<Zuora.zObject> ratePlanDatas = new List<Zuora.zObject>();
                System.debug('RatePlan count: ' + ratePlans.size());
                for(RatePlanData arp : ratePlans){
                    //Rate Plan
                    Zuora.zObject rp = new Zuora.zObject('RatePlan');
                    rp.setValue('ProductRatePlanId', arp.zId);
                    
                    //Make Rate plan Data
                    Zuora.zObject rpd = new Zuora.zObject('RatePlanData');
                    
                    List<Zuora.zObject> rpcds = new List<Zuora.zObject>();
                    
                    System.debug('charges count: ' + arp.ratePlanCharges.size());
                    for(RatePlanChargeData arpc : arp.ratePlanCharges){
                        //Rate Plan Charge
                        Zuora.zObject rpc = new Zuora.zObject('RatePlanCharge');
                        rpc.setValue('Description', arpc.chargeName);
                        rpc.setValue('ProductRatePlanChargeId', arpc.zId);
                        System.debug('pricing');
                        if(arpc.model == 'Flat Fee Pricing' || arpc.model == 'Per Unit Pricing')
                        {
                            if((arpc.price != '-') && (arpc.price != 'Varies') && (arpc.price != 'Flat Fee'))
                            {
                                rpc.setValue('Price', arpc.price);
                            }
                        }
                        
                        if(arpc.model == 'Discount-Fixed Amount')
                        {
                            rpc.setValue('DiscountAmount', arpc.discountAmount);
                        }
                        
                        if(arpc.model == 'Discount-Percentage')
                        {
                            rpc.setValue('DiscountPercentage', arpc.discountPercentage);
                        }
                        
                        if(arpc.quantity != '-')
                        {
                            rpc.setValue('Quantity', arpc.quantity);
                        }
                        
                        if(arpc.overagePrice != null)
                        {
                            rpc.setValue('OveragePrice', arpc.overagePrice);
                        }
                        
                        if(arpc.includedUnits != null)
                        {
                            rpc.setValue('IncludedUnits', arpc.includedUnits);
                        }
                        
                        rpc.setValue('Perpetual__c', getPerpetual(arpc));
                        
                        System.debug('tiers');
                        //Add Charge Tiers
                        List<Zuora.zObject> rpcdts = new List<Zuora.zObject>();
                        if(arpc.ratePlanChargeTiers != null)
                        {
                            System.debug('rate plan charge tiers: ' + arpc.ratePlanChargeTiers.size());
                            for(RatePlanChargeTierData arpct: arpc.ratePlanChargeTiers)
                            {
                                Zuora.zObject rpct = new Zuora.zObject('RatePlanChargeTier');
                                
                                rpct.setValue('StartingUnit', arpct.startingUnit);
                                rpct.setValue('EndingUnit', arpct.endingUnit);
                                rpct.setValue('Price', arpct.price);
                                rpct.setValue('Tier', arpct.tier);
                                
                                if(arpct.priceFormat == 'Flat Fee')
                                {
                                    rpct.setValue('PriceFormat', 'FlatFee');
                                }
                                else if(arpct.priceFormat == 'Per Unit')
                                {
                                    rpct.setValue('PriceFormat', 'PerUnit');
                                }
                                else
                                {
                                    rpct.setValue('PriceFormat', arpct.priceFormat);
                                }
                                
                                if(arpc.model == 'Tiered Pricing' || arpc.model == 'Volume Pricing')
                                {
                                    rpct.setValue('IsOveragePrice', arpct.isOverage);
                                }
                                
                                rpcdts.add(rpct);
                            }
                        }
                        
                        
                        Zuora.zObject rpcd = new Zuora.zObject('RatePlanChargeData');
                        rpcd.setValue('RatePlanCharge', rpc);
                        
                        if(arpc.model != 'Overage Pricing')
                        {
                            rpcd.setValue('RatePlanChargeTier', rpcdts);
                        }
                        
                        rpcds.add(rpcd);
                    }
                    
                    //Attach Rateplan to rateplan data
                    rpd.setValue('RatePlan', rp);
                    /*Attach Rateplan to rateplan data*/
                    rpd.setValue('RatePlanChargeData', rpcds);
                    
                    ratePlanDatas.add(rpd);
                }
                
                sd.RatePlanData = ratePlanDatas;
                System.debug('rate plan datas: ' + ratePlanDatas.size());
                //subscribe request
                Zuora.zApi.SubscribeRequest subsRequest = new Zuora.zApi.SubscribeRequest();
                subsRequest.ZAccount = acc;
                subsRequest.BillToContact = billToContact;
                if(this.quote.zqu__SoldToContact__c != this.quote.zqu__BillToContact__c){
                    subsRequest.SoldToContact = soldToContact;
                }
                
                subsRequest.SubscribeOptions = so;
                subsRequest.SubscriptionData = sd;
                
                //subsRequest.PreviewOptions = previewOpt;
                
                List<Zuora.zApi.SubscribeRequest> subsRequestLists = new List<Zuora.zApi.SubscribeRequest>{subsRequest};
                List<Zuora.zApi.SubscribeResult> subscribeResults;
                
                if(!Test.isRunningTest()){
                    subscribeResults = zApiInstance.zsubscribe(subsRequestLists);
                    subscribeRequest = Zuora.zApi.currentLogger.request;
                    subscribeResponse = Zuora.zApi.currentLogger.response;
                }
                else{
                    subscribeResults = new List<Zuora.zApi.SubscribeResult> {};
                    Zuora.zApi.SubscribeResult subRes = new Zuora.zApi.SubscribeResult();
                    subRes.Success = true;
                    subscribeResults.add(subRes);
                    
                }
                
                for (Zuora.zApi.SubscribeResult result : subscribeResults) {
                    if (result.Success) {
                        String message2 = 'This Quote has been successfully sent to the billing system and an Order has been created.';
                        subscribeStatus =  message2;
                        /*Delete Tiers to Reduce Storage*/
                        //deleteQuoteChargeTiers();
                        /*Update Invoice Delivery Preference*/
                        updateInvoiceDeliveryPreference(zApiInstance, result);
                        /*Updates values on the quote*/
                        updateCall(result);
                        appendMessage(ApexPages.Severity.CONFIRM, message2);
                        submitQuote = false;
                        
                        if (result.InvoiceDatas != null) {
                            for (Zuora.zObject invData: result.InvoiceDatas)
                            {
                                //In Preview mode, handle with the invoice data
                                Zuora.zObject invoice = (Zuora.zObject) invData.getValue( 'Invoice' );
                                previewAmount = ( Decimal ) invoice.getValue( 'Amount' );
                            }
                        }
                    }
                    else
                    {
                        Zuora.zObject[] errors = result.errors;
                        for (Zuora.zObject error : errors)
                        {
                            subscribeStatus = 'Failure';
                            subscribeMessage = 'Subscribe failed: ' + (String)error.getValue('Message');
                            ApexPages.addmessage(new ApexPages.Message(ApexPages.Severity.ERROR, subscribeMessage));
                        }
                    }
                }
            }
            catch (Exception ex )
            {
                subscribeStatus = 'Failure.';
                subscribeMessage = 'Unhandled Exception: ' + ex.getMessage();
                System.debug('failure in subscribe');
                return;
            }
        }
    }
    
    private string getPerpetual(RatePlanChargeData rpc){
        System.debug('looking for zcharges with z id of ' + rpc.zId);
        
        zqu.zCharge thezcharge = null;
        
        for(zqu.zChargeGroup chargeGroup : chargeGroupList){
            for(zqu.zCharge zcharge: chargeGroup.zCharges){
                if(zcharge.PRODUCT_RATE_PLAN_CHARGE_ZUORA_ID == rpc.zId){
                    System.debug('found zcharge');
                    thezcharge = zCharge;
                }
            }
        }
        
        if(thezcharge == null){
            System.debug('didnt find zcharge matching ' + rpc.zId);
        }
        
        System.debug('looking for quote charges with id of ' + thezcharge.Id);
        
        zqu__QuoteCharge__c charge = this.repo.getQuoteCharge(thezcharge.Id);
        
        System.debug('using perpetual of ' + charge.Perpetual__c);
        
        return charge.Perpetual__c;
    }
    
    private Boolean validate() {
        if (null == this.controller.getRecord() || null == this.controller.getRecord().Id) {
            appendMessage(ApexPages.Severity.ERROR, 'Need to specify the id of quote for creating subscription.');
            return false;
        }
        return true;
    }
    
    private static void appendMessage(ApexPages.Severity messageType, String message) {
        ApexPages.addMessage(new ApexPages.Message(messageType, message));
    }
}