/**
 * SubscriptionData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.zuora.api;

/**
 * SubscriptionData bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class SubscriptionData implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name =
	 * SubscriptionData Namespace URI = http://api.zuora.com/ Namespace Prefix =
	 * ns1
	 */

    /**
     * field for Subscription
     */

    protected com.zuora.api.object.Subscription localSubscription;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSubscriptionTracker = false;

    public boolean isSubscriptionSpecified() {
        return localSubscriptionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.object.Subscription
     */
    public com.zuora.api.object.Subscription getSubscription() {
        return localSubscription;
    }

    /**
     * Auto generated setter method
     *
     * @param param Subscription
     */
    public void setSubscription(com.zuora.api.object.Subscription param) {
        localSubscriptionTracker = true;

        this.localSubscription = param;

    }

    /**
     * field for RatePlanData This was an Array!
     */

    protected com.zuora.api.RatePlanData[] localRatePlanData;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRatePlanDataTracker = false;

    public boolean isRatePlanDataSpecified() {
        return localRatePlanDataTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.RatePlanData[]
     */
    public com.zuora.api.RatePlanData[] getRatePlanData() {
        return localRatePlanData;
    }

    /**
     * validate the array for RatePlanData
     */
    protected void validateRatePlanData(com.zuora.api.RatePlanData[] param) {

    }

    /**
     * Auto generated setter method
     *
     * @param param RatePlanData
     */
    public void setRatePlanData(com.zuora.api.RatePlanData[] param) {

        validateRatePlanData(param);

        localRatePlanDataTracker = true;

        this.localRatePlanData = param;
    }

    /**
     * Auto generated add method for the array for convenience
     *
     * @param param com.zuora.api.RatePlanData
     */
    public void addRatePlanData(com.zuora.api.RatePlanData param) {
        if (localRatePlanData == null) {
            localRatePlanData = new com.zuora.api.RatePlanData[]{};
        }

        // update the setting tracker
        localRatePlanDataTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil
                .toList(localRatePlanData);
        list.add(param);
        this.localRatePlanData = (com.zuora.api.RatePlanData[]) list
                .toArray(new com.zuora.api.RatePlanData[list.size()]);

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
                        namespacePrefix + ":SubscriptionData", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "SubscriptionData", xmlWriter);
            }

        }
        if (localSubscriptionTracker) {
            if (localSubscription == null) {

                writeStartElement(null, "http://api.zuora.com/",
                        "Subscription", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localSubscription.serialize(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "Subscription"), xmlWriter);
            }
        }
        if (localRatePlanDataTracker) {
            if (localRatePlanData != null) {
                for (int i = 0; i < localRatePlanData.length; i++) {
                    if (localRatePlanData[i] != null) {
                        localRatePlanData[i]
                                .serialize(
                                        new javax.xml.namespace.QName(
                                                "http://api.zuora.com/",
                                                "RatePlanData"), xmlWriter);
                    } else {

                        writeStartElement(null, "http://api.zuora.com/",
                                "RatePlanData", xmlWriter);

                        // write the nil attribute
                        writeAttribute("xsi",
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "nil", "1", xmlWriter);
                        xmlWriter.writeEndElement();

                    }

                }
            } else {

                writeStartElement(null, "http://api.zuora.com/",
                        "RatePlanData", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();

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

        if (localSubscriptionTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://api.zuora.com/", "Subscription"));

            elementList.add(localSubscription == null ? null
                    : localSubscription);
        }
        if (localRatePlanDataTracker) {
            if (localRatePlanData != null) {
                for (int i = 0; i < localRatePlanData.length; i++) {

                    if (localRatePlanData[i] != null) {
                        elementList.add(new javax.xml.namespace.QName(
                                "http://api.zuora.com/", "RatePlanData"));
                        elementList.add(localRatePlanData[i]);
                    } else {

                        elementList.add(new javax.xml.namespace.QName(
                                "http://api.zuora.com/", "RatePlanData"));
                        elementList.add(null);

                    }

                }
            } else {

                elementList.add(new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "RatePlanData"));
                elementList.add(localRatePlanData);

            }

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
        public static SubscriptionData parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            SubscriptionData object = new SubscriptionData();

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

                        if (!"SubscriptionData".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader
                                    .getNamespaceContext().getNamespaceURI(
                                            nsPrefix);
                            return (SubscriptionData) com.zuora.api.object.ExtensionMapper
                                    .getTypeObject(nsUri, type, reader);
                        }

                    }

                }

                // Note all attributes that were handled. Used to differ normal
                // attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list2 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://api.zuora.com/", "Subscription")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setSubscription(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setSubscription(com.zuora.api.object.Subscription.Factory
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
                        "http://api.zuora.com/", "RatePlanData")
                        .equals(reader.getName())) {

                    // Process the array and step past its final element's end.

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        list2.add(null);
                        reader.next();
                    } else {
                        list2.add(com.zuora.api.RatePlanData.Factory
                                .parse(reader));
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
                                    "http://api.zuora.com/", "RatePlanData")
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
                                    list2.add(com.zuora.api.RatePlanData.Factory
                                            .parse(reader));
                                }
                            } else {
                                loopDone2 = true;
                            }
                        }
                    }
                    // call the converter utility to convert and set the array

                    object.setRatePlanData((com.zuora.api.RatePlanData[]) org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToArray(com.zuora.api.RatePlanData.class,
                                    list2));

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
