<div id="login" class="loginitemcontainer">
    <div class="title">returning customers</div>

    <div class="title">sign in</div>
    <g:if test="${flash.loginmessage}">
        <div class="alert alert-error">
            ${flash.loginmessage}
        </div>
    </g:if>
    <g:form name="loginform" url="[action: 'login', controller: 'login']">
        <div class="control-group">
            <input type="text" name="email" placeholder="Email" data-val="true"
                   data-val-required="Required" data-val-email/> <br/>
            <span class="field-validation-valid validationText help-inline"
                  data-valmsg-for="email" data-valmsg-replace="true"></span>
        </div>

        <div class="control-group">
            <input type="text" name="code" placeholder="Agency Code"
                   data-val="true" data-val-required="Required"/> <br/>
            <span class="field-validation-valid validationText help-inline"
                  data-valmsg-for="code" data-valmsg-replace="true"></span>
        </div>

        <div class="control-group">
            <input type="password" name="password" placeholder="Password"
                   data-val="true" data-val-required="Required"/><br/> <span
                class="field-validation-valid validationText help-inline"
                data-valmsg-for="password" data-valmsg-replace="true"></span>
        </div>

        <div class="submitcontainer">
            <input type="submit" class="button" value="Login"></input>
        </div>

        <div class="ForogotPasswordLinkContainer">
            <a href="#" id="ForgotPasswordLink">Forgot Password?</a>
        </div>
    </g:form>
</div>