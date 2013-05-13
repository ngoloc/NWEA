<span data-bind="with: SubscriptionsViewModel">
    <div class="HomeSectionTitle Title SectionTitle">Current Subscriptions (<span
            data-bind="text: SubscriptionCount"></span>)
    </div>

    <div class="HomeSection Section">
        <div class="NoneMessage" data-bind="visible: (NoSubscriptions() && !IsLoading())">No
        Renewals Found</div>

        <div class="loading" data-bind="visible:IsLoading">
            <g:message code="spinner.alt" default="Loading&hellip;"/>
        </div>
        <table data-bind="visible: (!IsLoading() && !NoSubscriptions())" id="SubscriptionsTable">
            <thead>
            <th>
                Renewal
            </th>
            <th>
                Service Name/Description
            </th>
            <th class="Center">
                New Term End Date
            </th>
            <th class="Center">
                Students
            </th>
            <th class="Center">
                Price
            </th>
            </thead>
            <tbody data-bind="foreach: Subscriptions">
            <tr>
                <td>
                    <div class="ChooseType">
                        <div class="RenewOption">
                            <input type="radio" value="Renew"
                                   data-bind="attr: {id: RenewName}, checked: RenewUpdate"/><label
                                data-bind="attr: {for: RenewName}">Renew as is</label>
                        </div>

                        <div class="RenewOption">
                            <input type="radio" value="Update"
                                   data-bind="attr: {id: UpdateName}, checked: RenewUpdate"/><label
                                data-bind="attr: {for: UpdateName}">Update</label>
                        </div>
                    </div>
                </td>
                <td class="LeftBorder ServiceNameCell">
                    <span data-bind="text: name" class="ServiceName"></span>
                    <span data-bind="text: description" class="ServiceDescription"></span>
                </td>
                <td data-bind="text: RenewalEndDate" class="Center LeftBorder">
                </td>
                <td data-bind="text: studentcount" class="Center LeftBorder">
                </td>
                <td class="Center LeftBorder">
                    <span data-bind="text: totalprice"></span>
                </td>
            </tr>
            <tr data-bind="visible: IsUpdate">
                <td colspan="5" class="UpdateSubscriptionRow">
                    <input data-bind="value: studentcount, valueUpdate: 'afterkeydown'" type="text"/>
                </td>
            </tr>
            </tbody>

        </table>
    </div>
</span>