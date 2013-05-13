/**
 * InvoiceItemAdjustment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.zuora.api.object;

/**
 * InvoiceItemAdjustment bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class InvoiceItemAdjustment extends com.zuora.api.object.ZObject
        implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name =
	 * InvoiceItemAdjustment Namespace URI = http://object.api.zuora.com/
	 * Namespace Prefix = ns2
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
     * field for AdjustmentDate
     */

    protected java.util.Calendar localAdjustmentDate;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAdjustmentDateTracker = false;

    public boolean isAdjustmentDateSpecified() {
        return localAdjustmentDateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getAdjustmentDate() {
        return localAdjustmentDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param AdjustmentDate
     */
    public void setAdjustmentDate(java.util.Calendar param) {
        localAdjustmentDateTracker = true;

        this.localAdjustmentDate = param;

    }

    /**
     * field for AdjustmentNumber
     */

    protected java.lang.String localAdjustmentNumber;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAdjustmentNumberTracker = false;

    public boolean isAdjustmentNumberSpecified() {
        return localAdjustmentNumberTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAdjustmentNumber() {
        return localAdjustmentNumber;
    }

    /**
     * Auto generated setter method
     *
     * @param param AdjustmentNumber
     */
    public void setAdjustmentNumber(java.lang.String param) {
        localAdjustmentNumberTracker = true;

        this.localAdjustmentNumber = param;

    }

    /**
     * field for Amount
     */

    protected java.math.BigDecimal localAmount;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAmountTracker = false;

    public boolean isAmountSpecified() {
        return localAmountTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getAmount() {
        return localAmount;
    }

    /**
     * Auto generated setter method
     *
     * @param param Amount
     */
    public void setAmount(java.math.BigDecimal param) {
        localAmountTracker = true;

        this.localAmount = param;

    }

    /**
     * field for CancelledById
     */

    protected com.zuora.api.ID localCancelledById;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCancelledByIdTracker = false;

    public boolean isCancelledByIdSpecified() {
        return localCancelledByIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ID
     */
    public com.zuora.api.ID getCancelledById() {
        return localCancelledById;
    }

    /**
     * Auto generated setter method
     *
     * @param param CancelledById
     */
    public void setCancelledById(com.zuora.api.ID param) {
        localCancelledByIdTracker = true;

        this.localCancelledById = param;

    }

    /**
     * field for CancelledDate
     */

    protected java.util.Calendar localCancelledDate;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCancelledDateTracker = false;

    public boolean isCancelledDateSpecified() {
        return localCancelledDateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getCancelledDate() {
        return localCancelledDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param CancelledDate
     */
    public void setCancelledDate(java.util.Calendar param) {
        localCancelledDateTracker = true;

        this.localCancelledDate = param;

    }

    /**
     * field for Comment
     */

    protected java.lang.String localComment;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCommentTracker = false;

    public boolean isCommentSpecified() {
        return localCommentTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getComment() {
        return localComment;
    }

    /**
     * Auto generated setter method
     *
     * @param param Comment
     */
    public void setComment(java.lang.String param) {
        localCommentTracker = true;

        this.localComment = param;

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
     * field for CustomerName
     */

    protected java.lang.String localCustomerName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCustomerNameTracker = false;

    public boolean isCustomerNameSpecified() {
        return localCustomerNameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCustomerName() {
        return localCustomerName;
    }

    /**
     * Auto generated setter method
     *
     * @param param CustomerName
     */
    public void setCustomerName(java.lang.String param) {
        localCustomerNameTracker = true;

        this.localCustomerName = param;

    }

    /**
     * field for CustomerNumber
     */

    protected java.lang.String localCustomerNumber;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCustomerNumberTracker = false;

    public boolean isCustomerNumberSpecified() {
        return localCustomerNumberTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCustomerNumber() {
        return localCustomerNumber;
    }

    /**
     * Auto generated setter method
     *
     * @param param CustomerNumber
     */
    public void setCustomerNumber(java.lang.String param) {
        localCustomerNumberTracker = true;

        this.localCustomerNumber = param;

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
     * field for InvoiceItemName
     */

    protected java.lang.String localInvoiceItemName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localInvoiceItemNameTracker = false;

    public boolean isInvoiceItemNameSpecified() {
        return localInvoiceItemNameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getInvoiceItemName() {
        return localInvoiceItemName;
    }

    /**
     * Auto generated setter method
     *
     * @param param InvoiceItemName
     */
    public void setInvoiceItemName(java.lang.String param) {
        localInvoiceItemNameTracker = true;

        this.localInvoiceItemName = param;

    }

    /**
     * field for InvoiceNumber
     */

    protected java.lang.String localInvoiceNumber;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localInvoiceNumberTracker = false;

    public boolean isInvoiceNumberSpecified() {
        return localInvoiceNumberTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getInvoiceNumber() {
        return localInvoiceNumber;
    }

    /**
     * Auto generated setter method
     *
     * @param param InvoiceNumber
     */
    public void setInvoiceNumber(java.lang.String param) {
        localInvoiceNumberTracker = true;

        this.localInvoiceNumber = param;

    }

    /**
     * field for ReferenceId
     */

    protected java.lang.String localReferenceId;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localReferenceIdTracker = false;

    public boolean isReferenceIdSpecified() {
        return localReferenceIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getReferenceId() {
        return localReferenceId;
    }

    /**
     * Auto generated setter method
     *
     * @param param ReferenceId
     */
    public void setReferenceId(java.lang.String param) {
        localReferenceIdTracker = true;

        this.localReferenceId = param;

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
     * field for SourceId
     */

    protected java.lang.String localSourceId;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSourceIdTracker = false;

    public boolean isSourceIdSpecified() {
        return localSourceIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSourceId() {
        return localSourceId;
    }

    /**
     * Auto generated setter method
     *
     * @param param SourceId
     */
    public void setSourceId(java.lang.String param) {
        localSourceIdTracker = true;

        this.localSourceId = param;

    }

    /**
     * field for SourceType
     */

    protected java.lang.String localSourceType;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSourceTypeTracker = false;

    public boolean isSourceTypeSpecified() {
        return localSourceTypeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSourceType() {
        return localSourceType;
    }

    /**
     * Auto generated setter method
     *
     * @param param SourceType
     */
    public void setSourceType(java.lang.String param) {
        localSourceTypeTracker = true;

        this.localSourceType = param;

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
     * field for TransferredToAccounting
     */

    protected java.lang.String localTransferredToAccounting;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTransferredToAccountingTracker = false;

    public boolean isTransferredToAccountingSpecified() {
        return localTransferredToAccountingTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTransferredToAccounting() {
        return localTransferredToAccounting;
    }

    /**
     * Auto generated setter method
     *
     * @param param TransferredToAccounting
     */
    public void setTransferredToAccounting(java.lang.String param) {
        localTransferredToAccountingTracker = true;

        this.localTransferredToAccounting = param;

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
                    "type", namespacePrefix + ":InvoiceItemAdjustment",
                    xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                    "type", "InvoiceItemAdjustment", xmlWriter);
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
        if (localAdjustmentDateTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "AdjustmentDate", xmlWriter);

            if (localAdjustmentDate == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localAdjustmentDate));

            }

            xmlWriter.writeEndElement();
        }
        if (localAdjustmentNumberTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "AdjustmentNumber", xmlWriter);

            if (localAdjustmentNumber == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localAdjustmentNumber);

            }

            xmlWriter.writeEndElement();
        }
        if (localAmountTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "Amount", xmlWriter);

            if (localAmount == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localAmount));

            }

            xmlWriter.writeEndElement();
        }
        if (localCancelledByIdTracker) {
            if (localCancelledById == null) {

                writeStartElement(null, "http://object.api.zuora.com/",
                        "CancelledById", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localCancelledById.serialize(new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "CancelledById"),
                        xmlWriter);
            }
        }
        if (localCancelledDateTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "CancelledDate", xmlWriter);

            if (localCancelledDate == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localCancelledDate));

            }

            xmlWriter.writeEndElement();
        }
        if (localCommentTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "Comment", xmlWriter);

            if (localComment == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localComment);

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
        if (localCustomerNameTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "CustomerName", xmlWriter);

            if (localCustomerName == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localCustomerName);

            }

            xmlWriter.writeEndElement();
        }
        if (localCustomerNumberTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "CustomerNumber", xmlWriter);

            if (localCustomerNumber == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localCustomerNumber);

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
        if (localInvoiceItemNameTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "InvoiceItemName", xmlWriter);

            if (localInvoiceItemName == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localInvoiceItemName);

            }

            xmlWriter.writeEndElement();
        }
        if (localInvoiceNumberTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "InvoiceNumber", xmlWriter);

            if (localInvoiceNumber == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localInvoiceNumber);

            }

            xmlWriter.writeEndElement();
        }
        if (localReferenceIdTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "ReferenceId", xmlWriter);

            if (localReferenceId == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localReferenceId);

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
        if (localSourceIdTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "SourceId", xmlWriter);

            if (localSourceId == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localSourceId);

            }

            xmlWriter.writeEndElement();
        }
        if (localSourceTypeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "SourceType", xmlWriter);

            if (localSourceType == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localSourceType);

            }

            xmlWriter.writeEndElement();
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
        if (localTransferredToAccountingTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "TransferredToAccounting",
                    xmlWriter);

            if (localTransferredToAccounting == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localTransferredToAccounting);

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
                "http://object.api.zuora.com/", "InvoiceItemAdjustment"));
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
        if (localAccountingCodeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "AccountingCode"));

            elementList.add(localAccountingCode == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localAccountingCode));
        }
        if (localAdjustmentDateTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "AdjustmentDate"));

            elementList.add(localAdjustmentDate == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localAdjustmentDate));
        }
        if (localAdjustmentNumberTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "AdjustmentNumber"));

            elementList.add(localAdjustmentNumber == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localAdjustmentNumber));
        }
        if (localAmountTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Amount"));

            elementList.add(localAmount == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localAmount));
        }
        if (localCancelledByIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "CancelledById"));

            elementList.add(localCancelledById == null ? null
                    : localCancelledById);
        }
        if (localCancelledDateTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "CancelledDate"));

            elementList.add(localCancelledDate == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCancelledDate));
        }
        if (localCommentTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Comment"));

            elementList.add(localComment == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localComment));
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
        if (localCustomerNameTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "CustomerName"));

            elementList.add(localCustomerName == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCustomerName));
        }
        if (localCustomerNumberTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "CustomerNumber"));

            elementList.add(localCustomerNumber == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCustomerNumber));
        }
        if (localInvoiceIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "InvoiceId"));

            elementList.add(localInvoiceId == null ? null : localInvoiceId);
        }
        if (localInvoiceItemNameTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "InvoiceItemName"));

            elementList.add(localInvoiceItemName == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localInvoiceItemName));
        }
        if (localInvoiceNumberTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "InvoiceNumber"));

            elementList.add(localInvoiceNumber == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localInvoiceNumber));
        }
        if (localReferenceIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "ReferenceId"));

            elementList.add(localReferenceId == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localReferenceId));
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
        if (localSourceIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "SourceId"));

            elementList.add(localSourceId == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localSourceId));
        }
        if (localSourceTypeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "SourceType"));

            elementList.add(localSourceType == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localSourceType));
        }
        if (localStatusTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Status"));

            elementList.add(localStatus == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localStatus));
        }
        if (localTransferredToAccountingTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "TransferredToAccounting"));

            elementList.add(localTransferredToAccounting == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localTransferredToAccounting));
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
        public static InvoiceItemAdjustment parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            InvoiceItemAdjustment object = new InvoiceItemAdjustment();

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

                        if (!"InvoiceItemAdjustment".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader
                                    .getNamespaceContext().getNamespaceURI(
                                            nsPrefix);
                            return (InvoiceItemAdjustment) com.zuora.api.object.ExtensionMapper
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
                        "AdjustmentDate").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setAdjustmentDate(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "AdjustmentNumber").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setAdjustmentNumber(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "Amount")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setAmount(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "CancelledById")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setCancelledById(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setCancelledById(com.zuora.api.ID.Factory
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
                        "http://object.api.zuora.com/", "CancelledDate")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setCancelledDate(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "Comment")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setComment(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "CustomerName")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setCustomerName(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "CustomerNumber").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setCustomerNumber(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "InvoiceItemName").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setInvoiceItemName(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "InvoiceNumber")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setInvoiceNumber(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "ReferenceId")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setReferenceId(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "SourceId")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setSourceId(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "SourceType")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setSourceType(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "TransferredToAccounting").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setTransferredToAccounting(org.apache.axis2.databinding.utils.ConverterUtil
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
