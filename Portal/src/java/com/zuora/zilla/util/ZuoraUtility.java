package com.zuora.zilla.util;

import org.apache.axis.encoding.Base64;
import org.codehaus.groovy.grails.commons.ConfigurationHolder;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.TimeZone;

public class ZuoraUtility {

    private Map config;

    public ZuoraUtility() {
        this.config = ConfigurationHolder.getFlatConfig();
    }

    private String GetSetting(String name) {
        return (String) this.config.get(name);
    }

    public String getUsername() {
        return GetSetting("zuora.username");
    }

    public String getPassword() {
        return GetSetting("zuora.password");
    }

    public String getEndpoint() {
        return GetSetting("zuora.endpoint");
    }

    public String getPageId() {
        return GetSetting("zuora.pageid");
    }

    public String getTenantId() {
        return GetSetting("zuora.tenantid");
    }

    public String getAPISecurityKey() {
        return GetSetting("zuora.apisecuritykey");
    }

    public String getZuoraAppUrl() {
        return GetSetting("zuora.appurl");
    }

    public String getAppUrl() {
        return GetSetting("grails.appurl");
    }

    public boolean getDefaultAutopay() {
        return Boolean.parseBoolean(GetSetting("zuora.defaultautopay"));
    }

    public String getDefaultBatch() {
        return GetSetting("zuora.defaultautopay");
    }

    public String getDefaultCurrency() {
        return GetSetting("zuora.defaultcurrency");
    }

    public int getDefaultBillCycleDay() {
        return Integer.parseInt(GetSetting("zuora.defaultbillcycleday"));
    }

    public String getDefaultPaymentTerm() {
        return GetSetting("zuora.defaultpaymentterm");
    }

    /**
     * Print a message.
     */
    public void print(String msg) {
        System.out.println(msg);
    }

    /**
     * Gets the current date.
     *
     * @return the current date
     */
    public static String getCurrentDate() {
        TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar calendar = new GregorianCalendar();
        calendar.setTimeZone(tz);
        //DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:00:00");
        return dateFormat.format(calendar.getTime());
    }

    /**
     * Get current calendar.
     *
     * @return the calendar
     */
    public static Calendar getCurrentCalendar() {
        TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar calendar = new GregorianCalendar();
        calendar.setTimeZone(tz);
        return calendar;
    }

    /**
     * Get today's day number.
     *
     * @return the current day number
     */
    public static int getCurrentDayNumber() {
        TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar calendar = new GregorianCalendar();
        calendar.setTimeZone(tz);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * Decode base64.
     *
     * @param strBody the String body
     * @return the byte[]
     */
    public static byte[] decodeBase64(String strBody) throws Exception {
        if (strBody == null) {
            throw new Exception("Invoice body was null");
        }
        return Base64.decode(strBody);
    }
}
