package com.nwea.portal.repository;

import com.zuora.api.Amend;
import com.zuora.api.AmendResult;
import com.zuora.api.object.Amendment;
import com.zuora.api.object.ZObject;
import com.zuora.zilla.util.ZApi;
import org.springframework.cache.Cache;

public class AmendmentRepository extends RepositoryBase {

    public AmendmentRepository(Cache c, ZApi api) throws Exception {
        super(c, api);
    }

    public Amendment GetById(String amendmentId) throws Exception {
        ZObject[] results = Query("SELECT Id,ContractEffectiveDate FROM Amendment WHERE Id='"
                + amendmentId + "'");
        return (Amendment) results[0];
    }

    public AmendResult[] ApplyAmend(Amend amd) {
        return ApplyAmend(amd);
    }
}
