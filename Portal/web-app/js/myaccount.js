$(document).ready(function(){

		$('.add_pm').hide();
		$('.update_contact').hide();
		$('.change_plan').hide();
		$('.save_changes').hide();
		$('.success_message').hide();
		$('.error_message').hide();
		$('.add_payment_method_panel').hide();

		$(".update_contact").click(function(event){
			inputContactDetail(event);
		});
		$(".save_changes").click(function(event){
			saveContactChange(event);
		});
		loadAccountSummaries();
	});

	function loadAccountSummaries(){
		getAccountSummary();
		getSubscriptionSummary();
	}

	function loadAccount(acc){
		$('.account_name').html(acc.name);
		$('.last_payment_amount').html((acc.lastPaymentAmount!=null ? '$'+acc.lastPaymentAmount : 'N/A'));
		$('.account_balance').html('$'+acc.balance);
		$('.last_payment_date').html((acc.lastPaymentDate!=null ? formatUDate(acc.lastPaymentDate) : 'N/A'));
		$('.last_invoice_date').html((acc.lastInvoiceDate!=null ? formatUDate(acc.lastInvoiceDate) : 'N/A'));
		$('.account-summary .loading').hide();
		$('.account-summary-table').fadeIn('fast');				
		$('.view_last_pdf').click(viewLastPdf);
	}

