<script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
<script type="text/javascript">
 
   /* Set your sidebar component, button, and picklist field labels here */
   var customComponentName = 'Custom Button Visibility';
   var buttonLabel = 'Send to Z-Billing';
   var picklistLabel = 'Status';
   var triggerValue = 'Sent to Z-Billing';
    
   jQuery(document).ready(function(){ 
        /* hide the sidebar component from user */
        jQuery('.htmlAreaComponentModule').find('h2:contains("'+customComponentName+'")').parent().parent().hide();
         
          /* only hide button if picklist value is "High" */
          var picklistValue = jQuery('td.labelCol:contains("'+picklistLabel+'")').next().find('div').html();
          var btn = jQuery('input[value="'+buttonLabel+'"]');
          if (picklistValue == triggerValue)
              btn.hide();
          else
            btn.show();
           
   }); 
</script>