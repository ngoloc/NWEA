<div class="column cbform" id="login">
    <h3>Returning Customers Sign In</h3>
    <g:form name="loginform" class="content" url="[action: 'login', controller: 'login']">
        <fieldset>
            <span class="required-label">
                <span class="required">*</span> Required info
            </span>

            <div class="formContainer">
                <g:if test="${flash.loginmessage}">
                    <div class="errors">${flash.loginmessage}</div>
                </g:if>
                <div class="inputs">
                    <div class="control">
                        <div class="labelContainer">
                            <label for="email">Email</label>
                        </div>
                        <div class="fieldContainer">
                            <input type="text" class="text-input" id="email" name="email" data-val="true" data-val-required="Required" data-val-email/>
                        </div>
                        <span class="field-validation-valid validationText errors" data-valmsg-for="email" data-valmsg-replace="true">
                        </span>
                    </div>

                    <div class="control">
                        <div class="labelContainer">
                            <label for="code">Agency Code:</label>
                        </div>

                        <div class="fieldContainer">
                            <input type="text" class="text-input" id="code" name="code" data-val="true" data-val-required="Required"/>
                        </div>
                        <span class="field-validation-valid validationText errors" data-valmsg-for="code" data-valmsg-replace="true">
                        </span>
                    </div>

                    <div class="control">
                        <div class="labelContainer">
                            <label for="password">Password:</label>
                        </div>
                        <div class="fieldContainer">
                            <input type="password" class="text-input" id="password" name="password" data-val="true" data-val-required="Required" />
                        </div>
                        <span class="field-validation-valid validationText errors" data-valmsg-for="password" data-valmsg-replace="true">
                        </span>
                    </div>

                    <div class="form-footer">
                        <p><a href="#" id="ForgotPasswordLink">Forgot Password</a>.</p>
                        <span class="button">
                            <input type="submit" value="Login">
                        </span>
                    </div>
                </div>
            </div>
        </fieldset>
    </g:form>
</div>


