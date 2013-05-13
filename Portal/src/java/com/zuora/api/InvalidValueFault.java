/**
 * InvalidValueFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.zuora.api;

public class InvalidValueFault extends java.lang.Exception {

    private static final long serialVersionUID = 1366001390567L;

    private com.zuora.api.fault.InvalidValueFaultE faultMessage;

    public InvalidValueFault() {
        super("InvalidValueFault");
    }

    public InvalidValueFault(java.lang.String s) {
        super(s);
    }

    public InvalidValueFault(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public InvalidValueFault(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(com.zuora.api.fault.InvalidValueFaultE msg) {
        faultMessage = msg;
    }

    public com.zuora.api.fault.InvalidValueFaultE getFaultMessage() {
        return faultMessage;
    }
}
