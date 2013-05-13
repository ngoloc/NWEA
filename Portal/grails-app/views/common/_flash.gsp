<div class="FlashContainer">
    <g:if test="${flash.info}">
        <span class="alert alert-info">${flash.info}
        </span>
    </g:if>

    <g:if test="${flash.error}">
        <span class="alert alert-error">${flash.error}
        </span>
    </g:if>
</div>
