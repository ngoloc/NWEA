/**
 * Contact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.zuora.api.object;

/**
 * Contact bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class Contact extends com.zuora.api.object.ZObject implements
        org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name = Contact
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
     * field for Address1
     */

    protected java.lang.String localAddress1;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAddress1Tracker = false;

    public boolean isAddress1Specified() {
        return localAddress1Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAddress1() {
        return localAddress1;
    }

    /**
     * Auto generated setter method
     *
     * @param param Address1
     */
    public void setAddress1(java.lang.String param) {
        localAddress1Tracker = true;

        this.localAddress1 = param;

    }

    /**
     * field for Address2
     */

    protected java.lang.String localAddress2;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAddress2Tracker = false;

    public boolean isAddress2Specified() {
        return localAddress2Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAddress2() {
        return localAddress2;
    }

    /**
     * Auto generated setter method
     *
     * @param param Address2
     */
    public void setAddress2(java.lang.String param) {
        localAddress2Tracker = true;

        this.localAddress2 = param;

    }

    /**
     * field for City
     */

    protected java.lang.String localCity;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCityTracker = false;

    public boolean isCitySpecified() {
        return localCityTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCity() {
        return localCity;
    }

    /**
     * Auto generated setter method
     *
     * @param param City
     */
    public void setCity(java.lang.String param) {
        localCityTracker = true;

        this.localCity = param;

    }

    /**
     * field for Country
     */

    protected java.lang.String localCountry;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCountryTracker = false;

    public boolean isCountrySpecified() {
        return localCountryTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCountry() {
        return localCountry;
    }

    /**
     * Auto generated setter method
     *
     * @param param Country
     */
    public void setCountry(java.lang.String param) {
        localCountryTracker = true;

        this.localCountry = param;

    }

    /**
     * field for County
     */

    protected java.lang.String localCounty;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCountyTracker = false;

    public boolean isCountySpecified() {
        return localCountyTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCounty() {
        return localCounty;
    }

    /**
     * Auto generated setter method
     *
     * @param param County
     */
    public void setCounty(java.lang.String param) {
        localCountyTracker = true;

        this.localCounty = param;

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
     * field for Fax
     */

    protected java.lang.String localFax;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localFaxTracker = false;

    public boolean isFaxSpecified() {
        return localFaxTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getFax() {
        return localFax;
    }

    /**
     * Auto generated setter method
     *
     * @param param Fax
     */
    public void setFax(java.lang.String param) {
        localFaxTracker = true;

        this.localFax = param;

    }

    /**
     * field for FirstName
     */

    protected java.lang.String localFirstName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localFirstNameTracker = false;

    public boolean isFirstNameSpecified() {
        return localFirstNameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getFirstName() {
        return localFirstName;
    }

    /**
     * Auto generated setter method
     *
     * @param param FirstName
     */
    public void setFirstName(java.lang.String param) {
        localFirstNameTracker = true;

        this.localFirstName = param;

    }

    /**
     * field for HomePhone
     */

    protected java.lang.String localHomePhone;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localHomePhoneTracker = false;

    public boolean isHomePhoneSpecified() {
        return localHomePhoneTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getHomePhone() {
        return localHomePhone;
    }

    /**
     * Auto generated setter method
     *
     * @param param HomePhone
     */
    public void setHomePhone(java.lang.String param) {
        localHomePhoneTracker = true;

        this.localHomePhone = param;

    }

    /**
     * field for LastName
     */

    protected java.lang.String localLastName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localLastNameTracker = false;

    public boolean isLastNameSpecified() {
        return localLastNameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getLastName() {
        return localLastName;
    }

    /**
     * Auto generated setter method
     *
     * @param param LastName
     */
    public void setLastName(java.lang.String param) {
        localLastNameTracker = true;

        this.localLastName = param;

    }

    /**
     * field for MobilePhone
     */

    protected java.lang.String localMobilePhone;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localMobilePhoneTracker = false;

    public boolean isMobilePhoneSpecified() {
        return localMobilePhoneTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getMobilePhone() {
        return localMobilePhone;
    }

    /**
     * Auto generated setter method
     *
     * @param param MobilePhone
     */
    public void setMobilePhone(java.lang.String param) {
        localMobilePhoneTracker = true;

        this.localMobilePhone = param;

    }

    /**
     * field for NickName
     */

    protected java.lang.String localNickName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localNickNameTracker = false;

    public boolean isNickNameSpecified() {
        return localNickNameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getNickName() {
        return localNickName;
    }

    /**
     * Auto generated setter method
     *
     * @param param NickName
     */
    public void setNickName(java.lang.String param) {
        localNickNameTracker = true;

        this.localNickName = param;

    }

    /**
     * field for OtherPhone
     */

    protected java.lang.String localOtherPhone;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localOtherPhoneTracker = false;

    public boolean isOtherPhoneSpecified() {
        return localOtherPhoneTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getOtherPhone() {
        return localOtherPhone;
    }

    /**
     * Auto generated setter method
     *
     * @param param OtherPhone
     */
    public void setOtherPhone(java.lang.String param) {
        localOtherPhoneTracker = true;

        this.localOtherPhone = param;

    }

    /**
     * field for OtherPhoneType
     */

    protected java.lang.String localOtherPhoneType;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localOtherPhoneTypeTracker = false;

    public boolean isOtherPhoneTypeSpecified() {
        return localOtherPhoneTypeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getOtherPhoneType() {
        return localOtherPhoneType;
    }

    /**
     * Auto generated setter method
     *
     * @param param OtherPhoneType
     */
    public void setOtherPhoneType(java.lang.String param) {
        localOtherPhoneTypeTracker = true;

        this.localOtherPhoneType = param;

    }

    /**
     * field for PersonalEmail
     */

    protected java.lang.String localPersonalEmail;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPersonalEmailTracker = false;

    public boolean isPersonalEmailSpecified() {
        return localPersonalEmailTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getPersonalEmail() {
        return localPersonalEmail;
    }

    /**
     * Auto generated setter method
     *
     * @param param PersonalEmail
     */
    public void setPersonalEmail(java.lang.String param) {
        localPersonalEmailTracker = true;

        this.localPersonalEmail = param;

    }

    /**
     * field for PostalCode
     */

    protected java.lang.String localPostalCode;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPostalCodeTracker = false;

    public boolean isPostalCodeSpecified() {
        return localPostalCodeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getPostalCode() {
        return localPostalCode;
    }

    /**
     * Auto generated setter method
     *
     * @param param PostalCode
     */
    public void setPostalCode(java.lang.String param) {
        localPostalCodeTracker = true;

        this.localPostalCode = param;

    }

    /**
     * field for State
     */

    protected java.lang.String localState;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localStateTracker = false;

    public boolean isStateSpecified() {
        return localStateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getState() {
        return localState;
    }

    /**
     * Auto generated setter method
     *
     * @param param State
     */
    public void setState(java.lang.String param) {
        localStateTracker = true;

        this.localState = param;

    }

    /**
     * field for TaxRegion
     */

    protected java.lang.String localTaxRegion;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTaxRegionTracker = false;

    public boolean isTaxRegionSpecified() {
        return localTaxRegionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTaxRegion() {
        return localTaxRegion;
    }

    /**
     * Auto generated setter method
     *
     * @param param TaxRegion
     */
    public void setTaxRegion(java.lang.String param) {
        localTaxRegionTracker = true;

        this.localTaxRegion = param;

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
     * field for WorkEmail
     */

    protected java.lang.String localWorkEmail;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localWorkEmailTracker = false;

    public boolean isWorkEmailSpecified() {
        return localWorkEmailTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getWorkEmail() {
        return localWorkEmail;
    }

    /**
     * Auto generated setter method
     *
     * @param param WorkEmail
     */
    public void setWorkEmail(java.lang.String param) {
        localWorkEmailTracker = true;

        this.localWorkEmail = param;

    }

    /**
     * field for WorkPhone
     */

    protected java.lang.String localWorkPhone;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localWorkPhoneTracker = false;

    public boolean isWorkPhoneSpecified() {
        return localWorkPhoneTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getWorkPhone() {
        return localWorkPhone;
    }

    /**
     * Auto generated setter method
     *
     * @param param WorkPhone
     */
    public void setWorkPhone(java.lang.String param) {
        localWorkPhoneTracker = true;

        this.localWorkPhone = param;

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
                    "type", namespacePrefix + ":Contact", xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                    "type", "Contact", xmlWriter);
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
        if (localAddress1Tracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "Address1", xmlWriter);

            if (localAddress1 == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localAddress1);

            }

            xmlWriter.writeEndElement();
        }
        if (localAddress2Tracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "Address2", xmlWriter);

            if (localAddress2 == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localAddress2);

            }

            xmlWriter.writeEndElement();
        }
        if (localCityTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "City", xmlWriter);

            if (localCity == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localCity);

            }

            xmlWriter.writeEndElement();
        }
        if (localCountryTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "Country", xmlWriter);

            if (localCountry == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localCountry);

            }

            xmlWriter.writeEndElement();
        }
        if (localCountyTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "County", xmlWriter);

            if (localCounty == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localCounty);

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
        if (localFaxTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "Fax", xmlWriter);

            if (localFax == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localFax);

            }

            xmlWriter.writeEndElement();
        }
        if (localFirstNameTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "FirstName", xmlWriter);

            if (localFirstName == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localFirstName);

            }

            xmlWriter.writeEndElement();
        }
        if (localHomePhoneTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "HomePhone", xmlWriter);

            if (localHomePhone == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localHomePhone);

            }

            xmlWriter.writeEndElement();
        }
        if (localLastNameTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "LastName", xmlWriter);

            if (localLastName == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localLastName);

            }

            xmlWriter.writeEndElement();
        }
        if (localMobilePhoneTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "MobilePhone", xmlWriter);

            if (localMobilePhone == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localMobilePhone);

            }

            xmlWriter.writeEndElement();
        }
        if (localNickNameTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "NickName", xmlWriter);

            if (localNickName == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localNickName);

            }

            xmlWriter.writeEndElement();
        }
        if (localOtherPhoneTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "OtherPhone", xmlWriter);

            if (localOtherPhone == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localOtherPhone);

            }

            xmlWriter.writeEndElement();
        }
        if (localOtherPhoneTypeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "OtherPhoneType", xmlWriter);

            if (localOtherPhoneType == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localOtherPhoneType);

            }

            xmlWriter.writeEndElement();
        }
        if (localPersonalEmailTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "PersonalEmail", xmlWriter);

            if (localPersonalEmail == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localPersonalEmail);

            }

            xmlWriter.writeEndElement();
        }
        if (localPostalCodeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "PostalCode", xmlWriter);

            if (localPostalCode == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localPostalCode);

            }

            xmlWriter.writeEndElement();
        }
        if (localStateTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "State", xmlWriter);

            if (localState == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localState);

            }

            xmlWriter.writeEndElement();
        }
        if (localTaxRegionTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "TaxRegion", xmlWriter);

            if (localTaxRegion == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localTaxRegion);

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
        if (localWorkEmailTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "WorkEmail", xmlWriter);

            if (localWorkEmail == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localWorkEmail);

            }

            xmlWriter.writeEndElement();
        }
        if (localWorkPhoneTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "WorkPhone", xmlWriter);

            if (localWorkPhone == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localWorkPhone);

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
                "http://object.api.zuora.com/", "Contact"));
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
        if (localAddress1Tracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Address1"));

            elementList.add(localAddress1 == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localAddress1));
        }
        if (localAddress2Tracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Address2"));

            elementList.add(localAddress2 == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localAddress2));
        }
        if (localCityTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "City"));

            elementList.add(localCity == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCity));
        }
        if (localCountryTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Country"));

            elementList.add(localCountry == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCountry));
        }
        if (localCountyTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "County"));

            elementList.add(localCounty == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCounty));
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
        if (localFaxTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Fax"));

            elementList.add(localFax == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localFax));
        }
        if (localFirstNameTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "FirstName"));

            elementList.add(localFirstName == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localFirstName));
        }
        if (localHomePhoneTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "HomePhone"));

            elementList.add(localHomePhone == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localHomePhone));
        }
        if (localLastNameTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "LastName"));

            elementList.add(localLastName == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localLastName));
        }
        if (localMobilePhoneTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "MobilePhone"));

            elementList.add(localMobilePhone == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localMobilePhone));
        }
        if (localNickNameTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "NickName"));

            elementList.add(localNickName == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localNickName));
        }
        if (localOtherPhoneTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "OtherPhone"));

            elementList.add(localOtherPhone == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localOtherPhone));
        }
        if (localOtherPhoneTypeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "OtherPhoneType"));

            elementList.add(localOtherPhoneType == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localOtherPhoneType));
        }
        if (localPersonalEmailTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "PersonalEmail"));

            elementList.add(localPersonalEmail == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localPersonalEmail));
        }
        if (localPostalCodeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "PostalCode"));

            elementList.add(localPostalCode == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localPostalCode));
        }
        if (localStateTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "State"));

            elementList.add(localState == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localState));
        }
        if (localTaxRegionTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "TaxRegion"));

            elementList.add(localTaxRegion == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localTaxRegion));
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
        if (localWorkEmailTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "WorkEmail"));

            elementList.add(localWorkEmail == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localWorkEmail));
        }
        if (localWorkPhoneTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "WorkPhone"));

            elementList.add(localWorkPhone == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localWorkPhone));
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
        public static Contact parse(javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            Contact object = new Contact();

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

                        if (!"Contact".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader
                                    .getNamespaceContext().getNamespaceURI(
                                            nsPrefix);
                            return (Contact) com.zuora.api.object.ExtensionMapper
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
                        "http://object.api.zuora.com/", "Address1")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setAddress1(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "Address2")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setAddress2(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "City")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setCity(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "Country")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setCountry(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "County")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setCounty(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "Fax")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setFax(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "FirstName")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setFirstName(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "HomePhone")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setHomePhone(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "LastName")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setLastName(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "MobilePhone")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setMobilePhone(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "NickName")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setNickName(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "OtherPhone")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setOtherPhone(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "OtherPhoneType").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setOtherPhoneType(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "PersonalEmail")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setPersonalEmail(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "PostalCode")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setPostalCode(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "State")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setState(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "TaxRegion")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setTaxRegion(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "WorkEmail")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setWorkEmail(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "WorkPhone")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setWorkPhone(org.apache.axis2.databinding.utils.ConverterUtil
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
