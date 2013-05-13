/**
 * SubscribeResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.zuora.api;

/**
 * SubscribeResult bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class SubscribeResult implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name =
	 * SubscribeResult Namespace URI = http://api.zuora.com/ Namespace Prefix =
	 * ns1
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
     * field for Errors This was an Array!
     */

    protected com.zuora.api.Error[] localErrors;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localErrorsTracker = false;

    public boolean isErrorsSpecified() {
        return localErrorsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.Error[]
     */
    public com.zuora.api.Error[] getErrors() {
        return localErrors;
    }

    /**
     * validate the array for Errors
     */
    protected void validateErrors(com.zuora.api.Error[] param) {

    }

    /**
     * Auto generated setter method
     *
     * @param param Errors
     */
    public void setErrors(com.zuora.api.Error[] param) {

        validateErrors(param);

        localErrorsTracker = true;

        this.localErrors = param;
    }

    /**
     * Auto generated add method for the array for convenience
     *
     * @param param com.zuora.api.Error
     */
    public void addErrors(com.zuora.api.Error param) {
        if (localErrors == null) {
            localErrors = new com.zuora.api.Error[]{};
        }

        // update the setting tracker
        localErrorsTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil
                .toList(localErrors);
        list.add(param);
        this.localErrors = (com.zuora.api.Error[]) list
                .toArray(new com.zuora.api.Error[list.size()]);

    }

    /**
     * field for InvoiceData This was an Array!
     */

    protected com.zuora.api.InvoiceData[] localInvoiceData;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localInvoiceDataTracker = false;

    public boolean isInvoiceDataSpecified() {
        return localInvoiceDataTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.InvoiceData[]
     */
    public com.zuora.api.InvoiceData[] getInvoiceData() {
        return localInvoiceData;
    }

    /**
     * validate the array for InvoiceData
     */
    protected void validateInvoiceData(com.zuora.api.InvoiceData[] param) {

    }

    /**
     * Auto generated setter method
     *
     * @param param InvoiceData
     */
    public void setInvoiceData(com.zuora.api.InvoiceData[] param) {

        validateInvoiceData(param);

        localInvoiceDataTracker = true;

        this.localInvoiceData = param;
    }

    /**
     * Auto generated add method for the array for convenience
     *
     * @param param com.zuora.api.InvoiceData
     */
    public void addInvoiceData(com.zuora.api.InvoiceData param) {
        if (localInvoiceData == null) {
            localInvoiceData = new com.zuora.api.InvoiceData[]{};
        }

        // update the setting tracker
        localInvoiceDataTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil
                .toList(localInvoiceData);
        list.add(param);
        this.localInvoiceData = (com.zuora.api.InvoiceData[]) list
                .toArray(new com.zuora.api.InvoiceData[list.size()]);

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
     * field for InvoiceResult
     */

    protected com.zuora.api.InvoiceResult localInvoiceResult;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localInvoiceResultTracker = false;

    public boolean isInvoiceResultSpecified() {
        return localInvoiceResultTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.InvoiceResult
     */
    public com.zuora.api.InvoiceResult getInvoiceResult() {
        return localInvoiceResult;
    }

    /**
     * Auto generated setter method
     *
     * @param param InvoiceResult
     */
    public void setInvoiceResult(com.zuora.api.InvoiceResult param) {
        localInvoiceResultTracker = true;

        this.localInvoiceResult = param;

    }

    /**
     * field for PaymentId
     */

    protected com.zuora.api.ID localPaymentId;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPaymentIdTracker = false;

    public boolean isPaymentIdSpecified() {
        return localPaymentIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ID
     */
    public com.zuora.api.ID getPaymentId() {
        return localPaymentId;
    }

    /**
     * Auto generated setter method
     *
     * @param param PaymentId
     */
    public void setPaymentId(com.zuora.api.ID param) {
        localPaymentIdTracker = true;

        this.localPaymentId = param;

    }

    /**
     * field for PaymentTransactionNumber
     */

    protected java.lang.String localPaymentTransactionNumber;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPaymentTransactionNumberTracker = false;

    public boolean isPaymentTransactionNumberSpecified() {
        return localPaymentTransactionNumberTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getPaymentTransactionNumber() {
        return localPaymentTransactionNumber;
    }

    /**
     * Auto generated setter method
     *
     * @param param PaymentTransactionNumber
     */
    public void setPaymentTransactionNumber(java.lang.String param) {
        localPaymentTransactionNumberTracker = true;

        this.localPaymentTransactionNumber = param;

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
     * field for Success
     */

    protected boolean localSuccess;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSuccessTracker = false;

    public boolean isSuccessSpecified() {
        return localSuccessTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getSuccess() {
        return localSuccess;
    }

    /**
     * Auto generated setter method
     *
     * @param param Success
     */
    public void setSuccess(boolean param) {

        // setting primitive attribute tracker to true
        localSuccessTracker = true;

        this.localSuccess = param;

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

        if (serializeType) {

            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://api.zuora.com/");
            if ((namespacePrefix != null)
                    && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":SubscribeResult", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "SubscribeResult", xmlWriter);
            }

        }
        if (localAccountIdTracker) {
            if (localAccountId == null) {

                writeStartElement(null, "http://api.zuora.com/", "AccountId",
                        xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localAccountId.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "AccountId"), xmlWriter);
            }
        }
        if (localAccountNumberTracker) {
            namespace = "http://api.zuora.com/";
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
        if (localErrorsTracker) {
            if (localErrors != null) {
                for (int i = 0; i < localErrors.length; i++) {
                    if (localErrors[i] != null) {
                        localErrors[i].serialize(new javax.xml.namespace.QName(
                                "http://api.zuora.com/", "Errors"), xmlWriter);
                    } else {

                        writeStartElement(null, "http://api.zuora.com/",
                                "Errors", xmlWriter);

                        // write the nil attribute
                        writeAttribute("xsi",
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "nil", "1", xmlWriter);
                        xmlWriter.writeEndElement();

                    }

                }
            } else {

                writeStartElement(null, "http://api.zuora.com/", "Errors",
                        xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();

            }
        }
        if (localInvoiceDataTracker) {
            if (localInvoiceData != null) {
                for (int i = 0; i < localInvoiceData.length; i++) {
                    if (localInvoiceData[i] != null) {
                        localInvoiceData[i]
                                .serialize(
                                        new javax.xml.namespace.QName(
                                                "http://api.zuora.com/",
                                                "InvoiceData"), xmlWriter);
                    } else {

                        writeStartElement(null, "http://api.zuora.com/",
                                "InvoiceData", xmlWriter);

                        // write the nil attribute
                        writeAttribute("xsi",
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "nil", "1", xmlWriter);
                        xmlWriter.writeEndElement();

                    }

                }
            } else {

                writeStartElement(null, "http://api.zuora.com/", "InvoiceData",
                        xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();

            }
        }
        if (localInvoiceIdTracker) {
            if (localInvoiceId == null) {

                writeStartElement(null, "http://api.zuora.com/", "InvoiceId",
                        xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localInvoiceId.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "InvoiceId"), xmlWriter);
            }
        }
        if (localInvoiceNumberTracker) {
            namespace = "http://api.zuora.com/";
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
        if (localInvoiceResultTracker) {
            if (localInvoiceResult == null) {

                writeStartElement(null, "http://api.zuora.com/",
                        "InvoiceResult", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localInvoiceResult.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "InvoiceResult"), xmlWriter);
            }
        }
        if (localPaymentIdTracker) {
            if (localPaymentId == null) {

                writeStartElement(null, "http://api.zuora.com/", "PaymentId",
                        xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localPaymentId.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "PaymentId"), xmlWriter);
            }
        }
        if (localPaymentTransactionNumberTracker) {
            namespace = "http://api.zuora.com/";
            writeStartElement(null, namespace, "PaymentTransactionNumber",
                    xmlWriter);

            if (localPaymentTransactionNumber == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localPaymentTransactionNumber);

            }

            xmlWriter.writeEndElement();
        }
        if (localSubscriptionIdTracker) {
            if (localSubscriptionId == null) {

                writeStartElement(null, "http://api.zuora.com/",
                        "SubscriptionId", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localSubscriptionId.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "SubscriptionId"), xmlWriter);
            }
        }
        if (localSubscriptionNumberTracker) {
            namespace = "http://api.zuora.com/";
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
        if (localSuccessTracker) {
            namespace = "http://api.zuora.com/";
            writeStartElement(null, namespace, "Success", xmlWriter);

            if (false) {

                throw new org.apache.axis2.databinding.ADBException(
                        "Success cannot be null!!");

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localSuccess));
            }

            xmlWriter.writeEndElement();
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

        if (localAccountIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "AccountId"));

            elementList.add(localAccountId == null ? null : localAccountId);
        }
        if (localAccountNumberTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "AccountNumber"));

            elementList.add(localAccountNumber == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localAccountNumber));
        }
        if (localErrorsTracker) {
            if (localErrors != null) {
                for (int i = 0; i < localErrors.length; i++) {

                    if (localErrors[i] != null) {
                        elementList.add(new javax.xml.namespace.QName(
                                "http://api.zuora.com/", "Errors"));
                        elementList.add(localErrors[i]);
                    } else {

                        elementList.add(new javax.xml.namespace.QName(
                                "http://api.zuora.com/", "Errors"));
                        elementList.add(null);

                    }

                }
            } else {

                elementList.add(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "Errors"));
                elementList.add(localErrors);

            }

        }
        if (localInvoiceDataTracker) {
            if (localInvoiceData != null) {
                for (int i = 0; i < localInvoiceData.length; i++) {

                    if (localInvoiceData[i] != null) {
                        elementList.add(new javax.xml.namespace.QName(
                                "http://api.zuora.com/", "InvoiceData"));
                        elementList.add(localInvoiceData[i]);
                    } else {

                        elementList.add(new javax.xml.namespace.QName(
                                "http://api.zuora.com/", "InvoiceData"));
                        elementList.add(null);

                    }

                }
            } else {

                elementList.add(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "InvoiceData"));
                elementList.add(localInvoiceData);

            }

        }
        if (localInvoiceIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "InvoiceId"));

            elementList.add(localInvoiceId == null ? null : localInvoiceId);
        }
        if (localInvoiceNumberTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "InvoiceNumber"));

            elementList.add(localInvoiceNumber == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localInvoiceNumber));
        }
        if (localInvoiceResultTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "InvoiceResult"));

            elementList.add(localInvoiceResult == null ? null
                    : localInvoiceResult);
        }
        if (localPaymentIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "PaymentId"));

            elementList.add(localPaymentId == null ? null : localPaymentId);
        }
        if (localPaymentTransactionNumberTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "PaymentTransactionNumber"));

            elementList.add(localPaymentTransactionNumber == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localPaymentTransactionNumber));
        }
        if (localSubscriptionIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "SubscriptionId"));

            elementList.add(localSubscriptionId == null ? null
                    : localSubscriptionId);
        }
        if (localSubscriptionNumberTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "SubscriptionNumber"));

            elementList.add(localSubscriptionNumber == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localSubscriptionNumber));
        }
        if (localSuccessTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "Success"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localSuccess));
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
        public static SubscribeResult parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            SubscribeResult object = new SubscribeResult();

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

                        if (!"SubscribeResult".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader
                                    .getNamespaceContext().getNamespaceURI(
                                            nsPrefix);
                            return (SubscribeResult) com.zuora.api.object.ExtensionMapper
                                    .getTypeObject(nsUri, type, reader);
                        }

                    }

                }

                // Note all attributes that were handled. Used to differ normal
                // attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list3 = new java.util.ArrayList();

                java.util.ArrayList list4 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "AccountId")
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
                        "http://api.zuora.com/", "AccountNumber")
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
                        "http://api.zuora.com/", "Errors")
                        .equals(reader.getName())) {

                    // Process the array and step past its final element's end.

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        list3.add(null);
                        reader.next();
                    } else {
                        list3.add(com.zuora.api.Error.Factory.parse(reader));
                    }
                    // loop until we find a start element that is not part of
                    // this array
                    boolean loopDone3 = false;
                    while (!loopDone3) {
                        // We should be at the end element, but make sure
                        while (!reader.isEndElement())
                            reader.next();
                        // Step out of this element
                        reader.next();
                        // Step to next element event.
                        while (!reader.isStartElement()
                                && !reader.isEndElement())
                            reader.next();
                        if (reader.isEndElement()) {
                            // two continuous end elements means we are exiting
                            // the xml structure
                            loopDone3 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                    "http://api.zuora.com/", "Errors")
                                    .equals(reader.getName())) {

                                nillableValue = reader
                                        .getAttributeValue(
                                                "http://www.w3.org/2001/XMLSchema-instance",
                                                "nil");
                                if ("true".equals(nillableValue)
                                        || "1".equals(nillableValue)) {
                                    list3.add(null);
                                    reader.next();
                                } else {
                                    list3.add(com.zuora.api.Error.Factory
                                            .parse(reader));
                                }
                            } else {
                                loopDone3 = true;
                            }
                        }
                    }
                    // call the converter utility to convert and set the array

                    object.setErrors((com.zuora.api.Error[]) org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToArray(com.zuora.api.Error.class, list3));

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "InvoiceData")
                        .equals(reader.getName())) {

                    // Process the array and step past its final element's end.

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        list4.add(null);
                        reader.next();
                    } else {
                        list4.add(com.zuora.api.InvoiceData.Factory
                                .parse(reader));
                    }
                    // loop until we find a start element that is not part of
                    // this array
                    boolean loopDone4 = false;
                    while (!loopDone4) {
                        // We should be at the end element, but make sure
                        while (!reader.isEndElement())
                            reader.next();
                        // Step out of this element
                        reader.next();
                        // Step to next element event.
                        while (!reader.isStartElement()
                                && !reader.isEndElement())
                            reader.next();
                        if (reader.isEndElement()) {
                            // two continuous end elements means we are exiting
                            // the xml structure
                            loopDone4 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                    "http://api.zuora.com/", "InvoiceData")
                                    .equals(reader.getName())) {

                                nillableValue = reader
                                        .getAttributeValue(
                                                "http://www.w3.org/2001/XMLSchema-instance",
                                                "nil");
                                if ("true".equals(nillableValue)
                                        || "1".equals(nillableValue)) {
                                    list4.add(null);
                                    reader.next();
                                } else {
                                    list4.add(com.zuora.api.InvoiceData.Factory
                                            .parse(reader));
                                }
                            } else {
                                loopDone4 = true;
                            }
                        }
                    }
                    // call the converter utility to convert and set the array

                    object.setInvoiceData((com.zuora.api.InvoiceData[]) org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToArray(com.zuora.api.InvoiceData.class,
                                    list4));

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "InvoiceId")
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
                        "http://api.zuora.com/", "InvoiceNumber")
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
                        "http://api.zuora.com/", "InvoiceResult")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setInvoiceResult(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setInvoiceResult(com.zuora.api.InvoiceResult.Factory
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
                        "http://api.zuora.com/", "PaymentId")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setPaymentId(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setPaymentId(com.zuora.api.ID.Factory
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
                        "PaymentTransactionNumber").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setPaymentTransactionNumber(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://api.zuora.com/", "SubscriptionId")
                        .equals(reader.getName())) {

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
                        "http://api.zuora.com/", "SubscriptionNumber")
                        .equals(reader.getName())) {

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
                        "http://api.zuora.com/", "Success")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Success"
                                        + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSuccess(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToBoolean(content));

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
