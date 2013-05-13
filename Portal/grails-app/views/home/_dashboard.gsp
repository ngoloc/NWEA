<div class="Dashboard">
    <div class="DashboardTitle" data-bind="visible: !IsLoading()">
        Service Dashboard
    </div>

    <div class="loading" data-bind="visible:IsLoading">
        <g:message code="spinner.alt" default="Loading&hellip;"/>
    </div>

    <div class="NoneMessage" data-bind="visible: (NoLicenses() && !IsLoading())">No
    Licenses Found</div>
    <table id="DashboardTable" data-bind="visible: (!IsLoading() && !NoLicenses())">
        <thead>
        <tr>
            <th>Subscriptions</th>
            <th class="DashboardMetricColumn">Licenses</th>
            <th class="DashboardMetricColumn">Tested</th>
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