<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<head>
    <g:render template="/common/resources"/>
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'admin.css')}" type="text/css">
</head>

<body>
<g:render template="/common/header"/>
<div class="Container">
    <g:render template="/common/flash"/>
    <g:render template="/common/adminnav"/>
    <div class="AdminContentContainer">
        <g:layoutBody/>
    </div>
</div>
<g:render template="/common/footer"/>
<g:render template="/common/spinner"/>
<g:javascript library="application"/>
<r:layoutResources/>
</body>
</html>
