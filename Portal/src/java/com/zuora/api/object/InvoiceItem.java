/**
 * InvoiceItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.zuora.api.object;

/**
 * InvoiceItem bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class InvoiceItem extends com.zuora.api.object.ZObject implements
        org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name =
	 * InvoiceItem Namespace URI = http://object.api.zuora.com/ Namespace Prefix
	 * = ns2
	 */

    /**
     * field for AccountingCode
     */

    protected java.lang.String localAccountingCode;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAccountingCodeTracker = false;

    public boolean isAccountingCodeSpecified() {
        return localAccountingCodeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAccountingCode() {
        return localAccountingCode;
    }

    /**
     * Auto generated setter method
     *
     * @param param AccountingCode
     */
    public void setAccountingCode(java.lang.String param) {
        localAccountingCodeTracker = true;

        this.localAccountingCode = param;

    }

    /**
     * field for AppliedToInvoiceItemId
     */

    protected com.zuora.api.ID localAppliedToInvoiceItemId;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAppliedToInvoiceItemIdTracker = false;

    public boolean isAppliedToInvoiceItemIdSpecified() {
        return localAppliedToInvoiceItemIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ID
     */
    public com.zuora.api.ID getAppliedToInvoiceItemId() {
        return localAppliedToInvoiceItemId;
    }

    /**
     * Auto generated setter method
     *
     * @param param AppliedToInvoiceItemId
     */
    public void setAppliedToInvoiceItemId(com.zuora.api.ID param) {
        localAppliedToInvoiceItemIdTracker = true;

        this.localAppliedToInvoiceItemId = param;

    }

    /**
     * field for ChargeAmount
     */

    protected java.math.BigDecimal localChargeAmount;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localChargeAmountTracker = false;

    public boolean isChargeAmountSpecified() {
        return localChargeAmountTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getChargeAmount() {
        return localChargeAmount;
    }

    /**
     * Auto generated setter method
     *
     * @param param ChargeAmount
     */
    public void setChargeAmount(java.math.BigDecimal param) {
        localChargeAmountTracker = true;

        this.localChargeAmount = param;

    }

    /**
     * field for ChargeDate
     */

    protected java.util.Calendar localChargeDate;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localChargeDateTracker = false;

    public boolean isChargeDateSpecified() {
        return localChargeDateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getChargeDate() {
        return localChargeDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param ChargeDate
     */
    public void setChargeDate(java.util.Calendar param) {
        localChargeDateTracker = true;

        this.localChargeDate = param;

    }

    /**
     * field for ChargeDescription
     */

    protected java.lang.String localChargeDescription;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localChargeDescriptionTracker = false;

    public boolean isChargeDescriptionSpecified() {
        return localChargeDescriptionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getChargeDescription() {
        return localChargeDescription;
    }

    /**
     * Auto generated setter method
     *
     * @param param ChargeDescription
     */
    public void setChargeDescription(java.lang.String param) {
        localChargeDescriptionTracker = true;

        this.localChargeDescription = param;

    }

    /**
     * field for ChargeName
     */

    protected java.lang.String localChargeName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localChargeNameTracker = false;

    public boolean isChargeNameSpecified() {
        return localChargeNameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getChargeName() {
        return localChargeName;
    }

    /**
     * Auto generated setter method
     *
     * @param param ChargeName
     */
    public void setChargeName(java.lang.String param) {
        localChargeNameTracker = true;

        this.localChargeName = param;

    }

    /**
     * field for ChargeNumber
     */

    protected java.lang.String localChargeNumber;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localChargeNumberTracker = false;

    public boolean isChargeNumberSpecified() {
        return localChargeNumberTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getChargeNumber() {
        return localChargeNumber;
    }

    /**
     * Auto generated setter method
     *
     * @param param ChargeNumber
     */
    public void setChargeNumber(java.lang.String param) {
        localChargeNumberTracker = true;

        this.localChargeNumber = param;

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
     * field for InvoiceId
     */

    protected com.zuora.api.ID localInvoiceId;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localInvoiceIdTracker = false;

    public boolean isInvoiceIdSpecified() {
        return localInvoiceIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ID
     */
    public com.zuora.api.ID getInvoiceId() {
        return localInvoiceId;
    }

    /**
     * Auto generated setter method
     *
     * @param param InvoiceId
     */
    public void setInvoiceId(com.zuora.api.ID param) {
        localInvoiceIdTracker = true;

        this.localInvoiceId = param;

    }

    /**
     * field for ProcessingType
     */

    protected java.math.BigDecimal localProcessingType;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localProcessingTypeTracker = false;

    public boolean isProcessingTypeSpecified() {
        return localProcessingTypeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getProcessingType() {
        return localProcessingType;
    }

    /**
     * Auto generated setter method
     *
     * @param param ProcessingType
     */
    public void setProcessingType(java.math.BigDecimal param) {
        localProcessingTypeTracker = true;

        this.localProcessingType = param;

    }

    /**
     * field for ProductDescription
     */

    protected java.lang.String localProductDescription;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localProductDescriptionTracker = false;

    public boolean isProductDescriptionSpecified() {
        return localProductDescriptionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getProductDescription() {
        return localProductDescription;
    }

    /**
     * Auto generated setter method
     *
     * @param param ProductDescription
     */
    public void setProductDescription(java.lang.String param) {
        localProductDescriptionTracker = true;

        this.localProductDescription = param;

    }

    /**
     * field for ProductId
     */

    protected com.zuora.api.ID localProductId;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localProductIdTracker = false;

    public boolean isProductIdSpecified() {
        return localProductIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ID
     */
    public com.zuora.api.ID getProductId() {
        return localProductId;
    }

    /**
     * Auto generated setter method
     *
     * @param param ProductId
     */
    public void setProductId(com.zuora.api.ID param) {
        localProductIdTracker = true;

        this.localProductId = param;

    }

    /**
     * field for ProductName
     */

    protected java.lang.String localProductName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localProductNameTracker = false;

    public boolean isProductNameSpecified() {
        return localProductNameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getProductName() {
        return localProductName;
    }

    /**
     * Auto generated setter method
     *
     * @param param ProductName
     */
    public void setProductName(java.lang.String param) {
        localProductNameTracker = true;

        this.localProductName = param;

    }

    /**
     * field for Quantity
     */

    protected java.math.BigDecimal localQuantity;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localQuantityTracker = false;

    public boolean isQuantitySpecified() {
        return localQuantityTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getQuantity() {
        return localQuantity;
    }

    /**
     * Auto generated setter method
     *
     * @param param Quantity
     */
    public void setQuantity(java.math.BigDecimal param) {
        localQuantityTracker = true;

        this.localQuantity = param;

    }

    /**
     * field for RatePlanChargeId
     */

    protected com.zuora.api.ID localRatePlanChargeId;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRatePlanChargeIdTracker = false;

    public boolean isRatePlanChargeIdSpecified() {
        return localRatePlanChargeIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ID
     */
    public com.zuora.api.ID getRatePlanChargeId() {
        return localRatePlanChargeId;
    }

    /**
     * Auto generated setter method
     *
     * @param param RatePlanChargeId
     */
    public void setRatePlanChargeId(com.zuora.api.ID param) {
        localRatePlanChargeIdTracker = true;

        this.localRatePlanChargeId = param;

    }

    /**
     * field for RevRecCode
     */

    protected java.lang.String localRevRecCode;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRevRecCodeTracker = false;

    public boolean isRevRecCodeSpecified() {
        return localRevRecCodeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getRevRecCode() {
        return localRevRecCode;
    }

    /**
     * Auto generated setter method
     *
     * @param param RevRecCode
     */
    public void setRevRecCode(java.lang.String param) {
        localRevRecCodeTracker = true;

        this.localRevRecCode = param;

    }

    /**
     * field for RevRecStartDate
     */

    protected java.util.Calendar localRevRecStartDate;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRevRecStartDateTracker = false;

    public boolean isRevRecStartDateSpecified() {
        return localRevRecStartDateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getRevRecStartDate() {
        return localRevRecStartDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param RevRecStartDate
     */
    public void setRevRecStartDate(java.util.Calendar param) {
        localRevRecStartDateTracker = true;

        this.localRevRecStartDate = param;

    }

    /**
     * field for RevRecTriggerCondition
     */

    protected java.lang.String localRevRecTriggerCondition;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRevRecTriggerConditionTracker = false;

    public boolean isRevRecTriggerConditionSpecified() {
        return localRevRecTriggerConditionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getRevRecTriggerCondition() {
        return localRevRecTriggerCondition;
    }

    /**
     * Auto generated setter method
     *
     * @param param RevRecTriggerCondition
     */
    public void setRevRecTriggerCondition(java.lang.String param) {
        localRevRecTriggerConditionTracker = true;

        this.localRevRecTriggerCondition = param;

    }

    /**
     * field for ServiceEndDate
     */

    protected java.util.Calendar localServiceEndDate;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localServiceEndDateTracker = false;

    public boolean isServiceEndDateSpecified() {
        return localServiceEndDateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getServiceEndDate() {
        return localServiceEndDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param ServiceEndDate
     */
    public void setServiceEndDate(java.util.Calendar param) {
        localServiceEndDateTracker = true;

        this.localServiceEndDate = param;

    }

    /**
     * field for ServiceStartDate
     */

    protected java.util.Calendar localServiceStartDate;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localServiceStartDateTracker = false;

    public boolean isServiceStartDateSpecified() {
        return localServiceStartDateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getServiceStartDate() {
        return localServiceStartDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param ServiceStartDate
     */
    public void setServiceStartDate(java.util.Calendar param) {
        localServiceStartDateTracker = true;

        this.localServiceStartDate = param;

    }

    /**
     * field for SKU
     */

    protected java.lang.String localSKU;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSKUTracker = false;

    public boolean isSKUSpecified() {
        return localSKUTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSKU() {
        return localSKU;
    }

    /**
     * Auto generated setter method
     *
     * @param param SKU
     */
    public void setSKU(java.lang.String param) {
        localSKUTracker = true;

        this.localSKU = param;

    }

    /**
     * field for SubscriptionId
     */

    protected com.zuora.api.ID localSubscriptionId;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSubscriptionIdTracker = false;

    public boolean isSubscriptionIdSpecified() {
        return localSubscriptionIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ID
     */
    public com.zuora.api.ID getSubscriptionId() {
        return localSubscriptionId;
    }

    /**
     * Auto generated setter method
     *
     * @param param SubscriptionId
     */
    public void setSubscriptionId(com.zuora.api.ID param) {
        localSubscriptionIdTracker = true;

        this.localSubscriptionId = param;

    }

    /**
     * field for SubscriptionNumber
     */

    protected java.lang.String localSubscriptionNumber;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSubscriptionNumberTracker = false;

    public boolean isSubscriptionNumberSpecified() {
        return localSubscriptionNumberTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSubscriptionNumber() {
        return localSubscriptionNumber;
    }

    /**
     * Auto generated setter method
     *
     * @param param SubscriptionNumber
     */
    public void setSubscriptionNumber(java.lang.String param) {
        localSubscriptionNumberTracker = true;

        this.localSubscriptionNumber = param;

    }

    /**
     * field for TaxAmount
     */

    protected java.math.BigDecimal localTaxAmount;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTaxAmountTracker = false;

    public boolean isTaxAmountSpecified() {
        return localTaxAmountTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getTaxAmount() {
        return localTaxAmount;
    }

    /**
     * Auto generated setter method
     *
     * @param param TaxAmount
     */
    public void setTaxAmount(java.math.BigDecimal param) {
        localTaxAmountTracker = true;

        this.localTaxAmount = param;

    }

    /**
     * field for TaxCode
     */

    protected java.lang.String localTaxCode;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTaxCodeTracker = false;

    public boolean isTaxCodeSpecified() {
        return localTaxCodeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTaxCode() {
        return localTaxCode;
    }

    /**
     * Auto generated setter method
     *
     * @param param TaxCode
     */
    public void setTaxCode(java.lang.String param) {
        localTaxCodeTracker = true;

        this.localTaxCode = param;

    }

    /**
     * field for TaxExemptAmount
     */

    protected java.math.BigDecimal localTaxExemptAmount;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTaxExemptAmountTracker = false;

    public boolean isTaxExemptAmountSpecified() {
        return localTaxExemptAmountTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getTaxExemptAmount() {
        return localTaxExemptAmount;
    }

    /**
     * Auto generated setter method
     *
     * @param param TaxExemptAmount
     */
    public void setTaxExemptAmount(java.math.BigDecimal param) {
        localTaxExemptAmountTracker = true;

        this.localTaxExemptAmount = param;

    }

    /**
     * field for UnitPrice
     */

    protected java.math.BigDecimal localUnitPrice;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localUnitPriceTracker = false;

    public boolean isUnitPriceSpecified() {
        return localUnitPriceTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getUnitPrice() {
        return localUnitPrice;
    }

    /**
     * Auto generated setter method
     *
     * @param param UnitPrice
     */
    public void setUnitPrice(java.math.BigDecimal param) {
        localUnitPriceTracker = true;

        this.localUnitPrice = param;

    }

    /**
     * field for UOM
     */

    protected java.lang.String localUOM;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localUOMTracker = false;

    public boolean isUOMSpecified() {
        return localUOMTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUOM() {
        return localUOM;
    }

    /**
     * Auto generated setter method
     *
     * @param param UOM
     */
    public void setUOM(java.lang.String param) {
        localUOMTracker = true;

        this.localUOM = param;

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
                    "type", namespacePrefix + ":InvoiceItem", xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                    "type", "InvoiceItem", xmlWriter);
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
        if (localAccountingCodeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "AccountingCode", xmlWriter);

            if (localAccountingCode == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localAccountingCode);

            }

            xmlWriter.writeEndElement();
        }
        if (localAppliedToInvoiceItemIdTracker) {
            if (localAppliedToInvoiceItemId == null) {

                writeStartElement(null, "http://object.api.zuora.com/",
                        "AppliedToInvoiceItemId", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localAppliedToInvoiceItemId.serialize(
                        new javax.xml.namespace.QName(
                                "http://object.api.zuora.com/",
                                "AppliedToInvoiceItemId"), xmlWriter);
            }
        }
        if (localChargeAmountTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "ChargeAmount", xmlWriter);

            if (localChargeAmount == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localChargeAmount));

            }

            xmlWriter.writeEndElement();
        }
        if (localChargeDateTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "ChargeDate", xmlWriter);

            if (localChargeDate == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localChargeDate));

            }

            xmlWriter.writeEndElement();
        }
        if (localChargeDescriptionTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "ChargeDescription", xmlWriter);

            if (localChargeDescription == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localChargeDescription);

            }

            xmlWriter.writeEndElement();
        }
        if (localChargeNameTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "ChargeName", xmlWriter);

            if (localChargeName == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localChargeName);

            }

            xmlWriter.writeEndElement();
        }
        if (localChargeNumberTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "ChargeNumber", xmlWriter);

            if (localChargeNumber == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localChargeNumber);

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
        if (localInvoiceIdTracker) {
            if (localInvoiceId == null) {

                writeStartElement(null, "http://object.api.zuora.com/",
                        "InvoiceId", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localInvoiceId
                        .serialize(new javax.xml.namespace.QName(
                                "http://object.api.zuora.com/", "InvoiceId"),
                                xmlWriter);
            }
        }
        if (localProcessingTypeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "ProcessingType", xmlWriter);

            if (localProcessingType == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localProcessingType));

            }

            xmlWriter.writeEndElement();
        }
        if (localProductDescriptionTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "ProductDescription", xmlWriter);

            if (localProductDescription == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localProductDescription);

            }

            xmlWriter.writeEndElement();
        }
        if (localProductIdTracker) {
            if (localProductId == null) {

                writeStartElement(null, "http://object.api.zuora.com/",
                        "ProductId", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localProductId
                        .serialize(new javax.xml.namespace.QName(
                                "http://object.api.zuora.com/", "ProductId"),
                                xmlWriter);
            }
        }
        if (localProductNameTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "ProductName", xmlWriter);

            if (localProductName == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localProductName);

            }

            xmlWriter.writeEndElement();
        }
        if (localQuantityTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "Quantity", xmlWriter);

            if (localQuantity == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localQuantity));

            }

            xmlWriter.writeEndElement();
        }
        if (localRatePlanChargeIdTracker) {
            if (localRatePlanChargeId == null) {

                writeStartElement(null, "http://object.api.zuora.com/",
                        "RatePlanChargeId", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localRatePlanChargeId.serialize(new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "RatePlanChargeId"),
                        xmlWriter);
            }
        }
        if (localRevRecCodeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "RevRecCode", xmlWriter);

            if (localRevRecCode == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localRevRecCode);

            }

            xmlWriter.writeEndElement();
        }
        if (localRevRecStartDateTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "RevRecStartDate", xmlWriter);

            if (localRevRecStartDate == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localRevRecStartDate));

            }

            xmlWriter.writeEndElement();
        }
        if (localRevRecTriggerConditionTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "RevRecTriggerCondition",
                    xmlWriter);

            if (localRevRecTriggerCondition == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localRevRecTriggerCondition);

            }

            xmlWriter.writeEndElement();
        }
        if (localServiceEndDateTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "ServiceEndDate", xmlWriter);

            if (localServiceEndDate == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localServiceEndDate));

            }

            xmlWriter.writeEndElement();
        }
        if (localServiceStartDateTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "ServiceStartDate", xmlWriter);

            if (localServiceStartDate == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localServiceStartDate));

            }

            xmlWriter.writeEndElement();
        }
        if (localSKUTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "SKU", xmlWriter);

            if (localSKU == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localSKU);

            }

            xmlWriter.writeEndElement();
        }
        if (localSubscriptionIdTracker) {
            if (localSubscriptionId == null) {

                writeStartElement(null, "http://object.api.zuora.com/",
                        "SubscriptionId", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localSubscriptionId.serialize(new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "SubscriptionId"),
                        xmlWriter);
            }
        }
        if (localSubscriptionNumberTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "SubscriptionNumber", xmlWriter);

            if (localSubscriptionNumber == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localSubscriptionNumber);

            }

            xmlWriter.writeEndElement();
        }
        if (localTaxAmountTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "TaxAmount", xmlWriter);

            if (localTaxAmount == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localTaxAmount));

            }

            xmlWriter.writeEndElement();
        }
        if (localTaxCodeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "TaxCode", xmlWriter);

            if (localTaxCode == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localTaxCode);

            }

            xmlWriter.writeEndElement();
        }
        if (localTaxExemptAmountTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "TaxExemptAmount", xmlWriter);

            if (localTaxExemptAmount == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localTaxExemptAmount));

            }

            xmlWriter.writeEndElement();
        }
        if (localUnitPriceTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "UnitPrice", xmlWriter);

            if (localUnitPrice == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localUnitPrice));

            }

            xmlWriter.writeEndElement();
        }
        if (localUOMTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "UOM", xmlWriter);

            if (localUOM == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localUOM);

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
                "http://object.api.zuora.com/", "InvoiceItem"));
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
        if (localAccountingCodeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "AccountingCode"));

            elementList.add(localAccountingCode == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localAccountingCode));
        }
        if (localAppliedToInvoiceItemIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "AppliedToInvoiceItemId"));

            elementList.add(localAppliedToInvoiceItemId == null ? null
                    : localAppliedToInvoiceItemId);
        }
        if (localChargeAmountTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "ChargeAmount"));

            elementList.add(localChargeAmount == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localChargeAmount));
        }
        if (localChargeDateTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "ChargeDate"));

            elementList.add(localChargeDate == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localChargeDate));
        }
        if (localChargeDescriptionTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "ChargeDescription"));

            elementList.add(localChargeDescription == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localChargeDescription));
        }
        if (localChargeNameTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "ChargeName"));

            elementList.add(localChargeName == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localChargeName));
        }
        if (localChargeNumberTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "ChargeNumber"));

            elementList.add(localChargeNumber == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localChargeNumber));
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
        if (localInvoiceIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "InvoiceId"));

            elementList.add(localInvoiceId == null ? null : localInvoiceId);
        }
        if (localProcessingTypeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "ProcessingType"));

            elementList.add(localProcessingType == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localProcessingType));
        }
        if (localProductDescriptionTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "ProductDescription"));

            elementList.add(localProductDescription == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localProductDescription));
        }
        if (localProductIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "ProductId"));

            elementList.add(localProductId == null ? null : localProductId);
        }
        if (localProductNameTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "ProductName"));

            elementList.add(localProductName == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localProductName));
        }
        if (localQuantityTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Quantity"));

            elementList.add(localQuantity == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localQuantity));
        }
        if (localRatePlanChargeIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "RatePlanChargeId"));

            elementList.add(localRatePlanChargeId == null ? null
                    : localRatePlanChargeId);
        }
        if (localRevRecCodeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "RevRecCode"));

            elementList.add(localRevRecCode == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localRevRecCode));
        }
        if (localRevRecStartDateTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "RevRecStartDate"));

            elementList.add(localRevRecStartDate == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localRevRecStartDate));
        }
        if (localRevRecTriggerConditionTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "RevRecTriggerCondition"));

            elementList.add(localRevRecTriggerCondition == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localRevRecTriggerCondition));
        }
        if (localServiceEndDateTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "ServiceEndDate"));

            elementList.add(localServiceEndDate == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localServiceEndDate));
        }
        if (localServiceStartDateTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "ServiceStartDate"));

            elementList.add(localServiceStartDate == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localServiceStartDate));
        }
        if (localSKUTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "SKU"));

            elementList.add(localSKU == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localSKU));
        }
        if (localSubscriptionIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "SubscriptionId"));

            elementList.add(localSubscriptionId == null ? null
                    : localSubscriptionId);
        }
        if (localSubscriptionNumberTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "SubscriptionNumber"));

            elementList.add(localSubscriptionNumber == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localSubscriptionNumber));
        }
        if (localTaxAmountTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "TaxAmount"));

            elementList.add(localTaxAmount == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localTaxAmount));
        }
        if (localTaxCodeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "TaxCode"));

            elementList.add(localTaxCode == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localTaxCode));
        }
        if (localTaxExemptAmountTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "TaxExemptAmount"));

            elementList.add(localTaxExemptAmount == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localTaxExemptAmount));
        }
        if (localUnitPriceTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "UnitPrice"));

            elementList.add(localUnitPrice == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localUnitPrice));
        }
        if (localUOMTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "UOM"));

            elementList.add(localUOM == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localUOM));
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
        public static InvoiceItem parse(javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            InvoiceItem object = new InvoiceItem();

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

                        if (!"InvoiceItem".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader
                                    .getNamespaceContext().getNamespaceURI(
                                            nsPrefix);
                            return (InvoiceItem) com.zuora.api.object.ExtensionMapper
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
                        "http://object.api.zuora.com/",
                        "AccountingCode").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setAccountingCode(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "AppliedToInvoiceItemId").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setAppliedToInvoiceItemId(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setAppliedToInvoiceItemId(com.zuora.api.ID.Factory
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
                        "http://object.api.zuora.com/", "ChargeAmount")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setChargeAmount(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "ChargeDate")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setChargeDate(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "ChargeDescription").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setChargeDescription(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "ChargeName")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setChargeName(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "ChargeNumber")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setChargeNumber(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "InvoiceId")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setInvoiceId(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setInvoiceId(com.zuora.api.ID.Factory
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
                        "http://object.api.zuora.com/",
                        "ProcessingType").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setProcessingType(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "ProductDescription").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setProductDescription(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "ProductId")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setProductId(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setProductId(com.zuora.api.ID.Factory
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
                        "http://object.api.zuora.com/", "ProductName")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setProductName(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "Quantity")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setQuantity(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "RatePlanChargeId").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setRatePlanChargeId(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setRatePlanChargeId(com.zuora.api.ID.Factory
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
                        "http://object.api.zuora.com/", "RevRecCode")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setRevRecCode(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "RevRecStartDate").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setRevRecStartDate(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "RevRecTriggerCondition").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setRevRecTriggerCondition(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "ServiceEndDate").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setServiceEndDate(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "ServiceStartDate").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setServiceStartDate(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "SKU")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setSKU(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "SubscriptionId").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setSubscriptionId(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setSubscriptionId(com.zuora.api.ID.Factory
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
                        "http://object.api.zuora.com/",
                        "SubscriptionNumber").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setSubscriptionNumber(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "TaxAmount")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setTaxAmount(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "TaxCode")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setTaxCode(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "TaxExemptAmount").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setTaxExemptAmount(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "UnitPrice")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setUnitPrice(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "UOM")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setUOM(org.apache.axis2.databinding.utils.ConverterUtil
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
