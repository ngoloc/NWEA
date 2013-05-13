/**
 * InvalidTypeFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.zuora.api;

public class InvalidTypeFault extends java.lang.Exception {

    private static final long serialVersionUID = 1366001390600L;

    private com.zuora.api.fault.InvalidTypeFaultE faultMessage;

    public InvalidTypeFault() {
        super("InvalidTypeFault");
    }

    public InvalidTypeFault(java.lang.String s) {
        super(s);
    }

    public InvalidTypeFault(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public InvalidTypeFault(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(com.zuora.api.fault.InvalidTypeFaultE msg) {
        faultMessage = msg;
    }

    public com.zuora.api.fault.InvalidTypeFaultE getFaultMessage() {
        return faultMessage;
    }
}
