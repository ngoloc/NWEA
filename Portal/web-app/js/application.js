if (typeof jQuery !== 'undefined') {
	(function($) {
		$('#spinner').ajaxStart(function() {
			$(this).fadeIn();
		}).ajaxStop(function() {
			$(this).fadeOut();
		}).ajaxError(function(){
			$(this).fadeOut();
		});
	})(jQuery);
}

$(document).ready(function(){
	$('.scaffold-list table:first').addClass('table').addClass('table-striped').addClass('table-hover');
	
});

function showSpinner(){
	$('#spinner').show();
}

function hideSpinner(){
	$('#spinner').hide();
}