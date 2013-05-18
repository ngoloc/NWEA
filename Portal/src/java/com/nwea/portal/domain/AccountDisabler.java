package com.nwea.portal.domain;

import com.nwea.portal.repository.ZuoraRepository;
import com.zuora.api.object.Account;
import org.springframework.cache.Cache;

public class AccountDisabler {

    private ZuoraRepository zr;

    public AccountDisabler(Cache cache) throws Exception {
        this.zr = new ZuoraRepository(cache);
    }

    public boolean IsDisabled(String accountid) throws Exception {
        Account account = zr.AccountR.GetById(accountid);
        return account.getDisableWebManagement() == "Yes";
    }

}
