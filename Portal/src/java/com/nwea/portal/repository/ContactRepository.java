package com.nwea.portal.repository;

import com.zuora.api.object.Contact;
import com.zuora.api.object.ZObject;
import com.zuora.zilla.util.ZApi;
import org.springframework.cache.Cache;

import java.util.Arrays;

public class ContactRepository extends RepositoryBase {

    private static final String columns = "AccountId, Country, Address1, Address2,"
            + "City, State, PostalCode, WorkPhone, FirstName, LastName";

    private static final String query = "SELECT %s FROM Contact WHERE %s = '%s'";

    public ContactRepository(Cache c, ZApi api) throws Exception {
        super(c, api);
        // TODO Auto-generated constructor stub
    }

    public Contact[] GetByAccountId(String accountId) throws Exception {
        ZObject[] results = Query(String.format(query, columns, "AccountId", accountId));
        Contact[] contactArray = Arrays.copyOf(results, results.length, Contact[].class);
        return contactArray;
    }

    public Contact GetById(String contactId) throws Exception {
        ZObject[] results = Query(String.format(query, columns, "Id", contactId));
        return (Contact) results[0];
    }

    public Contact[] GetByEmail(String email) throws Exception {
        ZObject[] results = Query(String.format(query, columns, "WorkEmail", email) + " OR PersonalEmail = '" + email + "'");
        if (results.length == 0) {
            return new Contact[0];
        }
        return (Contact[]) results;
    }

    public void Update(Contact contact) throws Exception {
        super.Update(contact);
    }

    public String Create(Contact contact) throws Exception {
        return super.Create(contact);
    }

}
