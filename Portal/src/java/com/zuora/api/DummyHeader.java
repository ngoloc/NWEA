/**
 * DummyHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.zuora.api;

/**
 * DummyHeader bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class DummyHeader implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
            "http://api.zuora.com/", "DummyHeader", "ns1");

    /**
     * field for Account
     */

    protected com.zuora.api.object.Account localAccount;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAccountTracker = false;

    public boolean isAccountSpecified() {
        return localAccountTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.Account
     */
    public com.zuora.api.object.Account getAccount() {
        return localAccount;
    }

    /**
     * Auto generated setter method
     *
     * @param param Account
     */
    public void setAccount(com.zuora.api.object.Account param) {
        localAccountTracker = true;

        this.localAccount = param;

    }

    /**
     * field for AccountingPeriod
     */

    protected com.zuora.api.object.AccountingPeriod localAccountingPeriod;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAccountingPeriodTracker = false;

    public boolean isAccountingPeriodSpecified() {
        return localAccountingPeriodTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.AccountingPeriod
     */
    public com.zuora.api.object.AccountingPeriod getAccountingPeriod() {
        return localAccountingPeriod;
    }

    /**
     * Auto generated setter method
     *
     * @param param AccountingPeriod
     */
    public void setAccountingPeriod(com.zuora.api.object.AccountingPeriod param) {
        localAccountingPeriodTracker = true;

        this.localAccountingPeriod = param;

    }

    /**
     * field for InvoiceAdjustment
     */

    protected com.zuora.api.object.InvoiceAdjustment localInvoiceAdjustment;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localInvoiceAdjustmentTracker = false;

    public boolean isInvoiceAdjustmentSpecified() {
        return localInvoiceAdjustmentTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.InvoiceAdjustment
     */
    public com.zuora.api.object.InvoiceAdjustment getInvoiceAdjustment() {
        return localInvoiceAdjustment;
    }

    /**
     * Auto generated setter method
     *
     * @param param InvoiceAdjustment
     */
    public void setInvoiceAdjustment(
            com.zuora.api.object.InvoiceAdjustment param) {
        localInvoiceAdjustmentTracker = true;

        this.localInvoiceAdjustment = param;

    }

    /**
     * field for Amendment
     */

    protected com.zuora.api.object.Amendment localAmendment;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAmendmentTracker = false;

    public boolean isAmendmentSpecified() {
        return localAmendmentTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.Amendment
     */
    public com.zuora.api.object.Amendment getAmendment() {
        return localAmendment;
    }

    /**
     * Auto generated setter method
     *
     * @param param Amendment
     */
    public void setAmendment(com.zuora.api.object.Amendment param) {
        localAmendmentTracker = true;

        this.localAmendment = param;

    }

    /**
     * field for Invoice
     */

    protected com.zuora.api.object.Invoice localInvoice;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localInvoiceTracker = false;

    public boolean isInvoiceSpecified() {
        return localInvoiceTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.Invoice
     */
    public com.zuora.api.object.Invoice getInvoice() {
        return localInvoice;
    }

    /**
     * Auto generated setter method
     *
     * @param param Invoice
     */
    public void setInvoice(com.zuora.api.object.Invoice param) {
        localInvoiceTracker = true;

        this.localInvoice = param;

    }

    /**
     * field for InvoiceItem
     */

    protected com.zuora.api.object.InvoiceItem localInvoiceItem;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localInvoiceItemTracker = false;

    public boolean isInvoiceItemSpecified() {
        return localInvoiceItemTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.InvoiceItem
     */
    public com.zuora.api.object.InvoiceItem getInvoiceItem() {
        return localInvoiceItem;
    }

    /**
     * Auto generated setter method
     *
     * @param param InvoiceItem
     */
    public void setInvoiceItem(com.zuora.api.object.InvoiceItem param) {
        localInvoiceItemTracker = true;

        this.localInvoiceItem = param;

    }

    /**
     * field for InvoicePayment
     */

    protected com.zuora.api.object.InvoicePayment localInvoicePayment;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localInvoicePaymentTracker = false;

    public boolean isInvoicePaymentSpecified() {
        return localInvoicePaymentTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.InvoicePayment
     */
    public com.zuora.api.object.InvoicePayment getInvoicePayment() {
        return localInvoicePayment;
    }

    /**
     * Auto generated setter method
     *
     * @param param InvoicePayment
     */
    public void setInvoicePayment(com.zuora.api.object.InvoicePayment param) {
        localInvoicePaymentTracker = true;

        this.localInvoicePayment = param;

    }

    /**
     * field for Import
     */

    protected com.zuora.api.object.Import localImport;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localImportTracker = false;

    public boolean isImportSpecified() {
        return localImportTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.Import
     */
    public com.zuora.api.object.Import getImport() {
        return localImport;
    }

    /**
     * Auto generated setter method
     *
     * @param param Import
     */
    public void setImport(com.zuora.api.object.Import param) {
        localImportTracker = true;

        this.localImport = param;

    }

    /**
     * field for Payment
     */

    protected com.zuora.api.object.Payment localPayment;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPaymentTracker = false;

    public boolean isPaymentSpecified() {
        return localPaymentTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.Payment
     */
    public com.zuora.api.object.Payment getPayment() {
        return localPayment;
    }

    /**
     * Auto generated setter method
     *
     * @param param Payment
     */
    public void setPayment(com.zuora.api.object.Payment param) {
        localPaymentTracker = true;

        this.localPayment = param;

    }

    /**
     * field for Product
     */

    protected com.zuora.api.object.Product localProduct;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localProductTracker = false;

    public boolean isProductSpecified() {
        return localProductTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.Product
     */
    public com.zuora.api.object.Product getProduct() {
        return localProduct;
    }

    /**
     * Auto generated setter method
     *
     * @param param Product
     */
    public void setProduct(com.zuora.api.object.Product param) {
        localProductTracker = true;

        this.localProduct = param;

    }

    /**
     * field for ProductRatePlan
     */

    protected com.zuora.api.object.ProductRatePlan localProductRatePlan;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localProductRatePlanTracker = false;

    public boolean isProductRatePlanSpecified() {
        return localProductRatePlanTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.ProductRatePlan
     */
    public com.zuora.api.object.ProductRatePlan getProductRatePlan() {
        return localProductRatePlan;
    }

    /**
     * Auto generated setter method
     *
     * @param param ProductRatePlan
     */
    public void setProductRatePlan(com.zuora.api.object.ProductRatePlan param) {
        localProductRatePlanTracker = true;

        this.localProductRatePlan = param;

    }

    /**
     * field for ProductRatePlanCharge
     */

    protected com.zuora.api.object.ProductRatePlanCharge localProductRatePlanCharge;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localProductRatePlanChargeTracker = false;

    public boolean isProductRatePlanChargeSpecified() {
        return localProductRatePlanChargeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.ProductRatePlanCharge
     */
    public com.zuora.api.object.ProductRatePlanCharge getProductRatePlanCharge() {
        return localProductRatePlanCharge;
    }

    /**
     * Auto generated setter method
     *
     * @param param ProductRatePlanCharge
     */
    public void setProductRatePlanCharge(
            com.zuora.api.object.ProductRatePlanCharge param) {
        localProductRatePlanChargeTracker = true;

        this.localProductRatePlanCharge = param;

    }

    /**
     * field for ProductRatePlanChargeTier
     */

    protected com.zuora.api.object.ProductRatePlanChargeTier localProductRatePlanChargeTier;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localProductRatePlanChargeTierTracker = false;

    public boolean isProductRatePlanChargeTierSpecified() {
        return localProductRatePlanChargeTierTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.ProductRatePlanChargeTier
     */
    public com.zuora.api.object.ProductRatePlanChargeTier getProductRatePlanChargeTier() {
        return localProductRatePlanChargeTier;
    }

    /**
     * Auto generated setter method
     *
     * @param param ProductRatePlanChargeTier
     */
    public void setProductRatePlanChargeTier(
            com.zuora.api.object.ProductRatePlanChargeTier param) {
        localProductRatePlanChargeTierTracker = true;

        this.localProductRatePlanChargeTier = param;

    }

    /**
     * field for RatePlan
     */

    protected com.zuora.api.object.RatePlan localRatePlan;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRatePlanTracker = false;

    public boolean isRatePlanSpecified() {
        return localRatePlanTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.RatePlan
     */
    public com.zuora.api.object.RatePlan getRatePlan() {
        return localRatePlan;
    }

    /**
     * Auto generated setter method
     *
     * @param param RatePlan
     */
    public void setRatePlan(com.zuora.api.object.RatePlan param) {
        localRatePlanTracker = true;

        this.localRatePlan = param;

    }

    /**
     * field for RatePlanCharge
     */

    protected com.zuora.api.object.RatePlanCharge localRatePlanCharge;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRatePlanChargeTracker = false;

    public boolean isRatePlanChargeSpecified() {
        return localRatePlanChargeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.RatePlanCharge
     */
    public com.zuora.api.object.RatePlanCharge getRatePlanCharge() {
        return localRatePlanCharge;
    }

    /**
     * Auto generated setter method
     *
     * @param param RatePlanCharge
     */
    public void setRatePlanCharge(com.zuora.api.object.RatePlanCharge param) {
        localRatePlanChargeTracker = true;

        this.localRatePlanCharge = param;

    }

    /**
     * field for RatePlanChargeTier
     */

    protected com.zuora.api.object.RatePlanChargeTier localRatePlanChargeTier;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRatePlanChargeTierTracker = false;

    public boolean isRatePlanChargeTierSpecified() {
        return localRatePlanChargeTierTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.RatePlanChargeTier
     */
    public com.zuora.api.object.RatePlanChargeTier getRatePlanChargeTier() {
        return localRatePlanChargeTier;
    }

    /**
     * Auto generated setter method
     *
     * @param param RatePlanChargeTier
     */
    public void setRatePlanChargeTier(
            com.zuora.api.object.RatePlanChargeTier param) {
        localRatePlanChargeTierTracker = true;

        this.localRatePlanChargeTier = param;

    }

    /**
     * field for TaxationItem
     */

    protected com.zuora.api.object.TaxationItem localTaxationItem;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTaxationItemTracker = false;

    public boolean isTaxationItemSpecified() {
        return localTaxationItemTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.TaxationItem
     */
    public com.zuora.api.object.TaxationItem getTaxationItem() {
        return localTaxationItem;
    }

    /**
     * Auto generated setter method
     *
     * @param param TaxationItem
     */
    public void setTaxationItem(com.zuora.api.object.TaxationItem param) {
        localTaxationItemTracker = true;

        this.localTaxationItem = param;

    }

    /**
     * field for Usage
     */

    protected com.zuora.api.object.Usage localUsage;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localUsageTracker = false;

    public boolean isUsageSpecified() {
        return localUsageTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.Usage
     */
    public com.zuora.api.object.Usage getUsage() {
        return localUsage;
    }

    /**
     * Auto generated setter method
     *
     * @param param Usage
     */
    public void setUsage(com.zuora.api.object.Usage param) {
        localUsageTracker = true;

        this.localUsage = param;

    }

    /**
     * field for Refund
     */

    protected com.zuora.api.object.Refund localRefund;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRefundTracker = false;

    public boolean isRefundSpecified() {
        return localRefundTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.Refund
     */
    public com.zuora.api.object.Refund getRefund() {
        return localRefund;
    }

    /**
     * Auto generated setter method
     *
     * @param param Refund
     */
    public void setRefund(com.zuora.api.object.Refund param) {
        localRefundTracker = true;

        this.localRefund = param;

    }

    /**
     * field for RefundInvoicePayment
     */

    protected com.zuora.api.object.RefundInvoicePayment localRefundInvoicePayment;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRefundInvoicePaymentTracker = false;

    public boolean isRefundInvoicePaymentSpecified() {
        return localRefundInvoicePaymentTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.RefundInvoicePayment
     */
    public com.zuora.api.object.RefundInvoicePayment getRefundInvoicePayment() {
        return localRefundInvoicePayment;
    }

    /**
     * Auto generated setter method
     *
     * @param param RefundInvoicePayment
     */
    public void setRefundInvoicePayment(
            com.zuora.api.object.RefundInvoicePayment param) {
        localRefundInvoicePaymentTracker = true;

        this.localRefundInvoicePayment = param;

    }

    /**
     * field for CreditBalanceAdjustment
     */

    protected com.zuora.api.object.CreditBalanceAdjustment localCreditBalanceAdjustment;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCreditBalanceAdjustmentTracker = false;

    public boolean isCreditBalanceAdjustmentSpecified() {
        return localCreditBalanceAdjustmentTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.CreditBalanceAdjustment
     */
    public com.zuora.api.object.CreditBalanceAdjustment getCreditBalanceAdjustment() {
        return localCreditBalanceAdjustment;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreditBalanceAdjustment
     */
    public void setCreditBalanceAdjustment(
            com.zuora.api.object.CreditBalanceAdjustment param) {
        localCreditBalanceAdjustmentTracker = true;

        this.localCreditBalanceAdjustment = param;

    }

    /**
     * field for Export
     */

    protected com.zuora.api.object.Export localExport;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localExportTracker = false;

    public boolean isExportSpecified() {
        return localExportTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.Export
     */
    public com.zuora.api.object.Export getExport() {
        return localExport;
    }

    /**
     * Auto generated setter method
     *
     * @param param Export
     */
    public void setExport(com.zuora.api.object.Export param) {
        localExportTracker = true;

        this.localExport = param;

    }

    /**
     * field for InvoiceItemAdjustment
     */

    protected com.zuora.api.object.InvoiceItemAdjustment localInvoiceItemAdjustment;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localInvoiceItemAdjustmentTracker = false;

    public boolean isInvoiceItemAdjustmentSpecified() {
        return localInvoiceItemAdjustmentTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.InvoiceItemAdjustment
     */
    public com.zuora.api.object.InvoiceItemAdjustment getInvoiceItemAdjustment() {
        return localInvoiceItemAdjustment;
    }

    /**
     * Auto generated setter method
     *
     * @param param InvoiceItemAdjustment
     */
    public void setInvoiceItemAdjustment(
            com.zuora.api.object.InvoiceItemAdjustment param) {
        localInvoiceItemAdjustmentTracker = true;

        this.localInvoiceItemAdjustment = param;

    }

    /**
     * field for CommunicationProfile
     */

    protected com.zuora.api.object.CommunicationProfile localCommunicationProfile;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCommunicationProfileTracker = false;

    public boolean isCommunicationProfileSpecified() {
        return localCommunicationProfileTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.CommunicationProfile
     */
    public com.zuora.api.object.CommunicationProfile getCommunicationProfile() {
        return localCommunicationProfile;
    }

    /**
     * Auto generated setter method
     *
     * @param param CommunicationProfile
     */
    public void setCommunicationProfile(
            com.zuora.api.object.CommunicationProfile param) {
        localCommunicationProfileTracker = true;

        this.localCommunicationProfile = param;

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
                this, MY_QNAME);
        return factory.createOMElement(dataSource, MY_QNAME);

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

        if (serializeType) {

            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://api.zuora.com/");
            if ((namespacePrefix != null)
                    && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":DummyHeader", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "DummyHeader", xmlWriter);
            }

        }
        if (localAccountTracker) {
            if (localAccount == null) {

                writeStartElement(null, "http://api.zuora.com/", "Account",
                        xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localAccount.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "Account"), xmlWriter);
            }
        }
        if (localAccountingPeriodTracker) {
            if (localAccountingPeriod == null) {

                writeStartElement(null, "http://api.zuora.com/",
                        "AccountingPeriod", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localAccountingPeriod
                        .serialize(new javax.xml.namespace.QName(
                                "http://api.zuora.com/", "AccountingPeriod"),
                                xmlWriter);
            }
        }
        if (localInvoiceAdjustmentTracker) {
            if (localInvoiceAdjustment == null) {

                writeStartElement(null, "http://api.zuora.com/",
                        "InvoiceAdjustment", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localInvoiceAdjustment.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "InvoiceAdjustment"),
                        xmlWriter);
            }
        }
        if (localAmendmentTracker) {
            if (localAmendment == null) {

                writeStartElement(null, "http://api.zuora.com/", "Amendment",
                        xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localAmendment.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "Amendment"), xmlWriter);
            }
        }
        if (localInvoiceTracker) {
            if (localInvoice == null) {

                writeStartElement(null, "http://api.zuora.com/", "Invoice",
                        xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localInvoice.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "Invoice"), xmlWriter);
            }
        }
        if (localInvoiceItemTracker) {
            if (localInvoiceItem == null) {

                writeStartElement(null, "http://api.zuora.com/", "InvoiceItem",
                        xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localInvoiceItem.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "InvoiceItem"), xmlWriter);
            }
        }
        if (localInvoicePaymentTracker) {
            if (localInvoicePayment == null) {

                writeStartElement(null, "http://api.zuora.com/",
                        "InvoicePayment", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localInvoicePayment.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "InvoicePayment"), xmlWriter);
            }
        }
        if (localImportTracker) {
            if (localImport == null) {

                writeStartElement(null, "http://api.zuora.com/", "Import",
                        xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localImport.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "Import"), xmlWriter);
            }
        }
        if (localPaymentTracker) {
            if (localPayment == null) {

                writeStartElement(null, "http://api.zuora.com/", "Payment",
                        xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localPayment.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "Payment"), xmlWriter);
            }
        }
        if (localProductTracker) {
            if (localProduct == null) {

                writeStartElement(null, "http://api.zuora.com/", "Product",
                        xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localProduct.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "Product"), xmlWriter);
            }
        }
        if (localProductRatePlanTracker) {
            if (localProductRatePlan == null) {

                writeStartElement(null, "http://api.zuora.com/",
                        "ProductRatePlan", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localProductRatePlan.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "ProductRatePlan"), xmlWriter);
            }
        }
        if (localProductRatePlanChargeTracker) {
            if (localProductRatePlanCharge == null) {

                writeStartElement(null, "http://api.zuora.com/",
                        "ProductRatePlanCharge", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localProductRatePlanCharge.serialize(
                        new javax.xml.namespace.QName("http://api.zuora.com/",
                                "ProductRatePlanCharge"), xmlWriter);
            }
        }
        if (localProductRatePlanChargeTierTracker) {
            if (localProductRatePlanChargeTier == null) {

                writeStartElement(null, "http://api.zuora.com/",
                        "ProductRatePlanChargeTier", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localProductRatePlanChargeTier.serialize(
                        new javax.xml.namespace.QName("http://api.zuora.com/",
                                "ProductRatePlanChargeTier"), xmlWriter);
            }
        }
        if (localRatePlanTracker) {
            if (localRatePlan == null) {

                writeStartElement(null, "http://api.zuora.com/", "RatePlan",
                        xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localRatePlan.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "RatePlan"), xmlWriter);
            }
        }
        if (localRatePlanChargeTracker) {
            if (localRatePlanCharge == null) {

                writeStartElement(null, "http://api.zuora.com/",
                        "RatePlanCharge", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localRatePlanCharge.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "RatePlanCharge"), xmlWriter);
            }
        }
        if (localRatePlanChargeTierTracker) {
            if (localRatePlanChargeTier == null) {

                writeStartElement(null, "http://api.zuora.com/",
                        "RatePlanChargeTier", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localRatePlanChargeTier.serialize(
                        new javax.xml.namespace.QName("http://api.zuora.com/",
                                "RatePlanChargeTier"), xmlWriter);
            }
        }
        if (localTaxationItemTracker) {
            if (localTaxationItem == null) {

                writeStartElement(null, "http://api.zuora.com/",
                        "TaxationItem", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localTaxationItem.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "TaxationItem"), xmlWriter);
            }
        }
        if (localUsageTracker) {
            if (localUsage == null) {

                writeStartElement(null, "http://api.zuora.com/", "Usage",
                        xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localUsage.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "Usage"), xmlWriter);
            }
        }
        if (localRefundTracker) {
            if (localRefund == null) {

                writeStartElement(null, "http://api.zuora.com/", "Refund",
                        xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localRefund.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "Refund"), xmlWriter);
            }
        }
        if (localRefundInvoicePaymentTracker) {
            if (localRefundInvoicePayment == null) {

                writeStartElement(null, "http://api.zuora.com/",
                        "RefundInvoicePayment", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localRefundInvoicePayment.serialize(
                        new javax.xml.namespace.QName("http://api.zuora.com/",
                                "RefundInvoicePayment"), xmlWriter);
            }
        }
        if (localCreditBalanceAdjustmentTracker) {
            if (localCreditBalanceAdjustment == null) {

                writeStartElement(null, "http://api.zuora.com/",
                        "CreditBalanceAdjustment", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localCreditBalanceAdjustment.serialize(
                        new javax.xml.namespace.QName("http://api.zuora.com/",
                                "CreditBalanceAdjustment"), xmlWriter);
            }
        }
        if (localExportTracker) {
            if (localExport == null) {

                writeStartElement(null, "http://api.zuora.com/", "Export",
                        xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localExport.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "Export"), xmlWriter);
            }
        }
        if (localInvoiceItemAdjustmentTracker) {
            if (localInvoiceItemAdjustment == null) {

                writeStartElement(null, "http://api.zuora.com/",
                        "InvoiceItemAdjustment", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localInvoiceItemAdjustment.serialize(
                        new javax.xml.namespace.QName("http://api.zuora.com/",
                                "InvoiceItemAdjustment"), xmlWriter);
            }
        }
        if (localCommunicationProfileTracker) {
            if (localCommunicationProfile == null) {

                writeStartElement(null, "http://api.zuora.com/",
                        "CommunicationProfile", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localCommunicationProfile.serialize(
                        new javax.xml.namespace.QName("http://api.zuora.com/",
                                "CommunicationProfile"), xmlWriter);
            }
        }
        xmlWriter.writeEndElement();

    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://api.zuora.com/")) {
            return "ns1";
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

        if (localAccountTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "Account"));

            elementList.add(localAccount == null ? null : localAccount);
        }
        if (localAccountingPeriodTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "AccountingPeriod"));

            elementList.add(localAccountingPeriod == null ? null
                    : localAccountingPeriod);
        }
        if (localInvoiceAdjustmentTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "InvoiceAdjustment"));

            elementList.add(localInvoiceAdjustment == null ? null
                    : localInvoiceAdjustment);
        }
        if (localAmendmentTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "Amendment"));

            elementList.add(localAmendment == null ? null : localAmendment);
        }
        if (localInvoiceTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "Invoice"));

            elementList.add(localInvoice == null ? null : localInvoice);
        }
        if (localInvoiceItemTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "InvoiceItem"));

            elementList.add(localInvoiceItem == null ? null : localInvoiceItem);
        }
        if (localInvoicePaymentTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "InvoicePayment"));

            elementList.add(localInvoicePayment == null ? null
                    : localInvoicePayment);
        }
        if (localImportTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "Import"));

            elementList.add(localImport == null ? null : localImport);
        }
        if (localPaymentTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "Payment"));

            elementList.add(localPayment == null ? null : localPayment);
        }
        if (localProductTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "Product"));

            elementList.add(localProduct == null ? null : localProduct);
        }
        if (localProductRatePlanTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "ProductRatePlan"));

            elementList.add(localProductRatePlan == null ? null
                    : localProductRatePlan);
        }
        if (localProductRatePlanChargeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "ProductRatePlanCharge"));

            elementList.add(localProductRatePlanCharge == null ? null
                    : localProductRatePlanCharge);
        }
        if (localProductRatePlanChargeTierTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "ProductRatePlanChargeTier"));

            elementList.add(localProductRatePlanChargeTier == null ? null
                    : localProductRatePlanChargeTier);
        }
        if (localRatePlanTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "RatePlan"));

            elementList.add(localRatePlan == null ? null : localRatePlan);
        }
        if (localRatePlanChargeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "RatePlanCharge"));

            elementList.add(localRatePlanCharge == null ? null
                    : localRatePlanCharge);
        }
        if (localRatePlanChargeTierTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "RatePlanChargeTier"));

            elementList.add(localRatePlanChargeTier == null ? null
                    : localRatePlanChargeTier);
        }
        if (localTaxationItemTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "TaxationItem"));

            elementList.add(localTaxationItem == null ? null
                    : localTaxationItem);
        }
        if (localUsageTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "Usage"));

            elementList.add(localUsage == null ? null : localUsage);
        }
        if (localRefundTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "Refund"));

            elementList.add(localRefund == null ? null : localRefund);
        }
        if (localRefundInvoicePaymentTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "RefundInvoicePayment"));

            elementList.add(localRefundInvoicePayment == null ? null
                    : localRefundInvoicePayment);
        }
        if (localCreditBalanceAdjustmentTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "CreditBalanceAdjustment"));

            elementList.add(localCreditBalanceAdjustment == null ? null
                    : localCreditBalanceAdjustment);
        }
        if (localExportTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "Export"));

            elementList.add(localExport == null ? null : localExport);
        }
        if (localInvoiceItemAdjustmentTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "InvoiceItemAdjustment"));

            elementList.add(localInvoiceItemAdjustment == null ? null
                    : localInvoiceItemAdjustment);
        }
        if (localCommunicationProfileTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "CommunicationProfile"));

            elementList.add(localCommunicationProfile == null ? null
                    : localCommunicationProfile);
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
        public static DummyHeader parse(javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            DummyHeader object = new DummyHeader();

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

                        if (!"DummyHeader".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader
                                    .getNamespaceContext().getNamespaceURI(
                                            nsPrefix);
                            return (DummyHeader) com.zuora.api.object.ExtensionMapper
                                    .getTypeObject(nsUri, type, reader);
                        }

                    }

                }

                // Note all attributes that were handled. Used to differ normal
                // attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "Account")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setAccount(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setAccount(com.zuora.api.object.Account.Factory
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
                        "http://api.zuora.com/", "AccountingPeriod")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setAccountingPeriod(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setAccountingPeriod(com.zuora.api.object.AccountingPeriod.Factory
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
                        "http://api.zuora.com/", "InvoiceAdjustment")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setInvoiceAdjustment(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setInvoiceAdjustment(com.zuora.api.object.InvoiceAdjustment.Factory
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
                        "http://api.zuora.com/", "Amendment")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setAmendment(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setAmendment(com.zuora.api.object.Amendment.Factory
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
                        "http://api.zuora.com/", "Invoice")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setInvoice(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setInvoice(com.zuora.api.object.Invoice.Factory
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
                        "http://api.zuora.com/", "InvoiceItem")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setInvoiceItem(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setInvoiceItem(com.zuora.api.object.InvoiceItem.Factory
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
                        "http://api.zuora.com/", "InvoicePayment")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setInvoicePayment(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setInvoicePayment(com.zuora.api.object.InvoicePayment.Factory
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
                        "http://api.zuora.com/", "Import")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setImport(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setImport(com.zuora.api.object.Import.Factory
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
                        "http://api.zuora.com/", "Payment")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setPayment(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setPayment(com.zuora.api.object.Payment.Factory
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
                        "http://api.zuora.com/", "Product")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setProduct(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setProduct(com.zuora.api.object.Product.Factory
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
                        "http://api.zuora.com/", "ProductRatePlan")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setProductRatePlan(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setProductRatePlan(com.zuora.api.object.ProductRatePlan.Factory
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
                        "http://api.zuora.com/",
                        "ProductRatePlanCharge").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setProductRatePlanCharge(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setProductRatePlanCharge(com.zuora.api.object.ProductRatePlanCharge.Factory
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
                        "http://api.zuora.com/",
                        "ProductRatePlanChargeTier").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setProductRatePlanChargeTier(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setProductRatePlanChargeTier(com.zuora.api.object.ProductRatePlanChargeTier.Factory
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
                        "http://api.zuora.com/", "RatePlan")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setRatePlan(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setRatePlan(com.zuora.api.object.RatePlan.Factory
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
                        "http://api.zuora.com/", "RatePlanCharge")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setRatePlanCharge(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setRatePlanCharge(com.zuora.api.object.RatePlanCharge.Factory
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
                        "http://api.zuora.com/", "RatePlanChargeTier")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setRatePlanChargeTier(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setRatePlanChargeTier(com.zuora.api.object.RatePlanChargeTier.Factory
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
                        "http://api.zuora.com/", "TaxationItem")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setTaxationItem(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setTaxationItem(com.zuora.api.object.TaxationItem.Factory
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
                        "http://api.zuora.com/", "Usage").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setUsage(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setUsage(com.zuora.api.object.Usage.Factory
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
                        "http://api.zuora.com/", "Refund")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setRefund(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setRefund(com.zuora.api.object.Refund.Factory
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
                        "http://api.zuora.com/", "RefundInvoicePayment")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setRefundInvoicePayment(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setRefundInvoicePayment(com.zuora.api.object.RefundInvoicePayment.Factory
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
                        "http://api.zuora.com/",
                        "CreditBalanceAdjustment").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setCreditBalanceAdjustment(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setCreditBalanceAdjustment(com.zuora.api.object.CreditBalanceAdjustment.Factory
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
                        "http://api.zuora.com/", "Export")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setExport(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setExport(com.zuora.api.object.Export.Factory
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
                        "http://api.zuora.com/",
                        "InvoiceItemAdjustment").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setInvoiceItemAdjustment(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setInvoiceItemAdjustment(com.zuora.api.object.InvoiceItemAdjustment.Factory
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
                        "http://api.zuora.com/", "CommunicationProfile")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setCommunicationProfile(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setCommunicationProfile(com.zuora.api.object.CommunicationProfile.Factory
                                .parse(reader));

                        reader.next();
                    }
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
