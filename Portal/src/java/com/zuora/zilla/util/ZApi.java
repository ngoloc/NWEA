package com.zuora.zilla.util;

import com.zuora.api.*;
import com.zuora.api.object.ZObject;

import java.rmi.RemoteException;

public class ZApi {

    /**
     * The Stub to query from Zuora.
     */
    private ZuoraServiceStub service;

    /**
     * True upon a successful login.
     */
    public boolean isLoggedIn;

    private SessionHeader sessionHeader;

    /**
     * Creating a new zApi instance will log in using a SOAP login call, and
     * will generate a session header which can be used for subsequent API
     * calls. If the credentials set up in config.php are invalid, the
     * instantiation of the class will throw an exception.
     *
     * @throws LoginFault
     * @throws UnexpectedErrorFault
     * @throws RemoteException
     */
    public ZApi() throws Exception {
        // Get the user's credentials
        ZuoraUtility utility = new ZuoraUtility();
        String username = utility.getUsername();
        String password = utility.getPassword();
        String endpoint = utility.getEndpoint();

        // get the stub
        // new java.net.URL(endpoint)
        service = new ZuoraServiceStub(endpoint);

        Login login = new Login();
        login.setUsername(username);
        login.setPassword(password);
        LoginResponse logRes = service.login(login);
        LoginResult result = logRes.getResult();

        sessionHeader = new SessionHeader();
        sessionHeader.setSession(result.getSession());

        isLoggedIn = true;
    }

    /**
     * Query() call
     *
     * @param $q Query string
     * @return QueryResultW
     * @throws Exception
     * @throws InvalidQueryLocatorFault
     * @throws UnexpectedErrorFault
     * @throws MalformedQueryFault
     * @throws RemoteException
     */
    public QueryResult zQuery(String queryString) throws Exception {
        System.out.println("QUERY: " + queryString);
        QueryResponse qres;
        try {
            Query q = new Query();
            q.setQueryString(queryString);
            qres = service.query(q, sessionHeader);
        } catch (Exception e) {
            System.out.println("Exception on zQuery [" + queryString + "]: "
                    + e.getMessage());
            throw e;
        }

        return qres.getResult();
    }

    /**
     * zCreate() Create().
     *
     * @param $objs A list of 'zobject' arrays with all fields defined for the
     *              objects to be inserted
     * @return SaveResults
     * @throws InvalidTypeFault
     * @throws UnexpectedErrorFault
     * @throws RemoteException
     */
    public SaveResult[] zCreate(ZObject[] objs) throws Exception {
        System.out.println("CREATE: " + objs[0].getClass());
        CreateResponse cres;
        try {
            CallOptions co = new CallOptions();
            Create c = new Create();
            c.setZObjects(objs);
            cres = service.create(c, co, sessionHeader);
        } catch (Exception e) {
            Logger.Log("Exception on zCreate : " + e.getMessage());
            throw e;
        }

        return cres.getResult();
    }

    /**
     * zUpdate() Update()
     *
     * @param $objs A list of 'zobject' arrays with all fields defined for the
     *              objects to be updated
     * @return SaveResults
     * @throws InvalidTypeFault
     * @throws UnexpectedErrorFault
     * @throws RemoteException
     */
    public SaveResult[] zUpdate(ZObject[] objs) throws Exception {
        System.out.println("UPDATE: " + objs[0].getClass());
        UpdateResponse ures;
        try {
            Update u = new Update();
            u.setZObjects(objs);
            ures = service.update(u, sessionHeader);
        } catch (Exception e) {
            Logger.Log("Exception on zUpdate : " + e.getMessage());
            throw e;
        }

        return ures.getResult();
    }

    /**
     * Delete() call
     *
     * @param $ids   Zuora IDs of records to be deleted
     * @param $ztype Object Type: Account, Product, etc.
     * @return DeleteResults
     * @throws InvalidTypeFault
     * @throws UnexpectedErrorFault
     * @throws InvalidValueFault
     * @throws RemoteException
     */
    public DeleteResult[] zDelete(ID[] ids, String type) throws Exception {
        System.out.println("DELETE: " + type);
        DeleteResponse dres;
        try {
            Delete d = new Delete();
            d.setIds(ids);
            d.setType(type);
            dres = service.delete(d, sessionHeader);
        } catch (Exception e) {
            Logger.Log("Exception on zDelete : " + e.getMessage());
            throw e;
        }

        return dres.getResult();
    }

    /**
     * Subscribe() call
     *
     * @param $zSubReq a SubscriptionRequest object that has been populated with all
     *                 required fields
     * @return SubscribeResult
     * @throws UnexpectedErrorFault
     * @throws RemoteException
     */
    public SubscribeResult[] zSubscribe(Subscribe subReqs) throws Exception {
        System.out.println("SUBSCRIBE");
        SubscribeResponse sres;
        try {
            sres = service.subscribe(subReqs, sessionHeader);
        } catch (Exception e) {
            Logger.Log("Exception on zSubscribe : " + e.getMessage());
            throw e;
        }

        return sres.getResult();
    }

    /**
     * Amend() call
     *
     * @param $zAmendment      Amendment to be created
     * @param $zAmendOptions   Override of default amendment options
     * @param $zPreviewOptions Override of default preview options
     * @return AmendResults
     * @throws UnexpectedErrorFault
     * @throws RemoteException
     */
    public AmendResult[] zAmend(Amend amendReqs) throws Exception {
        System.out.println("AMEND");
        AmendResponse ares;
        try {
            ares = service.amend(amendReqs, sessionHeader);
        } catch (Exception e) {
            Logger.Log("Exception on zSubscribe : " + e.getMessage());
            throw e;
        }

        return ares.getResults();
    }
}
