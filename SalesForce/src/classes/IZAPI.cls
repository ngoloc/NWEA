public interface IZAPI {

	List<Zuora.zObject> zquery(string zoql);

	List<Zuora.zApi.SaveResult> zcreate(List<Zuora.zObject> objects);

	void zlogin();
	
	List<Zuora.zApi.SubscribeResult> zsubscribe(List<Zuora.zApi.SubscribeRequest> subsRequestList);
	
	List<Zuora.zApi.SaveResult> zupdate(List<Zuora.zObject> objs);
}