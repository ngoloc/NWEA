var homevm;

function isaccountactive(){
	$.post('isactive', {}, function(data){
		if(data){
			purchase('po');
		}
		else{
			promptforcontact();
		}
	});
}

function promptforcontact(){
	$('#contactmodal').modal('show');
}

function isReadyToPurchase(){
	if(homevm.IsLoading()){
		toastr.warning('Not ready');
		return false;
	}
	return true;
}

function closeAndPurchase() {
	$('#ccmodal').modal('hide');
	purchase('cc');
}

function purchase(method) {
	var requests = getPurchaseRequests();
	if(requests.length == 0){
		toastr.error('no licenses selected');
		return;
	}
	
	var productids = [];
	var quantities = [];
	var prices = [];
    var types = [];
    var subids = [];
	$.each(requests, function(i, ele){
		productids.push(ele.id);
		quantities.push(ele.quantity);
		prices.push(ele.price);
        types.push(ele.type);
        subids.push(ele.subid);
	});
	
	showSpinner();
	$.post('purchase', {
		method : method,
		productids : productids.join(','),
		quantities: quantities.join(','),
		prices: prices.join(','),
		ponumber : $('#ponumber').val()
	}, function(data) {
		hideSpinner();
		if(data.error){
			toastr.error(data.error);
		}
		else{
			showSpinner();
			window.location.href = '../OrderCompleted/index';
		}
	});
}

function getPurchaseRequests() {
	var requests = [];
	$.each(homevm.SubscriptionsViewModel.Subscriptions(), function(i, ele) {
        requests.push({
            id : ele.license.id,
            quantity : ele.studentcount(),
            price: ele.price.replace('$',''),
            type: ele.RenewUpdate(),
            subid: ele.license.item.subscriptionId
        });
	});

    $.each(homevm.RelatedItems(), function(i, ele){
        if(ele.newQuantity() > 0){
         requests.push({
             id: ele.id,
             quantity: ele.newQuantity(),
             price: (ele.item.pricePerUnit || ele.price || '').replace('$',''),
             type: 'New',
             subid: null
         });
        }
    });

	return requests;
}

function getHomeSummary() {
	homevm.IsLoading(true);
	$.post('summary', {}, function(data) {
		var licenses = [];

        $.each(data.licenses, function(i, ele) {
			if(ele.pricePerUnit && ele.pricePerUnit > 0){
				licenses.push(new LicenseViewModel(ele));
			}
		});

		homevm.Licenses(licenses);

        homevm.SubscriptionsViewModel.SetSubscriptions(licenses);
        homevm.SubscriptionsViewModel.IsLoading(false);

		homevm.pmurl(data.pmurl);
		homevm.IsLoading(false);
	});
}

function getRelatedProducts(){
     homevm.IsLoadingRelated(true);
    $.post('../api/related?' + new Date().getTime(), {}, function(data){
        var related = $.map(data, function(ele){
             return new LicenseViewModel(ele);
        });

        homevm.RelatedItems(related);
        homevm.IsLoadingRelated(false);
    }) ;
}

$(document).ready(function() {
    if($('.home').length){
        homevm = new HomeViewModel();
        ko.applyBindings(homevm, $('.home')[0]);
        getHomeSummary();
        getRelatedProducts();
    }
});