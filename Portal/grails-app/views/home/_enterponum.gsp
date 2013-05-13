<div id="pomodal" class="modal hide fade" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal"
                aria-hidden="true">×</button>

        <h3 id="myModalLabel">Enter PO Number</h3>
    </div>

    <div class="modal-body">
        <div class="control-group">
            <label for=ponumber" >PO Number:</label><input type="text"
                                                           id="ponumber"/>
        </div>
    </div>

    <div class="modal-footer">
        <button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
        <button class="btn btn-primary" data-dismiss="modal"
                data-bind="click: purchasePO">Purchase</button>
    </div>
</div>