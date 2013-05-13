function LicenseViewModel(item) {

    this.name = item.name;

    this.id = item.productId;

    this.quantity = item.quantity;

    this.newQuantity = ko.observable();

    this.price = '$' + (item.pricePerUnit || item.price);

    this.suggestedQuantity = item.suggestedQuantity || '';

    this.item = item;

    this.renewalEndDate = item.renewalEndDate;

    this.total = ko.computed(function() {
        var total = this.newQuantity() * (this.item.pricePerUnit || this.item.price);
        return isNaN(total) ? '' : ('$' + total);
    }, this);
}