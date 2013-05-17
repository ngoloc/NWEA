package com.nwea.portal.domain;

import com.nwea.portal.repository.ZuoraRepository;
import com.zuora.api.ID;
import com.zuora.api.object.Account;
import com.zuora.api.object.Contact;
import org.springframework.cache.Cache;

public class RegisterUser {

    ZuoraRepository zr;

    public RegisterUser(Cache c) throws Exception {
        zr = new ZuoraRepository(c);
    }

    public String Register(String email, String agencyCode, String name)
            throws Exception {
        String accountId = zr.AccountR.GetIdByName(agencyCode);
        return accountId;
    }

    private String CreateNewAccount(
            String email,
            String agencyCode,
            String name) throws Exception {
        Account acc = new Account();
        acc.setName(email);
        acc.setCurrency("USD");
        acc.setBillCycleDay(1);
        acc.setStatus("Draft");
        acc.setNotes("Created by the NWEA Portal app sign up process.");
        acc.setAgencyCode(agencyCode);
        acc.setPaymentTerm("Due Upon Receipt");
        acc.setBatch("Batch1");


        String accountId = zr.AccountR.Create(acc);
        ID accIdd = new ID();
        accIdd.setID(accountId);
        acc.setId(accIdd);
        String firstname = "";
        String lastname = "";
        String[] nameparts = name.split(" ");
        if (nameparts.length == 1) {
            firstname = nameparts[0];
            lastname = "[lastname]";
        } else if (nameparts.length == 2) {
            firstname = nameparts[0];
            lastname = nameparts[1];
        } else {
            firstname = nameparts[0];
            lastname = name.substring(firstname.length());
        }

        Contact c = new Contact();
        c.setFirstName(firstname);
        c.setLastName(lastname);
        c.setAccountId(acc.getId());
        c.setCountry("US");
        c.setState("OR");
        String contactId = zr.ContactR.Create(c);

        Contact c2 = new Contact();
        c2.setFirstName(firstname);
        c2.setLastName(lastname);
        c2.setAccountId(acc.getId());
        c2.setCountry("US");
        c2.setState("OR");
        String contactId2 = zr.ContactR.Create(c);

        ID contactIdd = new ID();
        contactIdd.setID(contactId);

        ID contactIdd2 = new ID();
        contactIdd2.setID(contactId2);

        acc.setBillToId(contactIdd);
        acc.setSoldToId(contactIdd2);
        acc.setStatus("Active");

        zr.AccountR.Update(acc);

        return accountId;
    }
}
