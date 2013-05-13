<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
    <meta name="layout" content="main"/>
    <title>NWEA Portal Login</title>
    <g:javascript src="login.js"/>
</head>

<body>
<div class="mainlogincontainer">

    <g:render template="/login/login"/>
    <g:render template="/login/forgot"/>
    <g:render template="/login/signup"/>
</div>
<script type="text/javascript">
    var showForgotOnLoad = ${showForgot};
</script>
</body>
</html>