function formatUDate(d){
    return d;
}

	function loadContact(acc)
	{
		//Show Contact Info
		var con = acc.contactSummary;
		//Set input and output fields to User Contacts
		$('.contact-summary-table-input .mailing_id').val(con.id);
		$('.contact-summary-table-output .first_name').text(con.firstName || '');
		$('.contact-summary-table-input .first_name:text').val(con.firstName);
		$('.contact-summary-table-output .mailing_state').text(con.state || '');
		$('.contact-summary-table-input .mailing_state:text').val(con.state);
		$('.contact-summary-table-output .last_name').text(con.lastName || '');
		$('.contact-summary-table-input .last_name:text').val(con.lastName);
		$('.contact-summary-table-output .mailing_code').text(con.postalCode || '');
		$('.contact-summary-table-input .mailing_code:text').val(con.postalCode);
		$('.contact-summary-table-output .mailing_address1').text(con.address1 || '');
		$('.contact-summary-table-input .mailing_address1:text').val(con.address1);
		$('.contact-summary-table-output .mailing_address2').text(con.address2 || '');
		$('.contact-summary-table-input .mailing_address2:text').val(con.address2);
		$('.contact-summary-table-output .mailing_country').text(con.country || '');
		$('.contact-summary-table-input .mailing_country:text').val(con.country);
		$('.contact-summary-table-output .mailing_city').text(con.city || '');
		$('.contact-summary-table-input .mailing_city:text').val(con.city);
		$('.update_contact').show();
		$('.save_changes').hide();
		$('.contact-summary .loading').hide();
		$('.contact-summary-table-output').fadeIn('fast');
		$('#greeting').text("Welcome, " + con.firstName);
		
		// CNET Custom work / show sold to contact info
		var soldTo = acc.soldToContactSummary;
		$('.contact-summary-table-input .s_mailing_id').val(soldTo.id); // Added for CNET custom dev
		$('.contact-summary-table-output .s_first_name').text(soldTo.firstName || '');
		$('.contact-summary-table-input .s_first_name:text').val(soldTo.firstName);
		$('.contact-summary-table-output .s_mailing_state').text(soldTo.state || '');
		$('.contact-summary-table-input .s_mailing_state:text').val(soldTo.state);
		$('.contact-summary-table-output .s_last_name').text(soldTo.lastName || '');
		$('.contact-summary-table-input .s_last_name:text').val(soldTo.lastName);
		$('.contact-summary-table-output .s_mailing_code').text(soldTo.postalCode || '');
		$('.contact-summary-table-input .s_mailing_code:text').val(soldTo.postalCode);
		$('.contact-summary-table-output .s_mailing_address1').text(soldTo.address1 || '');
		$('.contact-summary-table-input .s_mailing_address1:text').val(soldTo.address1);
		$('.contact-summary-table-output .s_mailing_address2').text(soldTo.address2 || '');
		$('.contact-summary-table-input .s_mailing_address2:text').val(soldTo.address2);
		$('.contact-summary-table-output .s_mailing_country').text(soldTo.country || '');
		$('.contact-summary-table-input .s_mailing_country:text').val(soldTo.country);
		$('.contact-summary-table-output .s_mailing_city').text(soldTo.city || '');
		$('.contact-summary-table-input .s_mailing_city:text').val(soldTo.city);
	}
	
	function loadInvoice(acc){
		// Begin CNET custom work / show invoices summary
		var html = "";
		var invoices = acc.invoiceSummaries || [];
		html += "<tr class='border_bottom_dashed'><td><strong>Invoice Date</strong></td><td><strong>Due Date</strong></td><td><strong>Total Amount</strong></td><td></td></tr>";
		// For each invoice
		for (var i = 0; i < invoices.length; i++) {
			var inv = invoices[i];
			html += "<tr class='border_bottom_dashed'>";
			html += "<td>" + inv.invoiceDate + "</td>";
			html += "<td>" + inv.dueDate + "</td>";
			html += "<td>$" + inv.totalAmount + "</td>";
			html += "<td><a href='javascript:' class='btn_submit item_button button' style='margin-top: 5px' onclick='getPdf(\"" + inv.id + "\")'>View PDF</a></td>";
			html += "</tr>";
		}
		$(".invoice-summary-table").html(html);
		$('.invoice-summary .loading').hide();
		$('.invoice-summary-table').fadeIn('fast');
	}
	
	function loadSummary(acc){
		var html = "";
		var pm_summaries = acc.paymentSummaries || [];
		html += "<tr class='border_bottom_dashed'>";
		html += "    <td><strong>Date</strong></td>";
		html += "    <td><strong>Payment applied</strong></td>";
		html += "    <td><strong>Type</strong></td>";
		html += "    <td><strong>Status</strong></td>";
		html += "</tr>";
		// For each processed payment
		for (var i = 0; i < pm_summaries.length; i++) {
			var pm = pm_summaries[i];
			html += "<tr class='border_bottom_dashed'>";
			html += "    <td>"+pm.date+"</td>";
			html += "    <td>"+pm.paymentApplied+" USD</td>";
			html += "    <td>"+pm.type+"</td>";
			html += "    <td>"+pm.status+"</td>";
			html += "</tr>";
		}
		$('.payment-summaries-table').html(html);
		$('.payment-summaries .loading').hide();
		$('.payment-summaries-table').fadeIn('fast');
	}

function getPaymentMethodSummarySuccess(data){
    loadPayments(data);
}


