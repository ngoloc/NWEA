package com.nwea.portal.domain;

import com.zuora.api.ID;
import com.zuora.api.SaveResult;
import com.zuora.api.object.Account;
import com.zuora.api.object.Contact;
import com.zuora.api.object.ZObject;
import com.zuora.zilla.util.ZApi;

import javax.servlet.http.HttpServletRequest;

public class AddContactAndActivate {

    private ZApi zapi;

    public AddContactAndActivate() throws Exception {
        zapi = new ZApi();
    }

    public String Execute(HttpServletRequest request, String accountId) {

        Contact contact = new Contact();
        contact.setFirstName((String) request.getAttribute("firstname"));
        contact.setLastName((String) request.getAttribute("lastname"));
        contact.setAddress1((String) request.getAttribute("address1"));
        contact.setAddress2((String) request.getAttribute("address2"));
        contact.setCity((String) request.getAttribute("city"));
        contact.setPostalCode((String) request.getAttribute("postalcode"));
        contact.setCountry((String) request.getAttribute("country"));

        ID contactId;
        try {
            SaveResult[] sr = zapi.zCreate(new ZObject[]{contact});
            contactId = sr[0].getId();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return e.getMessage();
        }

        Account acc = new Account();
        ID accID = new ID();
        accID.setID(accountId);
        acc.setId(accID);
        acc.setStatus("Active");
        acc.setBillToId(contactId);
        acc.setSoldToId(contactId);

        SaveResult[] sr2;
        try {
            sr2 = zapi.zUpdate(new ZObject[]{acc});
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return e.getMessage();
        }
        SaveResult sr22 = sr2[0];
        if (sr22.getErrors().length > 0) {
            return sr22.getErrors()[0].getMessage();
        }
        return null;
    }

}
