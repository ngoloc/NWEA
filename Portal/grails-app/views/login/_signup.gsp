<div id="signup" class="loginitemcontainer">
    <div class="title">new customers</div>

    <div class="title">sign up</div>
    <g:if test="${flash.signupmessage}">
        <div class="alert alert-error">
            ${flash.signupmessage}
        </div>
    </g:if>
    <g:form name="signupform"
            url="[action: 'signup', controller: 'Signup']">
        <div class="control-group">
            <input type="text" name="name" placeholder="Name" data-val="true"
                   data-val-required="Required"/>
            <br/>
            <span
                    class="field-validation-valid validationText help-inline"
                    data-valmsg-for="name" data-valmsg-replace="true"></span>
        </div>

        <div class="control-group">
            <input type="text" name="email" placeholder="Email" data-val="true"
                   data-val-required="Required"/> <br/><span
                class="field-validation-valid validationText help-inline"
                data-valmsg-for="email" data-valmsg-replace="true" data-val-email=""></span>
        </div>

        <div class="control-group">
            <input type="text" name="code" placeholder="Agency Code"
                   data-val="true" data-val-required="Required"/><br/> <span
                class="field-validation-valid validationText help-inline"
                data-valmsg-for="code" data-valmsg-replace="true"></span>
        </div>

        <div class="control-group">
            <input type="password" name="password" placeholder="Password"
                   data-val="true" data-val-required="Required"/> <br/><span
                class="field-validation-valid validationText help-inline"
                data-valmsg-for="password" data-valmsg-replace="true"></span>
        </div>

        <div class="control-group">
            <input type="password" name="confirmpassword" placeholder="Confirm Password"
                   data-val="true" data-val-required="Required"
                   data-val-equalto="Password and Confirm password do not match" data-val-equalto-other="password"/>
            <br/>
            <span
                    class="field-validation-valid validationText help-inline"
                    data-valmsg-for="confirmpassword" data-valmsg-replace="true"></span>
        </div>

        <div class="submitcontainer">
            <input type="submit" class="button" value="Sign Up"></input>
        </div>
    </g:form>
</div>