/**
 * MalformedQueryFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.zuora.api;

public class MalformedQueryFault extends java.lang.Exception {

    private static final long serialVersionUID = 1366001390558L;

    private com.zuora.api.fault.MalformedQueryFaultE faultMessage;

    public MalformedQueryFault() {
        super("MalformedQueryFault");
    }

    public MalformedQueryFault(java.lang.String s) {
        super(s);
    }

    public MalformedQueryFault(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public MalformedQueryFault(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(com.zuora.api.fault.MalformedQueryFaultE msg) {
        faultMessage = msg;
    }

    public com.zuora.api.fault.MalformedQueryFaultE getFaultMessage() {
        return faultMessage;
    }
}
