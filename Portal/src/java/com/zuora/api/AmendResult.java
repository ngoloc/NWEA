/**
 * AmendResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.zuora.api;

/**
 * AmendResult bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class AmendResult implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name =
	 * AmendResult Namespace URI = http://api.zuora.com/ Namespace Prefix = ns1
	 */

    /**
     * field for AmendmentIds This was an Array!
     */

    protected com.zuora.api.ID[] localAmendmentIds;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAmendmentIdsTracker = false;

    public boolean isAmendmentIdsSpecified() {
        return localAmendmentIdsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ID[]
     */
    public com.zuora.api.ID[] getAmendmentIds() {
        return localAmendmentIds;
    }

    /**
     * validate the array for AmendmentIds
     */
    protected void validateAmendmentIds(com.zuora.api.ID[] param) {

    }

    /**
     * Auto generated setter method
     *
     * @param param AmendmentIds
     */
    public void setAmendmentIds(com.zuora.api.ID[] param) {

        validateAmendmentIds(param);

        localAmendmentIdsTracker = true;

        this.localAmendmentIds = param;
    }

    /**
     * Auto generated add method for the array for convenience
     *
     * @param param com.zuora.api.ID
     */
    public void addAmendmentIds(com.zuora.api.ID param) {
        if (localAmendmentIds == null) {
            localAmendmentIds = new com.zuora.api.ID[]{};
        }

        // update the setting tracker
        localAmendmentIdsTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil
                .toList(localAmendmentIds);
        list.add(param);
        this.localAmendmentIds = (com.zuora.api.ID[]) list
                .toArray(new com.zuora.api.ID[list.size()]);

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
     * field for InvoiceDatas This was an Array!
     */

    protected com.zuora.api.InvoiceData[] localInvoiceDatas;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localInvoiceDatasTracker = false;

    public boolean isInvoiceDatasSpecified() {
        return localInvoiceDatasTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.InvoiceData[]
     */
    public com.zuora.api.InvoiceData[] getInvoiceDatas() {
        return localInvoiceDatas;
    }

    /**
     * validate the array for InvoiceDatas
     */
    protected void validateInvoiceDatas(com.zuora.api.InvoiceData[] param) {

    }

    /**
     * Auto generated setter method
     *
     * @param param InvoiceDatas
     */
    public void setInvoiceDatas(com.zuora.api.InvoiceData[] param) {

        validateInvoiceDatas(param);

        localInvoiceDatasTracker = true;

        this.localInvoiceDatas = param;
    }

    /**
     * Auto generated add method for the array for convenience
     *
     * @param param com.zuora.api.InvoiceData
     */
    public void addInvoiceDatas(com.zuora.api.InvoiceData param) {
        if (localInvoiceDatas == null) {
            localInvoiceDatas = new com.zuora.api.InvoiceData[]{};
        }

        // update the setting tracker
        localInvoiceDatasTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil
                .toList(localInvoiceDatas);
        list.add(param);
        this.localInvoiceDatas = (com.zuora.api.InvoiceData[]) list
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
                        namespacePrefix + ":AmendResult", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "AmendResult", xmlWriter);
            }

        }
        if (localAmendmentIdsTracker) {
            if (localAmendmentIds != null) {
                for (int i = 0; i < localAmendmentIds.length; i++) {
                    if (localAmendmentIds[i] != null) {
                        localAmendmentIds[i]
                                .serialize(
                                        new javax.xml.namespace.QName(
                                                "http://api.zuora.com/",
                                                "AmendmentIds"), xmlWriter);
                    } else {

                        writeStartElement(null, "http://api.zuora.com/",
                                "AmendmentIds", xmlWriter);

                        // write the nil attribute
                        writeAttribute("xsi",
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "nil", "1", xmlWriter);
                        xmlWriter.writeEndElement();

                    }

                }
            } else {

                writeStartElement(null, "http://api.zuora.com/",
                        "AmendmentIds", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();

            }
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
        if (localInvoiceDatasTracker) {
            if (localInvoiceDatas != null) {
                for (int i = 0; i < localInvoiceDatas.length; i++) {
                    if (localInvoiceDatas[i] != null) {
                        localInvoiceDatas[i]
                                .serialize(
                                        new javax.xml.namespace.QName(
                                                "http://api.zuora.com/",
                                                "InvoiceDatas"), xmlWriter);
                    } else {

                        writeStartElement(null, "http://api.zuora.com/",
                                "InvoiceDatas", xmlWriter);

                        // write the nil attribute
                        writeAttribute("xsi",
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "nil", "1", xmlWriter);
                        xmlWriter.writeEndElement();

                    }

                }
            } else {

                writeStartElement(null, "http://api.zuora.com/",
                        "InvoiceDatas", xmlWriter);

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

        if (localAmendmentIdsTracker) {
            if (localAmendmentIds != null) {
                for (int i = 0; i < localAmendmentIds.length; i++) {

                    if (localAmendmentIds[i] != null) {
                        elementList.add(new javax.xml.namespace.QName(
                                "http://api.zuora.com/", "AmendmentIds"));
                        elementList.add(localAmendmentIds[i]);
                    } else {

                        elementList.add(new javax.xml.namespace.QName(
                                "http://api.zuora.com/", "AmendmentIds"));
                        elementList.add(null);

                    }

                }
            } else {

                elementList.add(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "AmendmentIds"));
                elementList.add(localAmendmentIds);

            }

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
        if (localInvoiceDatasTracker) {
            if (localInvoiceDatas != null) {
                for (int i = 0; i < localInvoiceDatas.length; i++) {

                    if (localInvoiceDatas[i] != null) {
                        elementList.add(new javax.xml.namespace.QName(
                                "http://api.zuora.com/", "InvoiceDatas"));
                        elementList.add(localInvoiceDatas[i]);
                    } else {

                        elementList.add(new javax.xml.namespace.QName(
                                "http://api.zuora.com/", "InvoiceDatas"));
                        elementList.add(null);

                    }

                }
            } else {

                elementList.add(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "InvoiceDatas"));
                elementList.add(localInvoiceDatas);

            }

        }
        if (localInvoiceIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "InvoiceId"));

            elementList.add(localInvoiceId == null ? null : localInvoiceId);
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
        public static AmendResult parse(javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            AmendResult object = new AmendResult();

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

                        if (!"AmendResult".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader
                                    .getNamespaceContext().getNamespaceURI(
                                            nsPrefix);
                            return (AmendResult) com.zuora.api.object.ExtensionMapper
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

                java.util.ArrayList list2 = new java.util.ArrayList();

                java.util.ArrayList list3 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "AmendmentIds")
                        .equals(reader.getName())) {

                    // Process the array and step past its final element's end.

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        list1.add(null);
                        reader.next();
                    } else {
                        list1.add(com.zuora.api.ID.Factory.parse(reader));
                    }
                    // loop until we find a start element that is not part of
                    // this array
                    boolean loopDone1 = false;
                    while (!loopDone1) {
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
                            loopDone1 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                    "http://api.zuora.com/", "AmendmentIds")
                                    .equals(reader.getName())) {

                                nillableValue = reader
                                        .getAttributeValue(
                                                "http://www.w3.org/2001/XMLSchema-instance",
                                                "nil");
                                if ("true".equals(nillableValue)
                                        || "1".equals(nillableValue)) {
                                    list1.add(null);
                                    reader.next();
                                } else {
                                    list1.add(com.zuora.api.ID.Factory
                                            .parse(reader));
                                }
                            } else {
                                loopDone1 = true;
                            }
                        }
                    }
                    // call the converter utility to convert and set the array

                    object.setAmendmentIds((com.zuora.api.ID[]) org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToArray(com.zuora.api.ID.class, list1));

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
                        list2.add(null);
                        reader.next();
                    } else {
                        list2.add(com.zuora.api.Error.Factory.parse(reader));
                    }
                    // loop until we find a start element that is not part of
                    // this array
                    boolean loopDone2 = false;
                    while (!loopDone2) {
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
                            loopDone2 = true;
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
                                    list2.add(null);
                                    reader.next();
                                } else {
                                    list2.add(com.zuora.api.Error.Factory
                                            .parse(reader));
                                }
                            } else {
                                loopDone2 = true;
                            }
                        }
                    }
                    // call the converter utility to convert and set the array

                    object.setErrors((com.zuora.api.Error[]) org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToArray(com.zuora.api.Error.class, list2));

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "InvoiceDatas")
                        .equals(reader.getName())) {

                    // Process the array and step past its final element's end.

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        list3.add(null);
                        reader.next();
                    } else {
                        list3.add(com.zuora.api.InvoiceData.Factory
                                .parse(reader));
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
                                    "http://api.zuora.com/", "InvoiceDatas")
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
                                    list3.add(com.zuora.api.InvoiceData.Factory
                                            .parse(reader));
                                }
                            } else {
                                loopDone3 = true;
                            }
                        }
                    }
                    // call the converter utility to convert and set the array

                    object.setInvoiceDatas((com.zuora.api.InvoiceData[]) org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToArray(com.zuora.api.InvoiceData.class,
                                    list3));

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
