/**
 * SubscribeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.zuora.api;

/**
 * SubscribeRequest bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class SubscribeRequest implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name =
	 * SubscribeRequest Namespace URI = http://api.zuora.com/ Namespace Prefix =
	 * ns1
	 */

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
     * field for PaymentMethod
     */

    protected com.zuora.api.object.PaymentMethod localPaymentMethod;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPaymentMethodTracker = false;

    public boolean isPaymentMethodSpecified() {
        return localPaymentMethodTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.PaymentMethod
     */
    public com.zuora.api.object.PaymentMethod getPaymentMethod() {
        return localPaymentMethod;
    }

    /**
     * Auto generated setter method
     *
     * @param param PaymentMethod
     */
    public void setPaymentMethod(com.zuora.api.object.PaymentMethod param) {
        localPaymentMethodTracker = true;

        this.localPaymentMethod = param;

    }

    /**
     * field for BillToContact
     */

    protected com.zuora.api.object.Contact localBillToContact;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localBillToContactTracker = false;

    public boolean isBillToContactSpecified() {
        return localBillToContactTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.Contact
     */
    public com.zuora.api.object.Contact getBillToContact() {
        return localBillToContact;
    }

    /**
     * Auto generated setter method
     *
     * @param param BillToContact
     */
    public void setBillToContact(com.zuora.api.object.Contact param) {
        localBillToContactTracker = true;

        this.localBillToContact = param;

    }

    /**
     * field for PreviewOptions
     */

    protected com.zuora.api.PreviewOptions localPreviewOptions;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPreviewOptionsTracker = false;

    public boolean isPreviewOptionsSpecified() {
        return localPreviewOptionsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.PreviewOptions
     */
    public com.zuora.api.PreviewOptions getPreviewOptions() {
        return localPreviewOptions;
    }

    /**
     * Auto generated setter method
     *
     * @param param PreviewOptions
     */
    public void setPreviewOptions(com.zuora.api.PreviewOptions param) {
        localPreviewOptionsTracker = true;

        this.localPreviewOptions = param;

    }

    /**
     * field for SoldToContact
     */

    protected com.zuora.api.object.Contact localSoldToContact;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSoldToContactTracker = false;

    public boolean isSoldToContactSpecified() {
        return localSoldToContactTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.Contact
     */
    public com.zuora.api.object.Contact getSoldToContact() {
        return localSoldToContact;
    }

    /**
     * Auto generated setter method
     *
     * @param param SoldToContact
     */
    public void setSoldToContact(com.zuora.api.object.Contact param) {
        localSoldToContactTracker = true;

        this.localSoldToContact = param;

    }

    /**
     * field for SubscribeOptions
     */

    protected com.zuora.api.SubscribeOptions localSubscribeOptions;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSubscribeOptionsTracker = false;

    public boolean isSubscribeOptionsSpecified() {
        return localSubscribeOptionsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.SubscribeOptions
     */
    public com.zuora.api.SubscribeOptions getSubscribeOptions() {
        return localSubscribeOptions;
    }

    /**
     * Auto generated setter method
     *
     * @param param SubscribeOptions
     */
    public void setSubscribeOptions(com.zuora.api.SubscribeOptions param) {
        localSubscribeOptionsTracker = true;

        this.localSubscribeOptions = param;

    }

    /**
     * field for SubscriptionData
     */

    protected com.zuora.api.SubscriptionData localSubscriptionData;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSubscriptionDataTracker = false;

    public boolean isSubscriptionDataSpecified() {
        return localSubscriptionDataTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.SubscriptionData
     */
    public com.zuora.api.SubscriptionData getSubscriptionData() {
        return localSubscriptionData;
    }

    /**
     * Auto generated setter method
     *
     * @param param SubscriptionData
     */
    public void setSubscriptionData(com.zuora.api.SubscriptionData param) {
        localSubscriptionDataTracker = true;

        this.localSubscriptionData = param;

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
                        namespacePrefix + ":SubscribeRequest", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "SubscribeRequest", xmlWriter);
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
        if (localPaymentMethodTracker) {
            if (localPaymentMethod == null) {

                writeStartElement(null, "http://api.zuora.com/",
                        "PaymentMethod", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localPaymentMethod.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "PaymentMethod"), xmlWriter);
            }
        }
        if (localBillToContactTracker) {
            if (localBillToContact == null) {

                writeStartElement(null, "http://api.zuora.com/",
                        "BillToContact", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localBillToContact.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "BillToContact"), xmlWriter);
            }
        }
        if (localPreviewOptionsTracker) {
            if (localPreviewOptions == null) {

                writeStartElement(null, "http://api.zuora.com/",
                        "PreviewOptions", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localPreviewOptions.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "PreviewOptions"), xmlWriter);
            }
        }
        if (localSoldToContactTracker) {
            if (localSoldToContact == null) {

                writeStartElement(null, "http://api.zuora.com/",
                        "SoldToContact", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localSoldToContact.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "SoldToContact"), xmlWriter);
            }
        }
        if (localSubscribeOptionsTracker) {
            if (localSubscribeOptions == null) {

                writeStartElement(null, "http://api.zuora.com/",
                        "SubscribeOptions", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localSubscribeOptions
                        .serialize(new javax.xml.namespace.QName(
                                "http://api.zuora.com/", "SubscribeOptions"),
                                xmlWriter);
            }
        }
        if (localSubscriptionDataTracker) {
            if (localSubscriptionData == null) {

                writeStartElement(null, "http://api.zuora.com/",
                        "SubscriptionData", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localSubscriptionData
                        .serialize(new javax.xml.namespace.QName(
                                "http://api.zuora.com/", "SubscriptionData"),
                                xmlWriter);
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
        if (localPaymentMethodTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "PaymentMethod"));

            elementList.add(localPaymentMethod == null ? null
                    : localPaymentMethod);
        }
        if (localBillToContactTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "BillToContact"));

            elementList.add(localBillToContact == null ? null
                    : localBillToContact);
        }
        if (localPreviewOptionsTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "PreviewOptions"));

            elementList.add(localPreviewOptions == null ? null
                    : localPreviewOptions);
        }
        if (localSoldToContactTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "SoldToContact"));

            elementList.add(localSoldToContact == null ? null
                    : localSoldToContact);
        }
        if (localSubscribeOptionsTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "SubscribeOptions"));

            elementList.add(localSubscribeOptions == null ? null
                    : localSubscribeOptions);
        }
        if (localSubscriptionDataTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "SubscriptionData"));

            elementList.add(localSubscriptionData == null ? null
                    : localSubscriptionData);
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
        public static SubscribeRequest parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            SubscribeRequest object = new SubscribeRequest();

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

                        if (!"SubscribeRequest".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader
                                    .getNamespaceContext().getNamespaceURI(
                                            nsPrefix);
                            return (SubscribeRequest) com.zuora.api.object.ExtensionMapper
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
                        "http://api.zuora.com/", "PaymentMethod")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setPaymentMethod(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setPaymentMethod(com.zuora.api.object.PaymentMethod.Factory
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
                        "http://api.zuora.com/", "BillToContact")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setBillToContact(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setBillToContact(com.zuora.api.object.Contact.Factory
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
                        "http://api.zuora.com/", "PreviewOptions")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setPreviewOptions(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setPreviewOptions(com.zuora.api.PreviewOptions.Factory
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
                        "http://api.zuora.com/", "SoldToContact")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setSoldToContact(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setSoldToContact(com.zuora.api.object.Contact.Factory
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
                        "http://api.zuora.com/", "SubscribeOptions")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setSubscribeOptions(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setSubscribeOptions(com.zuora.api.SubscribeOptions.Factory
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
                        "http://api.zuora.com/", "SubscriptionData")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setSubscriptionData(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setSubscriptionData(com.zuora.api.SubscriptionData.Factory
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
