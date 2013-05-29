/**
 * Account.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.zuora.api.object;

/**
 * Account bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class Account extends com.zuora.api.object.ZObject implements
        org.apache.axis2.databinding.ADBBean {

    protected String localDisableWebManagement;
    protected boolean localDisableWebManagementTracker = false;

    public boolean isDisableWebManagementSpecified() {
        return localDisableWebManagementTracker;
    }

    public String getDisableWebManagement() {
        return localDisableWebManagement;
    }

    public void setDisableWebManagement(String param) {
        this.localDisableWebManagement = param;
    }



    protected String localEnrollment;
    protected boolean localEnrollmentTracker = false;

    public boolean isEnrollmentSpecified() {
        return localEnrollmentTracker;
    }

    public String getEnrollment() {
        System.out.println("get ENROLLMENT: " + this.localEnrollment);
        return this.localEnrollment;
    }

    public void setEnrollment(String param) {
        System.out.println("SET ENROLLMENT: " + param);
        this.localEnrollment = param;
        this.localEnrollmentTracker = true;
    }



    protected java.lang.String localAgencyCode;
    protected boolean localAgencyCodeTracker = false;

    public boolean isAgencyCodeSpecified() {
        return localAgencyCodeTracker;
    }

    public java.lang.String getAgencyCode() {
        return localAgencyCode;
    }

    public void setAgencyCode(java.lang.String agencyCode) {
        localAgencyCodeTracker = true;
        this.localAgencyCode = agencyCode;
    }

	/*
     * This type was generated from the piece of schema that had name = Account
	 * Namespace URI = http://object.api.zuora.com/ Namespace Prefix = ns2
	 */

    /**
     * field for AccountNumber
     */

    protected java.lang.String localAccountNumber;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAccountNumberTracker = false;

    public boolean isAccountNumberSpecified() {
        return localAccountNumberTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAccountNumber() {
        return localAccountNumber;
    }

    /**
     * Auto generated setter method
     *
     * @param param AccountNumber
     */
    public void setAccountNumber(java.lang.String param) {
        localAccountNumberTracker = true;

        this.localAccountNumber = param;

    }

    /**
     * field for AdditionalEmailAddresses
     */

    protected java.lang.String localAdditionalEmailAddresses;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAdditionalEmailAddressesTracker = false;

    public boolean isAdditionalEmailAddressesSpecified() {
        return localAdditionalEmailAddressesTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAdditionalEmailAddresses() {
        return localAdditionalEmailAddresses;
    }

    /**
     * Auto generated setter method
     *
     * @param param AdditionalEmailAddresses
     */
    public void setAdditionalEmailAddresses(java.lang.String param) {
        localAdditionalEmailAddressesTracker = true;

        this.localAdditionalEmailAddresses = param;

    }

    /**
     * field for AllowInvoiceEdit
     */

    protected boolean localAllowInvoiceEdit;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAllowInvoiceEditTracker = false;

    public boolean isAllowInvoiceEditSpecified() {
        return localAllowInvoiceEditTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getAllowInvoiceEdit() {
        return localAllowInvoiceEdit;
    }

    /**
     * Auto generated setter method
     *
     * @param param AllowInvoiceEdit
     */
    public void setAllowInvoiceEdit(boolean param) {
        localAllowInvoiceEditTracker = true;

        this.localAllowInvoiceEdit = param;

    }

    /**
     * field for AutoPay
     */

    protected boolean localAutoPay;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAutoPayTracker = false;

    public boolean isAutoPaySpecified() {
        return localAutoPayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getAutoPay() {
        return localAutoPay;
    }

    /**
     * Auto generated setter method
     *
     * @param param AutoPay
     */
    public void setAutoPay(boolean param) {
        localAutoPayTracker = true;

        this.localAutoPay = param;

    }

    /**
     * field for Balance
     */

    protected java.math.BigDecimal localBalance;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localBalanceTracker = false;

    public boolean isBalanceSpecified() {
        return localBalanceTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getBalance() {
        return localBalance;
    }

    /**
     * Auto generated setter method
     *
     * @param param Balance
     */
    public void setBalance(java.math.BigDecimal param) {
        localBalanceTracker = true;
        this.localBalance = param;

    }

    /**
     * field for Batch
     */

    protected java.lang.String localBatch;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localBatchTracker = false;

    public boolean isBatchSpecified() {
        return localBatchTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getBatch() {
        return localBatch;
    }

    /**
     * Auto generated setter method
     *
     * @param param Batch
     */
    public void setBatch(java.lang.String param) {
        localBatchTracker = true;

        this.localBatch = param;

    }

    /**
     * field for BcdSettingOption
     */

    protected java.lang.String localBcdSettingOption;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localBcdSettingOptionTracker = false;

    public boolean isBcdSettingOptionSpecified() {
        return localBcdSettingOptionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getBcdSettingOption() {
        return localBcdSettingOption;
    }

    /**
     * Auto generated setter method
     *
     * @param param BcdSettingOption
     */
    public void setBcdSettingOption(java.lang.String param) {
        localBcdSettingOptionTracker = true;

        this.localBcdSettingOption = param;

    }

    /**
     * field for BillCycleDay
     */

    protected int localBillCycleDay;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localBillCycleDayTracker = false;

    public boolean isBillCycleDaySpecified() {
        return localBillCycleDayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getBillCycleDay() {
        return localBillCycleDay;
    }

    /**
     * Auto generated setter method
     *
     * @param param BillCycleDay
     */
    public void setBillCycleDay(int param) {

        // setting primitive attribute tracker to true
        localBillCycleDayTracker = param != java.lang.Integer.MIN_VALUE;

        this.localBillCycleDay = param;

    }

    /**
     * field for BillToId
     */

    protected com.zuora.api.ID localBillToId;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localBillToIdTracker = false;

    public boolean isBillToIdSpecified() {
        return localBillToIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ID
     */
    public com.zuora.api.ID getBillToId() {
        return localBillToId;
    }

    /**
     * Auto generated setter method
     *
     * @param param BillToId
     */
    public void setBillToId(com.zuora.api.ID param) {
        localBillToIdTracker = true;

        this.localBillToId = param;

    }

    /**
     * field for CommunicationProfileId
     */

    protected com.zuora.api.ID localCommunicationProfileId;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCommunicationProfileIdTracker = false;

    public boolean isCommunicationProfileIdSpecified() {
        return localCommunicationProfileIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ID
     */
    public com.zuora.api.ID getCommunicationProfileId() {
        return localCommunicationProfileId;
    }

    /**
     * Auto generated setter method
     *
     * @param param CommunicationProfileId
     */
    public void setCommunicationProfileId(com.zuora.api.ID param) {
        localCommunicationProfileIdTracker = true;

        this.localCommunicationProfileId = param;

    }

    /**
     * field for CreatedById
     */

    protected com.zuora.api.ID localCreatedById;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCreatedByIdTracker = false;

    public boolean isCreatedByIdSpecified() {
        return localCreatedByIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ID
     */
    public com.zuora.api.ID getCreatedById() {
        return localCreatedById;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreatedById
     */
    public void setCreatedById(com.zuora.api.ID param) {
        localCreatedByIdTracker = true;

        this.localCreatedById = param;

    }

    /**
     * field for CreatedDate
     */

    protected java.util.Calendar localCreatedDate;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCreatedDateTracker = false;

    public boolean isCreatedDateSpecified() {
        return localCreatedDateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getCreatedDate() {
        return localCreatedDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreatedDate
     */
    public void setCreatedDate(java.util.Calendar param) {
        localCreatedDateTracker = true;

        this.localCreatedDate = param;

    }

    /**
     * field for CreditBalance
     */

    protected java.math.BigDecimal localCreditBalance;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCreditBalanceTracker = false;

    public boolean isCreditBalanceSpecified() {
        return localCreditBalanceTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getCreditBalance() {
        return localCreditBalance;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreditBalance
     */
    public void setCreditBalance(java.math.BigDecimal param) {
        localCreditBalanceTracker = true;

        this.localCreditBalance = param;

    }

    /**
     * field for CrmId
     */

    protected java.lang.String localCrmId;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCrmIdTracker = false;

    public boolean isCrmIdSpecified() {
        return localCrmIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCrmId() {
        return localCrmId;
    }

    /**
     * Auto generated setter method
     *
     * @param param CrmId
     */
    public void setCrmId(java.lang.String param) {
        localCrmIdTracker = true;

        this.localCrmId = param;

    }

    /**
     * field for Currency
     */

    protected java.lang.String localCurrency;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCurrencyTracker = false;

    public boolean isCurrencySpecified() {
        return localCurrencyTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCurrency() {
        return localCurrency;
    }

    /**
     * Auto generated setter method
     *
     * @param param Currency
     */
    public void setCurrency(java.lang.String param) {
        localCurrencyTracker = true;

        this.localCurrency = param;

    }

    /**
     * field for CustomerServiceRepName
     */

    protected java.lang.String localCustomerServiceRepName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCustomerServiceRepNameTracker = false;

    public boolean isCustomerServiceRepNameSpecified() {
        return localCustomerServiceRepNameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCustomerServiceRepName() {
        return localCustomerServiceRepName;
    }

    /**
     * Auto generated setter method
     *
     * @param param CustomerServiceRepName
     */
    public void setCustomerServiceRepName(java.lang.String param) {
        localCustomerServiceRepNameTracker = true;

        this.localCustomerServiceRepName = param;

    }

    /**
     * field for DefaultPaymentMethodId
     */

    protected com.zuora.api.ID localDefaultPaymentMethodId;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localDefaultPaymentMethodIdTracker = false;

    public boolean isDefaultPaymentMethodIdSpecified() {
        return localDefaultPaymentMethodIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ID
     */
    public com.zuora.api.ID getDefaultPaymentMethodId() {
        return localDefaultPaymentMethodId;
    }

    /**
     * Auto generated setter method
     *
     * @param param DefaultPaymentMethodId
     */
    public void setDefaultPaymentMethodId(com.zuora.api.ID param) {
        localDefaultPaymentMethodIdTracker = true;

        this.localDefaultPaymentMethodId = param;

    }

    /**
     * field for InvoiceDeliveryPrefsEmail
     */

    protected boolean localInvoiceDeliveryPrefsEmail;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localInvoiceDeliveryPrefsEmailTracker = false;

    public boolean isInvoiceDeliveryPrefsEmailSpecified() {
        return localInvoiceDeliveryPrefsEmailTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getInvoiceDeliveryPrefsEmail() {
        return localInvoiceDeliveryPrefsEmail;
    }

    /**
     * Auto generated setter method
     *
     * @param param InvoiceDeliveryPrefsEmail
     */
    public void setInvoiceDeliveryPrefsEmail(boolean param) {
        localInvoiceDeliveryPrefsEmailTracker = true;

        this.localInvoiceDeliveryPrefsEmail = param;

    }

    /**
     * field for InvoiceDeliveryPrefsPrint
     */

    protected boolean localInvoiceDeliveryPrefsPrint;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localInvoiceDeliveryPrefsPrintTracker = false;

    public boolean isInvoiceDeliveryPrefsPrintSpecified() {
        return localInvoiceDeliveryPrefsPrintTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getInvoiceDeliveryPrefsPrint() {
        return localInvoiceDeliveryPrefsPrint;
    }

    /**
     * Auto generated setter method
     *
     * @param param InvoiceDeliveryPrefsPrint
     */
    public void setInvoiceDeliveryPrefsPrint(boolean param) {
        localInvoiceDeliveryPrefsPrintTracker = true;

        this.localInvoiceDeliveryPrefsPrint = param;

    }

    /**
     * field for InvoiceTemplateId
     */

    protected com.zuora.api.ID localInvoiceTemplateId;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localInvoiceTemplateIdTracker = false;

    public boolean isInvoiceTemplateIdSpecified() {
        return localInvoiceTemplateIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ID
     */
    public com.zuora.api.ID getInvoiceTemplateId() {
        return localInvoiceTemplateId;
    }

    /**
     * Auto generated setter method
     *
     * @param param InvoiceTemplateId
     */
    public void setInvoiceTemplateId(com.zuora.api.ID param) {
        localInvoiceTemplateIdTracker = true;

        this.localInvoiceTemplateId = param;

    }

    /**
     * field for LastInvoiceDate
     */

    protected java.util.Calendar localLastInvoiceDate;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localLastInvoiceDateTracker = false;

    public boolean isLastInvoiceDateSpecified() {
        return localLastInvoiceDateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getLastInvoiceDate() {
        return localLastInvoiceDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param LastInvoiceDate
     */
    public void setLastInvoiceDate(java.util.Calendar param) {
        localLastInvoiceDateTracker = true;

        this.localLastInvoiceDate = param;

    }

    /**
     * field for Name
     */

    protected java.lang.String localName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localNameTracker = false;

    public boolean isNameSpecified() {
        return localNameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getName() {
        return localName;
    }

    /**
     * Auto generated setter method
     *
     * @param param Name
     */
    public void setName(java.lang.String param) {
        localNameTracker = true;

        this.localName = param;

    }

    /**
     * field for Notes
     */

    protected java.lang.String localNotes;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localNotesTracker = false;

    public boolean isNotesSpecified() {
        return localNotesTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getNotes() {
        return localNotes;
    }

    /**
     * Auto generated setter method
     *
     * @param param Notes
     */
    public void setNotes(java.lang.String param) {
        localNotesTracker = true;

        this.localNotes = param;

    }

    /**
     * field for ParentId
     */

    protected com.zuora.api.ID localParentId;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localParentIdTracker = false;

    public boolean isParentIdSpecified() {
        return localParentIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ID
     */
    public com.zuora.api.ID getParentId() {
        return localParentId;
    }

    /**
     * Auto generated setter method
     *
     * @param param ParentId
     */
    public void setParentId(com.zuora.api.ID param) {
        localParentIdTracker = true;

        this.localParentId = param;

    }

    /**
     * field for PaymentGateway
     */

    protected java.lang.String localPaymentGateway;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPaymentGatewayTracker = false;

    public boolean isPaymentGatewaySpecified() {
        return localPaymentGatewayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getPaymentGateway() {
        return localPaymentGateway;
    }

    /**
     * Auto generated setter method
     *
     * @param param PaymentGateway
     */
    public void setPaymentGateway(java.lang.String param) {
        localPaymentGatewayTracker = true;

        this.localPaymentGateway = param;

    }

    /**
     * field for PaymentTerm
     */

    protected java.lang.String localPaymentTerm;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPaymentTermTracker = false;

    public boolean isPaymentTermSpecified() {
        return localPaymentTermTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getPaymentTerm() {
        return localPaymentTerm;
    }

    /**
     * Auto generated setter method
     *
     * @param param PaymentTerm
     */
    public void setPaymentTerm(java.lang.String param) {
        localPaymentTermTracker = true;

        this.localPaymentTerm = param;

    }

    /**
     * field for PurchaseOrderNumber
     */

    protected java.lang.String localPurchaseOrderNumber;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPurchaseOrderNumberTracker = false;

    public boolean isPurchaseOrderNumberSpecified() {
        return localPurchaseOrderNumberTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getPurchaseOrderNumber() {
        return localPurchaseOrderNumber;
    }

    /**
     * Auto generated setter method
     *
     * @param param PurchaseOrderNumber
     */
    public void setPurchaseOrderNumber(java.lang.String param) {
        localPurchaseOrderNumberTracker = true;

        this.localPurchaseOrderNumber = param;

    }

    /**
     * field for SalesRepName
     */

    protected java.lang.String localSalesRepName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSalesRepNameTracker = false;

    public boolean isSalesRepNameSpecified() {
        return localSalesRepNameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSalesRepName() {
        return localSalesRepName;
    }

    /**
     * Auto generated setter method
     *
     * @param param SalesRepName
     */
    public void setSalesRepName(java.lang.String param) {
        localSalesRepNameTracker = true;

        this.localSalesRepName = param;

    }

    /**
     * field for SoldToId
     */

    protected com.zuora.api.ID localSoldToId;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSoldToIdTracker = false;

    public boolean isSoldToIdSpecified() {
        return localSoldToIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ID
     */
    public com.zuora.api.ID getSoldToId() {
        return localSoldToId;
    }

    /**
     * Auto generated setter method
     *
     * @param param SoldToId
     */
    public void setSoldToId(com.zuora.api.ID param) {
        localSoldToIdTracker = true;

        this.localSoldToId = param;

    }

    /**
     * field for Status
     */

    protected java.lang.String localStatus;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localStatusTracker = false;

    public boolean isStatusSpecified() {
        return localStatusTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getStatus() {
        return localStatus;
    }

    /**
     * Auto generated setter method
     *
     * @param param Status
     */
    public void setStatus(java.lang.String param) {
        localStatusTracker = true;

        this.localStatus = param;

    }

    /**
     * field for TaxExemptCertificateID
     */

    protected java.lang.String localTaxExemptCertificateID;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTaxExemptCertificateIDTracker = false;

    public boolean isTaxExemptCertificateIDSpecified() {
        return localTaxExemptCertificateIDTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTaxExemptCertificateID() {
        return localTaxExemptCertificateID;
    }

    /**
     * Auto generated setter method
     *
     * @param param TaxExemptCertificateID
     */
    public void setTaxExemptCertificateID(java.lang.String param) {
        localTaxExemptCertificateIDTracker = true;

        this.localTaxExemptCertificateID = param;

    }

    /**
     * field for TaxExemptCertificateType
     */

    protected java.lang.String localTaxExemptCertificateType;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTaxExemptCertificateTypeTracker = false;

    public boolean isTaxExemptCertificateTypeSpecified() {
        return localTaxExemptCertificateTypeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTaxExemptCertificateType() {
        return localTaxExemptCertificateType;
    }

    /**
     * Auto generated setter method
     *
     * @param param TaxExemptCertificateType
     */
    public void setTaxExemptCertificateType(java.lang.String param) {
        localTaxExemptCertificateTypeTracker = true;

        this.localTaxExemptCertificateType = param;

    }

    /**
     * field for TaxExemptDescription
     */

    protected java.lang.String localTaxExemptDescription;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTaxExemptDescriptionTracker = false;

    public boolean isTaxExemptDescriptionSpecified() {
        return localTaxExemptDescriptionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTaxExemptDescription() {
        return localTaxExemptDescription;
    }

    /**
     * Auto generated setter method
     *
     * @param param TaxExemptDescription
     */
    public void setTaxExemptDescription(java.lang.String param) {
        localTaxExemptDescriptionTracker = true;

        this.localTaxExemptDescription = param;

    }

    /**
     * field for TaxExemptEffectiveDate
     */

    protected java.util.Calendar localTaxExemptEffectiveDate;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTaxExemptEffectiveDateTracker = false;

    public boolean isTaxExemptEffectiveDateSpecified() {
        return localTaxExemptEffectiveDateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getTaxExemptEffectiveDate() {
        return localTaxExemptEffectiveDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param TaxExemptEffectiveDate
     */
    public void setTaxExemptEffectiveDate(java.util.Calendar param) {
        localTaxExemptEffectiveDateTracker = true;

        this.localTaxExemptEffectiveDate = param;

    }

    /**
     * field for TaxExemptExpirationDate
     */

    protected java.util.Calendar localTaxExemptExpirationDate;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTaxExemptExpirationDateTracker = false;

    public boolean isTaxExemptExpirationDateSpecified() {
        return localTaxExemptExpirationDateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getTaxExemptExpirationDate() {
        return localTaxExemptExpirationDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param TaxExemptExpirationDate
     */
    public void setTaxExemptExpirationDate(java.util.Calendar param) {
        localTaxExemptExpirationDateTracker = true;

        this.localTaxExemptExpirationDate = param;

    }

    /**
     * field for TaxExemptIssuingJurisdiction
     */

    protected java.lang.String localTaxExemptIssuingJurisdiction;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTaxExemptIssuingJurisdictionTracker = false;

    public boolean isTaxExemptIssuingJurisdictionSpecified() {
        return localTaxExemptIssuingJurisdictionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTaxExemptIssuingJurisdiction() {
        return localTaxExemptIssuingJurisdiction;
    }

    /**
     * Auto generated setter method
     *
     * @param param TaxExemptIssuingJurisdiction
     */
    public void setTaxExemptIssuingJurisdiction(java.lang.String param) {
        localTaxExemptIssuingJurisdictionTracker = true;

        this.localTaxExemptIssuingJurisdiction = param;

    }

    /**
     * field for TaxExemptStatus
     */

    protected java.lang.String localTaxExemptStatus;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTaxExemptStatusTracker = false;

    public boolean isTaxExemptStatusSpecified() {
        return localTaxExemptStatusTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTaxExemptStatus() {
        return localTaxExemptStatus;
    }

    /**
     * Auto generated setter method
     *
     * @param param TaxExemptStatus
     */
    public void setTaxExemptStatus(java.lang.String param) {
        localTaxExemptStatusTracker = true;

        this.localTaxExemptStatus = param;

    }

    /**
     * field for TotalInvoiceBalance
     */

    protected java.math.BigDecimal localTotalInvoiceBalance;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTotalInvoiceBalanceTracker = false;

    public boolean isTotalInvoiceBalanceSpecified() {
        return localTotalInvoiceBalanceTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getTotalInvoiceBalance() {
        return localTotalInvoiceBalance;
    }

    /**
     * Auto generated setter method
     *
     * @param param TotalInvoiceBalance
     */
    public void setTotalInvoiceBalance(java.math.BigDecimal param) {
        localTotalInvoiceBalanceTracker = true;

        this.localTotalInvoiceBalance = param;

    }

    /**
     * field for UpdatedById
     */

    protected com.zuora.api.ID localUpdatedById;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localUpdatedByIdTracker = false;

    public boolean isUpdatedByIdSpecified() {
        return localUpdatedByIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ID
     */
    public com.zuora.api.ID getUpdatedById() {
        return localUpdatedById;
    }

    /**
     * Auto generated setter method
     *
     * @param param UpdatedById
     */
    public void setUpdatedById(com.zuora.api.ID param) {
        localUpdatedByIdTracker = true;

        this.localUpdatedById = param;

    }

    /**
     * field for UpdatedDate
     */

    protected java.util.Calendar localUpdatedDate;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localUpdatedDateTracker = false;

    public boolean isUpdatedDateSpecified() {
        return localUpdatedDateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getUpdatedDate() {
        return localUpdatedDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param UpdatedDate
     */
    public void setUpdatedDate(java.util.Calendar param) {
        localUpdatedDateTracker = true;

        this.localUpdatedDate = param;

    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

        org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
                this, parentQName);
        return factory.createOMElement(dataSource, parentQName);

    }

    public void serialize(final javax.xml.namespace.QName parentQName,
                          javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
                          javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {

        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

        java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                "http://object.api.zuora.com/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                    "type", namespacePrefix + ":Account", xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                    "type", "Account", xmlWriter);
        }

        if (localFieldsToNullTracker) {
            if (localFieldsToNull != null) {
                namespace = "http://object.api.zuora.com/";
                for (int i = 0; i < localFieldsToNull.length; i++) {

                    if (localFieldsToNull[i] != null) {

                        writeStartElement(null, namespace, "fieldsToNull",
                                xmlWriter);

                        xmlWriter
                                .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                        .convertToString(localFieldsToNull[i]));

                        xmlWriter.writeEndElement();

                    } else {

                        // write null attribute
                        namespace = "http://object.api.zuora.com/";
                        writeStartElement(null, namespace, "fieldsToNull",
                                xmlWriter);
                        writeAttribute("xsi",
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "nil", "1", xmlWriter);
                        xmlWriter.writeEndElement();

                    }

                }
            } else {

                // write the null attribute
                // write null attribute
                writeStartElement(null, "http://object.api.zuora.com/",
                        "fieldsToNull", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();

            }

        }
        if (localIdTracker) {
            if (localId == null) {

                writeStartElement(null, "http://object.api.zuora.com/", "Id",
                        xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localId.serialize(new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "Id"), xmlWriter);
            }
        }
        if (localAccountNumberTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "AccountNumber", xmlWriter);

            if (localAccountNumber == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localAccountNumber);

            }

            xmlWriter.writeEndElement();
        }
        if (localAgencyCodeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "AgencyCode__c", xmlWriter);

            if (localAgencyCode == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localAgencyCode);

            }

            xmlWriter.writeEndElement();
        }

        if (localDisableWebManagementTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "DisableWebManagement__c", xmlWriter);

            if (localDisableWebManagement == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localDisableWebManagement);

            }

            xmlWriter.writeEndElement();
        }

        if (localEnrollmentTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "Enrollment__c", xmlWriter);

            if (localEnrollment == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localEnrollment);

            }

            xmlWriter.writeEndElement();
        }


        if (localAdditionalEmailAddressesTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "AdditionalEmailAddresses",
                    xmlWriter);

            if (localAdditionalEmailAddresses == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localAdditionalEmailAddresses);

            }

            xmlWriter.writeEndElement();
        }
        if (localAllowInvoiceEditTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "AllowInvoiceEdit", xmlWriter);

            if (false) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localAllowInvoiceEdit));
            }

            xmlWriter.writeEndElement();
        }
        if (localAutoPayTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "AutoPay", xmlWriter);

            if (false) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localAutoPay));
            }

            xmlWriter.writeEndElement();
        }
        if (localBalanceTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "Balance", xmlWriter);

            if (localBalance == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localBalance));

            }

            xmlWriter.writeEndElement();
        }
        if (localBatchTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "Batch", xmlWriter);

            if (localBatch == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localBatch);

            }

            xmlWriter.writeEndElement();
        }
        if (localBcdSettingOptionTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "BcdSettingOption", xmlWriter);

            if (localBcdSettingOption == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localBcdSettingOption);

            }

            xmlWriter.writeEndElement();
        }
        if (localBillCycleDayTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "BillCycleDay", xmlWriter);

            if (localBillCycleDay == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException(
                        "BillCycleDay cannot be null!!");

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localBillCycleDay));
            }

            xmlWriter.writeEndElement();
        }
        if (localBillToIdTracker) {
            if (localBillToId == null) {

                writeStartElement(null, "http://object.api.zuora.com/",
                        "BillToId", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localBillToId.serialize(new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "BillToId"), xmlWriter);
            }
        }
        if (localCommunicationProfileIdTracker) {
            if (localCommunicationProfileId == null) {

                writeStartElement(null, "http://object.api.zuora.com/",
                        "CommunicationProfileId", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localCommunicationProfileId.serialize(
                        new javax.xml.namespace.QName(
                                "http://object.api.zuora.com/",
                                "CommunicationProfileId"), xmlWriter);
            }
        }
        if (localCreatedByIdTracker) {
            if (localCreatedById == null) {

                writeStartElement(null, "http://object.api.zuora.com/",
                        "CreatedById", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localCreatedById.serialize(new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "CreatedById"),
                        xmlWriter);
            }
        }
        if (localCreatedDateTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "CreatedDate", xmlWriter);

            if (localCreatedDate == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localCreatedDate));

            }

            xmlWriter.writeEndElement();
        }
        if (localCreditBalanceTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "CreditBalance", xmlWriter);

            if (localCreditBalance == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localCreditBalance));

            }

            xmlWriter.writeEndElement();
        }
        if (localCrmIdTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "CrmId", xmlWriter);

            if (localCrmId == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localCrmId);

            }

            xmlWriter.writeEndElement();
        }
        if (localCurrencyTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "Currency", xmlWriter);

            if (localCurrency == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localCurrency);

            }

            xmlWriter.writeEndElement();
        }
        if (localCustomerServiceRepNameTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "CustomerServiceRepName",
                    xmlWriter);

            if (localCustomerServiceRepName == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localCustomerServiceRepName);

            }

            xmlWriter.writeEndElement();
        }
        if (localDefaultPaymentMethodIdTracker) {
            if (localDefaultPaymentMethodId == null) {

                writeStartElement(null, "http://object.api.zuora.com/",
                        "DefaultPaymentMethodId", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localDefaultPaymentMethodId.serialize(
                        new javax.xml.namespace.QName(
                                "http://object.api.zuora.com/",
                                "DefaultPaymentMethodId"), xmlWriter);
            }
        }
        if (localInvoiceDeliveryPrefsEmailTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "InvoiceDeliveryPrefsEmail",
                    xmlWriter);

            if (false) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localInvoiceDeliveryPrefsEmail));
            }

            xmlWriter.writeEndElement();
        }
        if (localInvoiceDeliveryPrefsPrintTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "InvoiceDeliveryPrefsPrint",
                    xmlWriter);

            if (false) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localInvoiceDeliveryPrefsPrint));
            }

            xmlWriter.writeEndElement();
        }
        if (localInvoiceTemplateIdTracker) {
            if (localInvoiceTemplateId == null) {

                writeStartElement(null, "http://object.api.zuora.com/",
                        "InvoiceTemplateId", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localInvoiceTemplateId.serialize(new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "InvoiceTemplateId"),
                        xmlWriter);
            }
        }
        if (localLastInvoiceDateTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "LastInvoiceDate", xmlWriter);

            if (localLastInvoiceDate == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localLastInvoiceDate));

            }

            xmlWriter.writeEndElement();
        }
        if (localNameTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "Name", xmlWriter);

            if (localName == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localName);

            }

            xmlWriter.writeEndElement();
        }
        if (localNotesTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "Notes", xmlWriter);

            if (localNotes == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localNotes);

            }

            xmlWriter.writeEndElement();
        }
        if (localParentIdTracker) {
            if (localParentId == null) {

                writeStartElement(null, "http://object.api.zuora.com/",
                        "ParentId", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localParentId.serialize(new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "ParentId"), xmlWriter);
            }
        }
        if (localPaymentGatewayTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "PaymentGateway", xmlWriter);

            if (localPaymentGateway == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localPaymentGateway);

            }

            xmlWriter.writeEndElement();
        }
        if (localPaymentTermTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "PaymentTerm", xmlWriter);

            if (localPaymentTerm == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localPaymentTerm);

            }

            xmlWriter.writeEndElement();
        }
        if (localPurchaseOrderNumberTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "PurchaseOrderNumber", xmlWriter);

            if (localPurchaseOrderNumber == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localPurchaseOrderNumber);

            }

            xmlWriter.writeEndElement();
        }
        if (localSalesRepNameTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "SalesRepName", xmlWriter);

            if (localSalesRepName == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localSalesRepName);

            }

            xmlWriter.writeEndElement();
        }
        if (localSoldToIdTracker) {
            if (localSoldToId == null) {

                writeStartElement(null, "http://object.api.zuora.com/",
                        "SoldToId", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localSoldToId.serialize(new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "SoldToId"), xmlWriter);
            }
        }
        if (localStatusTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "Status", xmlWriter);

            if (localStatus == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localStatus);

            }

            xmlWriter.writeEndElement();
        }
        if (localTaxExemptCertificateIDTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "TaxExemptCertificateID",
                    xmlWriter);

            if (localTaxExemptCertificateID == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localTaxExemptCertificateID);

            }

            xmlWriter.writeEndElement();
        }
        if (localTaxExemptCertificateTypeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "TaxExemptCertificateType",
                    xmlWriter);

            if (localTaxExemptCertificateType == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localTaxExemptCertificateType);

            }

            xmlWriter.writeEndElement();
        }
        if (localTaxExemptDescriptionTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "TaxExemptDescription",
                    xmlWriter);

            if (localTaxExemptDescription == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localTaxExemptDescription);

            }

            xmlWriter.writeEndElement();
        }
        if (localTaxExemptEffectiveDateTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "TaxExemptEffectiveDate",
                    xmlWriter);

            if (localTaxExemptEffectiveDate == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localTaxExemptEffectiveDate));

            }

            xmlWriter.writeEndElement();
        }
        if (localTaxExemptExpirationDateTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "TaxExemptExpirationDate",
                    xmlWriter);

            if (localTaxExemptExpirationDate == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localTaxExemptExpirationDate));

            }

            xmlWriter.writeEndElement();
        }
        if (localTaxExemptIssuingJurisdictionTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "TaxExemptIssuingJurisdiction",
                    xmlWriter);

            if (localTaxExemptIssuingJurisdiction == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localTaxExemptIssuingJurisdiction);

            }

            xmlWriter.writeEndElement();
        }
        if (localTaxExemptStatusTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "TaxExemptStatus", xmlWriter);

            if (localTaxExemptStatus == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localTaxExemptStatus);

            }

            xmlWriter.writeEndElement();
        }
        if (localTotalInvoiceBalanceTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "TotalInvoiceBalance", xmlWriter);

            if (localTotalInvoiceBalance == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localTotalInvoiceBalance));

            }

            xmlWriter.writeEndElement();
        }
        if (localUpdatedByIdTracker) {
            if (localUpdatedById == null) {

                writeStartElement(null, "http://object.api.zuora.com/",
                        "UpdatedById", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localUpdatedById.serialize(new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "UpdatedById"),
                        xmlWriter);
            }
        }
        if (localUpdatedDateTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "UpdatedDate", xmlWriter);

            if (localUpdatedDate == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localUpdatedDate));

            }

            xmlWriter.writeEndElement();
        }
        xmlWriter.writeEndElement();

    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://object.api.zuora.com/")) {
            return "ns2";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
                                   java.lang.String namespace, java.lang.String localPart,
                                   javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
        if (writerPrefix != null) {
            xmlWriter.writeStartElement(namespace, localPart);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix,
                                java.lang.String namespace, java.lang.String attName,
                                java.lang.String attValue,
                                javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        if (xmlWriter.getPrefix(namespace) == null) {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
        xmlWriter.writeAttribute(namespace, attName, attValue);
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace,
                                java.lang.String attName, java.lang.String attValue,
                                javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace,
                                     java.lang.String attName, javax.xml.namespace.QName qname,
                                     javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter
                .getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }

    /**
     * method to handle Qnames
     */

    private void writeQName(javax.xml.namespace.QName qname,
                            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();
        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix
                        + ":"
                        + org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(qname));
            } else {
                // i.e this is the default namespace
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qname));
            }

        } else {
            xmlWriter
                    .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToString(qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
                             javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

        if (qnames != null) {
            // we have to store this data until last moment since it is not
            // possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }
                namespaceURI = qnames[i].getNamespaceURI();
                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);
                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite
                                .append(prefix)
                                .append(":")
                                .append(org.apache.axis2.databinding.utils.ConverterUtil
                                        .convertToString(qnames[i]));
                    } else {
                        stringToWrite
                                .append(org.apache.axis2.databinding.utils.ConverterUtil
                                        .convertToString(qnames[i]));
                    }
                } else {
                    stringToWrite
                            .append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                }
            }
            xmlWriter.writeCharacters(stringToWrite.toString());
        }

    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);
        if (prefix == null) {
            prefix = generatePrefix(namespace);
            javax.xml.namespace.NamespaceContext nsContext = xmlWriter
                    .getNamespaceContext();
            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);
                if (uri == null || uri.length() == 0) {
                    break;
                }
                prefix = org.apache.axis2.databinding.utils.BeanUtil
                        .getUniquePrefix();
            }
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
        return prefix;
    }

    /**
     * databinding method to get an XML representation of this object
     */
    public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {

        java.util.ArrayList elementList = new java.util.ArrayList();
        java.util.ArrayList attribList = new java.util.ArrayList();

        attribList.add(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema-instance", "type"));
        attribList.add(new javax.xml.namespace.QName(
                "http://object.api.zuora.com/", "Account"));
        if (localFieldsToNullTracker) {
            if (localFieldsToNull != null) {
                for (int i = 0; i < localFieldsToNull.length; i++) {

                    if (localFieldsToNull[i] != null) {
                        elementList
                                .add(new javax.xml.namespace.QName(
                                        "http://object.api.zuora.com/",
                                        "fieldsToNull"));
                        elementList
                                .add(org.apache.axis2.databinding.utils.ConverterUtil
                                        .convertToString(localFieldsToNull[i]));
                    } else {

                        elementList
                                .add(new javax.xml.namespace.QName(
                                        "http://object.api.zuora.com/",
                                        "fieldsToNull"));
                        elementList.add(null);

                    }

                }
            } else {

                elementList.add(new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "fieldsToNull"));
                elementList.add(null);

            }

        }
        if (localIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Id"));

            elementList.add(localId == null ? null : localId);
        }
        if (localAccountNumberTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "AccountNumber"));

            elementList.add(localAccountNumber == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localAccountNumber));
        }
        if (localAgencyCodeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "AgencyCode__c"));

            elementList.add(localAgencyCode == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localAgencyCode));
        }
        if (localDisableWebManagementTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "DisableWebManagement__c"));

            elementList.add(localDisableWebManagement == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localDisableWebManagement));
        }
        if (localEnrollmentTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Enrollment__c"));

            elementList.add(localEnrollment == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localEnrollment));
        }
        if (localAdditionalEmailAddressesTracker) {
            elementList
                    .add(new javax.xml.namespace.QName(
                            "http://object.api.zuora.com/",
                            "AdditionalEmailAddresses"));

            elementList.add(localAdditionalEmailAddresses == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localAdditionalEmailAddresses));
        }
        if (localAllowInvoiceEditTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "AllowInvoiceEdit"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localAllowInvoiceEdit));
        }
        if (localAutoPayTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "AutoPay"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localAutoPay));
        }
        if (localBalanceTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Balance"));

            elementList.add(localBalance == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localBalance));
        }
        if (localBatchTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Batch"));

            elementList.add(localBatch == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localBatch));
        }
        if (localBcdSettingOptionTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "BcdSettingOption"));

            elementList.add(localBcdSettingOption == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localBcdSettingOption));
        }
        if (localBillCycleDayTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "BillCycleDay"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localBillCycleDay));
        }
        if (localBillToIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "BillToId"));

            elementList.add(localBillToId == null ? null : localBillToId);
        }
        if (localCommunicationProfileIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "CommunicationProfileId"));

            elementList.add(localCommunicationProfileId == null ? null
                    : localCommunicationProfileId);
        }
        if (localCreatedByIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "CreatedById"));

            elementList.add(localCreatedById == null ? null : localCreatedById);
        }
        if (localCreatedDateTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "CreatedDate"));

            elementList.add(localCreatedDate == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCreatedDate));
        }
        if (localCreditBalanceTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "CreditBalance"));

            elementList.add(localCreditBalance == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCreditBalance));
        }
        if (localCrmIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "CrmId"));

            elementList.add(localCrmId == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCrmId));
        }
        if (localCurrencyTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Currency"));

            elementList.add(localCurrency == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCurrency));
        }
        if (localCustomerServiceRepNameTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "CustomerServiceRepName"));

            elementList.add(localCustomerServiceRepName == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCustomerServiceRepName));
        }
        if (localDefaultPaymentMethodIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "DefaultPaymentMethodId"));

            elementList.add(localDefaultPaymentMethodId == null ? null
                    : localDefaultPaymentMethodId);
        }
        if (localInvoiceDeliveryPrefsEmailTracker) {
            elementList
                    .add(new javax.xml.namespace.QName(
                            "http://object.api.zuora.com/",
                            "InvoiceDeliveryPrefsEmail"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localInvoiceDeliveryPrefsEmail));
        }
        if (localInvoiceDeliveryPrefsPrintTracker) {
            elementList
                    .add(new javax.xml.namespace.QName(
                            "http://object.api.zuora.com/",
                            "InvoiceDeliveryPrefsPrint"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localInvoiceDeliveryPrefsPrint));
        }
        if (localInvoiceTemplateIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "InvoiceTemplateId"));

            elementList.add(localInvoiceTemplateId == null ? null
                    : localInvoiceTemplateId);
        }
        if (localLastInvoiceDateTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "LastInvoiceDate"));

            elementList.add(localLastInvoiceDate == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localLastInvoiceDate));
        }
        if (localNameTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Name"));

            elementList.add(localName == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localName));
        }
        if (localNotesTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Notes"));

            elementList.add(localNotes == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localNotes));
        }
        if (localParentIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "ParentId"));

            elementList.add(localParentId == null ? null : localParentId);
        }
        if (localPaymentGatewayTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "PaymentGateway"));

            elementList.add(localPaymentGateway == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localPaymentGateway));
        }
        if (localPaymentTermTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "PaymentTerm"));

            elementList.add(localPaymentTerm == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localPaymentTerm));
        }
        if (localPurchaseOrderNumberTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "PurchaseOrderNumber"));

            elementList.add(localPurchaseOrderNumber == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localPurchaseOrderNumber));
        }
        if (localSalesRepNameTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "SalesRepName"));

            elementList.add(localSalesRepName == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localSalesRepName));
        }
        if (localSoldToIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "SoldToId"));

            elementList.add(localSoldToId == null ? null : localSoldToId);
        }
        if (localStatusTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Status"));

            elementList.add(localStatus == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localStatus));
        }
        if (localTaxExemptCertificateIDTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "TaxExemptCertificateID"));

            elementList.add(localTaxExemptCertificateID == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localTaxExemptCertificateID));
        }
        if (localTaxExemptCertificateTypeTracker) {
            elementList
                    .add(new javax.xml.namespace.QName(
                            "http://object.api.zuora.com/",
                            "TaxExemptCertificateType"));

            elementList.add(localTaxExemptCertificateType == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localTaxExemptCertificateType));
        }
        if (localTaxExemptDescriptionTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "TaxExemptDescription"));

            elementList.add(localTaxExemptDescription == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localTaxExemptDescription));
        }
        if (localTaxExemptEffectiveDateTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "TaxExemptEffectiveDate"));

            elementList.add(localTaxExemptEffectiveDate == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localTaxExemptEffectiveDate));
        }
        if (localTaxExemptExpirationDateTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "TaxExemptExpirationDate"));

            elementList.add(localTaxExemptExpirationDate == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localTaxExemptExpirationDate));
        }
        if (localTaxExemptIssuingJurisdictionTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/",
                    "TaxExemptIssuingJurisdiction"));

            elementList
                    .add(localTaxExemptIssuingJurisdiction == null ? null
                            : org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToString(localTaxExemptIssuingJurisdiction));
        }
        if (localTaxExemptStatusTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "TaxExemptStatus"));

            elementList.add(localTaxExemptStatus == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localTaxExemptStatus));
        }
        if (localTotalInvoiceBalanceTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "TotalInvoiceBalance"));

            elementList.add(localTotalInvoiceBalance == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localTotalInvoiceBalance));
        }
        if (localUpdatedByIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "UpdatedById"));

            elementList.add(localUpdatedById == null ? null : localUpdatedById);
        }
        if (localUpdatedDateTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "UpdatedDate"));

            elementList.add(localUpdatedDate == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localUpdatedDate));
        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
                qName, elementList.toArray(), attribList.toArray());

    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {

        /**
         * static method to create the object Precondition: If this object is an
         * element, the current or next start element starts this object and any
         * intervening reader events are ignorable If this object is not an
         * element, it is a complex type and the reader is at the event just
         * after the outer start element Postcondition: If this object is an
         * element, the reader is positioned at its end element If this object
         * is a complex type, the reader is positioned at the end element of its
         * outer element
         */
        public static Account parse(javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            Account object = new Account();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";
            try {

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.getAttributeValue(
                        "http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader
                            .getAttributeValue(
                                    "http://www.w3.org/2001/XMLSchema-instance",
                                    "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }
                        nsPrefix = nsPrefix == null ? "" : nsPrefix;

                        java.lang.String type = fullTypeName
                                .substring(fullTypeName.indexOf(":") + 1);

                        if (!"Account".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader
                                    .getNamespaceContext().getNamespaceURI(
                                            nsPrefix);
                            return (Account) com.zuora.api.object.ExtensionMapper
                                    .getTypeObject(nsUri, type, reader);
                        }

                    }

                }

                // Note all attributes that were handled. Used to differ normal
                // attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list1 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "fieldsToNull")
                        .equals(reader.getName())) {

                    // Process the array and step past its final element's end.

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        list1.add(null);

                        reader.next();
                    } else {
                        list1.add(reader.getElementText());
                    }
                    // loop until we find a start element that is not part of
                    // this array
                    boolean loopDone1 = false;
                    while (!loopDone1) {
                        // Ensure we are at the EndElement
                        while (!reader.isEndElement()) {
                            reader.next();
                        }
                        // Step out of this element
                        reader.next();
                        // Step to next element event.
                        while (!reader.isStartElement()
                                && !reader.isEndElement())
                            reader.next();
                        if (reader.isEndElement()) {
                            // two continuous end elements means we are exiting
                            // the xml structure
                            loopDone1 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                    "http://object.api.zuora.com/",
                                    "fieldsToNull").equals(reader.getName())) {

                                nillableValue = reader
                                        .getAttributeValue(
                                                "http://www.w3.org/2001/XMLSchema-instance",
                                                "nil");
                                if ("true".equals(nillableValue)
                                        || "1".equals(nillableValue)) {
                                    list1.add(null);

                                    reader.next();
                                } else {
                                    list1.add(reader.getElementText());
                                }
                            } else {
                                loopDone1 = true;
                            }
                        }
                    }
                    // call the converter utility to convert and set the array

                    object.setFieldsToNull((java.lang.String[]) list1
                            .toArray(new java.lang.String[list1.size()]));

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "Id")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setId(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setId(com.zuora.api.ID.Factory.parse(reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "AccountNumber")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setAccountNumber(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "AdditionalEmailAddresses").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setAdditionalEmailAddresses(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "AllowInvoiceEdit").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setAllowInvoiceEdit(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToBoolean(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "AgencyCode__c").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setAgencyCode(content);

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "AutoPay")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setAutoPay(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToBoolean(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "Balance")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setBalance(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToDecimal(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "Batch")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setBatch(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "BcdSettingOption").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setBcdSettingOption(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "BillCycleDay")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "BillCycleDay"
                                        + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setBillCycleDay(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToInt(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                    object.setBillCycleDay(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "BillToId")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setBillToId(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setBillToId(com.zuora.api.ID.Factory
                                .parse(reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "CommunicationProfileId").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setCommunicationProfileId(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setCommunicationProfileId(com.zuora.api.ID.Factory
                                .parse(reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "CreatedById")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setCreatedById(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setCreatedById(com.zuora.api.ID.Factory
                                .parse(reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "CreatedDate")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setCreatedDate(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToDateTime(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "CreditBalance")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setCreditBalance(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToDecimal(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();


                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "CrmId")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setCrmId(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "Currency")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setCurrency(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "CustomerServiceRepName").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setCustomerServiceRepName(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "DefaultPaymentMethodId").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setDefaultPaymentMethodId(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setDefaultPaymentMethodId(com.zuora.api.ID.Factory
                                .parse(reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "DisableWebManagement__c").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setDisableWebManagement(content);

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "Enrollment__c").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setEnrollment(content);

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "InvoiceDeliveryPrefsEmail").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setInvoiceDeliveryPrefsEmail(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToBoolean(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "InvoiceDeliveryPrefsPrint").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setInvoiceDeliveryPrefsPrint(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToBoolean(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "InvoiceTemplateId").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setInvoiceTemplateId(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setInvoiceTemplateId(com.zuora.api.ID.Factory
                                .parse(reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "LastInvoiceDate").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setLastInvoiceDate(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToDateTime(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();
                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "Name")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setName(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "Notes")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setNotes(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "ParentId")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setParentId(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setParentId(com.zuora.api.ID.Factory
                                .parse(reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "PaymentGateway").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setPaymentGateway(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "PaymentTerm")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setPaymentTerm(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "PurchaseOrderNumber").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setPurchaseOrderNumber(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();
                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "SalesRepName")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setSalesRepName(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }



                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();
                System.out.println("is enrollment?: "+ reader.getName());
                if (reader.isStartElement() && new javax.xml.namespace.QName("http://object.api.zuora.com/","Enrollment__c").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setEnrollment(content);

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();
                System.out.println("is enrollment?: " + reader.getName());
                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "SoldToId")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setSoldToId(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setSoldToId(com.zuora.api.ID.Factory
                                .parse(reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();
                System.out.println("is enrollment?: " + reader.getName());
                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "Status")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setStatus(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();
                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "TaxExemptCertificateID").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setTaxExemptCertificateID(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();
                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "TaxExemptCertificateType").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setTaxExemptCertificateType(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();
                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "TaxExemptDescription")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setTaxExemptDescription(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();
                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "TaxExemptEffectiveDate").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setTaxExemptEffectiveDate(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToDateTime(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();
                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "TaxExemptExpirationDate").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setTaxExemptExpirationDate(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToDateTime(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();
                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "TaxExemptIssuingJurisdiction").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setTaxExemptIssuingJurisdiction(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();
                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "TaxExemptStatus").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setTaxExemptStatus(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();
                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "TotalInvoiceBalance").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setTotalInvoiceBalance(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToDecimal(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();
                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "UpdatedById")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setUpdatedById(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setUpdatedById(com.zuora.api.ID.Factory
                                .parse(reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();
                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "UpdatedDate")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setUpdatedDate(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToDateTime(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();
                System.out.println("is enrollment?: " + reader.getName());

                if (reader.isStartElement())
                    // A start element we are not expecting indicates a trailing
                    // invalid property
                    throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());

            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

    }// end of factory class

}
