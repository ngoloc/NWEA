<div id="contactmodal" class="modal hide fade" tabindex="-1"
     role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal"
                aria-hidden="true">×</button>

        <h3 id="myModalLabel">Enter Contact Information</h3>
    </div>

    <div class="modal-body">
        <div class="ContactRequiredForPurchase">Contact information is
        required for purchase.</div>
        <g:form name="contactform"
                url="[action: 'create', controller: 'contact']"
                class="form-horizontal">

            <div class="control-group">
                <label class="control-label" for="firstname"><span style="color:red">*</span>First Name</label>

                <div class="controls">
                    <input type="text" id="firstname" placeholder="First Name">
                </div>
            </div>

            <div class="control-group">
                <label class="control-label" for="lastname"><span style="color:red">*</span>Last Name</label>

                <div class="controls">
                    <input type="text" id="lastname" placeholder="Last Name">
                </div>
            </div>

            <div class="control-group">
                <label class="control-label" for="address1">Address 1</label>

                <div class="controls">
                    <input type="text" id="address1" placeholder="Address 1">
                </div>
            </div>

            <div class="control-group">
                <label class="control-label" for="address2">Address 2</label>

                <div class="controls">
                    <input type="text" id="address2" placeholder="Address 2">
                </div>
            </div>

            <div class="control-group">
                <label class="control-label" for="city">City</label>

                <div class="controls">
                    <input type="text" id="city" placeholder="City">
                </div>
            </div>


            <div class="control-group">
                <label class="control-label" for="postal">Postal Code</label>

                <div class="controls">
                    <input type="text" id="postal" placeholder="Postal Code">
                </div>
            </div>

            <div class="control-group">
                <label class="control-label" for="country">Country</label>

                <div class="controls">
                    <input type="text" id="country" placeholder="Country">
                </div>
            </div>

        </g:form>
    </div>

    <div class="modal-footer">
        <button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
        <button class="btn btn-primary" data-bind="click: submitcontact">Continue</button>
    </div>
</div>