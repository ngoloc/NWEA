<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
    <meta name="layout" content="main"/>
    <title>Reset Password</title>
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'resetpassword.css')}" type="text/css">
</head>

<body>
<div class="body resetpasswordbody">
    <div id="resetpassword" class="loginitemcontainer">
        <g:if test="${flash.resetmessage}">
            <div class="alert alert-error">
                ${flash.resetmessage}
            </div>
        </g:if>
        <g:form name="loginform" url="[action: 'reset', controller: 'ResetPassword']">
            <input type="hidden" name="id" value="${id}"/>

            <div class="control-group">
                <input type="password" name="password" placeholder="Password"
                       data-val="true" data-val-required="Required"/><br/> <span
                    class="field-validation-valid validationText help-inline"
                    data-valmsg-for="password" data-valmsg-replace="true"></span>
            </div>

            <div class="control-group">
                <input type="password" name="confirmpassword" placeholder="Confirm Password"
                       data-val="true" data-val-required="Required"
                       data-val-equalto="Password and confirm password must match"
                       data-val-equalto-other="password"/><br/> <span
                    class="field-validation-valid validationText help-inline"
                    data-valmsg-for="confirmpassword" data-valmsg-replace="true"></span>
            </div>

            <div class="submitcontainer">
                <input type="submit" class="button" value="Submit"></input>
            </div>
        </g:form>
    </div>
</div>
</body>
</html>