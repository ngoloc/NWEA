/**
 * Usage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.zuora.api.object;

/**
 * Usage bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class Usage extends com.zuora.api.object.ZObject implements
        org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name = Usage
	 * Namespace URI = http://object.api.zuora.com/ Namespace Prefix = ns2
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
     * field for AncestorAccountId
     */

    protected com.zuora.api.ID localAncestorAccountId;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAncestorAccountIdTracker = false;

    public boolean isAncestorAccountIdSpecified() {
        return localAncestorAccountIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ID
     */
    public com.zuora.api.ID getAncestorAccountId() {
        return localAncestorAccountId;
    }

    /**
     * Auto generated setter method
     *
     * @param param AncestorAccountId
     */
    public void setAncestorAccountId(com.zuora.api.ID param) {
        localAncestorAccountIdTracker = true;

        this.localAncestorAccountId = param;

    }

    /**
     * field for ChargeId
     */

    protected com.zuora.api.ID localChargeId;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localChargeIdTracker = false;

    public boolean isChargeIdSpecified() {
        return localChargeIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ID
     */
    public com.zuora.api.ID getChargeId() {
        return localChargeId;
    }

    /**
     * Auto generated setter method
     *
     * @param param ChargeId
     */
    public void setChargeId(com.zuora.api.ID param) {
        localChargeIdTracker = true;

        this.localChargeId = param;

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
     * field for Description
     */

    protected java.lang.String localDescription;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localDescriptionTracker = false;

    public boolean isDescriptionSpecified() {
        return localDescriptionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDescription() {
        return localDescription;
    }

    /**
     * Auto generated setter method
     *
     * @param param Description
     */
    public void setDescription(java.lang.String param) {
        localDescriptionTracker = true;

        this.localDescription = param;

    }

    /**
     * field for EndDateTime
     */

    protected java.util.Calendar localEndDateTime;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localEndDateTimeTracker = false;

    public boolean isEndDateTimeSpecified() {
        return localEndDateTimeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getEndDateTime() {
        return localEndDateTime;
    }

    /**
     * Auto generated setter method
     *
     * @param param EndDateTime
     */
    public void setEndDateTime(java.util.Calendar param) {
        localEndDateTimeTracker = true;

        this.localEndDateTime = param;

    }

    /**
     * field for ImportId
     */

    protected com.zuora.api.ID localImportId;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localImportIdTracker = false;

    public boolean isImportIdSpecified() {
        return localImportIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ID
     */
    public com.zuora.api.ID getImportId() {
        return localImportId;
    }

    /**
     * Auto generated setter method
     *
     * @param param ImportId
     */
    public void setImportId(com.zuora.api.ID param) {
        localImportIdTracker = true;

        this.localImportId = param;

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
     * field for RbeStatus
     */

    protected java.lang.String localRbeStatus;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRbeStatusTracker = false;

    public boolean isRbeStatusSpecified() {
        return localRbeStatusTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getRbeStatus() {
        return localRbeStatus;
    }

    /**
     * Auto generated setter method
     *
     * @param param RbeStatus
     */
    public void setRbeStatus(java.lang.String param) {
        localRbeStatusTracker = true;

        this.localRbeStatus = param;

    }

    /**
     * field for SourceName
     */

    protected java.lang.String localSourceName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSourceNameTracker = false;

    public boolean isSourceNameSpecified() {
        return localSourceNameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSourceName() {
        return localSourceName;
    }

    /**
     * Auto generated setter method
     *
     * @param param SourceName
     */
    public void setSourceName(java.lang.String param) {
        localSourceNameTracker = true;

        this.localSourceName = param;

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
     * field for StartDateTime
     */

    protected java.util.Calendar localStartDateTime;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localStartDateTimeTracker = false;

    public boolean isStartDateTimeSpecified() {
        return localStartDateTimeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getStartDateTime() {
        return localStartDateTime;
    }

    /**
     * Auto generated setter method
     *
     * @param param StartDateTime
     */
    public void setStartDateTime(java.util.Calendar param) {
        localStartDateTimeTracker = true;

        this.localStartDateTime = param;

    }

    /**
     * field for SubmissionDateTime
     */

    protected java.util.Calendar localSubmissionDateTime;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSubmissionDateTimeTracker = false;

    public boolean isSubmissionDateTimeSpecified() {
        return localSubmissionDateTimeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getSubmissionDateTime() {
        return localSubmissionDateTime;
    }

    /**
     * Auto generated setter method
     *
     * @param param SubmissionDateTime
     */
    public void setSubmissionDateTime(java.util.Calendar param) {
        localSubmissionDateTimeTracker = true;

        this.localSubmissionDateTime = param;

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
                    "type", namespacePrefix + ":Usage", xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                    "type", "Usage", xmlWriter);
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
        if (localAncestorAccountIdTracker) {
            if (localAncestorAccountId == null) {

                writeStartElement(null, "http://object.api.zuora.com/",
                        "AncestorAccountId", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localAncestorAccountId.serialize(new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "AncestorAccountId"),
                        xmlWriter);
            }
        }
        if (localChargeIdTracker) {
            if (localChargeId == null) {

                writeStartElement(null, "http://object.api.zuora.com/",
                        "ChargeId", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localChargeId.serialize(new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "ChargeId"), xmlWriter);
            }
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
        if (localDescriptionTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "Description", xmlWriter);

            if (localDescription == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localDescription);

            }

            xmlWriter.writeEndElement();
        }
        if (localEndDateTimeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "EndDateTime", xmlWriter);

            if (localEndDateTime == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localEndDateTime));

            }

            xmlWriter.writeEndElement();
        }
        if (localImportIdTracker) {
            if (localImportId == null) {

                writeStartElement(null, "http://object.api.zuora.com/",
                        "ImportId", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localImportId.serialize(new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "ImportId"), xmlWriter);
            }
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
        if (localRbeStatusTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "RbeStatus", xmlWriter);

            if (localRbeStatus == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localRbeStatus);

            }

            xmlWriter.writeEndElement();
        }
        if (localSourceNameTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "SourceName", xmlWriter);

            if (localSourceName == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localSourceName);

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
        if (localStartDateTimeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "StartDateTime", xmlWriter);

            if (localStartDateTime == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localStartDateTime));

            }

            xmlWriter.writeEndElement();
        }
        if (localSubmissionDateTimeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "SubmissionDateTime", xmlWriter);

            if (localSubmissionDateTime == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localSubmissionDateTime));

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
                "http://object.api.zuora.com/", "Usage"));
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
        if (localAccountNumberTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "AccountNumber"));

            elementList.add(localAccountNumber == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localAccountNumber));
        }
        if (localAncestorAccountIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "AncestorAccountId"));

            elementList.add(localAncestorAccountId == null ? null
                    : localAncestorAccountId);
        }
        if (localChargeIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "ChargeId"));

            elementList.add(localChargeId == null ? null : localChargeId);
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
        if (localDescriptionTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Description"));

            elementList.add(localDescription == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localDescription));
        }
        if (localEndDateTimeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "EndDateTime"));

            elementList.add(localEndDateTime == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localEndDateTime));
        }
        if (localImportIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "ImportId"));

            elementList.add(localImportId == null ? null : localImportId);
        }
        if (localInvoiceIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "InvoiceId"));

            elementList.add(localInvoiceId == null ? null : localInvoiceId);
        }
        if (localInvoiceNumberTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "InvoiceNumber"));

            elementList.add(localInvoiceNumber == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localInvoiceNumber));
        }
        if (localQuantityTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Quantity"));

            elementList.add(localQuantity == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localQuantity));
        }
        if (localRbeStatusTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "RbeStatus"));

            elementList.add(localRbeStatus == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localRbeStatus));
        }
        if (localSourceNameTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "SourceName"));

            elementList.add(localSourceName == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localSourceName));
        }
        if (localSourceTypeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "SourceType"));

            elementList.add(localSourceType == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localSourceType));
        }
        if (localStartDateTimeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "StartDateTime"));

            elementList.add(localStartDateTime == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localStartDateTime));
        }
        if (localSubmissionDateTimeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "SubmissionDateTime"));

            elementList.add(localSubmissionDateTime == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localSubmissionDateTime));
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
        public static Usage parse(javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            Usage object = new Usage();

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

                        if (!"Usage".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader
                                    .getNamespaceContext().getNamespaceURI(
                                            nsPrefix);
                            return (Usage) com.zuora.api.object.ExtensionMapper
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "AncestorAccountId").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setAncestorAccountId(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setAncestorAccountId(com.zuora.api.ID.Factory
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
                        "http://object.api.zuora.com/", "ChargeId")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setChargeId(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setChargeId(com.zuora.api.ID.Factory
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
                        "http://object.api.zuora.com/", "Description")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setDescription(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "EndDateTime")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setEndDateTime(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "ImportId")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setImportId(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setImportId(com.zuora.api.ID.Factory
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
                        "http://object.api.zuora.com/", "RbeStatus")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setRbeStatus(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "SourceName")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setSourceName(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "StartDateTime")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setStartDateTime(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "SubmissionDateTime").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setSubmissionDateTime(org.apache.axis2.databinding.utils.ConverterUtil
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