function loadPayments(acc){
		//Show PaymentMethod Info
		var html = "";
        html += "<thead><th>Type</th><th>Card Holder Name</th><th>Card Number</th><th>Expiration</th><th></th><th></th></thead>";
        html += "<tbody>";
		var ps = acc.paymentMethodSummaries || [];
		//For each payment method, print out
		for(var i = 0; i < ps.length; i++){
			var pm = ps[i];
			html+="    <tr class='border_bottom_dashed'>";
			html+="        <td class='vaTop'><b>"+pm.cardType+"</b></td>";
            html+="        <td><span class='card_holder_name'>"+pm.cardHolderName+"</span></td>";
            html+="        <td><span class='card_masked_number'>"+pm.maskedNumber+"</span></td>";
            html+="        <td>Exp:<span class='card_expiration_month'>"+pm.expirationMonth+"</span>/<span class='card_expiration_year'>"+pm.expirationYear+"</span></td>";
			if(pm.isDefault==false){
				html+="        <td class='vaTop'><a href='javascript:' id='pm_update_"+pm.id+"' class='btn_submit item_button btn_make_default'>Make Default</a></td>";
				html+="        <td class='vaTop'><a href='javascript:' id='pm_remove_"+pm.id+"' class='btn_submit item_button btn_remove_pm'>Remove Card</a></td>";
			} else {
				html+="        <td class='vaTop'><b>[Default]</b></td><td></td>";
			}
			html+="    </tr>";
		}
        html += "</tbody>";
		$('.paymentmethod-summary-table').html(html);
		$(".btn_make_default").click(function(event){
            $('.paymentmethod-summary .loading').show();
            $('.paymentmethod-summary-table').hide();
			changeDefaultPm(event);
		});
		$(".btn_remove_pm").click(function(event){
            $('.paymentmethod-summary .loading').show();
            $('.paymentmethod-summary-table').hide();
            removePm(event);
		});
		$('.add_pm').show();
		$('.add_pm').click(showNewPaymentMethodPanel);
		$('.paymentmethod-summary .loading').hide();
		$('.paymentmethod-summary-table').fadeIn('fast');
	}
	
	function initializeVisibility(){
		$('.account-summary-table').hide();
		$('.account-summary .loading').show();
		$('.contact-summary-table-input').hide();
		$('.contact-summary-table-output').hide();
		$('.contact-summary .loading').show();
		$('.invoice-summary .loading').show();
		$('.invoice-summary-table').hide();
		$('.payment-summaries .loading').show();
		$('.payment-summaries-table').hide();
	}
	
	function getSummarySuccess(data){
		var acc = data;
		loadAccount(acc);
		loadContact(acc);
		loadInvoice(acc);
		loadSummary(acc);
	}
	
	function getAccountSummary(){
		initializeVisibility();
		$.getJSON("../MyAccount/GetCompleteSummary", getSummarySuccess);
	}
	
	function getSubscriptionSuccess(data){
		var subs = data;
		var html = "";
		for (var i in subs) {
			var sub = subs[i];
			html += "<div class='subscription-summary-table'>";
			html += "    <table>";
			html += "        <tr>";
			html += "        <td width='15%''>Start Date:</td>";
			html += "        <td width='35%''><strong>"+sub.startDate+"</strong></td>";
			html += "        <td width='15%''>End Date:</td>";
			html += "        <td width='35%''><strong>"+sub.endDate+"</strong></td>";
			html += "        </tr>";
			html += "    </table>";
			html += "    <div class='innerBlock'>";
			html += "        <ul class='chosen_plans'>";
			for(var j in sub.active_plans){
				var rp = sub.active_plans[j];
				html += "<li class='border_bottom_dashed'>";
                html += "   <div class='rateplan_info'>";
                html += "       <span class='rateplan_name'>"+rp.ProductName+" : "+rp.Name+"</span><br>";
                html += "       <ul class='price_item_list' >";
                html += "           <li class='price_item'><span class='price_item'>"+rp.Description+"</span></li>";
                html += "       </ul>";
				html += "   </div>";
				html += "   <div class='clear-block'></div>";
				html += "</li>";
			}
			html += "        </ul>";
			html += "        <ul class='removed_plans'>";
			//Display removed plans
			for(var j in subs.removed_plans){
				var rp = subs.removed_plans[j];
				html += "<li class='border_bottom_dashed'>";
                html += "   <div class='rateplan_info'>";
                html += "       <span class='rateplan_name'>"+rp.ProductName+" : "+rp.Name+"</span><br>";
                if(rp.AmendmentType=='RemoveProduct'){
					html+="    <div class='mark'>Expires "+formatZDate(rp.effectiveDate)+"</div><br>";	
				}
                html += "       <ul class='price_item_list' style='margin-left: 0;margin-top: 6px;'>";
                html += "           <li class='price_item'><span class='price_item'>"+rp.Description+"</span></li>";
                html += "       </ul>";
				html += "   </div>";
				html += "   <div class='clear-block'></div>";
				html += "</li>";
			}
			html += "        </ul>";
			html += "    </div>"
			html += "</div>";
		}
		
		$('.subs-content-box').html(html);
		$('.subscription-summary .loading').hide();
		$('.subscription-summary-table').fadeIn('fast');
	}
	
	//Display Subscription Summary panel
	var getSubscriptionSummary = function(){
		$('.subscription-summary-table').hide();
		$('.subscription-summary .loading').show();
		$.getJSON("../MyAccount/GetLatestSubscription", getSubscriptionSuccess);
	}

	function getcontactsummarysuccess(data){
		var con = data.msg[0];
		//Set input and output fields to User Contacts
		$('.contact-summary-table-output .first_name').text(con.FirstName);
		$('.contact-summary-table-input .first_name:text').val(con.FirstName);
		$('.contact-summary-table-output .mailing_state').text(con.State);
		$('.contact-summary-table-input .mailing_state:text').val(con.State);
		$('.contact-summary-table-output .last_name').text(con.LastName);
		$('.contact-summary-table-input .last_name:text').val(con.LastName);
		$('.contact-summary-table-output .mailing_code').text(con.PostalCode);
		$('.contact-summary-table-input .mailing_code:text').val(con.PostalCode);
		$('.contact-summary-table-output .mailing_address1').text(con.Address1);
		$('.contact-summary-table-input .mailing_address1:text').val(con.Address1);
		$('.contact-summary-table-output .mailing_address2').text(con.Address2);
		$('.contact-summary-table-input .mailing_address2:text').val(con.Address2);
		$('.contact-summary-table-output .mailing_country').text(con.Country);
		$('.contact-summary-table-input .mailing_country:text').val(con.Country);
		$('.contact-summary-table-output .mailing_city').text(con.City);
		$('.contact-summary-table-input .mailing_city:text').val(con.City);
		$('#greeting').text("Welcome, " + con.FirstName);
		$('.update_contact').show();
		$('.save_changes').hide();
		$('.contact-summary-table-output').fadeIn('fast');
		$('.contact-summary .loading').hide();
		$('.contact-summary-table-output').fadeIn('fast');
	}
	
	function getContactSummary(){
		$('.contact-summary-table-input').hide();
		$('.contact-summary-table-output').hide();
		$('.contact-summary .loading').show();
		$.getJSON("../MyAccount/backend?typeGetContactSummary", getcontactsummarysuccess);
	}
	
	function viewLastPdf(){
		window.open('../MyAccount/backend?type=GetLastPdf');
	}
	
	function getPdf(id) {
		window.open('../MyAccount/backend?type=GetPdf&invoiceId=' + id);
	}

	//When the user clicks the Update Contact Info button, hide the contact output table, and display the contact input table.
	function inputContactDetail(event){
		$('.success_message').hide();
		$('.error_message').hide();

		$('.contact-summary-table-output').hide();
		$('.contact-summary-table-input').show();

		$('.update_contact').hide();
		$('.save_changes').show();
	};
	
	//When the user clicks the Save Changes button on the contact panel, update the Contact record with the user's preferences and return a message.
	function saveContactChange(){
		$('.contact-summary .loading').show();
		$('.contact-summary-table-output').hide();
		$('.contact-summary-table-input').hide();
		
		//Update Contact
		var mailing_id = $('.mailing_id').val();
		var first_name = $('.first_name:text').val();
		var mailing_state = $('.mailing_state:text').val();
		var last_name = $('.last_name:text').val();
		var mailing_code = $('.mailing_code:text').val();
		var mailing_address1 = $('.mailing_address1:text').val();
		var mailing_address2 = $('.mailing_address2:text').val();
		var mailing_country = $('.mailing_country:text').val();
		var mailing_city = $('.mailing_city:text').val();
		
		// update sold to contact var (CNET Custom work)
		var s_mailing_id = $('.s_mailing_id').val();
		var s_first_name = $('.s_first_name:text').val();
		var s_mailing_state = $('.s_mailing_state:text').val();
		var s_last_name = $('.s_last_name:text').val();
		var s_mailing_code = $('.s_mailing_code:text').val();
		var s_mailing_address1 = $('.s_mailing_address1:text').val();
		var s_mailing_address2 = $('.s_mailing_address2:text').val();
		var s_mailing_country = $('.s_mailing_country:text').val();
		var s_mailing_city = $('.s_mailing_city:text').val();
		
		$.getJSON("../MyAccount/backend?type=UpdateContact", {	id:mailing_id,
													firstName:first_name,
													lastName:last_name,
													address1:mailing_address1,
													address2:mailing_address2,
													city:mailing_city,
													state:mailing_state,
													postalCode:mailing_code,
													country:mailing_country,
													s_id:s_mailing_id,
													s_firstName:s_first_name,
													s_lastName:s_last_name,
													s_address1:s_mailing_address1,
													s_address2:s_mailing_address2,
													s_city:s_mailing_city,
													s_state:s_mailing_state,
													s_postalCode:s_mailing_code,
													s_country:s_mailing_country},updatecontactsuccess
		);
		
		$('.update_contact').show();
		$('.save_changes').hide();
	}
	

	function updatecontactsuccess(data){
		//Get back success result
		var success = data.Success;
		if(success){
			//If true, show success message, re-render panel
			$('.success_message').text('Contact successfully saved!');
			$('.success_message').show();
			$('.contact-summary .loading').hide();
			$('.contact-summary-table-output').show();

			//Set output fields to the same value as the input fields
			$('.contact-summary-table-output .first_name').text($('.contact-summary-table-input .first_name:text').val() || '');
			$('.contact-summary-table-output .mailing_state').text($('.contact-summary-table-input .mailing_state:text').val() || '');
			$('.contact-summary-table-output .last_name').text($('.contact-summary-table-input .last_name:text').val() || '');
			$('.contact-summary-table-output .mailing_code').text($('.contact-summary-table-input .mailing_code:text').val() || '');
			$('.contact-summary-table-output .mailing_address1').text($('.contact-summary-table-input .mailing_address1:text').val() || '');
			$('.contact-summary-table-output .mailing_address2').text($('.contact-summary-table-input .mailing_address2:text').val() || '');
			$('.contact-summary-table-output .mailing_country').text($('.contact-summary-table-input .mailing_country:text').val() || '');
			$('.contact-summary-table-output .mailing_city').text($('.contact-summary-table-input .mailing_city:text').val() || '');
			
			// BEGIN CNET Custom Work
			$('.contact-summary-table-output .s_first_name').text($('.contact-summary-table-input .s_first_name:text').val() || '');
			$('.contact-summary-table-output .s_mailing_state').text($('.contact-summary-table-input .s_mailing_state:text').val() || '');
			$('.contact-summary-table-output .s_last_name').text($('.contact-summary-table-input .s_last_name:text').val() || '');
			$('.contact-summary-table-output .s_mailing_code').text($('.contact-summary-table-input .s_mailing_code:text').val() || '');
			$('.contact-summary-table-output .s_mailing_address1').text($('.contact-summary-table-input .s_mailing_address1:text').val() || '');
			$('.contact-summary-table-output .s_mailing_address2').text($('.contact-summary-table-input .s_mailing_address2:text').val() || '');
			$('.contact-summary-table-output .s_mailing_country').text($('.contact-summary-table-input .s_mailing_country:text').val() || '');
			$('.contact-summary-table-output .s_mailing_city').text($('.contact-summary-table-input .s_mailing_city:text').val() || '');
			// END CNET Custom Work
							
		} else {
			//If false, show failure message, don't rerender panel
			var errors = data.Errors;
			var error_output = "";
			for(var ei in errors){
				var error = errors[ei];
				error_output += error.Message + "\n";
			}
			$('.error_message').text(error_output);					
			$('.error_message').show();					
		}
		
	}
	

	function getPaymentMethodSummary(){
		$('.paymentmethod-summary-table').hide();
		$('.paymentmethod-summary .loading').show();
		$.getJSON("../MyAccount/backend?type=GetPaymentMethodSummary&ts=" + new Date().getTime(), getPaymentMethodSummarySuccess);
	}
	
	function changeDefaultPm(event){
		var buttonId = event.target.id;
		var pmId = buttonId.split('pm_update_')[1];

		$.getJSON("../MyAccount/backend?type=ChangeDefaultPaymentMethod", {pmId:pmId},
			function(data){
				getPaymentMethodSummary();
        	} 
		);
	};
	
	function removePmSuccess(data){
		var resp = data;
		if (resp.success){
			getPaymentMethodSummary();
		} else {
			alert("This card could not be deleted. Please try again later.");
		}
	}
	
	function removePm(event){
		var buttonId = event.target.id;
		var pmId = buttonId.split('pm_remove_')[1];

		$.getJSON("../MyAccount/backend?type=RemovePaymentMethod", {pmId:pmId}, removePmSuccess);
	};
	
	function showNewPaymentMethodPanel(){
		$.getJSON("../MyAccount/backend?type=GetExistingIframeSrc",
			function(data){
			if(data){
				
				
			$("#pmiframe").attr('src', data.data);
				$('#ccmodal').modal('show');
				
				$('#addpm').click(submitNewPaymentMethod);
			}
			else{
				toastr.error('Account not found');
				
			}
			}
		);
	}
	
	function submitNewPaymentMethod(){
		showSpinner();
		submitHostedPage('pmiframe');
	}

	function cancelNewPaymentMethod(){
		hideNewPaymentMethodPanel();
	}
	
	function hideNewPaymentMethodPanel(){
		$("#infor.error_message").hide();
		$('.add_payment_method_panel').slideUp('fast');
		$('.new_pm').unbind('click');
		$('.cancel_pm').unbind('click');
		$("#pmiframe").attr('src', '');
	}

	function hostedpagecallback_success(ref_id) {
		submitNewPaymentMethod();
		getPaymentMethodSummary();
		hideNewPaymentMethodPanel();
	}

	function hostedpagecallback_failure(errorCode, errorMessage, errorField_creditCardType, errorField_creditCardNumber,
			errorField_creditCardExpirationMonth, errorField_creditCardExpirationYear, errorField_cardSecurityCode,
			errorField_creditCardHolderName) {

		var html = '';

		html += formatErrorDisplay(errorCode, '');
		html += formatErrorDisplay(errorMessage, '');
		html += formatErrorDisplay(errorField_creditCardType, 'Card Type: ');
		html += formatErrorDisplay(errorField_creditCardNumber, 'Card Number: ');
		html += formatErrorDisplay(errorField_creditCardExpirationMonth, 'Card Expiration Month: ');
		html += formatErrorDisplay(errorField_creditCardExpirationYear, 'Card Expiration Year: ');
		html += formatErrorDisplay(errorField_cardSecurityCode, 'Card Security Code: ');
		html += formatErrorDisplay(errorField_creditCardHolderName, 'Card Holder Name: ');

		if(html!=''){
			html = 'Your credit card info was not saved for the following reasons.<br><ul>' + html;
			html += '</ul>';
		}
		$('#infor.error_message').html(html);

		$("#infor.error_message").show();
		showNewPaymentMethodPanel();
	}
	
	function formatErrorDisplay(errorField, prefix){
		var result = '';
		var displayError = errorField;
		if(displayError=='NullValue') displayError = "Missing required field.";
		if(errorField!=null && errorField!=''){
			result += '<li>' + prefix + displayError + '</li>';
		}
		return result;
	}
	
	function closeAndPurchase(){
		getPaymentMethodSummary();
	}