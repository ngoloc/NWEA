/**
 * PaymentMethod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.zuora.api.object;

/**
 * PaymentMethod bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class PaymentMethod extends com.zuora.api.object.ZObject implements
        org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name =
	 * PaymentMethod Namespace URI = http://object.api.zuora.com/ Namespace
	 * Prefix = ns2
	 */

    /**
     * field for AccountId
     */

    protected com.zuora.api.ID localAccountId;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localAccountIdTracker = false;

    public boolean isAccountIdSpecified() {
        return localAccountIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ID
     */
    public com.zuora.api.ID getAccountId() {
        return localAccountId;
    }

    /**
     * Auto generated setter method
     *
     * @param param AccountId
     */
    public void setAccountId(com.zuora.api.ID param) {
        localAccountIdTracker = true;

        this.localAccountId = param;

    }

    /**
     * field for AchAbaCode
     */

    protected java.lang.String localAchAbaCode;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localAchAbaCodeTracker = false;

    public boolean isAchAbaCodeSpecified() {
        return localAchAbaCodeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAchAbaCode() {
        return localAchAbaCode;
    }

    /**
     * Auto generated setter method
     *
     * @param param AchAbaCode
     */
    public void setAchAbaCode(java.lang.String param) {
        localAchAbaCodeTracker = true;

        this.localAchAbaCode = param;

    }

    /**
     * field for AchAccountName
     */

    protected java.lang.String localAchAccountName;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localAchAccountNameTracker = false;

    public boolean isAchAccountNameSpecified() {
        return localAchAccountNameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAchAccountName() {
        return localAchAccountName;
    }

    /**
     * Auto generated setter method
     *
     * @param param AchAccountName
     */
    public void setAchAccountName(java.lang.String param) {
        localAchAccountNameTracker = true;

        this.localAchAccountName = param;

    }

    /**
     * field for AchAccountNumber
     */

    protected java.lang.String localAchAccountNumber;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localAchAccountNumberTracker = false;

    public boolean isAchAccountNumberSpecified() {
        return localAchAccountNumberTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAchAccountNumber() {
        return localAchAccountNumber;
    }

    /**
     * Auto generated setter method
     *
     * @param param AchAccountNumber
     */
    public void setAchAccountNumber(java.lang.String param) {
        localAchAccountNumberTracker = true;

        this.localAchAccountNumber = param;

    }

    /**
     * field for AchAccountNumberMask
     */

    protected java.lang.String localAchAccountNumberMask;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localAchAccountNumberMaskTracker = false;

    public boolean isAchAccountNumberMaskSpecified() {
        return localAchAccountNumberMaskTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAchAccountNumberMask() {
        return localAchAccountNumberMask;
    }

    /**
     * Auto generated setter method
     *
     * @param param AchAccountNumberMask
     */
    public void setAchAccountNumberMask(java.lang.String param) {
        localAchAccountNumberMaskTracker = true;

        this.localAchAccountNumberMask = param;

    }

    /**
     * field for AchAccountType
     */

    protected java.lang.String localAchAccountType;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localAchAccountTypeTracker = false;

    public boolean isAchAccountTypeSpecified() {
        return localAchAccountTypeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAchAccountType() {
        return localAchAccountType;
    }

    /**
     * Auto generated setter method
     *
     * @param param AchAccountType
     */
    public void setAchAccountType(java.lang.String param) {
        localAchAccountTypeTracker = true;

        this.localAchAccountType = param;

    }

    /**
     * field for AchBankName
     */

    protected java.lang.String localAchBankName;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localAchBankNameTracker = false;

    public boolean isAchBankNameSpecified() {
        return localAchBankNameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAchBankName() {
        return localAchBankName;
    }

    /**
     * Auto generated setter method
     *
     * @param param AchBankName
     */
    public void setAchBankName(java.lang.String param) {
        localAchBankNameTracker = true;

        this.localAchBankName = param;

    }

    /**
     * field for Active
     */

    protected boolean localActive;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localActiveTracker = false;

    public boolean isActiveSpecified() {
        return localActiveTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getActive() {
        return localActive;
    }

    /**
     * Auto generated setter method
     *
     * @param param Active
     */
    public void setActive(boolean param) {
        localActiveTracker = true;

        this.localActive = param;

    }

    /**
     * field for BankIdentificationNumber
     */

    protected java.lang.String localBankIdentificationNumber;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localBankIdentificationNumberTracker = false;

    public boolean isBankIdentificationNumberSpecified() {
        return localBankIdentificationNumberTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getBankIdentificationNumber() {
        return localBankIdentificationNumber;
    }

    /**
     * Auto generated setter method
     *
     * @param param BankIdentificationNumber
     */
    public void setBankIdentificationNumber(java.lang.String param) {
        localBankIdentificationNumberTracker = true;

        this.localBankIdentificationNumber = param;

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
     * field for CreditCardAddress1
     */

    protected java.lang.String localCreditCardAddress1;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localCreditCardAddress1Tracker = false;

    public boolean isCreditCardAddress1Specified() {
        return localCreditCardAddress1Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCreditCardAddress1() {
        return localCreditCardAddress1;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreditCardAddress1
     */
    public void setCreditCardAddress1(java.lang.String param) {
        localCreditCardAddress1Tracker = true;

        this.localCreditCardAddress1 = param;

    }

    /**
     * field for CreditCardAddress2
     */

    protected java.lang.String localCreditCardAddress2;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localCreditCardAddress2Tracker = false;

    public boolean isCreditCardAddress2Specified() {
        return localCreditCardAddress2Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCreditCardAddress2() {
        return localCreditCardAddress2;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreditCardAddress2
     */
    public void setCreditCardAddress2(java.lang.String param) {
        localCreditCardAddress2Tracker = true;

        this.localCreditCardAddress2 = param;

    }

    /**
     * field for CreditCardCity
     */

    protected java.lang.String localCreditCardCity;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localCreditCardCityTracker = false;

    public boolean isCreditCardCitySpecified() {
        return localCreditCardCityTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCreditCardCity() {
        return localCreditCardCity;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreditCardCity
     */
    public void setCreditCardCity(java.lang.String param) {
        localCreditCardCityTracker = true;

        this.localCreditCardCity = param;

    }

    /**
     * field for CreditCardCountry
     */

    protected java.lang.String localCreditCardCountry;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localCreditCardCountryTracker = false;

    public boolean isCreditCardCountrySpecified() {
        return localCreditCardCountryTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCreditCardCountry() {
        return localCreditCardCountry;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreditCardCountry
     */
    public void setCreditCardCountry(java.lang.String param) {
        localCreditCardCountryTracker = true;

        this.localCreditCardCountry = param;

    }

    /**
     * field for CreditCardExpirationMonth
     */

    protected int localCreditCardExpirationMonth;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localCreditCardExpirationMonthTracker = false;

    public boolean isCreditCardExpirationMonthSpecified() {
        return localCreditCardExpirationMonthTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getCreditCardExpirationMonth() {
        return localCreditCardExpirationMonth;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreditCardExpirationMonth
     */
    public void setCreditCardExpirationMonth(int param) {
        localCreditCardExpirationMonthTracker = true;

        this.localCreditCardExpirationMonth = param;

    }

    /**
     * field for CreditCardExpirationYear
     */

    protected int localCreditCardExpirationYear;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localCreditCardExpirationYearTracker = false;

    public boolean isCreditCardExpirationYearSpecified() {
        return localCreditCardExpirationYearTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getCreditCardExpirationYear() {
        return localCreditCardExpirationYear;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreditCardExpirationYear
     */
    public void setCreditCardExpirationYear(int param) {
        localCreditCardExpirationYearTracker = true;

        this.localCreditCardExpirationYear = param;

    }

    /**
     * field for CreditCardHolderName
     */

    protected java.lang.String localCreditCardHolderName;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localCreditCardHolderNameTracker = false;

    public boolean isCreditCardHolderNameSpecified() {
        return localCreditCardHolderNameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCreditCardHolderName() {
        return localCreditCardHolderName;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreditCardHolderName
     */
    public void setCreditCardHolderName(java.lang.String param) {
        localCreditCardHolderNameTracker = true;

        this.localCreditCardHolderName = param;

    }

    /**
     * field for CreditCardMaskNumber
     */

    protected java.lang.String localCreditCardMaskNumber;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localCreditCardMaskNumberTracker = false;

    public boolean isCreditCardMaskNumberSpecified() {
        return localCreditCardMaskNumberTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCreditCardMaskNumber() {
        return localCreditCardMaskNumber;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreditCardMaskNumber
     */
    public void setCreditCardMaskNumber(java.lang.String param) {
        localCreditCardMaskNumberTracker = true;

        this.localCreditCardMaskNumber = param;

    }

    /**
     * field for CreditCardNumber
     */

    protected java.lang.String localCreditCardNumber;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localCreditCardNumberTracker = false;

    public boolean isCreditCardNumberSpecified() {
        return localCreditCardNumberTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCreditCardNumber() {
        return localCreditCardNumber;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreditCardNumber
     */
    public void setCreditCardNumber(java.lang.String param) {
        localCreditCardNumberTracker = true;

        this.localCreditCardNumber = param;

    }

    /**
     * field for CreditCardPostalCode
     */

    protected java.lang.String localCreditCardPostalCode;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localCreditCardPostalCodeTracker = false;

    public boolean isCreditCardPostalCodeSpecified() {
        return localCreditCardPostalCodeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCreditCardPostalCode() {
        return localCreditCardPostalCode;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreditCardPostalCode
     */
    public void setCreditCardPostalCode(java.lang.String param) {
        localCreditCardPostalCodeTracker = true;

        this.localCreditCardPostalCode = param;

    }

    /**
     * field for CreditCardSecurityCode
     */

    protected java.lang.String localCreditCardSecurityCode;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localCreditCardSecurityCodeTracker = false;

    public boolean isCreditCardSecurityCodeSpecified() {
        return localCreditCardSecurityCodeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCreditCardSecurityCode() {
        return localCreditCardSecurityCode;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreditCardSecurityCode
     */
    public void setCreditCardSecurityCode(java.lang.String param) {
        localCreditCardSecurityCodeTracker = true;

        this.localCreditCardSecurityCode = param;

    }

    /**
     * field for CreditCardState
     */

    protected java.lang.String localCreditCardState;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localCreditCardStateTracker = false;

    public boolean isCreditCardStateSpecified() {
        return localCreditCardStateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCreditCardState() {
        return localCreditCardState;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreditCardState
     */
    public void setCreditCardState(java.lang.String param) {
        localCreditCardStateTracker = true;

        this.localCreditCardState = param;

    }

    /**
     * field for CreditCardType
     */

    protected java.lang.String localCreditCardType;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localCreditCardTypeTracker = false;

    public boolean isCreditCardTypeSpecified() {
        return localCreditCardTypeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCreditCardType() {
        return localCreditCardType;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreditCardType
     */
    public void setCreditCardType(java.lang.String param) {
        localCreditCardTypeTracker = true;

        this.localCreditCardType = param;

    }

    /**
     * field for DeviceSessionId
     */

    protected java.lang.String localDeviceSessionId;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localDeviceSessionIdTracker = false;

    public boolean isDeviceSessionIdSpecified() {
        return localDeviceSessionIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDeviceSessionId() {
        return localDeviceSessionId;
    }

    /**
     * Auto generated setter method
     *
     * @param param DeviceSessionId
     */
    public void setDeviceSessionId(java.lang.String param) {
        localDeviceSessionIdTracker = true;

        this.localDeviceSessionId = param;

    }

    /**
     * field for Email
     */

    protected java.lang.String localEmail;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localEmailTracker = false;

    public boolean isEmailSpecified() {
        return localEmailTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEmail() {
        return localEmail;
    }

    /**
     * Auto generated setter method
     *
     * @param param Email
     */
    public void setEmail(java.lang.String param) {
        localEmailTracker = true;

        this.localEmail = param;

    }

    /**
     * field for GatewayOptionData
     */

    protected com.zuora.api.GatewayOptionData localGatewayOptionData;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localGatewayOptionDataTracker = false;

    public boolean isGatewayOptionDataSpecified() {
        return localGatewayOptionDataTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.GatewayOptionData
     */
    public com.zuora.api.GatewayOptionData getGatewayOptionData() {
        return localGatewayOptionData;
    }

    /**
     * Auto generated setter method
     *
     * @param param GatewayOptionData
     */
    public void setGatewayOptionData(com.zuora.api.GatewayOptionData param) {
        localGatewayOptionDataTracker = true;

        this.localGatewayOptionData = param;

    }

    /**
     * field for IPAddress
     */

    protected java.lang.String localIPAddress;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localIPAddressTracker = false;

    public boolean isIPAddressSpecified() {
        return localIPAddressTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getIPAddress() {
        return localIPAddress;
    }

    /**
     * Auto generated setter method
     *
     * @param param IPAddress
     */
    public void setIPAddress(java.lang.String param) {
        localIPAddressTracker = true;

        this.localIPAddress = param;

    }

    /**
     * field for LastFailedSaleTransactionDate
     */

    protected java.util.Calendar localLastFailedSaleTransactionDate;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localLastFailedSaleTransactionDateTracker = false;

    public boolean isLastFailedSaleTransactionDateSpecified() {
        return localLastFailedSaleTransactionDateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getLastFailedSaleTransactionDate() {
        return localLastFailedSaleTransactionDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param LastFailedSaleTransactionDate
     */
    public void setLastFailedSaleTransactionDate(java.util.Calendar param) {
        localLastFailedSaleTransactionDateTracker = true;

        this.localLastFailedSaleTransactionDate = param;

    }

    /**
     * field for LastTransactionDateTime
     */

    protected java.util.Calendar localLastTransactionDateTime;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localLastTransactionDateTimeTracker = false;

    public boolean isLastTransactionDateTimeSpecified() {
        return localLastTransactionDateTimeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getLastTransactionDateTime() {
        return localLastTransactionDateTime;
    }

    /**
     * Auto generated setter method
     *
     * @param param LastTransactionDateTime
     */
    public void setLastTransactionDateTime(java.util.Calendar param) {
        localLastTransactionDateTimeTracker = true;

        this.localLastTransactionDateTime = param;

    }

    /**
     * field for LastTransactionStatus
     */

    protected java.lang.String localLastTransactionStatus;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localLastTransactionStatusTracker = false;

    public boolean isLastTransactionStatusSpecified() {
        return localLastTransactionStatusTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getLastTransactionStatus() {
        return localLastTransactionStatus;
    }

    /**
     * Auto generated setter method
     *
     * @param param LastTransactionStatus
     */
    public void setLastTransactionStatus(java.lang.String param) {
        localLastTransactionStatusTracker = true;

        this.localLastTransactionStatus = param;

    }

    /**
     * field for MaxConsecutivePaymentFailures
     */

    protected short localMaxConsecutivePaymentFailures;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localMaxConsecutivePaymentFailuresTracker = false;

    public boolean isMaxConsecutivePaymentFailuresSpecified() {
        return localMaxConsecutivePaymentFailuresTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return short
     */
    public short getMaxConsecutivePaymentFailures() {
        return localMaxConsecutivePaymentFailures;
    }

    /**
     * Auto generated setter method
     *
     * @param param MaxConsecutivePaymentFailures
     */
    public void setMaxConsecutivePaymentFailures(short param) {
        localMaxConsecutivePaymentFailuresTracker = true;

        this.localMaxConsecutivePaymentFailures = param;

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
     * field for NumConsecutiveFailures
     */

    protected int localNumConsecutiveFailures;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localNumConsecutiveFailuresTracker = false;

    public boolean isNumConsecutiveFailuresSpecified() {
        return localNumConsecutiveFailuresTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getNumConsecutiveFailures() {
        return localNumConsecutiveFailures;
    }

    /**
     * Auto generated setter method
     *
     * @param param NumConsecutiveFailures
     */
    public void setNumConsecutiveFailures(int param) {
        localNumConsecutiveFailuresTracker = true;

        this.localNumConsecutiveFailures = param;

    }

    /**
     * field for PaymentMethodStatus
     */

    protected java.lang.String localPaymentMethodStatus;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localPaymentMethodStatusTracker = false;

    public boolean isPaymentMethodStatusSpecified() {
        return localPaymentMethodStatusTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getPaymentMethodStatus() {
        return localPaymentMethodStatus;
    }

    /**
     * Auto generated setter method
     *
     * @param param PaymentMethodStatus
     */
    public void setPaymentMethodStatus(java.lang.String param) {
        localPaymentMethodStatusTracker = true;

        this.localPaymentMethodStatus = param;

    }

    /**
     * field for PaymentRetryWindow
     */

    protected short localPaymentRetryWindow;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localPaymentRetryWindowTracker = false;

    public boolean isPaymentRetryWindowSpecified() {
        return localPaymentRetryWindowTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return short
     */
    public short getPaymentRetryWindow() {
        return localPaymentRetryWindow;
    }

    /**
     * Auto generated setter method
     *
     * @param param PaymentRetryWindow
     */
    public void setPaymentRetryWindow(short param) {
        localPaymentRetryWindowTracker = true;

        this.localPaymentRetryWindow = param;

    }

    /**
     * field for PaypalBaid
     */

    protected java.lang.String localPaypalBaid;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localPaypalBaidTracker = false;

    public boolean isPaypalBaidSpecified() {
        return localPaypalBaidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getPaypalBaid() {
        return localPaypalBaid;
    }

    /**
     * Auto generated setter method
     *
     * @param param PaypalBaid
     */
    public void setPaypalBaid(java.lang.String param) {
        localPaypalBaidTracker = true;

        this.localPaypalBaid = param;

    }

    /**
     * field for PaypalEmail
     */

    protected java.lang.String localPaypalEmail;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localPaypalEmailTracker = false;

    public boolean isPaypalEmailSpecified() {
        return localPaypalEmailTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getPaypalEmail() {
        return localPaypalEmail;
    }

    /**
     * Auto generated setter method
     *
     * @param param PaypalEmail
     */
    public void setPaypalEmail(java.lang.String param) {
        localPaypalEmailTracker = true;

        this.localPaypalEmail = param;

    }

    /**
     * field for PaypalPreapprovalKey
     */

    protected java.lang.String localPaypalPreapprovalKey;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localPaypalPreapprovalKeyTracker = false;

    public boolean isPaypalPreapprovalKeySpecified() {
        return localPaypalPreapprovalKeyTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getPaypalPreapprovalKey() {
        return localPaypalPreapprovalKey;
    }

    /**
     * Auto generated setter method
     *
     * @param param PaypalPreapprovalKey
     */
    public void setPaypalPreapprovalKey(java.lang.String param) {
        localPaypalPreapprovalKeyTracker = true;

        this.localPaypalPreapprovalKey = param;

    }

    /**
     * field for PaypalType
     */

    protected java.lang.String localPaypalType;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localPaypalTypeTracker = false;

    public boolean isPaypalTypeSpecified() {
        return localPaypalTypeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getPaypalType() {
        return localPaypalType;
    }

    /**
     * Auto generated setter method
     *
     * @param param PaypalType
     */
    public void setPaypalType(java.lang.String param) {
        localPaypalTypeTracker = true;

        this.localPaypalType = param;

    }

    /**
     * field for Phone
     */

    protected java.lang.String localPhone;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localPhoneTracker = false;

    public boolean isPhoneSpecified() {
        return localPhoneTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getPhone() {
        return localPhone;
    }

    /**
     * Auto generated setter method
     *
     * @param param Phone
     */
    public void setPhone(java.lang.String param) {
        localPhoneTracker = true;

        this.localPhone = param;

    }

    /**
     * field for SkipValidation
     */

    protected boolean localSkipValidation;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localSkipValidationTracker = false;

    public boolean isSkipValidationSpecified() {
        return localSkipValidationTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getSkipValidation() {
        return localSkipValidation;
    }

    /**
     * Auto generated setter method
     *
     * @param param SkipValidation
     */
    public void setSkipValidation(boolean param) {
        localSkipValidationTracker = true;

        this.localSkipValidation = param;

    }

    /**
     * field for TotalNumberOfErrorPayments
     */

    protected int localTotalNumberOfErrorPayments;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localTotalNumberOfErrorPaymentsTracker = false;

    public boolean isTotalNumberOfErrorPaymentsSpecified() {
        return localTotalNumberOfErrorPaymentsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getTotalNumberOfErrorPayments() {
        return localTotalNumberOfErrorPayments;
    }

    /**
     * Auto generated setter method
     *
     * @param param TotalNumberOfErrorPayments
     */
    public void setTotalNumberOfErrorPayments(int param) {
        localTotalNumberOfErrorPaymentsTracker = true;

        this.localTotalNumberOfErrorPayments = param;

    }

    /**
     * field for TotalNumberOfProcessedPayments
     */

    protected int localTotalNumberOfProcessedPayments;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localTotalNumberOfProcessedPaymentsTracker = false;

    public boolean isTotalNumberOfProcessedPaymentsSpecified() {
        return localTotalNumberOfProcessedPaymentsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getTotalNumberOfProcessedPayments() {
        return localTotalNumberOfProcessedPayments;
    }

    /**
     * Auto generated setter method
     *
     * @param param TotalNumberOfProcessedPayments
     */
    public void setTotalNumberOfProcessedPayments(int param) {
        localTotalNumberOfProcessedPaymentsTracker = true;

        this.localTotalNumberOfProcessedPayments = param;

    }

    /**
     * field for Type
     */

    protected java.lang.String localType;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localTypeTracker = false;

    public boolean isTypeSpecified() {
        return localTypeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getType() {
        return localType;
    }

    /**
     * Auto generated setter method
     *
     * @param param Type
     */
    public void setType(java.lang.String param) {
        localTypeTracker = true;

        this.localType = param;

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
     * field for UseDefaultRetryRule
     */

    protected boolean localUseDefaultRetryRule;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localUseDefaultRetryRuleTracker = false;

    public boolean isUseDefaultRetryRuleSpecified() {
        return localUseDefaultRetryRuleTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getUseDefaultRetryRule() {
        return localUseDefaultRetryRule;
    }

    /**
     * Auto generated setter method
     *
     * @param param UseDefaultRetryRule
     */
    public void setUseDefaultRetryRule(boolean param) {
        localUseDefaultRetryRuleTracker = true;

        this.localUseDefaultRetryRule = param;

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
                    "type", namespacePrefix + ":PaymentMethod", xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                    "type", "PaymentMethod", xmlWriter);
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
        if (localAccountIdTracker) {
            if (localAccountId == null) {

                writeStartElement(null, "http://object.api.zuora.com/",
                        "AccountId", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localAccountId
                        .serialize(new javax.xml.namespace.QName(
                                "http://object.api.zuora.com/", "AccountId"),
                                xmlWriter);
            }
        }
        if (localAchAbaCodeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "AchAbaCode", xmlWriter);

            if (localAchAbaCode == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localAchAbaCode);

            }

            xmlWriter.writeEndElement();
        }
        if (localAchAccountNameTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "AchAccountName", xmlWriter);

            if (localAchAccountName == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localAchAccountName);

            }

            xmlWriter.writeEndElement();
        }
        if (localAchAccountNumberTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "AchAccountNumber", xmlWriter);

            if (localAchAccountNumber == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localAchAccountNumber);

            }

            xmlWriter.writeEndElement();
        }
        if (localAchAccountNumberMaskTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "AchAccountNumberMask",
                    xmlWriter);

            if (localAchAccountNumberMask == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localAchAccountNumberMask);

            }

            xmlWriter.writeEndElement();
        }
        if (localAchAccountTypeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "AchAccountType", xmlWriter);

            if (localAchAccountType == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localAchAccountType);

            }

            xmlWriter.writeEndElement();
        }
        if (localAchBankNameTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "AchBankName", xmlWriter);

            if (localAchBankName == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localAchBankName);

            }

            xmlWriter.writeEndElement();
        }
        if (localActiveTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "Active", xmlWriter);

            if (false) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localActive));
            }

            xmlWriter.writeEndElement();
        }
        if (localBankIdentificationNumberTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "BankIdentificationNumber",
                    xmlWriter);

            if (localBankIdentificationNumber == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localBankIdentificationNumber);

            }

            xmlWriter.writeEndElement();
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
        if (localCreditCardAddress1Tracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "CreditCardAddress1", xmlWriter);

            if (localCreditCardAddress1 == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localCreditCardAddress1);

            }

            xmlWriter.writeEndElement();
        }
        if (localCreditCardAddress2Tracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "CreditCardAddress2", xmlWriter);

            if (localCreditCardAddress2 == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localCreditCardAddress2);

            }

            xmlWriter.writeEndElement();
        }
        if (localCreditCardCityTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "CreditCardCity", xmlWriter);

            if (localCreditCardCity == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localCreditCardCity);

            }

            xmlWriter.writeEndElement();
        }
        if (localCreditCardCountryTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "CreditCardCountry", xmlWriter);

            if (localCreditCardCountry == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localCreditCardCountry);

            }

            xmlWriter.writeEndElement();
        }
        if (localCreditCardExpirationMonthTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "CreditCardExpirationMonth",
                    xmlWriter);

            if (localCreditCardExpirationMonth == java.lang.Integer.MIN_VALUE) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localCreditCardExpirationMonth));
            }

            xmlWriter.writeEndElement();
        }
        if (localCreditCardExpirationYearTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "CreditCardExpirationYear",
                    xmlWriter);

            if (localCreditCardExpirationYear == java.lang.Integer.MIN_VALUE) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localCreditCardExpirationYear));
            }

            xmlWriter.writeEndElement();
        }
        if (localCreditCardHolderNameTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "CreditCardHolderName",
                    xmlWriter);

            if (localCreditCardHolderName == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localCreditCardHolderName);

            }

            xmlWriter.writeEndElement();
        }
        if (localCreditCardMaskNumberTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "CreditCardMaskNumber",
                    xmlWriter);

            if (localCreditCardMaskNumber == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localCreditCardMaskNumber);

            }

            xmlWriter.writeEndElement();
        }
        if (localCreditCardNumberTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "CreditCardNumber", xmlWriter);

            if (localCreditCardNumber == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localCreditCardNumber);

            }

            xmlWriter.writeEndElement();
        }
        if (localCreditCardPostalCodeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "CreditCardPostalCode",
                    xmlWriter);

            if (localCreditCardPostalCode == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localCreditCardPostalCode);

            }

            xmlWriter.writeEndElement();
        }
        if (localCreditCardSecurityCodeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "CreditCardSecurityCode",
                    xmlWriter);

            if (localCreditCardSecurityCode == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localCreditCardSecurityCode);

            }

            xmlWriter.writeEndElement();
        }
        if (localCreditCardStateTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "CreditCardState", xmlWriter);

            if (localCreditCardState == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localCreditCardState);

            }

            xmlWriter.writeEndElement();
        }
        if (localCreditCardTypeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "CreditCardType", xmlWriter);

            if (localCreditCardType == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localCreditCardType);

            }

            xmlWriter.writeEndElement();
        }
        if (localDeviceSessionIdTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "DeviceSessionId", xmlWriter);

            if (localDeviceSessionId == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localDeviceSessionId);

            }

            xmlWriter.writeEndElement();
        }
        if (localEmailTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "Email", xmlWriter);

            if (localEmail == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localEmail);

            }

            xmlWriter.writeEndElement();
        }
        if (localGatewayOptionDataTracker) {
            if (localGatewayOptionData == null) {

                writeStartElement(null, "http://object.api.zuora.com/",
                        "GatewayOptionData", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localGatewayOptionData.serialize(new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "GatewayOptionData"),
                        xmlWriter);
            }
        }
        if (localIPAddressTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "IPAddress", xmlWriter);

            if (localIPAddress == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localIPAddress);

            }

            xmlWriter.writeEndElement();
        }
        if (localLastFailedSaleTransactionDateTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "LastFailedSaleTransactionDate",
                    xmlWriter);

            if (localLastFailedSaleTransactionDate == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localLastFailedSaleTransactionDate));

            }

            xmlWriter.writeEndElement();
        }
        if (localLastTransactionDateTimeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "LastTransactionDateTime",
                    xmlWriter);

            if (localLastTransactionDateTime == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localLastTransactionDateTime));

            }

            xmlWriter.writeEndElement();
        }
        if (localLastTransactionStatusTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "LastTransactionStatus",
                    xmlWriter);

            if (localLastTransactionStatus == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localLastTransactionStatus);

            }

            xmlWriter.writeEndElement();
        }
        if (localMaxConsecutivePaymentFailuresTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "MaxConsecutivePaymentFailures",
                    xmlWriter);

            if (localMaxConsecutivePaymentFailures == java.lang.Short.MIN_VALUE) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localMaxConsecutivePaymentFailures));
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
        if (localNumConsecutiveFailuresTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "NumConsecutiveFailures",
                    xmlWriter);

            if (localNumConsecutiveFailures == java.lang.Integer.MIN_VALUE) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localNumConsecutiveFailures));
            }

            xmlWriter.writeEndElement();
        }
        if (localPaymentMethodStatusTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "PaymentMethodStatus", xmlWriter);

            if (localPaymentMethodStatus == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localPaymentMethodStatus);

            }

            xmlWriter.writeEndElement();
        }
        if (localPaymentRetryWindowTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "PaymentRetryWindow", xmlWriter);

            if (localPaymentRetryWindow == java.lang.Short.MIN_VALUE) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localPaymentRetryWindow));
            }

            xmlWriter.writeEndElement();
        }
        if (localPaypalBaidTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "PaypalBaid", xmlWriter);

            if (localPaypalBaid == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localPaypalBaid);

            }

            xmlWriter.writeEndElement();
        }
        if (localPaypalEmailTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "PaypalEmail", xmlWriter);

            if (localPaypalEmail == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localPaypalEmail);

            }

            xmlWriter.writeEndElement();
        }
        if (localPaypalPreapprovalKeyTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "PaypalPreapprovalKey",
                    xmlWriter);

            if (localPaypalPreapprovalKey == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localPaypalPreapprovalKey);

            }

            xmlWriter.writeEndElement();
        }
        if (localPaypalTypeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "PaypalType", xmlWriter);

            if (localPaypalType == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localPaypalType);

            }

            xmlWriter.writeEndElement();
        }
        if (localPhoneTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "Phone", xmlWriter);

            if (localPhone == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localPhone);

            }

            xmlWriter.writeEndElement();
        }
        if (localSkipValidationTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "SkipValidation", xmlWriter);

            if (false) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localSkipValidation));
            }

            xmlWriter.writeEndElement();
        }
        if (localTotalNumberOfErrorPaymentsTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "TotalNumberOfErrorPayments",
                    xmlWriter);

            if (localTotalNumberOfErrorPayments == java.lang.Integer.MIN_VALUE) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localTotalNumberOfErrorPayments));
            }

            xmlWriter.writeEndElement();
        }
        if (localTotalNumberOfProcessedPaymentsTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace,
                    "TotalNumberOfProcessedPayments", xmlWriter);

            if (localTotalNumberOfProcessedPayments == java.lang.Integer.MIN_VALUE) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localTotalNumberOfProcessedPayments));
            }

            xmlWriter.writeEndElement();
        }
        if (localTypeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "Type", xmlWriter);

            if (localType == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localType);

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
        if (localUseDefaultRetryRuleTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "UseDefaultRetryRule", xmlWriter);

            if (false) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localUseDefaultRetryRule));
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
                "http://object.api.zuora.com/", "PaymentMethod"));
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
        if (localAccountIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "AccountId"));

            elementList.add(localAccountId == null ? null : localAccountId);
        }
        if (localAchAbaCodeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "AchAbaCode"));

            elementList.add(localAchAbaCode == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localAchAbaCode));
        }
        if (localAchAccountNameTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "AchAccountName"));

            elementList.add(localAchAccountName == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localAchAccountName));
        }
        if (localAchAccountNumberTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "AchAccountNumber"));

            elementList.add(localAchAccountNumber == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localAchAccountNumber));
        }
        if (localAchAccountNumberMaskTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "AchAccountNumberMask"));

            elementList.add(localAchAccountNumberMask == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localAchAccountNumberMask));
        }
        if (localAchAccountTypeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "AchAccountType"));

            elementList.add(localAchAccountType == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localAchAccountType));
        }
        if (localAchBankNameTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "AchBankName"));

            elementList.add(localAchBankName == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localAchBankName));
        }
        if (localActiveTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Active"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localActive));
        }
        if (localBankIdentificationNumberTracker) {
            elementList
                    .add(new javax.xml.namespace.QName(
                            "http://object.api.zuora.com/",
                            "BankIdentificationNumber"));

            elementList.add(localBankIdentificationNumber == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localBankIdentificationNumber));
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
        if (localCreditCardAddress1Tracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "CreditCardAddress1"));

            elementList.add(localCreditCardAddress1 == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCreditCardAddress1));
        }
        if (localCreditCardAddress2Tracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "CreditCardAddress2"));

            elementList.add(localCreditCardAddress2 == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCreditCardAddress2));
        }
        if (localCreditCardCityTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "CreditCardCity"));

            elementList.add(localCreditCardCity == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCreditCardCity));
        }
        if (localCreditCardCountryTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "CreditCardCountry"));

            elementList.add(localCreditCardCountry == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCreditCardCountry));
        }
        if (localCreditCardExpirationMonthTracker) {
            elementList
                    .add(new javax.xml.namespace.QName(
                            "http://object.api.zuora.com/",
                            "CreditCardExpirationMonth"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCreditCardExpirationMonth));
        }
        if (localCreditCardExpirationYearTracker) {
            elementList
                    .add(new javax.xml.namespace.QName(
                            "http://object.api.zuora.com/",
                            "CreditCardExpirationYear"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCreditCardExpirationYear));
        }
        if (localCreditCardHolderNameTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "CreditCardHolderName"));

            elementList.add(localCreditCardHolderName == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCreditCardHolderName));
        }
        if (localCreditCardMaskNumberTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "CreditCardMaskNumber"));

            elementList.add(localCreditCardMaskNumber == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCreditCardMaskNumber));
        }
        if (localCreditCardNumberTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "CreditCardNumber"));

            elementList.add(localCreditCardNumber == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCreditCardNumber));
        }
        if (localCreditCardPostalCodeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "CreditCardPostalCode"));

            elementList.add(localCreditCardPostalCode == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCreditCardPostalCode));
        }
        if (localCreditCardSecurityCodeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "CreditCardSecurityCode"));

            elementList.add(localCreditCardSecurityCode == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCreditCardSecurityCode));
        }
        if (localCreditCardStateTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "CreditCardState"));

            elementList.add(localCreditCardState == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCreditCardState));
        }
        if (localCreditCardTypeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "CreditCardType"));

            elementList.add(localCreditCardType == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCreditCardType));
        }
        if (localDeviceSessionIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "DeviceSessionId"));

            elementList.add(localDeviceSessionId == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localDeviceSessionId));
        }
        if (localEmailTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Email"));

            elementList.add(localEmail == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localEmail));
        }
        if (localGatewayOptionDataTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "GatewayOptionData"));

            elementList.add(localGatewayOptionData == null ? null
                    : localGatewayOptionData);
        }
        if (localIPAddressTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "IPAddress"));

            elementList.add(localIPAddress == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localIPAddress));
        }
        if (localLastFailedSaleTransactionDateTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/",
                    "LastFailedSaleTransactionDate"));

            elementList
                    .add(localLastFailedSaleTransactionDate == null ? null
                            : org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToString(localLastFailedSaleTransactionDate));
        }
        if (localLastTransactionDateTimeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "LastTransactionDateTime"));

            elementList.add(localLastTransactionDateTime == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localLastTransactionDateTime));
        }
        if (localLastTransactionStatusTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "LastTransactionStatus"));

            elementList.add(localLastTransactionStatus == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localLastTransactionStatus));
        }
        if (localMaxConsecutivePaymentFailuresTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/",
                    "MaxConsecutivePaymentFailures"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localMaxConsecutivePaymentFailures));
        }
        if (localNameTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Name"));

            elementList.add(localName == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localName));
        }
        if (localNumConsecutiveFailuresTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "NumConsecutiveFailures"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localNumConsecutiveFailures));
        }
        if (localPaymentMethodStatusTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "PaymentMethodStatus"));

            elementList.add(localPaymentMethodStatus == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localPaymentMethodStatus));
        }
        if (localPaymentRetryWindowTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "PaymentRetryWindow"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localPaymentRetryWindow));
        }
        if (localPaypalBaidTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "PaypalBaid"));

            elementList.add(localPaypalBaid == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localPaypalBaid));
        }
        if (localPaypalEmailTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "PaypalEmail"));

            elementList.add(localPaypalEmail == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localPaypalEmail));
        }
        if (localPaypalPreapprovalKeyTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "PaypalPreapprovalKey"));

            elementList.add(localPaypalPreapprovalKey == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localPaypalPreapprovalKey));
        }
        if (localPaypalTypeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "PaypalType"));

            elementList.add(localPaypalType == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localPaypalType));
        }
        if (localPhoneTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Phone"));

            elementList.add(localPhone == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localPhone));
        }
        if (localSkipValidationTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "SkipValidation"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localSkipValidation));
        }
        if (localTotalNumberOfErrorPaymentsTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/",
                    "TotalNumberOfErrorPayments"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localTotalNumberOfErrorPayments));
        }
        if (localTotalNumberOfProcessedPaymentsTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/",
                    "TotalNumberOfProcessedPayments"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localTotalNumberOfProcessedPayments));
        }
        if (localTypeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Type"));

            elementList.add(localType == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localType));
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
        if (localUseDefaultRetryRuleTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "UseDefaultRetryRule"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localUseDefaultRetryRule));
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
        public static PaymentMethod parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            PaymentMethod object = new PaymentMethod();

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

                        if (!"PaymentMethod".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader
                                    .getNamespaceContext().getNamespaceURI(
                                            nsPrefix);
                            return (PaymentMethod) com.zuora.api.object.ExtensionMapper
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "AccountId")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setAccountId(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setAccountId(com.zuora.api.ID.Factory
                                .parse(reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "AchAbaCode")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setAchAbaCode(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "AchAccountName").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setAchAccountName(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "AchAccountNumber").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setAchAccountNumber(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "AchAccountNumberMask")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setAchAccountNumberMask(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "AchAccountType").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setAchAccountType(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "AchBankName")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setAchBankName(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "Active")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setActive(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "BankIdentificationNumber").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setBankIdentificationNumber(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "CreditCardAddress1").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setCreditCardAddress1(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "CreditCardAddress2").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setCreditCardAddress2(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "CreditCardCity").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setCreditCardCity(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "CreditCardCountry").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setCreditCardCountry(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "CreditCardExpirationMonth").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setCreditCardExpirationMonth(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToInt(content));

                    } else {

                        object.setCreditCardExpirationMonth(java.lang.Integer.MIN_VALUE);

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                    object.setCreditCardExpirationMonth(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "CreditCardExpirationYear").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setCreditCardExpirationYear(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToInt(content));

                    } else {

                        object.setCreditCardExpirationYear(java.lang.Integer.MIN_VALUE);

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                    object.setCreditCardExpirationYear(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "CreditCardHolderName")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setCreditCardHolderName(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "CreditCardMaskNumber")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setCreditCardMaskNumber(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "CreditCardNumber").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setCreditCardNumber(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "CreditCardPostalCode")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setCreditCardPostalCode(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "CreditCardSecurityCode").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setCreditCardSecurityCode(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "CreditCardState").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setCreditCardState(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "CreditCardType").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setCreditCardType(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "DeviceSessionId").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setDeviceSessionId(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "Email")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setEmail(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "GatewayOptionData").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setGatewayOptionData(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setGatewayOptionData(com.zuora.api.GatewayOptionData.Factory
                                .parse(reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "IPAddress")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setIPAddress(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "LastFailedSaleTransactionDate").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setLastFailedSaleTransactionDate(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "LastTransactionDateTime").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setLastTransactionDateTime(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "LastTransactionStatus").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setLastTransactionStatus(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "MaxConsecutivePaymentFailures").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setMaxConsecutivePaymentFailures(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToShort(content));

                    } else {

                        object.setMaxConsecutivePaymentFailures(java.lang.Short.MIN_VALUE);

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                    object.setMaxConsecutivePaymentFailures(java.lang.Short.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "NumConsecutiveFailures").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setNumConsecutiveFailures(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToInt(content));

                    } else {

                        object.setNumConsecutiveFailures(java.lang.Integer.MIN_VALUE);

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                    object.setNumConsecutiveFailures(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "PaymentMethodStatus").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setPaymentMethodStatus(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "PaymentRetryWindow").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setPaymentRetryWindow(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToShort(content));

                    } else {

                        object.setPaymentRetryWindow(java.lang.Short.MIN_VALUE);

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                    object.setPaymentRetryWindow(java.lang.Short.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "PaypalBaid")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setPaypalBaid(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "PaypalEmail")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setPaypalEmail(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "PaypalPreapprovalKey")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setPaypalPreapprovalKey(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "PaypalType")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setPaypalType(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "Phone")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setPhone(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "SkipValidation").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setSkipValidation(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "TotalNumberOfErrorPayments").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setTotalNumberOfErrorPayments(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToInt(content));

                    } else {

                        object.setTotalNumberOfErrorPayments(java.lang.Integer.MIN_VALUE);

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                    object.setTotalNumberOfErrorPayments(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "TotalNumberOfProcessedPayments").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setTotalNumberOfProcessedPayments(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToInt(content));

                    } else {

                        object.setTotalNumberOfProcessedPayments(java.lang.Integer.MIN_VALUE);

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                    object.setTotalNumberOfProcessedPayments(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "Type")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setType(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "UseDefaultRetryRule").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setUseDefaultRetryRule(org.apache.axis2.databinding.utils.ConverterUtil
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
