<div id="header">
    <a href="<g:createLink action="index" controller="login"/>"
       id="main-logo"></a>
    <g:if test="${!hidenav}">
        <div class="MainNav">
            <a href="<g:createLink action="index" controller="Home"/>">Renewal</a> |  <a
                href="<g:createLink action="index" controller="MyAccount"/>">My Account</a> | <a
                href="<g:createLink action="index" controller="logout"/>">Logout</a>
        </div>
    </g:if>

    <g:if test="${hidenav}">
        <div class="LoginTitle">
            NWEA Online Renewal Portal
        </div>
    </g:if>
    <auth:ifLoggedIn>
    <div class="loginstatus">
        <g:if test="${!hideaccountinfo}">
            <g:include action="status" controller="loginstatus"/>
        </g:if>
    </div>
        </auth:ifLoggedIn>
</div>

