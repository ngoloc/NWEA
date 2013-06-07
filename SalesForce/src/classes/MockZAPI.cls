public with sharing class MockZAPI implements IZAPI{

	public MockZAPI(){
	
	}
	
	public void zlogin(){
	
	}
	
	public List<Zuora.zObject> zquery(string zoql){
		return new List<Zuora.zObject>();
	}
	
	public List<Zuora.zApi.SaveResult> zcreate(List<Zuora.zObject> objects){
		return new List<Zuora.zApi.SaveResult>();
	}
	
	public List<Zuora.zApi.SubscribeResult> zsubscribe(List<Zuora.zApi.SubscribeRequest> subsRequestList){
		return new List<Zuora.zApi.SubscribeResult>();
	}
	
	public List<Zuora.zApi.SaveResult> zupdate(List<Zuora.zObject> objs){
		return new List<Zuora.zApi.SaveResult>();
	}
	
}