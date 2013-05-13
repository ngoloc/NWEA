<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
    <meta name="layout" content="main"/>
    <title>My Account</title>
    <link rel="stylesheet"
          href="${resource(dir: 'css', file: 'myaccount.css')}" type="text/css">
    <g:javascript src="myaccount.js"/>
</head>

<body>
<div id="web_main">
    <div id="main" class="edit_dv">
        <g:render template="account"/>
        <g:render template="invoices"/>
        <g:render template="paymentmethods"/>
        <g:render template="paymentsummaries"/>
        <g:render template="contactinfo"/>
        <g:render template="entercc"/>
    </div>
</div>
</body>
</html>