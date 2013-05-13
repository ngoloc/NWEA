function EnrollmentViewModel(currrentCount) {

    this.CurrentEnrollmentCount = ko.observable(currrentCount);

    this.EnrollmentFloor = ko.observable(currrentCount - (currrentCount *.1));

    this.UpdateRenewEnrollment = ko.observable('Renew');

    this.UpdateRenewEnrollment.subscribe(function(nv){
    });

    this.IsUpdate = ko.computed(function(){
        return this.UpdateRenewEnrollment() == 'Update';
    }, this);

    this.IsRenew = ko.computed(function(){
        return this.UpdateRenewEnrollment() == 'Renew';
    }, this);

}