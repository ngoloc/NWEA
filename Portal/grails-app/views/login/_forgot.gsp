<div id="forgot" class="loginitemcontainer">
    <g:if test="${flash.forgotmessage}">
        <div class="alert alert-error">
            ${flash.forgotmessage}
        </div>
    </g:if>
    <g:form name="forogotform"
            url="[action: 'reset', controller: 'forgot']">
        <div class="control-group">
            <input type="text" name="email" placeholder="Email" data-val="true"
                   data-val-required="Required" data-val-email/> <br/> <span
                class="field-validation-valid validationText help-inline"
                data-valmsg-for="email" data-valmsg-replace="true"></span>
        </div>

        <div class="submitcontainer">
            <input type="submit" class="button" value="Reset Password"></input>
        </div>

        <div class="ShowLoginLinkContainer">
            <a href="#" id="ShowLoginLink">Login</a>
        </div>
    </g:form>
</div>