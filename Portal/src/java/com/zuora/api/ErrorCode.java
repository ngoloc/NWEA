/**
 * ErrorCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.zuora.api;

/**
 * ErrorCode bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class ErrorCode implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
            "http://api.zuora.com/", "ErrorCode", "ns1");

    /**
     * field for ErrorCode
     */

    protected java.lang.String localErrorCode;

    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor

    protected ErrorCode(java.lang.String value, boolean isRegisterValue) {
        localErrorCode = value;
        if (isRegisterValue) {

            _table_.put(localErrorCode, this);

        }

    }

    public static final java.lang.String _API_DISABLED = org.apache.axis2.databinding.utils.ConverterUtil
            .convertToString("API_DISABLED");

    public static final java.lang.String _CANNOT_DELETE = org.apache.axis2.databinding.utils.ConverterUtil
            .convertToString("CANNOT_DELETE");

    public static final java.lang.String _CREDIT_CARD_PROCESSING_FAILURE = org.apache.axis2.databinding.utils.ConverterUtil
            .convertToString("CREDIT_CARD_PROCESSING_FAILURE");

    public static final java.lang.String _DUPLICATE_VALUE = org.apache.axis2.databinding.utils.ConverterUtil
            .convertToString("DUPLICATE_VALUE");

    public static final java.lang.String _INVALID_FIELD = org.apache.axis2.databinding.utils.ConverterUtil
            .convertToString("INVALID_FIELD");

    public static final java.lang.String _INVALID_LOGIN = org.apache.axis2.databinding.utils.ConverterUtil
            .convertToString("INVALID_LOGIN");

    public static final java.lang.String _INVALID_SESSION = org.apache.axis2.databinding.utils.ConverterUtil
            .convertToString("INVALID_SESSION");

    public static final java.lang.String _INVALID_TYPE = org.apache.axis2.databinding.utils.ConverterUtil
            .convertToString("INVALID_TYPE");

    public static final java.lang.String _INVALID_ID = org.apache.axis2.databinding.utils.ConverterUtil
            .convertToString("INVALID_ID");

    public static final java.lang.String _INVALID_VALUE = org.apache.axis2.databinding.utils.ConverterUtil
            .convertToString("INVALID_VALUE");

    public static final java.lang.String _INVALID_VERSION = org.apache.axis2.databinding.utils.ConverterUtil
            .convertToString("INVALID_VERSION");

    public static final java.lang.String _MALFORMED_QUERY = org.apache.axis2.databinding.utils.ConverterUtil
            .convertToString("MALFORMED_QUERY");

    public static final java.lang.String _MAX_RECORDS_EXCEEDED = org.apache.axis2.databinding.utils.ConverterUtil
            .convertToString("MAX_RECORDS_EXCEEDED");

    public static final java.lang.String _MISSING_REQUIRED_VALUE = org.apache.axis2.databinding.utils.ConverterUtil
            .convertToString("MISSING_REQUIRED_VALUE");

    public static final java.lang.String _NO_PERMISSION = org.apache.axis2.databinding.utils.ConverterUtil
            .convertToString("NO_PERMISSION");

    public static final java.lang.String _SERVER_UNAVAILABLE = org.apache.axis2.databinding.utils.ConverterUtil
            .convertToString("SERVER_UNAVAILABLE");

    public static final java.lang.String _UNKNOWN_ERROR = org.apache.axis2.databinding.utils.ConverterUtil
            .convertToString("UNKNOWN_ERROR");

    public static final java.lang.String _TRANSACTION_FAILED = org.apache.axis2.databinding.utils.ConverterUtil
            .convertToString("TRANSACTION_FAILED");

    public static final java.lang.String _INVALID_TEMPLATE = org.apache.axis2.databinding.utils.ConverterUtil
            .convertToString("INVALID_TEMPLATE");

    public static final java.lang.String _ACCOUNTING_PERIOD_CLOSED = org.apache.axis2.databinding.utils.ConverterUtil
            .convertToString("ACCOUNTING_PERIOD_CLOSED");

    public static final java.lang.String _BATCH_FAIL_ERROR = org.apache.axis2.databinding.utils.ConverterUtil
            .convertToString("BATCH_FAIL_ERROR");

    public static final java.lang.String _PDF_QUERY_ERROR = org.apache.axis2.databinding.utils.ConverterUtil
            .convertToString("PDF_QUERY_ERROR");

    public static final ErrorCode API_DISABLED = new ErrorCode(_API_DISABLED,
            true);

    public static final ErrorCode CANNOT_DELETE = new ErrorCode(_CANNOT_DELETE,
            true);

    public static final ErrorCode CREDIT_CARD_PROCESSING_FAILURE = new ErrorCode(
            _CREDIT_CARD_PROCESSING_FAILURE, true);

    public static final ErrorCode DUPLICATE_VALUE = new ErrorCode(
            _DUPLICATE_VALUE, true);

    public static final ErrorCode INVALID_FIELD = new ErrorCode(_INVALID_FIELD,
            true);

    public static final ErrorCode INVALID_LOGIN = new ErrorCode(_INVALID_LOGIN,
            true);

    public static final ErrorCode INVALID_SESSION = new ErrorCode(
            _INVALID_SESSION, true);

    public static final ErrorCode INVALID_TYPE = new ErrorCode(_INVALID_TYPE,
            true);

    public static final ErrorCode INVALID_ID = new ErrorCode(_INVALID_ID, true);

    public static final ErrorCode INVALID_VALUE = new ErrorCode(_INVALID_VALUE,
            true);

    public static final ErrorCode INVALID_VERSION = new ErrorCode(
            _INVALID_VERSION, true);

    public static final ErrorCode MALFORMED_QUERY = new ErrorCode(
            _MALFORMED_QUERY, true);

    public static final ErrorCode MAX_RECORDS_EXCEEDED = new ErrorCode(
            _MAX_RECORDS_EXCEEDED, true);

    public static final ErrorCode MISSING_REQUIRED_VALUE = new ErrorCode(
            _MISSING_REQUIRED_VALUE, true);

    public static final ErrorCode NO_PERMISSION = new ErrorCode(_NO_PERMISSION,
            true);

    public static final ErrorCode SERVER_UNAVAILABLE = new ErrorCode(
            _SERVER_UNAVAILABLE, true);

    public static final ErrorCode UNKNOWN_ERROR = new ErrorCode(_UNKNOWN_ERROR,
            true);

    public static final ErrorCode TRANSACTION_FAILED = new ErrorCode(
            _TRANSACTION_FAILED, true);

    public static final ErrorCode INVALID_TEMPLATE = new ErrorCode(
            _INVALID_TEMPLATE, true);

    public static final ErrorCode ACCOUNTING_PERIOD_CLOSED = new ErrorCode(
            _ACCOUNTING_PERIOD_CLOSED, true);

    public static final ErrorCode BATCH_FAIL_ERROR = new ErrorCode(
            _BATCH_FAIL_ERROR, true);

    public static final ErrorCode PDF_QUERY_ERROR = new ErrorCode(
            _PDF_QUERY_ERROR, true);

    public java.lang.String getValue() {
        return localErrorCode;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj == this);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public java.lang.String toString() {

        return localErrorCode.toString();

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

        // We can safely assume an element has only one type associated with it

        java.lang.String namespace = parentQName.getNamespaceURI();
        java.lang.String _localName = parentQName.getLocalPart();

        writeStartElement(null, namespace, _localName, xmlWriter);

        // add the type details if this is used in a simple type
        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://api.zuora.com/");
            if ((namespacePrefix != null)
                    && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":ErrorCode", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "ErrorCode", xmlWriter);
            }
        }

        if (localErrorCode == null) {

            throw new org.apache.axis2.databinding.ADBException(
                    "ErrorCode cannot be null !!");

        } else {

            xmlWriter.writeCharacters(localErrorCode);

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

        // We can safely assume an element has only one type associated with it
        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
                MY_QNAME,
                new java.lang.Object[]{
                        org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
                        org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localErrorCode)}, null);

    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {

        public static ErrorCode fromValue(java.lang.String value)
                throws java.lang.IllegalArgumentException {
            ErrorCode enumeration = (ErrorCode)

                    _table_.get(value);

            if ((enumeration == null)
                    && !((value == null) || (value.equals("")))) {
                throw new java.lang.IllegalArgumentException();
            }
            return enumeration;
        }

        public static ErrorCode fromString(java.lang.String value,
                                           java.lang.String namespaceURI)
                throws java.lang.IllegalArgumentException {
            try {

                return fromValue(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(value));

            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalArgumentException();
            }
        }

        public static ErrorCode fromString(
                javax.xml.stream.XMLStreamReader xmlStreamReader,
                java.lang.String content) {
            if (content.indexOf(":") > -1) {
                java.lang.String prefix = content.substring(0,
                        content.indexOf(":"));
                java.lang.String namespaceUri = xmlStreamReader
                        .getNamespaceContext().getNamespaceURI(prefix);
                return ErrorCode.Factory.fromString(content, namespaceUri);
            } else {
                return ErrorCode.Factory.fromString(content, "");
            }
        }

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
        public static ErrorCode parse(javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            ErrorCode object = null;
            // initialize a hash map to keep values
            java.util.Map attributeMap = new java.util.HashMap();
            java.util.List extraAttributeList = new java.util.ArrayList<org.apache.axiom.om.OMAttribute>();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";
            try {

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                // Note all attributes that were handled. Used to differ normal
                // attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                while (!reader.isEndElement()) {
                    if (reader.isStartElement() || reader.hasText()) {

                        nillableValue = reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "nil");
                        if ("true".equals(nillableValue)
                                || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "ErrorCode"
                                            + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        if (content.indexOf(":") > 0) {
                            // this seems to be a Qname so find the namespace
                            // and send
                            prefix = content.substring(0, content.indexOf(":"));
                            namespaceuri = reader.getNamespaceURI(prefix);
                            object = ErrorCode.Factory.fromString(content,
                                    namespaceuri);
                        } else {
                            // this seems to be not a qname send and empty
                            // namespace incase of it is
                            // check is done in fromString method
                            object = ErrorCode.Factory.fromString(content, "");
                        }

                    } else {
                        reader.next();
                    }
                } // end of while loop

            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

    }// end of factory class

}
