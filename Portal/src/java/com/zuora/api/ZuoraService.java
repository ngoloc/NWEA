
/**
 * ZuoraService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.zuora.api;

/*
 *  ZuoraService java interface
 */

public interface ZuoraService {

    /**
     * Auto generated method signature
     *
     * @param update8
     * @param sessionHeader9
     * @throws com.zuora.api.UnexpectedErrorFault
     *                                        :
     * @throws com.zuora.api.InvalidTypeFault :
     */

    public com.zuora.api.UpdateResponse update(

            com.zuora.api.Update update8, com.zuora.api.SessionHeader sessionHeader9)
            throws java.rmi.RemoteException

            , com.zuora.api.UnexpectedErrorFault,
            com.zuora.api.InvalidTypeFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param update8
     * @param sessionHeader9
     */
    public void startupdate(

            com.zuora.api.Update update8, com.zuora.api.SessionHeader sessionHeader9,

            final com.zuora.api.ZuoraServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param amend11
     * @param sessionHeader12
     * @throws com.zuora.api.UnexpectedErrorFault
     *          :
     */

    public com.zuora.api.AmendResponse amend(

            com.zuora.api.Amend amend11, com.zuora.api.SessionHeader sessionHeader12)
            throws java.rmi.RemoteException

            , com.zuora.api.UnexpectedErrorFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param amend11
     * @param sessionHeader12
     */
    public void startamend(

            com.zuora.api.Amend amend11, com.zuora.api.SessionHeader sessionHeader12,

            final com.zuora.api.ZuoraServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param create14
     * @param callOptions15
     * @param sessionHeader16
     * @throws com.zuora.api.UnexpectedErrorFault
     *                                        :
     * @throws com.zuora.api.InvalidTypeFault :
     */

    public com.zuora.api.CreateResponse create(

            com.zuora.api.Create create14, com.zuora.api.CallOptions callOptions15,
            com.zuora.api.SessionHeader sessionHeader16)
            throws java.rmi.RemoteException

            , com.zuora.api.UnexpectedErrorFault,
            com.zuora.api.InvalidTypeFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param create14
     * @param callOptions15
     * @param sessionHeader16
     */
    public void startcreate(

            com.zuora.api.Create create14, com.zuora.api.CallOptions callOptions15,
            com.zuora.api.SessionHeader sessionHeader16,

            final com.zuora.api.ZuoraServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param execute18
     * @param sessionHeader19
     * @throws com.zuora.api.InvalidValueFault
     *                                        :
     * @throws com.zuora.api.UnexpectedErrorFault
     *                                        :
     * @throws com.zuora.api.InvalidTypeFault :
     */

    public com.zuora.api.ExecuteResponse execute(

            com.zuora.api.Execute execute18, com.zuora.api.SessionHeader sessionHeader19)
            throws java.rmi.RemoteException

            , com.zuora.api.InvalidValueFault,
            com.zuora.api.UnexpectedErrorFault, com.zuora.api.InvalidTypeFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param execute18
     * @param sessionHeader19
     */
    public void startexecute(

            com.zuora.api.Execute execute18,
            com.zuora.api.SessionHeader sessionHeader19,

            final com.zuora.api.ZuoraServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param query21
     * @param sessionHeader22
     * @throws com.zuora.api.MalformedQueryFault
     *          :
     * @throws com.zuora.api.UnexpectedErrorFault
     *          :
     * @throws com.zuora.api.InvalidQueryLocatorFault
     *          :
     */

    public com.zuora.api.QueryResponse query(

            com.zuora.api.Query query21, com.zuora.api.SessionHeader sessionHeader22)
            throws java.rmi.RemoteException

            , com.zuora.api.MalformedQueryFault,
            com.zuora.api.UnexpectedErrorFault,
            com.zuora.api.InvalidQueryLocatorFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param query21
     * @param sessionHeader22
     */
    public void startquery(

            com.zuora.api.Query query21, com.zuora.api.SessionHeader sessionHeader22,

            final com.zuora.api.ZuoraServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param generate24
     * @param sessionHeader25
     * @throws com.zuora.api.UnexpectedErrorFault
     *                                        :
     * @throws com.zuora.api.InvalidTypeFault :
     */

    public com.zuora.api.GenerateResponse generate(

            com.zuora.api.Generate generate24,
            com.zuora.api.SessionHeader sessionHeader25)
            throws java.rmi.RemoteException

            , com.zuora.api.UnexpectedErrorFault,
            com.zuora.api.InvalidTypeFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param generate24
     * @param sessionHeader25
     */
    public void startgenerate(

            com.zuora.api.Generate generate24,
            com.zuora.api.SessionHeader sessionHeader25,

            final com.zuora.api.ZuoraServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param login27
     * @throws com.zuora.api.UnexpectedErrorFault
     *                                  :
     * @throws com.zuora.api.LoginFault :
     */

    public com.zuora.api.LoginResponse login(

            com.zuora.api.Login login27) throws java.rmi.RemoteException

            , com.zuora.api.UnexpectedErrorFault, com.zuora.api.LoginFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param login27
     */
    public void startlogin(

            com.zuora.api.Login login27,

            final com.zuora.api.ZuoraServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getUserInfo29
     * @param sessionHeader30
     * @throws com.zuora.api.UnexpectedErrorFault
     *          :
     */

    public com.zuora.api.GetUserInfoResponse getUserInfo(

            com.zuora.api.GetUserInfo getUserInfo29,
            com.zuora.api.SessionHeader sessionHeader30)
            throws java.rmi.RemoteException

            , com.zuora.api.UnexpectedErrorFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getUserInfo29
     * @param sessionHeader30
     */
    public void startgetUserInfo(

            com.zuora.api.GetUserInfo getUserInfo29,
            com.zuora.api.SessionHeader sessionHeader30,

            final com.zuora.api.ZuoraServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param subscribe32
     * @param sessionHeader33
     * @throws com.zuora.api.UnexpectedErrorFault
     *          :
     */

    public com.zuora.api.SubscribeResponse subscribe(

            com.zuora.api.Subscribe subscribe32,
            com.zuora.api.SessionHeader sessionHeader33)
            throws java.rmi.RemoteException

            , com.zuora.api.UnexpectedErrorFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param subscribe32
     * @param sessionHeader33
     */
    public void startsubscribe(

            com.zuora.api.Subscribe subscribe32,
            com.zuora.api.SessionHeader sessionHeader33,

            final com.zuora.api.ZuoraServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param delete35
     * @param sessionHeader36
     * @throws com.zuora.api.InvalidValueFault
     *                                        :
     * @throws com.zuora.api.UnexpectedErrorFault
     *                                        :
     * @throws com.zuora.api.InvalidTypeFault :
     */

    public com.zuora.api.DeleteResponse delete(

            com.zuora.api.Delete delete35, com.zuora.api.SessionHeader sessionHeader36)
            throws java.rmi.RemoteException

            , com.zuora.api.InvalidValueFault,
            com.zuora.api.UnexpectedErrorFault, com.zuora.api.InvalidTypeFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param delete35
     * @param sessionHeader36
     */
    public void startdelete(

            com.zuora.api.Delete delete35, com.zuora.api.SessionHeader sessionHeader36,

            final com.zuora.api.ZuoraServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

    //
}
