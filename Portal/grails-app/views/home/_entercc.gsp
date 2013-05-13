<div id="ccmodal" class="modal hide fade" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal"
                aria-hidden="true">×</button>

        <h3 id="myModalLabel">Enter Payment Information</h3>
    </div>

    <div class="modal-body pmiframecontianer">
        <iframe id="pmiframe" width=600 height=625
                data-bind="attr: {src: pmurl}" border=0></iframe>
    </div>

    <div class="modal-footer">
        <button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
        <button class="btn btn-primary" data-bind="click: submitiframe">Purchase</button>
    </div>
</div>