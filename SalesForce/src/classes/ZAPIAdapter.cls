public with sharing class ZAPIAdapter implements IZAPI {

	private Zuora.zApi api;

	public ZAPIAdapter(){
		this.api = new Zuora.zApi();
	}
	
	public List<Zuora.zObject> zquery(string zoql){
		return this.api.zquery(zoql);
	}
	
	public void zlogin(){
		this.api.zlogin();
	}
	
	public List<Zuora.zApi.SaveResult> zcreate(List<Zuora.zObject> objects){
		return this.api.zcreate(objects);
	}
	
	public List<Zuora.zApi.SubscribeResult> zsubscribe(List<Zuora.zApi.SubscribeRequest> subsRequestList){
		return this.api.zsubscribe(subsRequestList);
	}
	
	public List<Zuora.zApi.SaveResult> zupdate(List<Zuora.zObject> objs){
		return this.api.zupdate(objs);
	}

}