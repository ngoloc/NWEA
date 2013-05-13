$.validator.setDefaults({
	showErrors: function(errorMap, errorList){
		$.each(errorList, function(i, error){
			var $input = $(error.element);
			var $group = $input.parents('.control-group');
			$group.addClass('error');
		});
		this.defaultShowErrors();
	}
});