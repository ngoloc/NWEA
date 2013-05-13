package com.nwea.portal.domain;

import com.nwea.portal.repository.ZuoraRepository;
import com.zuora.api.ID;
import com.zuora.api.object.Account;

public class AccountActivator {

    private IsAccountActive isactive;

    private ZuoraRepository zr;

    public AccountActivator(ZuoraRepository zr) throws Exception {
        isactive = new IsAccountActive(zr);
        this.zr = zr;
    }

    public void Activate(String zaccountid) throws Exception {

        if (!isactive.ExecuteById(zaccountid)) {
            Account acc = new Account();
            ID id = new ID();
            id.setID(zaccountid);
            acc.setId(id);
            acc.setStatus("Active");
            zr.AccountR.Update(acc);
        }
    }
}
