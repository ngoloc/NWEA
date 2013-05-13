function SubscriptionsViewModel(subs){


    this.Subscriptions = ko.observable([]);
                                              var self = this;
                        this.SetSubscriptions = function(subs){

                            var ss = [];
                            $.each(subs, function(i, ele){
                                ss.push(new SubscriptionItemViewModel(ele, i) );
                            });
                            self.Subscriptions(ss);
                        };

    this.SetSubscriptions(subs);

    this.SubscriptionCount = ko.computed(function(){

        return this.Subscriptions().length;

    }, this);


    this.IsLoading = ko.observable(true);

    this.NoSubscriptions = ko.computed(function(){
        return this.Subscriptions().length == 0;

    }, this);
}