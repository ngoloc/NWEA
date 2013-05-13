function HomeViewModel() {

    this.pmurl = ko.observable('');

    this.IsLoading = ko.observable(true);

    this.IsLoadingRelated = ko.observable(true);

    this.Licenses = ko.observableArray([]);

    this.RelatedItems = ko.observableArray([]);

    this.Renewals = ko.observable([]);

    this.EnrollmentViewModel = new EnrollmentViewModel(0);

    this.SubscriptionsViewModel = new SubscriptionsViewModel([]);

    this.NoLicenses = ko.computed(function() {
        return this.Licenses().length == 0;
    }, this);

    this.NoRenewals = ko.computed(function() {
        return this.Renewals().length == 0;
    }, this);

    this.NoRelated = ko.computed(function() {
        return this.RelatedItems().length == 0;
    }, this);

    this.AreNewLicensesReady = ko.computed(function(){
        var related = ko.utils.arrayFilter(this.RelatedItems(), function(item){
            return item.newQuantity() > 0;
        });

        var renewals = ko.utils.arrayFilter(this.Renewals(), function(item){
            return item.newQuantity() > 0;
        });

        return related.length || renewals.length;

    }, this);

    this.purchasePO = function() {
        if(isReadyToPurchase()){
            purchase('po');
        }
    };

    this.purchaseCC = function() {
        if(isReadyToPurchase()){
            purchase('cc');
        }
    };

    this.submitiframe = function(){
        submitHostedPage('pmiframe');
    };

    this.showpo = function(){
        if(isReadyToPurchase()){
            $('#pomodal').modal('show');
        }
    };

    this.showcc = function(){
        if(isReadyToPurchase()){
            $('#ccmodal').modal('show');
        }
    };

    this.submitcontact = function(){
        var params = {
            firstname: $('#firstname').val(),
            lastname: $('#lastname').val(),
            address1: $('#address1').val(),
            address2: $('#address2').val(),
            city: $('#city').val(),
            postalcode: $('#postalcode').val(),
        };
        $.post('addcontact', params, function(data){
            if(data){
                toastr.error(data);
            }
            else{
                $('#contactmodal').modal('hide');
                purchase('po');
            }
        });
    };
};