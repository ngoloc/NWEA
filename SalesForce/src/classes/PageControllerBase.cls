public with sharing virtual class PageControllerBase {
	 public void appendErrorMessage(String message) {
        ApexPages.addMessage(new ApexPages.Message(ApexPages.Severity.ERROR, message));
    }  
}