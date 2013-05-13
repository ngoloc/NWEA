/**
 * ZuoraServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.zuora.api;

/*
 *  ZuoraServiceStub java implementation
 */

public class ZuoraServiceStub extends org.apache.axis2.client.Stub implements
        ZuoraService {
    protected org.apache.axis2.description.AxisOperation[] _operations;

    // hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();

    private static int counter = 0;

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }
        counter = counter + 1;
        return java.lang.Long.toString(java.lang.System.currentTimeMillis())
                + "_" + counter;
    }

    private void populateAxisService() throws org.apache.axis2.AxisFault {

        // creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService("ZuoraService"
                + getUniqueSuffix());
        addAnonymousOperations();

        // creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[10];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://api.zuora.com/", "update"));
        _service.addOperation(__operation);

        _operations[0] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://api.zuora.com/", "amend"));
        _service.addOperation(__operation);

        _operations[1] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://api.zuora.com/", "create"));
        _service.addOperation(__operation);

        _operations[2] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://api.zuora.com/", "execute"));
        _service.addOperation(__operation);

        _operations[3] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://api.zuora.com/", "query"));
        _service.addOperation(__operation);

        _operations[4] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://api.zuora.com/", "generate"));
        _service.addOperation(__operation);

        _operations[5] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://api.zuora.com/", "login"));
        _service.addOperation(__operation);

        _operations[6] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://api.zuora.com/", "getUserInfo"));
        _service.addOperation(__operation);

        _operations[7] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://api.zuora.com/", "subscribe"));
        _service.addOperation(__operation);

        _operations[8] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://api.zuora.com/", "delete"));
        _service.addOperation(__operation);

        _operations[9] = __operation;

    }

    // populates the faults
    private void populateFaults() {

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "update"),
                "com.zuora.api.UnexpectedErrorFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "update"),
                "com.zuora.api.UnexpectedErrorFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "update"),
                "com.zuora.api.fault.UnexpectedErrorFaultE");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "InvalidTypeFault"), "update"),
                "com.zuora.api.InvalidTypeFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "InvalidTypeFault"), "update"),
                "com.zuora.api.InvalidTypeFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "InvalidTypeFault"), "update"),
                "com.zuora.api.fault.InvalidTypeFaultE");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "amend"),
                "com.zuora.api.UnexpectedErrorFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "amend"),
                "com.zuora.api.UnexpectedErrorFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "amend"),
                "com.zuora.api.fault.UnexpectedErrorFaultE");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "create"),
                "com.zuora.api.UnexpectedErrorFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "create"),
                "com.zuora.api.UnexpectedErrorFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "create"),
                "com.zuora.api.fault.UnexpectedErrorFaultE");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "InvalidTypeFault"), "create"),
                "com.zuora.api.InvalidTypeFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "InvalidTypeFault"), "create"),
                "com.zuora.api.InvalidTypeFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "InvalidTypeFault"), "create"),
                "com.zuora.api.fault.InvalidTypeFaultE");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "InvalidValueFault"), "execute"),
                "com.zuora.api.InvalidValueFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "InvalidValueFault"), "execute"),
                "com.zuora.api.InvalidValueFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "InvalidValueFault"), "execute"),
                "com.zuora.api.fault.InvalidValueFaultE");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "execute"),
                "com.zuora.api.UnexpectedErrorFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "execute"),
                "com.zuora.api.UnexpectedErrorFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "execute"),
                "com.zuora.api.fault.UnexpectedErrorFaultE");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "InvalidTypeFault"), "execute"),
                "com.zuora.api.InvalidTypeFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "InvalidTypeFault"), "execute"),
                "com.zuora.api.InvalidTypeFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "InvalidTypeFault"), "execute"),
                "com.zuora.api.fault.InvalidTypeFaultE");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "MalformedQueryFault"), "query"),
                "com.zuora.api.MalformedQueryFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "MalformedQueryFault"), "query"),
                "com.zuora.api.MalformedQueryFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "MalformedQueryFault"), "query"),
                "com.zuora.api.fault.MalformedQueryFaultE");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "query"),
                "com.zuora.api.UnexpectedErrorFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "query"),
                "com.zuora.api.UnexpectedErrorFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "query"),
                "com.zuora.api.fault.UnexpectedErrorFaultE");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "InvalidQueryLocatorFault"), "query"),
                "com.zuora.api.InvalidQueryLocatorFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "InvalidQueryLocatorFault"), "query"),
                "com.zuora.api.InvalidQueryLocatorFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "InvalidQueryLocatorFault"), "query"),
                "com.zuora.api.fault.InvalidQueryLocatorFaultE");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "generate"),
                "com.zuora.api.UnexpectedErrorFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "generate"),
                "com.zuora.api.UnexpectedErrorFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "generate"),
                "com.zuora.api.fault.UnexpectedErrorFaultE");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "InvalidTypeFault"), "generate"),
                "com.zuora.api.InvalidTypeFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "InvalidTypeFault"), "generate"),
                "com.zuora.api.InvalidTypeFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "InvalidTypeFault"), "generate"),
                "com.zuora.api.fault.InvalidTypeFaultE");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "login"),
                "com.zuora.api.UnexpectedErrorFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "login"),
                "com.zuora.api.UnexpectedErrorFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "login"),
                "com.zuora.api.fault.UnexpectedErrorFaultE");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "LoginFault"), "login"), "com.zuora.api.LoginFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "LoginFault"), "login"), "com.zuora.api.LoginFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "LoginFault"), "login"),
                "com.zuora.api.fault.LoginFaultE");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "getUserInfo"),
                "com.zuora.api.UnexpectedErrorFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "getUserInfo"),
                "com.zuora.api.UnexpectedErrorFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "getUserInfo"),
                "com.zuora.api.fault.UnexpectedErrorFaultE");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "subscribe"),
                "com.zuora.api.UnexpectedErrorFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "subscribe"),
                "com.zuora.api.UnexpectedErrorFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "subscribe"),
                "com.zuora.api.fault.UnexpectedErrorFaultE");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "InvalidValueFault"), "delete"),
                "com.zuora.api.InvalidValueFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "InvalidValueFault"), "delete"),
                "com.zuora.api.InvalidValueFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "InvalidValueFault"), "delete"),
                "com.zuora.api.fault.InvalidValueFaultE");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "delete"),
                "com.zuora.api.UnexpectedErrorFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "delete"),
                "com.zuora.api.UnexpectedErrorFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "UnexpectedErrorFault"), "delete"),
                "com.zuora.api.fault.UnexpectedErrorFaultE");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "InvalidTypeFault"), "delete"),
                "com.zuora.api.InvalidTypeFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "InvalidTypeFault"), "delete"),
                "com.zuora.api.InvalidTypeFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://fault.api.zuora.com/",
                        "InvalidTypeFault"), "delete"),
                "com.zuora.api.fault.InvalidTypeFaultE");

    }

    /**
     * Constructor that takes in a configContext
     */

    public ZuoraServiceStub(
            org.apache.axis2.context.ConfigurationContext configurationContext,
            java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext and useseperate listner
     */
    public ZuoraServiceStub(
            org.apache.axis2.context.ConfigurationContext configurationContext,
            java.lang.String targetEndpoint, boolean useSeparateListener)
            throws org.apache.axis2.AxisFault {
        // To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(
                configurationContext, _service);

        _serviceClient.getOptions().setTo(
                new org.apache.axis2.addressing.EndpointReference(
                        targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

    }

    /**
     * Default Constructor
     */
    public ZuoraServiceStub(
            org.apache.axis2.context.ConfigurationContext configurationContext)
            throws org.apache.axis2.AxisFault {

        this(configurationContext,
                "https://apisandbox.zuora.com/apps/services/a/46.0");

    }

    /**
     * Default Constructor
     */
    public ZuoraServiceStub() throws org.apache.axis2.AxisFault {

        this("https://apisandbox.zuora.com/apps/services/a/46.0");

    }

    /**
     * Constructor taking the target endpoint
     */
    public ZuoraServiceStub(java.lang.String targetEndpoint)
            throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }

    /**
     * Auto generated method signature
     *
     * @param update38
     * @param sessionHeader39
     * @throws com.zuora.api.UnexpectedErrorFault
     *                                        :
     * @throws com.zuora.api.InvalidTypeFault :
     * @see com.zuora.api.ZuoraService#update
     */

    public com.zuora.api.UpdateResponse update(

            com.zuora.api.Update update38, com.zuora.api.SessionHeader sessionHeader39)

            throws java.rmi.RemoteException

            , com.zuora.api.UnexpectedErrorFault, com.zuora.api.InvalidTypeFault {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                    .createClient(_operations[0].getName());
            _operationClient.getOptions().setAction(
                    "http://api.zuora.com/Soap/updateRequest");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
                    true);

            addPropertyToOperationClient(
                    _operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                    .getSoapVersionURI()), update38,
                    optimizeContent(new javax.xml.namespace.QName(
                            "http://api.zuora.com/", "update")),
                    new javax.xml.namespace.QName("http://api.zuora.com/",
                            "update"));

            env.build();

            // add the children only if the parameter is not null
            if (sessionHeader39 != null) {

                org.apache.axiom.om.OMElement omElementsessionHeader39 = toOM(
                        sessionHeader39,
                        optimizeContent(new javax.xml.namespace.QName(
                                "http://api.zuora.com/", "update")));
                addHeader(omElementsessionHeader39, env);

            }

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
                    .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
                    .getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                    .getFirstElement(), com.zuora.api.UpdateResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.zuora.api.UpdateResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap
                        .containsKey(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "update"))) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                .get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(), "update"));
                        java.lang.Class exceptionClass = java.lang.Class
                                .forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass
                                .getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor
                                .newInstance(f.getMessage());
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                .get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(), "update"));
                        java.lang.Class messageClass = java.lang.Class
                                .forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod(
                                "setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof com.zuora.api.UnexpectedErrorFault) {
                            throw (com.zuora.api.UnexpectedErrorFault) ex;
                        }

                        if (ex instanceof com.zuora.api.InvalidTypeFault) {
                            throw (com.zuora.api.InvalidTypeFault) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                        .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param update38
     * @param sessionHeader39
     * @see com.zuora.api.ZuoraService#startupdate
     */
    public void startupdate(

            com.zuora.api.Update update38, com.zuora.api.SessionHeader sessionHeader39,

            final com.zuora.api.ZuoraServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                .createClient(_operations[0].getName());
        _operationClient.getOptions().setAction(
                "http://api.zuora.com/Soap/updateRequest");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(
                _operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(
                getFactory(_operationClient.getOptions().getSoapVersionURI()),
                update38,
                optimizeContent(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "update")),
                new javax.xml.namespace.QName("http://api.zuora.com/", "update"));

        // add the soap_headers only if they are not null
        if (sessionHeader39 != null) {

            org.apache.axiom.om.OMElement omElementsessionHeader39 = toOM(
                    sessionHeader39,
                    optimizeContent(new javax.xml.namespace.QName(
                            "http://api.zuora.com/", "update")));
            addHeader(omElementsessionHeader39, env);

        }

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient
                .setCallback(new org.apache.axis2.client.async.AxisCallback() {
                    public void onMessage(
                            org.apache.axis2.context.MessageContext resultContext) {
                        try {
                            org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
                                    .getEnvelope();

                            java.lang.Object object = fromOM(resultEnv
                                    .getBody().getFirstElement(),
                                    com.zuora.api.UpdateResponse.class,
                                    getEnvelopeNamespaces(resultEnv));
                            callback.receiveResultupdate((com.zuora.api.UpdateResponse) object);

                        } catch (org.apache.axis2.AxisFault e) {
                            callback.receiveErrorupdate(e);
                        }
                    }

                    public void onError(java.lang.Exception error) {
                        if (error instanceof org.apache.axis2.AxisFault) {
                            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                            org.apache.axiom.om.OMElement faultElt = f
                                    .getDetail();
                            if (faultElt != null) {
                                if (faultExceptionNameMap
                                        .containsKey(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "update"))) {
                                    // make the fault by reflection
                                    try {
                                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                                .get(new org.apache.axis2.client.FaultMapKey(
                                                        faultElt.getQName(),
                                                        "update"));
                                        java.lang.Class exceptionClass = java.lang.Class
                                                .forName(exceptionClassName);
                                        java.lang.reflect.Constructor constructor = exceptionClass
                                                .getConstructor(String.class);
                                        java.lang.Exception ex = (java.lang.Exception) constructor
                                                .newInstance(f.getMessage());
                                        // message class
                                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                                .get(new org.apache.axis2.client.FaultMapKey(
                                                        faultElt.getQName(),
                                                        "update"));
                                        java.lang.Class messageClass = java.lang.Class
                                                .forName(messageClassName);
                                        java.lang.Object messageObject = fromOM(
                                                faultElt, messageClass, null);
                                        java.lang.reflect.Method m = exceptionClass
                                                .getMethod(
                                                        "setFaultMessage",
                                                        new java.lang.Class[]{messageClass});
                                        m.invoke(
                                                ex,
                                                new java.lang.Object[]{messageObject});

                                        if (ex instanceof com.zuora.api.UnexpectedErrorFault) {
                                            callback.receiveErrorupdate((com.zuora.api.UnexpectedErrorFault) ex);
                                            return;
                                        }

                                        if (ex instanceof com.zuora.api.InvalidTypeFault) {
                                            callback.receiveErrorupdate((com.zuora.api.InvalidTypeFault) ex);
                                            return;
                                        }

                                        callback.receiveErrorupdate(new java.rmi.RemoteException(
                                                ex.getMessage(), ex));
                                    } catch (java.lang.ClassCastException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorupdate(f);
                                    } catch (java.lang.ClassNotFoundException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorupdate(f);
                                    } catch (java.lang.NoSuchMethodException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorupdate(f);
                                    } catch (java.lang.reflect.InvocationTargetException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorupdate(f);
                                    } catch (java.lang.IllegalAccessException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorupdate(f);
                                    } catch (java.lang.InstantiationException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorupdate(f);
                                    } catch (org.apache.axis2.AxisFault e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorupdate(f);
                                    }
                                } else {
                                    callback.receiveErrorupdate(f);
                                }
                            } else {
                                callback.receiveErrorupdate(f);
                            }
                        } else {
                            callback.receiveErrorupdate(error);
                        }
                    }

                    public void onFault(
                            org.apache.axis2.context.MessageContext faultContext) {
                        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                                .getInboundFaultFromMessageContext(faultContext);
                        onError(fault);
                    }

                    public void onComplete() {
                        try {
                            _messageContext.getTransportOut().getSender()
                                    .cleanup(_messageContext);
                        } catch (org.apache.axis2.AxisFault axisFault) {
                            callback.receiveErrorupdate(axisFault);
                        }
                    }
                });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[0].getMessageReceiver() == null
                && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[0].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @param amend41
     * @param sessionHeader42
     * @throws com.zuora.api.UnexpectedErrorFault
     *          :
     * @see com.zuora.api.ZuoraService#amend
     */

    public com.zuora.api.AmendResponse amend(

            com.zuora.api.Amend amend41, com.zuora.api.SessionHeader sessionHeader42)

            throws java.rmi.RemoteException

            , com.zuora.api.UnexpectedErrorFault {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                    .createClient(_operations[1].getName());
            _operationClient.getOptions().setAction(
                    "http://api.zuora.com/Soap/amendRequest");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
                    true);

            addPropertyToOperationClient(
                    _operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                    .getSoapVersionURI()), amend41,
                    optimizeContent(new javax.xml.namespace.QName(
                            "http://api.zuora.com/", "amend")),
                    new javax.xml.namespace.QName("http://api.zuora.com/",
                            "amend"));

            env.build();

            // add the children only if the parameter is not null
            if (sessionHeader42 != null) {

                org.apache.axiom.om.OMElement omElementsessionHeader42 = toOM(
                        sessionHeader42,
                        optimizeContent(new javax.xml.namespace.QName(
                                "http://api.zuora.com/", "amend")));
                addHeader(omElementsessionHeader42, env);

            }

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
                    .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
                    .getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                    .getFirstElement(), com.zuora.api.AmendResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.zuora.api.AmendResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap
                        .containsKey(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "amend"))) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                .get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(), "amend"));
                        java.lang.Class exceptionClass = java.lang.Class
                                .forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass
                                .getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor
                                .newInstance(f.getMessage());
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                .get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(), "amend"));
                        java.lang.Class messageClass = java.lang.Class
                                .forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod(
                                "setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof com.zuora.api.UnexpectedErrorFault) {
                            throw (com.zuora.api.UnexpectedErrorFault) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                        .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param amend41
     * @param sessionHeader42
     * @see com.zuora.api.ZuoraService#startamend
     */
    public void startamend(

            com.zuora.api.Amend amend41, com.zuora.api.SessionHeader sessionHeader42,

            final com.zuora.api.ZuoraServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                .createClient(_operations[1].getName());
        _operationClient.getOptions().setAction(
                "http://api.zuora.com/Soap/amendRequest");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(
                _operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions()
                .getSoapVersionURI()), amend41,
                optimizeContent(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "amend")),
                new javax.xml.namespace.QName("http://api.zuora.com/", "amend"));

        // add the soap_headers only if they are not null
        if (sessionHeader42 != null) {

            org.apache.axiom.om.OMElement omElementsessionHeader42 = toOM(
                    sessionHeader42,
                    optimizeContent(new javax.xml.namespace.QName(
                            "http://api.zuora.com/", "amend")));
            addHeader(omElementsessionHeader42, env);

        }

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient
                .setCallback(new org.apache.axis2.client.async.AxisCallback() {
                    public void onMessage(
                            org.apache.axis2.context.MessageContext resultContext) {
                        try {
                            org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
                                    .getEnvelope();

                            java.lang.Object object = fromOM(resultEnv
                                    .getBody().getFirstElement(),
                                    com.zuora.api.AmendResponse.class,
                                    getEnvelopeNamespaces(resultEnv));
                            callback.receiveResultamend((com.zuora.api.AmendResponse) object);

                        } catch (org.apache.axis2.AxisFault e) {
                            callback.receiveErroramend(e);
                        }
                    }

                    public void onError(java.lang.Exception error) {
                        if (error instanceof org.apache.axis2.AxisFault) {
                            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                            org.apache.axiom.om.OMElement faultElt = f
                                    .getDetail();
                            if (faultElt != null) {
                                if (faultExceptionNameMap
                                        .containsKey(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "amend"))) {
                                    // make the fault by reflection
                                    try {
                                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                                .get(new org.apache.axis2.client.FaultMapKey(
                                                        faultElt.getQName(),
                                                        "amend"));
                                        java.lang.Class exceptionClass = java.lang.Class
                                                .forName(exceptionClassName);
                                        java.lang.reflect.Constructor constructor = exceptionClass
                                                .getConstructor(String.class);
                                        java.lang.Exception ex = (java.lang.Exception) constructor
                                                .newInstance(f.getMessage());
                                        // message class
                                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                                .get(new org.apache.axis2.client.FaultMapKey(
                                                        faultElt.getQName(),
                                                        "amend"));
                                        java.lang.Class messageClass = java.lang.Class
                                                .forName(messageClassName);
                                        java.lang.Object messageObject = fromOM(
                                                faultElt, messageClass, null);
                                        java.lang.reflect.Method m = exceptionClass
                                                .getMethod(
                                                        "setFaultMessage",
                                                        new java.lang.Class[]{messageClass});
                                        m.invoke(
                                                ex,
                                                new java.lang.Object[]{messageObject});

                                        if (ex instanceof com.zuora.api.UnexpectedErrorFault) {
                                            callback.receiveErroramend((com.zuora.api.UnexpectedErrorFault) ex);
                                            return;
                                        }

                                        callback.receiveErroramend(new java.rmi.RemoteException(
                                                ex.getMessage(), ex));
                                    } catch (java.lang.ClassCastException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErroramend(f);
                                    } catch (java.lang.ClassNotFoundException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErroramend(f);
                                    } catch (java.lang.NoSuchMethodException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErroramend(f);
                                    } catch (java.lang.reflect.InvocationTargetException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErroramend(f);
                                    } catch (java.lang.IllegalAccessException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErroramend(f);
                                    } catch (java.lang.InstantiationException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErroramend(f);
                                    } catch (org.apache.axis2.AxisFault e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErroramend(f);
                                    }
                                } else {
                                    callback.receiveErroramend(f);
                                }
                            } else {
                                callback.receiveErroramend(f);
                            }
                        } else {
                            callback.receiveErroramend(error);
                        }
                    }

                    public void onFault(
                            org.apache.axis2.context.MessageContext faultContext) {
                        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                                .getInboundFaultFromMessageContext(faultContext);
                        onError(fault);
                    }

                    public void onComplete() {
                        try {
                            _messageContext.getTransportOut().getSender()
                                    .cleanup(_messageContext);
                        } catch (org.apache.axis2.AxisFault axisFault) {
                            callback.receiveErroramend(axisFault);
                        }
                    }
                });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[1].getMessageReceiver() == null
                && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[1].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @param create44
     * @param callOptions45
     * @param sessionHeader46
     * @throws com.zuora.api.UnexpectedErrorFault
     *                                        :
     * @throws com.zuora.api.InvalidTypeFault :
     * @see com.zuora.api.ZuoraService#create
     */

    public com.zuora.api.CreateResponse create(

            com.zuora.api.Create create44, com.zuora.api.CallOptions callOptions45,
            com.zuora.api.SessionHeader sessionHeader46)

            throws java.rmi.RemoteException

            , com.zuora.api.UnexpectedErrorFault, com.zuora.api.InvalidTypeFault {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                    .createClient(_operations[2].getName());
            _operationClient.getOptions().setAction(
                    "http://api.zuora.com/Soap/createRequest");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
                    true);

            addPropertyToOperationClient(
                    _operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                    .getSoapVersionURI()), create44,
                    optimizeContent(new javax.xml.namespace.QName(
                            "http://api.zuora.com/", "create")),
                    new javax.xml.namespace.QName("http://api.zuora.com/",
                            "create"));

            env.build();

            // add the children only if the parameter is not null
            if (callOptions45 != null) {

                org.apache.axiom.om.OMElement omElementcallOptions45 = toOM(
                        callOptions45,
                        optimizeContent(new javax.xml.namespace.QName(
                                "http://api.zuora.com/", "create")));
                addHeader(omElementcallOptions45, env);

            }

            // add the children only if the parameter is not null
            if (sessionHeader46 != null) {

                org.apache.axiom.om.OMElement omElementsessionHeader46 = toOM(
                        sessionHeader46,
                        optimizeContent(new javax.xml.namespace.QName(
                                "http://api.zuora.com/", "create")));
                addHeader(omElementsessionHeader46, env);

            }

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
                    .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
                    .getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                    .getFirstElement(), com.zuora.api.CreateResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.zuora.api.CreateResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap
                        .containsKey(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "create"))) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                .get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(), "create"));
                        java.lang.Class exceptionClass = java.lang.Class
                                .forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass
                                .getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor
                                .newInstance(f.getMessage());
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                .get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(), "create"));
                        java.lang.Class messageClass = java.lang.Class
                                .forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod(
                                "setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof com.zuora.api.UnexpectedErrorFault) {
                            throw (com.zuora.api.UnexpectedErrorFault) ex;
                        }

                        if (ex instanceof com.zuora.api.InvalidTypeFault) {
                            throw (com.zuora.api.InvalidTypeFault) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                        .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param create44
     * @param callOptions45
     * @param sessionHeader46
     * @see com.zuora.api.ZuoraService#startcreate
     */
    public void startcreate(

            com.zuora.api.Create create44, com.zuora.api.CallOptions callOptions45,
            com.zuora.api.SessionHeader sessionHeader46,

            final com.zuora.api.ZuoraServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                .createClient(_operations[2].getName());
        _operationClient.getOptions().setAction(
                "http://api.zuora.com/Soap/createRequest");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(
                _operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(
                getFactory(_operationClient.getOptions().getSoapVersionURI()),
                create44,
                optimizeContent(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "create")),
                new javax.xml.namespace.QName("http://api.zuora.com/", "create"));

        // add the soap_headers only if they are not null
        if (callOptions45 != null) {

            org.apache.axiom.om.OMElement omElementcallOptions45 = toOM(
                    callOptions45,
                    optimizeContent(new javax.xml.namespace.QName(
                            "http://api.zuora.com/", "create")));
            addHeader(omElementcallOptions45, env);

        }

        // add the soap_headers only if they are not null
        if (sessionHeader46 != null) {

            org.apache.axiom.om.OMElement omElementsessionHeader46 = toOM(
                    sessionHeader46,
                    optimizeContent(new javax.xml.namespace.QName(
                            "http://api.zuora.com/", "create")));
            addHeader(omElementsessionHeader46, env);

        }

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient
                .setCallback(new org.apache.axis2.client.async.AxisCallback() {
                    public void onMessage(
                            org.apache.axis2.context.MessageContext resultContext) {
                        try {
                            org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
                                    .getEnvelope();

                            java.lang.Object object = fromOM(resultEnv
                                    .getBody().getFirstElement(),
                                    com.zuora.api.CreateResponse.class,
                                    getEnvelopeNamespaces(resultEnv));
                            callback.receiveResultcreate((com.zuora.api.CreateResponse) object);

                        } catch (org.apache.axis2.AxisFault e) {
                            callback.receiveErrorcreate(e);
                        }
                    }

                    public void onError(java.lang.Exception error) {
                        if (error instanceof org.apache.axis2.AxisFault) {
                            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                            org.apache.axiom.om.OMElement faultElt = f
                                    .getDetail();
                            if (faultElt != null) {
                                if (faultExceptionNameMap
                                        .containsKey(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "create"))) {
                                    // make the fault by reflection
                                    try {
                                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                                .get(new org.apache.axis2.client.FaultMapKey(
                                                        faultElt.getQName(),
                                                        "create"));
                                        java.lang.Class exceptionClass = java.lang.Class
                                                .forName(exceptionClassName);
                                        java.lang.reflect.Constructor constructor = exceptionClass
                                                .getConstructor(String.class);
                                        java.lang.Exception ex = (java.lang.Exception) constructor
                                                .newInstance(f.getMessage());
                                        // message class
                                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                                .get(new org.apache.axis2.client.FaultMapKey(
                                                        faultElt.getQName(),
                                                        "create"));
                                        java.lang.Class messageClass = java.lang.Class
                                                .forName(messageClassName);
                                        java.lang.Object messageObject = fromOM(
                                                faultElt, messageClass, null);
                                        java.lang.reflect.Method m = exceptionClass
                                                .getMethod(
                                                        "setFaultMessage",
                                                        new java.lang.Class[]{messageClass});
                                        m.invoke(
                                                ex,
                                                new java.lang.Object[]{messageObject});

                                        if (ex instanceof com.zuora.api.UnexpectedErrorFault) {
                                            callback.receiveErrorcreate((com.zuora.api.UnexpectedErrorFault) ex);
                                            return;
                                        }

                                        if (ex instanceof com.zuora.api.InvalidTypeFault) {
                                            callback.receiveErrorcreate((com.zuora.api.InvalidTypeFault) ex);
                                            return;
                                        }

                                        callback.receiveErrorcreate(new java.rmi.RemoteException(
                                                ex.getMessage(), ex));
                                    } catch (java.lang.ClassCastException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorcreate(f);
                                    } catch (java.lang.ClassNotFoundException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorcreate(f);
                                    } catch (java.lang.NoSuchMethodException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorcreate(f);
                                    } catch (java.lang.reflect.InvocationTargetException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorcreate(f);
                                    } catch (java.lang.IllegalAccessException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorcreate(f);
                                    } catch (java.lang.InstantiationException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorcreate(f);
                                    } catch (org.apache.axis2.AxisFault e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorcreate(f);
                                    }
                                } else {
                                    callback.receiveErrorcreate(f);
                                }
                            } else {
                                callback.receiveErrorcreate(f);
                            }
                        } else {
                            callback.receiveErrorcreate(error);
                        }
                    }

                    public void onFault(
                            org.apache.axis2.context.MessageContext faultContext) {
                        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                                .getInboundFaultFromMessageContext(faultContext);
                        onError(fault);
                    }

                    public void onComplete() {
                        try {
                            _messageContext.getTransportOut().getSender()
                                    .cleanup(_messageContext);
                        } catch (org.apache.axis2.AxisFault axisFault) {
                            callback.receiveErrorcreate(axisFault);
                        }
                    }
                });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[2].getMessageReceiver() == null
                && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[2].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @param execute48
     * @param sessionHeader49
     * @throws com.zuora.api.InvalidValueFault
     *                                        :
     * @throws com.zuora.api.UnexpectedErrorFault
     *                                        :
     * @throws com.zuora.api.InvalidTypeFault :
     * @see com.zuora.api.ZuoraService#execute
     */

    public com.zuora.api.ExecuteResponse execute(

            com.zuora.api.Execute execute48, com.zuora.api.SessionHeader sessionHeader49)

            throws java.rmi.RemoteException

            , com.zuora.api.InvalidValueFault, com.zuora.api.UnexpectedErrorFault,
            com.zuora.api.InvalidTypeFault {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                    .createClient(_operations[3].getName());
            _operationClient.getOptions().setAction(
                    "http://api.zuora.com/Soap/executeRequest");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
                    true);

            addPropertyToOperationClient(
                    _operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                    .getSoapVersionURI()), execute48,
                    optimizeContent(new javax.xml.namespace.QName(
                            "http://api.zuora.com/", "execute")),
                    new javax.xml.namespace.QName("http://api.zuora.com/",
                            "execute"));

            env.build();

            // add the children only if the parameter is not null
            if (sessionHeader49 != null) {

                org.apache.axiom.om.OMElement omElementsessionHeader49 = toOM(
                        sessionHeader49,
                        optimizeContent(new javax.xml.namespace.QName(
                                "http://api.zuora.com/", "execute")));
                addHeader(omElementsessionHeader49, env);

            }

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
                    .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
                    .getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                    .getFirstElement(), com.zuora.api.ExecuteResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.zuora.api.ExecuteResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap
                        .containsKey(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "execute"))) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                .get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(), "execute"));
                        java.lang.Class exceptionClass = java.lang.Class
                                .forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass
                                .getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor
                                .newInstance(f.getMessage());
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                .get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(), "execute"));
                        java.lang.Class messageClass = java.lang.Class
                                .forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod(
                                "setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof com.zuora.api.InvalidValueFault) {
                            throw (com.zuora.api.InvalidValueFault) ex;
                        }

                        if (ex instanceof com.zuora.api.UnexpectedErrorFault) {
                            throw (com.zuora.api.UnexpectedErrorFault) ex;
                        }

                        if (ex instanceof com.zuora.api.InvalidTypeFault) {
                            throw (com.zuora.api.InvalidTypeFault) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                        .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param execute48
     * @param sessionHeader49
     * @see com.zuora.api.ZuoraService#startexecute
     */
    public void startexecute(

            com.zuora.api.Execute execute48,
            com.zuora.api.SessionHeader sessionHeader49,

            final com.zuora.api.ZuoraServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                .createClient(_operations[3].getName());
        _operationClient.getOptions().setAction(
                "http://api.zuora.com/Soap/executeRequest");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(
                _operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions()
                .getSoapVersionURI()), execute48,
                optimizeContent(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "execute")),
                new javax.xml.namespace.QName("http://api.zuora.com/",
                        "execute"));

        // add the soap_headers only if they are not null
        if (sessionHeader49 != null) {

            org.apache.axiom.om.OMElement omElementsessionHeader49 = toOM(
                    sessionHeader49,
                    optimizeContent(new javax.xml.namespace.QName(
                            "http://api.zuora.com/", "execute")));
            addHeader(omElementsessionHeader49, env);

        }

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient
                .setCallback(new org.apache.axis2.client.async.AxisCallback() {
                    public void onMessage(
                            org.apache.axis2.context.MessageContext resultContext) {
                        try {
                            org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
                                    .getEnvelope();

                            java.lang.Object object = fromOM(resultEnv
                                    .getBody().getFirstElement(),
                                    com.zuora.api.ExecuteResponse.class,
                                    getEnvelopeNamespaces(resultEnv));
                            callback.receiveResultexecute((com.zuora.api.ExecuteResponse) object);

                        } catch (org.apache.axis2.AxisFault e) {
                            callback.receiveErrorexecute(e);
                        }
                    }

                    public void onError(java.lang.Exception error) {
                        if (error instanceof org.apache.axis2.AxisFault) {
                            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                            org.apache.axiom.om.OMElement faultElt = f
                                    .getDetail();
                            if (faultElt != null) {
                                if (faultExceptionNameMap
                                        .containsKey(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "execute"))) {
                                    // make the fault by reflection
                                    try {
                                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                                .get(new org.apache.axis2.client.FaultMapKey(
                                                        faultElt.getQName(),
                                                        "execute"));
                                        java.lang.Class exceptionClass = java.lang.Class
                                                .forName(exceptionClassName);
                                        java.lang.reflect.Constructor constructor = exceptionClass
                                                .getConstructor(String.class);
                                        java.lang.Exception ex = (java.lang.Exception) constructor
                                                .newInstance(f.getMessage());
                                        // message class
                                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                                .get(new org.apache.axis2.client.FaultMapKey(
                                                        faultElt.getQName(),
                                                        "execute"));
                                        java.lang.Class messageClass = java.lang.Class
                                                .forName(messageClassName);
                                        java.lang.Object messageObject = fromOM(
                                                faultElt, messageClass, null);
                                        java.lang.reflect.Method m = exceptionClass
                                                .getMethod(
                                                        "setFaultMessage",
                                                        new java.lang.Class[]{messageClass});
                                        m.invoke(
                                                ex,
                                                new java.lang.Object[]{messageObject});

                                        if (ex instanceof com.zuora.api.InvalidValueFault) {
                                            callback.receiveErrorexecute((com.zuora.api.InvalidValueFault) ex);
                                            return;
                                        }

                                        if (ex instanceof com.zuora.api.UnexpectedErrorFault) {
                                            callback.receiveErrorexecute((com.zuora.api.UnexpectedErrorFault) ex);
                                            return;
                                        }

                                        if (ex instanceof com.zuora.api.InvalidTypeFault) {
                                            callback.receiveErrorexecute((com.zuora.api.InvalidTypeFault) ex);
                                            return;
                                        }

                                        callback.receiveErrorexecute(new java.rmi.RemoteException(
                                                ex.getMessage(), ex));
                                    } catch (java.lang.ClassCastException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorexecute(f);
                                    } catch (java.lang.ClassNotFoundException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorexecute(f);
                                    } catch (java.lang.NoSuchMethodException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorexecute(f);
                                    } catch (java.lang.reflect.InvocationTargetException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorexecute(f);
                                    } catch (java.lang.IllegalAccessException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorexecute(f);
                                    } catch (java.lang.InstantiationException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorexecute(f);
                                    } catch (org.apache.axis2.AxisFault e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorexecute(f);
                                    }
                                } else {
                                    callback.receiveErrorexecute(f);
                                }
                            } else {
                                callback.receiveErrorexecute(f);
                            }
                        } else {
                            callback.receiveErrorexecute(error);
                        }
                    }

                    public void onFault(
                            org.apache.axis2.context.MessageContext faultContext) {
                        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                                .getInboundFaultFromMessageContext(faultContext);
                        onError(fault);
                    }

                    public void onComplete() {
                        try {
                            _messageContext.getTransportOut().getSender()
                                    .cleanup(_messageContext);
                        } catch (org.apache.axis2.AxisFault axisFault) {
                            callback.receiveErrorexecute(axisFault);
                        }
                    }
                });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[3].getMessageReceiver() == null
                && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[3].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @param query51
     * @param sessionHeader52
     * @throws com.zuora.api.MalformedQueryFault
     *          :
     * @throws com.zuora.api.UnexpectedErrorFault
     *          :
     * @throws com.zuora.api.InvalidQueryLocatorFault
     *          :
     * @see com.zuora.api.ZuoraService#query
     */

    public com.zuora.api.QueryResponse query(

            com.zuora.api.Query query51, com.zuora.api.SessionHeader sessionHeader52)

            throws java.rmi.RemoteException

            , com.zuora.api.MalformedQueryFault, com.zuora.api.UnexpectedErrorFault,
            com.zuora.api.InvalidQueryLocatorFault {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                    .createClient(_operations[4].getName());
            _operationClient.getOptions().setAction(
                    "http://api.zuora.com/Soap/queryRequest");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
                    true);

            addPropertyToOperationClient(
                    _operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                    .getSoapVersionURI()), query51,
                    optimizeContent(new javax.xml.namespace.QName(
                            "http://api.zuora.com/", "query")),
                    new javax.xml.namespace.QName("http://api.zuora.com/",
                            "query"));

            env.build();

            // add the children only if the parameter is not null
            if (sessionHeader52 != null) {

                org.apache.axiom.om.OMElement omElementsessionHeader52 = toOM(
                        sessionHeader52,
                        optimizeContent(new javax.xml.namespace.QName(
                                "http://api.zuora.com/", "query")));
                addHeader(omElementsessionHeader52, env);

            }

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
                    .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
                    .getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                    .getFirstElement(), com.zuora.api.QueryResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.zuora.api.QueryResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap
                        .containsKey(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "query"))) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                .get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(), "query"));
                        java.lang.Class exceptionClass = java.lang.Class
                                .forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass
                                .getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor
                                .newInstance(f.getMessage());
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                .get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(), "query"));
                        java.lang.Class messageClass = java.lang.Class
                                .forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod(
                                "setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof com.zuora.api.MalformedQueryFault) {
                            throw (com.zuora.api.MalformedQueryFault) ex;
                        }

                        if (ex instanceof com.zuora.api.UnexpectedErrorFault) {
                            throw (com.zuora.api.UnexpectedErrorFault) ex;
                        }

                        if (ex instanceof com.zuora.api.InvalidQueryLocatorFault) {
                            throw (com.zuora.api.InvalidQueryLocatorFault) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                        .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param query51
     * @param sessionHeader52
     * @see com.zuora.api.ZuoraService#startquery
     */
    public void startquery(

            com.zuora.api.Query query51, com.zuora.api.SessionHeader sessionHeader52,

            final com.zuora.api.ZuoraServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                .createClient(_operations[4].getName());
        _operationClient.getOptions().setAction(
                "http://api.zuora.com/Soap/queryRequest");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(
                _operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions()
                .getSoapVersionURI()), query51,
                optimizeContent(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "query")),
                new javax.xml.namespace.QName("http://api.zuora.com/", "query"));

        // add the soap_headers only if they are not null
        if (sessionHeader52 != null) {

            org.apache.axiom.om.OMElement omElementsessionHeader52 = toOM(
                    sessionHeader52,
                    optimizeContent(new javax.xml.namespace.QName(
                            "http://api.zuora.com/", "query")));
            addHeader(omElementsessionHeader52, env);

        }

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient
                .setCallback(new org.apache.axis2.client.async.AxisCallback() {
                    public void onMessage(
                            org.apache.axis2.context.MessageContext resultContext) {
                        try {
                            org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
                                    .getEnvelope();

                            java.lang.Object object = fromOM(resultEnv
                                    .getBody().getFirstElement(),
                                    com.zuora.api.QueryResponse.class,
                                    getEnvelopeNamespaces(resultEnv));
                            callback.receiveResultquery((com.zuora.api.QueryResponse) object);

                        } catch (org.apache.axis2.AxisFault e) {
                            callback.receiveErrorquery(e);
                        }
                    }

                    public void onError(java.lang.Exception error) {
                        if (error instanceof org.apache.axis2.AxisFault) {
                            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                            org.apache.axiom.om.OMElement faultElt = f
                                    .getDetail();
                            if (faultElt != null) {
                                if (faultExceptionNameMap
                                        .containsKey(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "query"))) {
                                    // make the fault by reflection
                                    try {
                                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                                .get(new org.apache.axis2.client.FaultMapKey(
                                                        faultElt.getQName(),
                                                        "query"));
                                        java.lang.Class exceptionClass = java.lang.Class
                                                .forName(exceptionClassName);
                                        java.lang.reflect.Constructor constructor = exceptionClass
                                                .getConstructor(String.class);
                                        java.lang.Exception ex = (java.lang.Exception) constructor
                                                .newInstance(f.getMessage());
                                        // message class
                                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                                .get(new org.apache.axis2.client.FaultMapKey(
                                                        faultElt.getQName(),
                                                        "query"));
                                        java.lang.Class messageClass = java.lang.Class
                                                .forName(messageClassName);
                                        java.lang.Object messageObject = fromOM(
                                                faultElt, messageClass, null);
                                        java.lang.reflect.Method m = exceptionClass
                                                .getMethod(
                                                        "setFaultMessage",
                                                        new java.lang.Class[]{messageClass});
                                        m.invoke(
                                                ex,
                                                new java.lang.Object[]{messageObject});

                                        if (ex instanceof com.zuora.api.MalformedQueryFault) {
                                            callback.receiveErrorquery((com.zuora.api.MalformedQueryFault) ex);
                                            return;
                                        }

                                        if (ex instanceof com.zuora.api.UnexpectedErrorFault) {
                                            callback.receiveErrorquery((com.zuora.api.UnexpectedErrorFault) ex);
                                            return;
                                        }

                                        if (ex instanceof com.zuora.api.InvalidQueryLocatorFault) {
                                            callback.receiveErrorquery((com.zuora.api.InvalidQueryLocatorFault) ex);
                                            return;
                                        }

                                        callback.receiveErrorquery(new java.rmi.RemoteException(
                                                ex.getMessage(), ex));
                                    } catch (java.lang.ClassCastException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorquery(f);
                                    } catch (java.lang.ClassNotFoundException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorquery(f);
                                    } catch (java.lang.NoSuchMethodException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorquery(f);
                                    } catch (java.lang.reflect.InvocationTargetException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorquery(f);
                                    } catch (java.lang.IllegalAccessException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorquery(f);
                                    } catch (java.lang.InstantiationException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorquery(f);
                                    } catch (org.apache.axis2.AxisFault e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorquery(f);
                                    }
                                } else {
                                    callback.receiveErrorquery(f);
                                }
                            } else {
                                callback.receiveErrorquery(f);
                            }
                        } else {
                            callback.receiveErrorquery(error);
                        }
                    }

                    public void onFault(
                            org.apache.axis2.context.MessageContext faultContext) {
                        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                                .getInboundFaultFromMessageContext(faultContext);
                        onError(fault);
                    }

                    public void onComplete() {
                        try {
                            _messageContext.getTransportOut().getSender()
                                    .cleanup(_messageContext);
                        } catch (org.apache.axis2.AxisFault axisFault) {
                            callback.receiveErrorquery(axisFault);
                        }
                    }
                });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[4].getMessageReceiver() == null
                && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[4].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @param generate54
     * @param sessionHeader55
     * @throws com.zuora.api.UnexpectedErrorFault
     *                                        :
     * @throws com.zuora.api.InvalidTypeFault :
     * @see com.zuora.api.ZuoraService#generate
     */

    public com.zuora.api.GenerateResponse generate(

            com.zuora.api.Generate generate54,
            com.zuora.api.SessionHeader sessionHeader55)

            throws java.rmi.RemoteException

            , com.zuora.api.UnexpectedErrorFault, com.zuora.api.InvalidTypeFault {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                    .createClient(_operations[5].getName());
            _operationClient.getOptions().setAction(
                    "http://api.zuora.com/Soap/generateRequest");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
                    true);

            addPropertyToOperationClient(
                    _operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                    .getSoapVersionURI()), generate54,
                    optimizeContent(new javax.xml.namespace.QName(
                            "http://api.zuora.com/", "generate")),
                    new javax.xml.namespace.QName("http://api.zuora.com/",
                            "generate"));

            env.build();

            // add the children only if the parameter is not null
            if (sessionHeader55 != null) {

                org.apache.axiom.om.OMElement omElementsessionHeader55 = toOM(
                        sessionHeader55,
                        optimizeContent(new javax.xml.namespace.QName(
                                "http://api.zuora.com/", "generate")));
                addHeader(omElementsessionHeader55, env);

            }

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
                    .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
                    .getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                    .getFirstElement(), com.zuora.api.GenerateResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.zuora.api.GenerateResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap
                        .containsKey(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "generate"))) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                .get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(), "generate"));
                        java.lang.Class exceptionClass = java.lang.Class
                                .forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass
                                .getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor
                                .newInstance(f.getMessage());
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                .get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(), "generate"));
                        java.lang.Class messageClass = java.lang.Class
                                .forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod(
                                "setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof com.zuora.api.UnexpectedErrorFault) {
                            throw (com.zuora.api.UnexpectedErrorFault) ex;
                        }

                        if (ex instanceof com.zuora.api.InvalidTypeFault) {
                            throw (com.zuora.api.InvalidTypeFault) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                        .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param generate54
     * @param sessionHeader55
     * @see com.zuora.api.ZuoraService#startgenerate
     */
    public void startgenerate(

            com.zuora.api.Generate generate54,
            com.zuora.api.SessionHeader sessionHeader55,

            final com.zuora.api.ZuoraServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                .createClient(_operations[5].getName());
        _operationClient.getOptions().setAction(
                "http://api.zuora.com/Soap/generateRequest");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(
                _operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions()
                .getSoapVersionURI()), generate54,
                optimizeContent(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "generate")),
                new javax.xml.namespace.QName("http://api.zuora.com/",
                        "generate"));

        // add the soap_headers only if they are not null
        if (sessionHeader55 != null) {

            org.apache.axiom.om.OMElement omElementsessionHeader55 = toOM(
                    sessionHeader55,
                    optimizeContent(new javax.xml.namespace.QName(
                            "http://api.zuora.com/", "generate")));
            addHeader(omElementsessionHeader55, env);

        }

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient
                .setCallback(new org.apache.axis2.client.async.AxisCallback() {
                    public void onMessage(
                            org.apache.axis2.context.MessageContext resultContext) {
                        try {
                            org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
                                    .getEnvelope();

                            java.lang.Object object = fromOM(resultEnv
                                    .getBody().getFirstElement(),
                                    com.zuora.api.GenerateResponse.class,
                                    getEnvelopeNamespaces(resultEnv));
                            callback.receiveResultgenerate((com.zuora.api.GenerateResponse) object);

                        } catch (org.apache.axis2.AxisFault e) {
                            callback.receiveErrorgenerate(e);
                        }
                    }

                    public void onError(java.lang.Exception error) {
                        if (error instanceof org.apache.axis2.AxisFault) {
                            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                            org.apache.axiom.om.OMElement faultElt = f
                                    .getDetail();
                            if (faultElt != null) {
                                if (faultExceptionNameMap
                                        .containsKey(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "generate"))) {
                                    // make the fault by reflection
                                    try {
                                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                                .get(new org.apache.axis2.client.FaultMapKey(
                                                        faultElt.getQName(),
                                                        "generate"));
                                        java.lang.Class exceptionClass = java.lang.Class
                                                .forName(exceptionClassName);
                                        java.lang.reflect.Constructor constructor = exceptionClass
                                                .getConstructor(String.class);
                                        java.lang.Exception ex = (java.lang.Exception) constructor
                                                .newInstance(f.getMessage());
                                        // message class
                                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                                .get(new org.apache.axis2.client.FaultMapKey(
                                                        faultElt.getQName(),
                                                        "generate"));
                                        java.lang.Class messageClass = java.lang.Class
                                                .forName(messageClassName);
                                        java.lang.Object messageObject = fromOM(
                                                faultElt, messageClass, null);
                                        java.lang.reflect.Method m = exceptionClass
                                                .getMethod(
                                                        "setFaultMessage",
                                                        new java.lang.Class[]{messageClass});
                                        m.invoke(
                                                ex,
                                                new java.lang.Object[]{messageObject});

                                        if (ex instanceof com.zuora.api.UnexpectedErrorFault) {
                                            callback.receiveErrorgenerate((com.zuora.api.UnexpectedErrorFault) ex);
                                            return;
                                        }

                                        if (ex instanceof com.zuora.api.InvalidTypeFault) {
                                            callback.receiveErrorgenerate((com.zuora.api.InvalidTypeFault) ex);
                                            return;
                                        }

                                        callback.receiveErrorgenerate(new java.rmi.RemoteException(
                                                ex.getMessage(), ex));
                                    } catch (java.lang.ClassCastException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorgenerate(f);
                                    } catch (java.lang.ClassNotFoundException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorgenerate(f);
                                    } catch (java.lang.NoSuchMethodException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorgenerate(f);
                                    } catch (java.lang.reflect.InvocationTargetException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorgenerate(f);
                                    } catch (java.lang.IllegalAccessException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorgenerate(f);
                                    } catch (java.lang.InstantiationException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorgenerate(f);
                                    } catch (org.apache.axis2.AxisFault e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorgenerate(f);
                                    }
                                } else {
                                    callback.receiveErrorgenerate(f);
                                }
                            } else {
                                callback.receiveErrorgenerate(f);
                            }
                        } else {
                            callback.receiveErrorgenerate(error);
                        }
                    }

                    public void onFault(
                            org.apache.axis2.context.MessageContext faultContext) {
                        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                                .getInboundFaultFromMessageContext(faultContext);
                        onError(fault);
                    }

                    public void onComplete() {
                        try {
                            _messageContext.getTransportOut().getSender()
                                    .cleanup(_messageContext);
                        } catch (org.apache.axis2.AxisFault axisFault) {
                            callback.receiveErrorgenerate(axisFault);
                        }
                    }
                });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[5].getMessageReceiver() == null
                && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[5].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @param login57
     * @throws com.zuora.api.UnexpectedErrorFault
     *                                  :
     * @throws com.zuora.api.LoginFault :
     * @see com.zuora.api.ZuoraService#login
     */

    public com.zuora.api.LoginResponse login(

            com.zuora.api.Login login57)

            throws java.rmi.RemoteException

            , com.zuora.api.UnexpectedErrorFault, com.zuora.api.LoginFault {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                    .createClient(_operations[6].getName());
            _operationClient.getOptions().setAction(
                    "http://api.zuora.com/Soap/loginRequest");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
                    true);

            addPropertyToOperationClient(
                    _operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                    .getSoapVersionURI()), login57,
                    optimizeContent(new javax.xml.namespace.QName(
                            "http://api.zuora.com/", "login")),
                    new javax.xml.namespace.QName("http://api.zuora.com/",
                            "login"));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
                    .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
                    .getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                    .getFirstElement(), com.zuora.api.LoginResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.zuora.api.LoginResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap
                        .containsKey(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "login"))) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                .get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(), "login"));
                        java.lang.Class exceptionClass = java.lang.Class
                                .forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass
                                .getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor
                                .newInstance(f.getMessage());
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                .get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(), "login"));
                        java.lang.Class messageClass = java.lang.Class
                                .forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod(
                                "setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof com.zuora.api.UnexpectedErrorFault) {
                            throw (com.zuora.api.UnexpectedErrorFault) ex;
                        }

                        if (ex instanceof com.zuora.api.LoginFault) {
                            throw (com.zuora.api.LoginFault) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                        .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param login57
     * @see com.zuora.api.ZuoraService#startlogin
     */
    public void startlogin(

            com.zuora.api.Login login57,

            final com.zuora.api.ZuoraServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                .createClient(_operations[6].getName());
        _operationClient.getOptions().setAction(
                "http://api.zuora.com/Soap/loginRequest");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(
                _operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions()
                .getSoapVersionURI()), login57,
                optimizeContent(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "login")),
                new javax.xml.namespace.QName("http://api.zuora.com/", "login"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient
                .setCallback(new org.apache.axis2.client.async.AxisCallback() {
                    public void onMessage(
                            org.apache.axis2.context.MessageContext resultContext) {
                        try {
                            org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
                                    .getEnvelope();

                            java.lang.Object object = fromOM(resultEnv
                                    .getBody().getFirstElement(),
                                    com.zuora.api.LoginResponse.class,
                                    getEnvelopeNamespaces(resultEnv));
                            callback.receiveResultlogin((com.zuora.api.LoginResponse) object);

                        } catch (org.apache.axis2.AxisFault e) {
                            callback.receiveErrorlogin(e);
                        }
                    }

                    public void onError(java.lang.Exception error) {
                        if (error instanceof org.apache.axis2.AxisFault) {
                            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                            org.apache.axiom.om.OMElement faultElt = f
                                    .getDetail();
                            if (faultElt != null) {
                                if (faultExceptionNameMap
                                        .containsKey(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "login"))) {
                                    // make the fault by reflection
                                    try {
                                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                                .get(new org.apache.axis2.client.FaultMapKey(
                                                        faultElt.getQName(),
                                                        "login"));
                                        java.lang.Class exceptionClass = java.lang.Class
                                                .forName(exceptionClassName);
                                        java.lang.reflect.Constructor constructor = exceptionClass
                                                .getConstructor(String.class);
                                        java.lang.Exception ex = (java.lang.Exception) constructor
                                                .newInstance(f.getMessage());
                                        // message class
                                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                                .get(new org.apache.axis2.client.FaultMapKey(
                                                        faultElt.getQName(),
                                                        "login"));
                                        java.lang.Class messageClass = java.lang.Class
                                                .forName(messageClassName);
                                        java.lang.Object messageObject = fromOM(
                                                faultElt, messageClass, null);
                                        java.lang.reflect.Method m = exceptionClass
                                                .getMethod(
                                                        "setFaultMessage",
                                                        new java.lang.Class[]{messageClass});
                                        m.invoke(
                                                ex,
                                                new java.lang.Object[]{messageObject});

                                        if (ex instanceof com.zuora.api.UnexpectedErrorFault) {
                                            callback.receiveErrorlogin((com.zuora.api.UnexpectedErrorFault) ex);
                                            return;
                                        }

                                        if (ex instanceof com.zuora.api.LoginFault) {
                                            callback.receiveErrorlogin((com.zuora.api.LoginFault) ex);
                                            return;
                                        }

                                        callback.receiveErrorlogin(new java.rmi.RemoteException(
                                                ex.getMessage(), ex));
                                    } catch (java.lang.ClassCastException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorlogin(f);
                                    } catch (java.lang.ClassNotFoundException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorlogin(f);
                                    } catch (java.lang.NoSuchMethodException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorlogin(f);
                                    } catch (java.lang.reflect.InvocationTargetException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorlogin(f);
                                    } catch (java.lang.IllegalAccessException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorlogin(f);
                                    } catch (java.lang.InstantiationException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorlogin(f);
                                    } catch (org.apache.axis2.AxisFault e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorlogin(f);
                                    }
                                } else {
                                    callback.receiveErrorlogin(f);
                                }
                            } else {
                                callback.receiveErrorlogin(f);
                            }
                        } else {
                            callback.receiveErrorlogin(error);
                        }
                    }

                    public void onFault(
                            org.apache.axis2.context.MessageContext faultContext) {
                        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                                .getInboundFaultFromMessageContext(faultContext);
                        onError(fault);
                    }

                    public void onComplete() {
                        try {
                            _messageContext.getTransportOut().getSender()
                                    .cleanup(_messageContext);
                        } catch (org.apache.axis2.AxisFault axisFault) {
                            callback.receiveErrorlogin(axisFault);
                        }
                    }
                });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[6].getMessageReceiver() == null
                && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[6].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @param getUserInfo59
     * @param sessionHeader60
     * @throws com.zuora.api.UnexpectedErrorFault
     *          :
     * @see com.zuora.api.ZuoraService#getUserInfo
     */

    public com.zuora.api.GetUserInfoResponse getUserInfo(

            com.zuora.api.GetUserInfo getUserInfo59,
            com.zuora.api.SessionHeader sessionHeader60)

            throws java.rmi.RemoteException

            , com.zuora.api.UnexpectedErrorFault {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                    .createClient(_operations[7].getName());
            _operationClient.getOptions().setAction(
                    "http://api.zuora.com/Soap/getUserInfoRequest");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
                    true);

            addPropertyToOperationClient(
                    _operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                    .getSoapVersionURI()), getUserInfo59,
                    optimizeContent(new javax.xml.namespace.QName(
                            "http://api.zuora.com/", "getUserInfo")),
                    new javax.xml.namespace.QName("http://api.zuora.com/",
                            "getUserInfo"));

            env.build();

            // add the children only if the parameter is not null
            if (sessionHeader60 != null) {

                org.apache.axiom.om.OMElement omElementsessionHeader60 = toOM(
                        sessionHeader60,
                        optimizeContent(new javax.xml.namespace.QName(
                                "http://api.zuora.com/", "getUserInfo")));
                addHeader(omElementsessionHeader60, env);

            }

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
                    .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
                    .getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                    .getFirstElement(),
                    com.zuora.api.GetUserInfoResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.zuora.api.GetUserInfoResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap
                        .containsKey(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "getUserInfo"))) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                .get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(), "getUserInfo"));
                        java.lang.Class exceptionClass = java.lang.Class
                                .forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass
                                .getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor
                                .newInstance(f.getMessage());
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                .get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(), "getUserInfo"));
                        java.lang.Class messageClass = java.lang.Class
                                .forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod(
                                "setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof com.zuora.api.UnexpectedErrorFault) {
                            throw (com.zuora.api.UnexpectedErrorFault) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                        .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getUserInfo59
     * @param sessionHeader60
     * @see com.zuora.api.ZuoraService#startgetUserInfo
     */
    public void startgetUserInfo(

            com.zuora.api.GetUserInfo getUserInfo59,
            com.zuora.api.SessionHeader sessionHeader60,

            final com.zuora.api.ZuoraServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                .createClient(_operations[7].getName());
        _operationClient.getOptions().setAction(
                "http://api.zuora.com/Soap/getUserInfoRequest");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(
                _operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions()
                .getSoapVersionURI()), getUserInfo59,
                optimizeContent(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "getUserInfo")),
                new javax.xml.namespace.QName("http://api.zuora.com/",
                        "getUserInfo"));

        // add the soap_headers only if they are not null
        if (sessionHeader60 != null) {

            org.apache.axiom.om.OMElement omElementsessionHeader60 = toOM(
                    sessionHeader60,
                    optimizeContent(new javax.xml.namespace.QName(
                            "http://api.zuora.com/", "getUserInfo")));
            addHeader(omElementsessionHeader60, env);

        }

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient
                .setCallback(new org.apache.axis2.client.async.AxisCallback() {
                    public void onMessage(
                            org.apache.axis2.context.MessageContext resultContext) {
                        try {
                            org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
                                    .getEnvelope();

                            java.lang.Object object = fromOM(resultEnv
                                    .getBody().getFirstElement(),
                                    com.zuora.api.GetUserInfoResponse.class,
                                    getEnvelopeNamespaces(resultEnv));
                            callback.receiveResultgetUserInfo((com.zuora.api.GetUserInfoResponse) object);

                        } catch (org.apache.axis2.AxisFault e) {
                            callback.receiveErrorgetUserInfo(e);
                        }
                    }

                    public void onError(java.lang.Exception error) {
                        if (error instanceof org.apache.axis2.AxisFault) {
                            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                            org.apache.axiom.om.OMElement faultElt = f
                                    .getDetail();
                            if (faultElt != null) {
                                if (faultExceptionNameMap
                                        .containsKey(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "getUserInfo"))) {
                                    // make the fault by reflection
                                    try {
                                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                                .get(new org.apache.axis2.client.FaultMapKey(
                                                        faultElt.getQName(),
                                                        "getUserInfo"));
                                        java.lang.Class exceptionClass = java.lang.Class
                                                .forName(exceptionClassName);
                                        java.lang.reflect.Constructor constructor = exceptionClass
                                                .getConstructor(String.class);
                                        java.lang.Exception ex = (java.lang.Exception) constructor
                                                .newInstance(f.getMessage());
                                        // message class
                                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                                .get(new org.apache.axis2.client.FaultMapKey(
                                                        faultElt.getQName(),
                                                        "getUserInfo"));
                                        java.lang.Class messageClass = java.lang.Class
                                                .forName(messageClassName);
                                        java.lang.Object messageObject = fromOM(
                                                faultElt, messageClass, null);
                                        java.lang.reflect.Method m = exceptionClass
                                                .getMethod(
                                                        "setFaultMessage",
                                                        new java.lang.Class[]{messageClass});
                                        m.invoke(
                                                ex,
                                                new java.lang.Object[]{messageObject});

                                        if (ex instanceof com.zuora.api.UnexpectedErrorFault) {
                                            callback.receiveErrorgetUserInfo((com.zuora.api.UnexpectedErrorFault) ex);
                                            return;
                                        }

                                        callback.receiveErrorgetUserInfo(new java.rmi.RemoteException(
                                                ex.getMessage(), ex));
                                    } catch (java.lang.ClassCastException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorgetUserInfo(f);
                                    } catch (java.lang.ClassNotFoundException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorgetUserInfo(f);
                                    } catch (java.lang.NoSuchMethodException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorgetUserInfo(f);
                                    } catch (java.lang.reflect.InvocationTargetException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorgetUserInfo(f);
                                    } catch (java.lang.IllegalAccessException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorgetUserInfo(f);
                                    } catch (java.lang.InstantiationException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorgetUserInfo(f);
                                    } catch (org.apache.axis2.AxisFault e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorgetUserInfo(f);
                                    }
                                } else {
                                    callback.receiveErrorgetUserInfo(f);
                                }
                            } else {
                                callback.receiveErrorgetUserInfo(f);
                            }
                        } else {
                            callback.receiveErrorgetUserInfo(error);
                        }
                    }

                    public void onFault(
                            org.apache.axis2.context.MessageContext faultContext) {
                        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                                .getInboundFaultFromMessageContext(faultContext);
                        onError(fault);
                    }

                    public void onComplete() {
                        try {
                            _messageContext.getTransportOut().getSender()
                                    .cleanup(_messageContext);
                        } catch (org.apache.axis2.AxisFault axisFault) {
                            callback.receiveErrorgetUserInfo(axisFault);
                        }
                    }
                });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[7].getMessageReceiver() == null
                && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[7].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @param subscribe62
     * @param sessionHeader63
     * @throws com.zuora.api.UnexpectedErrorFault
     *          :
     * @see com.zuora.api.ZuoraService#subscribe
     */

    public com.zuora.api.SubscribeResponse subscribe(

            com.zuora.api.Subscribe subscribe62,
            com.zuora.api.SessionHeader sessionHeader63)

            throws java.rmi.RemoteException

            , com.zuora.api.UnexpectedErrorFault {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                    .createClient(_operations[8].getName());
            _operationClient.getOptions().setAction(
                    "http://api.zuora.com/Soap/subscribeRequest");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
                    true);

            addPropertyToOperationClient(
                    _operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                    .getSoapVersionURI()), subscribe62,
                    optimizeContent(new javax.xml.namespace.QName(
                            "http://api.zuora.com/", "subscribe")),
                    new javax.xml.namespace.QName("http://api.zuora.com/",
                            "subscribe"));

            env.build();

            // add the children only if the parameter is not null
            if (sessionHeader63 != null) {

                org.apache.axiom.om.OMElement omElementsessionHeader63 = toOM(
                        sessionHeader63,
                        optimizeContent(new javax.xml.namespace.QName(
                                "http://api.zuora.com/", "subscribe")));
                addHeader(omElementsessionHeader63, env);

            }

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
                    .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
                    .getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                    .getFirstElement(), com.zuora.api.SubscribeResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.zuora.api.SubscribeResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap
                        .containsKey(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "subscribe"))) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                .get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(), "subscribe"));
                        java.lang.Class exceptionClass = java.lang.Class
                                .forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass
                                .getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor
                                .newInstance(f.getMessage());
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                .get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(), "subscribe"));
                        java.lang.Class messageClass = java.lang.Class
                                .forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod(
                                "setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof com.zuora.api.UnexpectedErrorFault) {
                            throw (com.zuora.api.UnexpectedErrorFault) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                        .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param subscribe62
     * @param sessionHeader63
     * @see com.zuora.api.ZuoraService#startsubscribe
     */
    public void startsubscribe(

            com.zuora.api.Subscribe subscribe62,
            com.zuora.api.SessionHeader sessionHeader63,

            final com.zuora.api.ZuoraServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                .createClient(_operations[8].getName());
        _operationClient.getOptions().setAction(
                "http://api.zuora.com/Soap/subscribeRequest");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(
                _operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions()
                .getSoapVersionURI()), subscribe62,
                optimizeContent(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "subscribe")),
                new javax.xml.namespace.QName("http://api.zuora.com/",
                        "subscribe"));

        // add the soap_headers only if they are not null
        if (sessionHeader63 != null) {

            org.apache.axiom.om.OMElement omElementsessionHeader63 = toOM(
                    sessionHeader63,
                    optimizeContent(new javax.xml.namespace.QName(
                            "http://api.zuora.com/", "subscribe")));
            addHeader(omElementsessionHeader63, env);

        }

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient
                .setCallback(new org.apache.axis2.client.async.AxisCallback() {
                    public void onMessage(
                            org.apache.axis2.context.MessageContext resultContext) {
                        try {
                            org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
                                    .getEnvelope();

                            java.lang.Object object = fromOM(resultEnv
                                    .getBody().getFirstElement(),
                                    com.zuora.api.SubscribeResponse.class,
                                    getEnvelopeNamespaces(resultEnv));
                            callback.receiveResultsubscribe((com.zuora.api.SubscribeResponse) object);

                        } catch (org.apache.axis2.AxisFault e) {
                            callback.receiveErrorsubscribe(e);
                        }
                    }

                    public void onError(java.lang.Exception error) {
                        if (error instanceof org.apache.axis2.AxisFault) {
                            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                            org.apache.axiom.om.OMElement faultElt = f
                                    .getDetail();
                            if (faultElt != null) {
                                if (faultExceptionNameMap
                                        .containsKey(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "subscribe"))) {
                                    // make the fault by reflection
                                    try {
                                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                                .get(new org.apache.axis2.client.FaultMapKey(
                                                        faultElt.getQName(),
                                                        "subscribe"));
                                        java.lang.Class exceptionClass = java.lang.Class
                                                .forName(exceptionClassName);
                                        java.lang.reflect.Constructor constructor = exceptionClass
                                                .getConstructor(String.class);
                                        java.lang.Exception ex = (java.lang.Exception) constructor
                                                .newInstance(f.getMessage());
                                        // message class
                                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                                .get(new org.apache.axis2.client.FaultMapKey(
                                                        faultElt.getQName(),
                                                        "subscribe"));
                                        java.lang.Class messageClass = java.lang.Class
                                                .forName(messageClassName);
                                        java.lang.Object messageObject = fromOM(
                                                faultElt, messageClass, null);
                                        java.lang.reflect.Method m = exceptionClass
                                                .getMethod(
                                                        "setFaultMessage",
                                                        new java.lang.Class[]{messageClass});
                                        m.invoke(
                                                ex,
                                                new java.lang.Object[]{messageObject});

                                        if (ex instanceof com.zuora.api.UnexpectedErrorFault) {
                                            callback.receiveErrorsubscribe((com.zuora.api.UnexpectedErrorFault) ex);
                                            return;
                                        }

                                        callback.receiveErrorsubscribe(new java.rmi.RemoteException(
                                                ex.getMessage(), ex));
                                    } catch (java.lang.ClassCastException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorsubscribe(f);
                                    } catch (java.lang.ClassNotFoundException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorsubscribe(f);
                                    } catch (java.lang.NoSuchMethodException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorsubscribe(f);
                                    } catch (java.lang.reflect.InvocationTargetException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorsubscribe(f);
                                    } catch (java.lang.IllegalAccessException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorsubscribe(f);
                                    } catch (java.lang.InstantiationException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorsubscribe(f);
                                    } catch (org.apache.axis2.AxisFault e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrorsubscribe(f);
                                    }
                                } else {
                                    callback.receiveErrorsubscribe(f);
                                }
                            } else {
                                callback.receiveErrorsubscribe(f);
                            }
                        } else {
                            callback.receiveErrorsubscribe(error);
                        }
                    }

                    public void onFault(
                            org.apache.axis2.context.MessageContext faultContext) {
                        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                                .getInboundFaultFromMessageContext(faultContext);
                        onError(fault);
                    }

                    public void onComplete() {
                        try {
                            _messageContext.getTransportOut().getSender()
                                    .cleanup(_messageContext);
                        } catch (org.apache.axis2.AxisFault axisFault) {
                            callback.receiveErrorsubscribe(axisFault);
                        }
                    }
                });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[8].getMessageReceiver() == null
                && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[8].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @param delete65
     * @param sessionHeader66
     * @throws com.zuora.api.InvalidValueFault
     *                                        :
     * @throws com.zuora.api.UnexpectedErrorFault
     *                                        :
     * @throws com.zuora.api.InvalidTypeFault :
     * @see com.zuora.api.ZuoraService#delete
     */

    public com.zuora.api.DeleteResponse delete(

            com.zuora.api.Delete delete65, com.zuora.api.SessionHeader sessionHeader66)

            throws java.rmi.RemoteException

            , com.zuora.api.InvalidValueFault, com.zuora.api.UnexpectedErrorFault,
            com.zuora.api.InvalidTypeFault {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                    .createClient(_operations[9].getName());
            _operationClient.getOptions().setAction(
                    "http://api.zuora.com/Soap/deleteRequest");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
                    true);

            addPropertyToOperationClient(
                    _operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                    .getSoapVersionURI()), delete65,
                    optimizeContent(new javax.xml.namespace.QName(
                            "http://api.zuora.com/", "delete")),
                    new javax.xml.namespace.QName("http://api.zuora.com/",
                            "delete"));

            env.build();

            // add the children only if the parameter is not null
            if (sessionHeader66 != null) {

                org.apache.axiom.om.OMElement omElementsessionHeader66 = toOM(
                        sessionHeader66,
                        optimizeContent(new javax.xml.namespace.QName(
                                "http://api.zuora.com/", "delete")));
                addHeader(omElementsessionHeader66, env);

            }

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
                    .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
                    .getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                    .getFirstElement(), com.zuora.api.DeleteResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.zuora.api.DeleteResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap
                        .containsKey(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "delete"))) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                .get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(), "delete"));
                        java.lang.Class exceptionClass = java.lang.Class
                                .forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass
                                .getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor
                                .newInstance(f.getMessage());
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                .get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(), "delete"));
                        java.lang.Class messageClass = java.lang.Class
                                .forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod(
                                "setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof com.zuora.api.InvalidValueFault) {
                            throw (com.zuora.api.InvalidValueFault) ex;
                        }

                        if (ex instanceof com.zuora.api.UnexpectedErrorFault) {
                            throw (com.zuora.api.UnexpectedErrorFault) ex;
                        }

                        if (ex instanceof com.zuora.api.InvalidTypeFault) {
                            throw (com.zuora.api.InvalidTypeFault) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                        .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param delete65
     * @param sessionHeader66
     * @see com.zuora.api.ZuoraService#startdelete
     */
    public void startdelete(

            com.zuora.api.Delete delete65, com.zuora.api.SessionHeader sessionHeader66,

            final com.zuora.api.ZuoraServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                .createClient(_operations[9].getName());
        _operationClient.getOptions().setAction(
                "http://api.zuora.com/Soap/deleteRequest");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(
                _operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(
                getFactory(_operationClient.getOptions().getSoapVersionURI()),
                delete65,
                optimizeContent(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "delete")),
                new javax.xml.namespace.QName("http://api.zuora.com/", "delete"));

        // add the soap_headers only if they are not null
        if (sessionHeader66 != null) {

            org.apache.axiom.om.OMElement omElementsessionHeader66 = toOM(
                    sessionHeader66,
                    optimizeContent(new javax.xml.namespace.QName(
                            "http://api.zuora.com/", "delete")));
            addHeader(omElementsessionHeader66, env);

        }

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient
                .setCallback(new org.apache.axis2.client.async.AxisCallback() {
                    public void onMessage(
                            org.apache.axis2.context.MessageContext resultContext) {
                        try {
                            org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
                                    .getEnvelope();

                            java.lang.Object object = fromOM(resultEnv
                                    .getBody().getFirstElement(),
                                    com.zuora.api.DeleteResponse.class,
                                    getEnvelopeNamespaces(resultEnv));
                            callback.receiveResultdelete((com.zuora.api.DeleteResponse) object);

                        } catch (org.apache.axis2.AxisFault e) {
                            callback.receiveErrordelete(e);
                        }
                    }

                    public void onError(java.lang.Exception error) {
                        if (error instanceof org.apache.axis2.AxisFault) {
                            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                            org.apache.axiom.om.OMElement faultElt = f
                                    .getDetail();
                            if (faultElt != null) {
                                if (faultExceptionNameMap
                                        .containsKey(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "delete"))) {
                                    // make the fault by reflection
                                    try {
                                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                                .get(new org.apache.axis2.client.FaultMapKey(
                                                        faultElt.getQName(),
                                                        "delete"));
                                        java.lang.Class exceptionClass = java.lang.Class
                                                .forName(exceptionClassName);
                                        java.lang.reflect.Constructor constructor = exceptionClass
                                                .getConstructor(String.class);
                                        java.lang.Exception ex = (java.lang.Exception) constructor
                                                .newInstance(f.getMessage());
                                        // message class
                                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                                .get(new org.apache.axis2.client.FaultMapKey(
                                                        faultElt.getQName(),
                                                        "delete"));
                                        java.lang.Class messageClass = java.lang.Class
                                                .forName(messageClassName);
                                        java.lang.Object messageObject = fromOM(
                                                faultElt, messageClass, null);
                                        java.lang.reflect.Method m = exceptionClass
                                                .getMethod(
                                                        "setFaultMessage",
                                                        new java.lang.Class[]{messageClass});
                                        m.invoke(
                                                ex,
                                                new java.lang.Object[]{messageObject});

                                        if (ex instanceof com.zuora.api.InvalidValueFault) {
                                            callback.receiveErrordelete((com.zuora.api.InvalidValueFault) ex);
                                            return;
                                        }

                                        if (ex instanceof com.zuora.api.UnexpectedErrorFault) {
                                            callback.receiveErrordelete((com.zuora.api.UnexpectedErrorFault) ex);
                                            return;
                                        }

                                        if (ex instanceof com.zuora.api.InvalidTypeFault) {
                                            callback.receiveErrordelete((com.zuora.api.InvalidTypeFault) ex);
                                            return;
                                        }

                                        callback.receiveErrordelete(new java.rmi.RemoteException(
                                                ex.getMessage(), ex));
                                    } catch (java.lang.ClassCastException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrordelete(f);
                                    } catch (java.lang.ClassNotFoundException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrordelete(f);
                                    } catch (java.lang.NoSuchMethodException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrordelete(f);
                                    } catch (java.lang.reflect.InvocationTargetException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrordelete(f);
                                    } catch (java.lang.IllegalAccessException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrordelete(f);
                                    } catch (java.lang.InstantiationException e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrordelete(f);
                                    } catch (org.apache.axis2.AxisFault e) {
                                        // we cannot intantiate the class -
                                        // throw the original Axis fault
                                        callback.receiveErrordelete(f);
                                    }
                                } else {
                                    callback.receiveErrordelete(f);
                                }
                            } else {
                                callback.receiveErrordelete(f);
                            }
                        } else {
                            callback.receiveErrordelete(error);
                        }
                    }

                    public void onFault(
                            org.apache.axis2.context.MessageContext faultContext) {
                        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                                .getInboundFaultFromMessageContext(faultContext);
                        onError(fault);
                    }

                    public void onComplete() {
                        try {
                            _messageContext.getTransportOut().getSender()
                                    .cleanup(_messageContext);
                        } catch (org.apache.axis2.AxisFault axisFault) {
                            callback.receiveErrordelete(axisFault);
                        }
                    }
                });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[9].getMessageReceiver() == null
                && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[9].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(
            org.apache.axiom.soap.SOAPEnvelope env) {
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator
                    .next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }
        return returnMap;
    }

    private javax.xml.namespace.QName[] opNameArray = null;

    private boolean optimizeContent(javax.xml.namespace.QName opName) {

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;
            }
        }
        return false;
    }

    // https://apisandbox.zuora.com/apps/services/a/46.0
    private org.apache.axiom.om.OMElement toOM(com.zuora.api.Update param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(com.zuora.api.Update.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.zuora.api.UpdateResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(com.zuora.api.UpdateResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.zuora.api.fault.UnexpectedErrorFaultE param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(
                    com.zuora.api.fault.UnexpectedErrorFaultE.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.zuora.api.fault.InvalidTypeFaultE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(
                    com.zuora.api.fault.InvalidTypeFaultE.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.zuora.api.SessionHeader param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(com.zuora.api.SessionHeader.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(com.zuora.api.Amend param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(com.zuora.api.Amend.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.zuora.api.AmendResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(com.zuora.api.AmendResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(com.zuora.api.Create param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(com.zuora.api.Create.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.zuora.api.CreateResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(com.zuora.api.CreateResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(com.zuora.api.CallOptions param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(com.zuora.api.CallOptions.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(com.zuora.api.Execute param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(com.zuora.api.Execute.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.zuora.api.ExecuteResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(com.zuora.api.ExecuteResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.zuora.api.fault.InvalidValueFaultE param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(
                    com.zuora.api.fault.InvalidValueFaultE.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(com.zuora.api.Query param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(com.zuora.api.Query.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.zuora.api.QueryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(com.zuora.api.QueryResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.zuora.api.fault.MalformedQueryFaultE param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(
                    com.zuora.api.fault.MalformedQueryFaultE.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.zuora.api.fault.InvalidQueryLocatorFaultE param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(
                    com.zuora.api.fault.InvalidQueryLocatorFaultE.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(com.zuora.api.Generate param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(com.zuora.api.Generate.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.zuora.api.GenerateResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(com.zuora.api.GenerateResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(com.zuora.api.Login param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(com.zuora.api.Login.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.zuora.api.LoginResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(com.zuora.api.LoginResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.zuora.api.fault.LoginFaultE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(com.zuora.api.fault.LoginFaultE.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(com.zuora.api.GetUserInfo param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(com.zuora.api.GetUserInfo.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.zuora.api.GetUserInfoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(
                    com.zuora.api.GetUserInfoResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(com.zuora.api.Subscribe param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(com.zuora.api.Subscribe.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.zuora.api.SubscribeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(com.zuora.api.SubscribeResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(com.zuora.api.Delete param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(com.zuora.api.Delete.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.zuora.api.DeleteResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(com.zuora.api.DeleteResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.zuora.api.Update param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
                    .getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(
                    param.getOMElement(com.zuora.api.Update.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

	/* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.zuora.api.Amend param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
                    .getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(
                    param.getOMElement(com.zuora.api.Amend.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

	/* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.zuora.api.Create param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
                    .getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(
                    param.getOMElement(com.zuora.api.Create.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

	/* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.zuora.api.Execute param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
                    .getDefaultEnvelope();
            emptyEnvelope.getBody()
                    .addChild(
                            param.getOMElement(com.zuora.api.Execute.MY_QNAME,
                                    factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

	/* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.zuora.api.Query param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
                    .getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(
                    param.getOMElement(com.zuora.api.Query.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

	/* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.zuora.api.Generate param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
                    .getDefaultEnvelope();
            emptyEnvelope.getBody()
                    .addChild(
                            param.getOMElement(com.zuora.api.Generate.MY_QNAME,
                                    factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

	/* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.zuora.api.Login param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
                    .getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(
                    param.getOMElement(com.zuora.api.Login.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

	/* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.zuora.api.GetUserInfo param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
                    .getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(
                    param.getOMElement(com.zuora.api.GetUserInfo.MY_QNAME,
                            factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

	/* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.zuora.api.Subscribe param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
                    .getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(
                    param.getOMElement(com.zuora.api.Subscribe.MY_QNAME,
                            factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

	/* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.zuora.api.Delete param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
                    .getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(
                    param.getOMElement(com.zuora.api.Delete.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

	/* methods to provide back word compatibility */

    /**
     * get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
                                    java.lang.Class type, java.util.Map extraNamespaces)
            throws org.apache.axis2.AxisFault {

        try {

            if (com.zuora.api.Update.class.equals(type)) {

                return com.zuora.api.Update.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.UpdateResponse.class.equals(type)) {

                return com.zuora.api.UpdateResponse.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.fault.UnexpectedErrorFaultE.class.equals(type)) {

                return com.zuora.api.fault.UnexpectedErrorFaultE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.fault.InvalidTypeFaultE.class.equals(type)) {

                return com.zuora.api.fault.InvalidTypeFaultE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.SessionHeader.class.equals(type)) {

                return com.zuora.api.SessionHeader.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.Amend.class.equals(type)) {

                return com.zuora.api.Amend.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.AmendResponse.class.equals(type)) {

                return com.zuora.api.AmendResponse.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.fault.UnexpectedErrorFaultE.class.equals(type)) {

                return com.zuora.api.fault.UnexpectedErrorFaultE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.SessionHeader.class.equals(type)) {

                return com.zuora.api.SessionHeader.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.Create.class.equals(type)) {

                return com.zuora.api.Create.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.CreateResponse.class.equals(type)) {

                return com.zuora.api.CreateResponse.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.fault.UnexpectedErrorFaultE.class.equals(type)) {

                return com.zuora.api.fault.UnexpectedErrorFaultE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.fault.InvalidTypeFaultE.class.equals(type)) {

                return com.zuora.api.fault.InvalidTypeFaultE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.CallOptions.class.equals(type)) {

                return com.zuora.api.CallOptions.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.SessionHeader.class.equals(type)) {

                return com.zuora.api.SessionHeader.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.Execute.class.equals(type)) {

                return com.zuora.api.Execute.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.ExecuteResponse.class.equals(type)) {

                return com.zuora.api.ExecuteResponse.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.fault.InvalidValueFaultE.class.equals(type)) {

                return com.zuora.api.fault.InvalidValueFaultE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.fault.UnexpectedErrorFaultE.class.equals(type)) {

                return com.zuora.api.fault.UnexpectedErrorFaultE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.fault.InvalidTypeFaultE.class.equals(type)) {

                return com.zuora.api.fault.InvalidTypeFaultE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.SessionHeader.class.equals(type)) {

                return com.zuora.api.SessionHeader.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.Query.class.equals(type)) {

                return com.zuora.api.Query.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.QueryResponse.class.equals(type)) {

                return com.zuora.api.QueryResponse.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.fault.MalformedQueryFaultE.class.equals(type)) {

                return com.zuora.api.fault.MalformedQueryFaultE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.fault.UnexpectedErrorFaultE.class.equals(type)) {

                return com.zuora.api.fault.UnexpectedErrorFaultE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.fault.InvalidQueryLocatorFaultE.class
                    .equals(type)) {

                return com.zuora.api.fault.InvalidQueryLocatorFaultE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.SessionHeader.class.equals(type)) {

                return com.zuora.api.SessionHeader.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.Generate.class.equals(type)) {

                return com.zuora.api.Generate.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.GenerateResponse.class.equals(type)) {

                return com.zuora.api.GenerateResponse.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.fault.UnexpectedErrorFaultE.class.equals(type)) {

                return com.zuora.api.fault.UnexpectedErrorFaultE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.fault.InvalidTypeFaultE.class.equals(type)) {

                return com.zuora.api.fault.InvalidTypeFaultE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.SessionHeader.class.equals(type)) {

                return com.zuora.api.SessionHeader.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.Login.class.equals(type)) {

                return com.zuora.api.Login.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.LoginResponse.class.equals(type)) {

                return com.zuora.api.LoginResponse.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.fault.UnexpectedErrorFaultE.class.equals(type)) {

                return com.zuora.api.fault.UnexpectedErrorFaultE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.fault.LoginFaultE.class.equals(type)) {

                return com.zuora.api.fault.LoginFaultE.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.GetUserInfo.class.equals(type)) {

                return com.zuora.api.GetUserInfo.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.GetUserInfoResponse.class.equals(type)) {

                return com.zuora.api.GetUserInfoResponse.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.fault.UnexpectedErrorFaultE.class.equals(type)) {

                return com.zuora.api.fault.UnexpectedErrorFaultE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.SessionHeader.class.equals(type)) {

                return com.zuora.api.SessionHeader.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.Subscribe.class.equals(type)) {

                return com.zuora.api.Subscribe.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.SubscribeResponse.class.equals(type)) {

                return com.zuora.api.SubscribeResponse.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.fault.UnexpectedErrorFaultE.class.equals(type)) {

                return com.zuora.api.fault.UnexpectedErrorFaultE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.SessionHeader.class.equals(type)) {

                return com.zuora.api.SessionHeader.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.Delete.class.equals(type)) {

                return com.zuora.api.Delete.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.DeleteResponse.class.equals(type)) {

                return com.zuora.api.DeleteResponse.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.fault.InvalidValueFaultE.class.equals(type)) {

                return com.zuora.api.fault.InvalidValueFaultE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.fault.UnexpectedErrorFaultE.class.equals(type)) {

                return com.zuora.api.fault.UnexpectedErrorFaultE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.fault.InvalidTypeFaultE.class.equals(type)) {

                return com.zuora.api.fault.InvalidTypeFaultE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.zuora.api.SessionHeader.class.equals(type)) {

                return com.zuora.api.SessionHeader.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
    }

}
