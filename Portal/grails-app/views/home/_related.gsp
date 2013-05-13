<div class="HomeSectionTitle Title SectionTitle">Related Items</div>

<div class="HomeSection Section">
    <div class="NoneMessage" data-bind="visible: (NoRelated() && !IsLoadingRelated())">No Related Items
    Found</div>

    <div class="loading" data-bind="visible: IsLoadingRelated">
        <g:message code="spinner.alt" default="Loading&hellip;"/>
    </div>
    <table class="table table-striped table-hover"
           data-bind="visible: (!IsLoadingRelated() && !NoRelated())">
        <thead>
        <tr>
            <th>Product</th>
            <th>New QTY</th>
            <th>Price</th>
            <th>Total</th>
        </tr>
        </thead>
        <tbody data-bind="foreach: RelatedItems">
        <tr>
            <td data-bind="text: name"></td>
            <td><input type="text" data-bind="value: newQuantity, valueUpdate: 'afterkeydown'"/></td>
            <td data-bind="text: price"></td>
            <td data-bind="text: total" class="TotalColumn"></td>
        </tr>
        </tbody>
    </table>
</div>