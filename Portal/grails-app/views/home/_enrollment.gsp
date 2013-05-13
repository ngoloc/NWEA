<div class="HomeSectionTitle Title SectionTitle">Update Enrollment</div>

<div class="SectionInstructions">
    Your annual per-student price with NWEA is based in part on the percentage of your overall K-12 enrollment that is licensed. Only MAP and MAP for Primary Grades licenses are used to calculated this price. Would you like to update your K-12 enrollment?
</div>

<div class="Enrollment" data-bind="with: EnrollmentViewModel">
    <div class="ChooseType">
        <div class="RenewOption">
            <input type="radio" name="UpdateRenewEnrollment" id="Renew" value="Renew"
                   data-bind="checked: UpdateRenewEnrollment"/><label for="Renew">Renew as is</label>

        </div>

        <div class="RenewOption">
            <input type="radio" name="UpdateRenewEnrollment" id="Update" value="Update"
                   data-bind="checked: UpdateRenewEnrollment"/><label for="Update">Update</label>
        </div>
    </div>

    <div class="TypeDetails">
        <div class="RenewDetails" data-bind="visible: IsRenew">
            Current Enrollment set to <span data-bind="text: CurrentEnrollmentCount" class="CurrentEnrollmentCount"></span>
        </div>

        <div class="UpdateDetails" data-bind="visible: IsUpdate">
            <span style="font-weight: bold">Update student enrollment</span>

            <div class="muted ToUpdateNote">
                To update, enter the new student enrollment on the right and click Continue. This will refresh the page and present you with renewal information reflecting the new enrollment number.
            </div>

            <div class="OnlineRenewalNote">
                Note: Online Renewal does not support lowering enrollment by more than 10%. If you need to update enrollment to lower than <span
                    data-bind="text: EnrollmentFloor" class="EnrollmentFloorCount"></span> you must contact your Partner Relations Representative for a price quote.

            </div>

            <span style="font-weight: bold">Enrollment:</span>
            <input class="UpdateEnrollmentCount" type="text" data-bind="value: CurrentEnrollmentCount"/>

        </div>
    </div>
</div>
