<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
    <meta name="layout" content="main"/>
    <title>NWEA Online Renewal Portal Admin Login</title>
</head>

<body>
<div class="adminlogincontainer">
    <div id="login" class="loginitemcontainer">
        <g:if test="${flash.loginmessage}">
            <div class="alert alert-error">
                ${flash.loginmessage}
            </div>
        </g:if>
        <g:form name="loginform"
                url="[action: 'login', controller: 'AdminLogin']">
            <div class="control-group">
                <input type="text" name="email" placeholder="Email" data-val="true"
                       data-val-required="Required" data-val-email/> <br/>
                <span class="field-validation-valid validationText help-inline"
                      data-valmsg-for="email" data-valmsg-replace="true"></span>
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
        </g:form>
    </div>
</div>
</body>
</html>