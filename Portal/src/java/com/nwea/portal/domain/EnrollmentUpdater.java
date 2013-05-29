package com.nwea.portal.domain;

import com.nwea.portal.repository.ZuoraRepository;
import com.zuora.api.object.Account;
import org.springframework.cache.Cache;

/**
 * Created with IntelliJ IDEA.
 * User: Dana
 * Date: 5/28/13
 * Time: 12:59 AM
 * To change this template use File | Settings | File Templates.
 */
public class EnrollmentUpdater {

    private ZuoraRepository zrepo;

    public EnrollmentUpdater(ZuoraRepository zr) throws Exception {
            this.zrepo = zr;
    }

    public void Execute(String accountId, String enrollment) throws Exception {
        Account acc = new Account();
        acc.setIdString(accountId);
        acc.setEnrollment(enrollment);
        this.zrepo.AccountR.Update(acc);
    }

}
