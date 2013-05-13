var SubscriptionViewModel = function(){
    this.StartDate = null;
    this.EndDate = null;
    this.ActivatePlans = [];
    this.RemovedPlans = [];
};

var PlanViewModel = function(){

    this.ProductName = null;
    this.Description = null;
    this.EffectiveDate = null;
    this.AmendmentType = null;

};