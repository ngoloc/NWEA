package com.nwea.portal.domain;

import com.nwea.portal.repository.ZuoraRepository;
import com.zuora.api.object.Account;

public class IsAccountActive {

    ZuoraRepository zr;

    public IsAccountActive(ZuoraRepository zr) throws Exception {
        this.zr = zr;
    }

    public boolean ExecuteByName(String accountName) throws Exception {
        Account acc = this.zr.AccountR.GetByName(accountName);
        return acc.getStatus().equals("Active");
    }

    public boolean ExecuteById(String zid) throws Exception {
        Account acc = this.zr.AccountR.GetById(zid);
        return acc.getStatus().equals("Active");
    }
}
