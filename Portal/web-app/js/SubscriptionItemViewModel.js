function SubscriptionItemViewModel(lic, index){

    this.license = lic;

    this.name = lic.name;

    this.description = '';

    this.enddate = '';

    this.studentcount = ko.observable(lic.quantity);

    this.price = lic.price;

    this.totalprice = ko.computed(function(){
        return lic.price.replace('$','') * this.studentcount();
    }, this);

    this.RenewName = 'Renew' + index;

    this.UpdateName = 'Update' + index;

    this.RenewUpdate = ko.observable('Renew');

    this.RenewalEndDate = lic.renewalEndDate;

    this.IsUpdate = ko.computed(function(){
        return this.RenewUpdate() == 'Update';
    }, this);

    this.RenewUpdate.subscribe(function(nv){
        if(nv == 'Renew'){
            this.studentcount(lic.quantity);
        }

    }, this);
}