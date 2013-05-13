var LoginViewModel = function(){
	
	function _initialize(){
		$.validator.unobtrusive.parse($('loginform')); 
		$.validator.unobtrusive.parse($('signupform'));
		$.validator.unobtrusive.parse($('forogotform'));
		$('#ForgotPasswordLink').click(_showForgot);
		$('#ShowLoginLink').click(_showLogin);
		if(typeof showForgotOnLoad != 'undefined' && showForgotOnLoad){
			_showForgot();
		}
	}

	function _showForgot(){
		$('#login').hide();
		$('#forgot').css('display','inline-block');
		return false;
	}
	
	function _showLogin(){
		$('#login').show();
		$('#forgot').hide();
		return false;
	}
	
	return {
		initialize: _initialize
	};
};

$(document).ready(function(){
	var vm = new LoginViewModel();
	vm.initialize();
});