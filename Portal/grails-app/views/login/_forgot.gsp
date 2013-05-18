<div class="column hide cbform" id="forgot">
    <h3>Reset Password</h3>
    <g:form name="forogotform"  class="content"
            url="[action: 'reset', controller: 'forgot']">
        <fieldset>
            <span class="required-label">
                <span class="required">*</span> Required info
            </span>

            <div class="formContainer">
                <g:if test="${flash.forgotmessage}">
                    <div class="errors">${flash.forgotmessage}</div>
                </g:if>
                <div class="inputs">
                    <div class="control">
                        <div class="labelContainer">
                            <label for="email">Email</label>
                        </div>

                        <div class="fieldContainer">
                            <input type="text" class="text-input" id="email" name="email"
                                   data-val="true" data-val-required="Required" data-val-email/>
                        </div>
                        <span class="field-validation-valid validationText errors"
                              data-valmsg-for="email" data-valmsg-replace="true">
                        </span>
                    </div>
                    <div class="form-footer">
                        <p><a href="#" id="ShowLoginLink">Login</a>.</p>
                        <span class="button">
                            <input type="submit" id="accountSubmit" value="Reset Password">
                        </span>
                    </div>
                </div>
            </div>
        </fieldset>
    </g:form>
</div>
