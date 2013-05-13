<div class="HomeSectionTitle Title SectionTitle">License Summary</div>

<div class="HomeSection Section">
    <div class="loading" data-bind="visible:IsLoading">
        <g:message code="spinner.alt" default="Loading&hellip;"/>
    </div>

    <div class="NoneMessage" data-bind="visible: (NoLicenses() && !IsLoading())">No
    Licenses Found</div>
    <table class="table table-striped table-hover"
           data-bind="visible: (!IsLoading() && !NoLicenses())">
        <thead>
        <tr>
            <th>Product</th>
            <th>Quantity</th>
            <th>Tested</th>
        </tr>
        </thead>
        <tbody data-bind="foreach: Licenses">
        <tr>
            <td data-bind="text: name"></td>
            <td data-bind="text: quantity"></td>
            <td data-bind="text: suggestedQuantity"></td>
        </tr>
        </tbody>
    </table>
</div>