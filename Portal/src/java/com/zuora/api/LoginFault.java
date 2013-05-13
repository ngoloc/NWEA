/**
 * LoginFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.zuora.api;

public class LoginFault extends java.lang.Exception {

    private static final long serialVersionUID = 1366001390584L;

    private com.zuora.api.fault.LoginFaultE faultMessage;

    public LoginFault() {
        super("LoginFault");
    }

    public LoginFault(java.lang.String s) {
        super(s);
    }

    public LoginFault(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public LoginFault(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(com.zuora.api.fault.LoginFaultE msg) {
        faultMessage = msg;
    }

    public com.zuora.api.fault.LoginFaultE getFaultMessage() {
        return faultMessage;
    }
}
