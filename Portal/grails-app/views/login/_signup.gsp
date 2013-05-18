<div class="column cbform">
    <h3>Get started in 30 seconds</h3>
    <g:form name="signupform" class="content" url="[action: 'signup', controller: 'Signup']">
        <fieldset>
            <span class="required-label">
                <span class="required">*</span> Required info
            </span>

            <div class="formContainer">
                <g:if test="${flash.signupmessage}">
                    <div class="errors">${flash.signupmessage}</div>
                </g:if>
                <div class="inputs">
                    <div class="control">
                        <div class="labelContainer required">
                            <label for="name">Name</label>
                            <span class="required">*</span>
                        </div>
                        <div class="fieldContainer">
                            <input type="text" class="text-input" id="name" name="name" data-val="true" data-val-required="Required"/>
                        </div>
                        <span class="field-validation-valid validationText errors"data-valmsg-for="name" data-valmsg-replace="true">
                        </span>
                    </div>
                    <div class="control">
                        <div class="labelContainer required">
                            <label for="email">Email</label>
                            <span class="required">*</span>
                        </div>
                        <div class="fieldContainer">
                            <input type="text" class="text-input" id="email" name="email"
                                   data-val="true" data-val-required="Required" data-val-email/>
                        </div>
                        <span class="field-validation-valid validationText errors"
                              data-valmsg-for="email" data-valmsg-replace="true">
                        </span>
                    </div>
                    <div class="control">
                        <div class="labelContainer required">
                            <label for="code">Agency Code:</label>
                            <span class="required">*</span>
                        </div>

                        <div class="fieldContainer">
                            <input type="text" class="text-input" id="code" name="code" data-val="true"
                                   data-val-required="Required" />
                        </div>
                        <span class="field-validation-valid validationText errors"
                              data-valmsg-for="code" data-valmsg-replace="true">
                        </span>
                    </div>
                    <div class="control">
                        <div class="labelContainer required">
                            <label for="password">Password:</label>
                            <span class="required">*</span>
                        </div>
                        <div class="fieldContainer">
                            <input type="password" class="text-input" id="password" name="password" data-val="true"
                                   data-val-required="Required" />
                        </div>
                        <span class="field-validation-valid validationText errors"
                              data-valmsg-for="password" data-valmsg-replace="true">
                        </span>
                    </div>
                    <div class="control">
                        <div class="labelContainer required">
                            <label for="confirmpassword">Confirm Password:</label>
                            <span class="required">*</span>
                        </div>
                        <div class="fieldContainer">
                            <input type="password" class="text-input" id="confirmpassword" name="confirmpassword" data-val="true" data-val-required="Required" />
                        </div>
                        <span class="field-validation-valid validationText errors"
                              data-valmsg-for="confirmpassword" data-valmsg-replace="true" data-val-equalto="Password and Confirm password do not match" data-val-equalto-other="password">
                        </span>
                    </div>

                    <div class="form-footer">
                        <span class="button">
                            <input type="submit" id="accountSubmit" value="Sign Up">
                        </span>
                    </div>
                </div>
            </div>
        </fieldset>
    </g:form>
</div>
