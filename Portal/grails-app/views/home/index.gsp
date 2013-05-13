<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
    <meta name="layout" content="main"/>
    <title>NWEA Portal Home</title>
</head>

<body>
<div class="home">
    <g:render template="/home/banner"/>
    <g:render template="/home/dashboard"/>
    <g:render template="/home/enrollment"/>
    <g:render template="/home/current"/>
    <g:render template="/home/related"/>

    <div id="ButtonContainer">
        <button class="button" href="#pomodal" role="button" data-bind="click: showpo">Purchase with PO</button>
        <button class="button" href="#ccmodal" role="button" data-bind="click: showcc">Purchase with CC</button>
    </div>

    <g:render template="/home/enterponum"/>
    <g:render template="/home/entercc"/>
    <g:render template="/home/entercontact"/>

</div>
</body>
</html>