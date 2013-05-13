/**
 * RatePlanCharge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.zuora.api.object;

/**
 * RatePlanCharge bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class RatePlanCharge extends com.zuora.api.object.ZObject implements
        org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name =
	 * RatePlanCharge Namespace URI = http://object.api.zuora.com/ Namespace
	 * Prefix = ns2
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
     * field for ApplyDiscountTo
     */

    protected java.lang.String localApplyDiscountTo;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localApplyDiscountToTracker = false;

    public boolean isApplyDiscountToSpecified() {
        return localApplyDiscountToTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getApplyDiscountTo() {
        return localApplyDiscountTo;
    }

    /**
     * Auto generated setter method
     *
     * @param param ApplyDiscountTo
     */
    public void setApplyDiscountTo(java.lang.String param) {
        localApplyDiscountToTracker = true;

        this.localApplyDiscountTo = param;

    }

    /**
     * field for BillCycleDay
     */

    protected int localBillCycleDay;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localBillCycleDayTracker = false;

    public boolean isBillCycleDaySpecified() {
        return localBillCycleDayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getBillCycleDay() {
        return localBillCycleDay;
    }

    /**
     * Auto generated setter method
     *
     * @param param BillCycleDay
     */
    public void setBillCycleDay(int param) {
        localBillCycleDayTracker = true;

        this.localBillCycleDay = param;

    }

    /**
     * field for BillCycleType
     */

    protected java.lang.String localBillCycleType;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localBillCycleTypeTracker = false;

    public boolean isBillCycleTypeSpecified() {
        return localBillCycleTypeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getBillCycleType() {
        return localBillCycleType;
    }

    /**
     * Auto generated setter method
     *
     * @param param BillCycleType
     */
    public void setBillCycleType(java.lang.String param) {
        localBillCycleTypeTracker = true;

        this.localBillCycleType = param;

    }

    /**
     * field for BillingPeriodAlignment
     */

    protected java.lang.String localBillingPeriodAlignment;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localBillingPeriodAlignmentTracker = false;

    public boolean isBillingPeriodAlignmentSpecified() {
        return localBillingPeriodAlignmentTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getBillingPeriodAlignment() {
        return localBillingPeriodAlignment;
    }

    /**
     * Auto generated setter method
     *
     * @param param BillingPeriodAlignment
     */
    public void setBillingPeriodAlignment(java.lang.String param) {
        localBillingPeriodAlignmentTracker = true;

        this.localBillingPeriodAlignment = param;

    }

    /**
     * field for ChargedThroughDate
     */

    protected java.util.Calendar localChargedThroughDate;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localChargedThroughDateTracker = false;

    public boolean isChargedThroughDateSpecified() {
        return localChargedThroughDateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getChargedThroughDate() {
        return localChargedThroughDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param ChargedThroughDate
     */
    public void setChargedThroughDate(java.util.Calendar param) {
        localChargedThroughDateTracker = true;

        this.localChargedThroughDate = param;

    }

    /**
     * field for ChargeModel
     */

    protected java.lang.String localChargeModel;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localChargeModelTracker = false;

    public boolean isChargeModelSpecified() {
        return localChargeModelTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getChargeModel() {
        return localChargeModel;
    }

    /**
     * Auto generated setter method
     *
     * @param param ChargeModel
     */
    public void setChargeModel(java.lang.String param) {
        localChargeModelTracker = true;

        this.localChargeModel = param;

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
     * field for ChargeType
     */

    protected java.lang.String localChargeType;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localChargeTypeTracker = false;

    public boolean isChargeTypeSpecified() {
        return localChargeTypeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getChargeType() {
        return localChargeType;
    }

    /**
     * Auto generated setter method
     *
     * @param param ChargeType
     */
    public void setChargeType(java.lang.String param) {
        localChargeTypeTracker = true;

        this.localChargeType = param;

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
     * field for DiscountAmount
     */

    protected java.math.BigDecimal localDiscountAmount;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localDiscountAmountTracker = false;

    public boolean isDiscountAmountSpecified() {
        return localDiscountAmountTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getDiscountAmount() {
        return localDiscountAmount;
    }

    /**
     * Auto generated setter method
     *
     * @param param DiscountAmount
     */
    public void setDiscountAmount(java.math.BigDecimal param) {
        localDiscountAmountTracker = true;

        this.localDiscountAmount = param;

    }

    /**
     * field for DiscountLevel
     */

    protected java.lang.String localDiscountLevel;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localDiscountLevelTracker = false;

    public boolean isDiscountLevelSpecified() {
        return localDiscountLevelTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDiscountLevel() {
        return localDiscountLevel;
    }

    /**
     * Auto generated setter method
     *
     * @param param DiscountLevel
     */
    public void setDiscountLevel(java.lang.String param) {
        localDiscountLevelTracker = true;

        this.localDiscountLevel = param;

    }

    /**
     * field for DiscountPercentage
     */

    protected java.math.BigDecimal localDiscountPercentage;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localDiscountPercentageTracker = false;

    public boolean isDiscountPercentageSpecified() {
        return localDiscountPercentageTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getDiscountPercentage() {
        return localDiscountPercentage;
    }

    /**
     * Auto generated setter method
     *
     * @param param DiscountPercentage
     */
    public void setDiscountPercentage(java.math.BigDecimal param) {
        localDiscountPercentageTracker = true;

        this.localDiscountPercentage = param;

    }

    /**
     * field for DMRC
     */

    protected java.math.BigDecimal localDMRC;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localDMRCTracker = false;

    public boolean isDMRCSpecified() {
        return localDMRCTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getDMRC() {
        return localDMRC;
    }

    /**
     * Auto generated setter method
     *
     * @param param DMRC
     */
    public void setDMRC(java.math.BigDecimal param) {
        localDMRCTracker = true;

        this.localDMRC = param;

    }

    /**
     * field for DTCV
     */

    protected java.math.BigDecimal localDTCV;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localDTCVTracker = false;

    public boolean isDTCVSpecified() {
        return localDTCVTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getDTCV() {
        return localDTCV;
    }

    /**
     * Auto generated setter method
     *
     * @param param DTCV
     */
    public void setDTCV(java.math.BigDecimal param) {
        localDTCVTracker = true;

        this.localDTCV = param;

    }

    /**
     * field for EffectiveEndDate
     */

    protected java.util.Calendar localEffectiveEndDate;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localEffectiveEndDateTracker = false;

    public boolean isEffectiveEndDateSpecified() {
        return localEffectiveEndDateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getEffectiveEndDate() {
        return localEffectiveEndDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param EffectiveEndDate
     */
    public void setEffectiveEndDate(java.util.Calendar param) {
        localEffectiveEndDateTracker = true;

        this.localEffectiveEndDate = param;

    }

    /**
     * field for EffectiveStartDate
     */

    protected java.util.Calendar localEffectiveStartDate;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localEffectiveStartDateTracker = false;

    public boolean isEffectiveStartDateSpecified() {
        return localEffectiveStartDateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getEffectiveStartDate() {
        return localEffectiveStartDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param EffectiveStartDate
     */
    public void setEffectiveStartDate(java.util.Calendar param) {
        localEffectiveStartDateTracker = true;

        this.localEffectiveStartDate = param;

    }

    /**
     * field for IncludedUnits
     */

    protected java.math.BigDecimal localIncludedUnits;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localIncludedUnitsTracker = false;

    public boolean isIncludedUnitsSpecified() {
        return localIncludedUnitsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getIncludedUnits() {
        return localIncludedUnits;
    }

    /**
     * Auto generated setter method
     *
     * @param param IncludedUnits
     */
    public void setIncludedUnits(java.math.BigDecimal param) {
        localIncludedUnitsTracker = true;

        this.localIncludedUnits = param;

    }

    /**
     * field for IsLastSegment
     */

    protected boolean localIsLastSegment;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localIsLastSegmentTracker = false;

    public boolean isIsLastSegmentSpecified() {
        return localIsLastSegmentTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getIsLastSegment() {
        return localIsLastSegment;
    }

    /**
     * Auto generated setter method
     *
     * @param param IsLastSegment
     */
    public void setIsLastSegment(boolean param) {
        localIsLastSegmentTracker = true;

        this.localIsLastSegment = param;

    }

    /**
     * field for MRR
     */

    protected java.math.BigDecimal localMRR;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localMRRTracker = false;

    public boolean isMRRSpecified() {
        return localMRRTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getMRR() {
        return localMRR;
    }

    /**
     * Auto generated setter method
     *
     * @param param MRR
     */
    public void setMRR(java.math.BigDecimal param) {
        localMRRTracker = true;

        this.localMRR = param;

    }

    /**
     * field for Name
     */

    protected java.lang.String localName;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localNameTracker = false;

    public boolean isNameSpecified() {
        return localNameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getName() {
        return localName;
    }

    /**
     * Auto generated setter method
     *
     * @param param Name
     */
    public void setName(java.lang.String param) {
        localNameTracker = true;

        this.localName = param;

    }

    /**
     * field for NumberOfPeriods
     */

    protected long localNumberOfPeriods;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localNumberOfPeriodsTracker = false;

    public boolean isNumberOfPeriodsSpecified() {
        return localNumberOfPeriodsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return long
     */
    public long getNumberOfPeriods() {
        return localNumberOfPeriods;
    }

    /**
     * Auto generated setter method
     *
     * @param param NumberOfPeriods
     */
    public void setNumberOfPeriods(long param) {
        localNumberOfPeriodsTracker = true;

        this.localNumberOfPeriods = param;

    }

    /**
     * field for OriginalId
     */

    protected com.zuora.api.ID localOriginalId;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localOriginalIdTracker = false;

    public boolean isOriginalIdSpecified() {
        return localOriginalIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ID
     */
    public com.zuora.api.ID getOriginalId() {
        return localOriginalId;
    }

    /**
     * Auto generated setter method
     *
     * @param param OriginalId
     */
    public void setOriginalId(com.zuora.api.ID param) {
        localOriginalIdTracker = true;

        this.localOriginalId = param;

    }

    /**
     * field for OverageCalculationOption
     */

    protected java.lang.String localOverageCalculationOption;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localOverageCalculationOptionTracker = false;

    public boolean isOverageCalculationOptionSpecified() {
        return localOverageCalculationOptionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getOverageCalculationOption() {
        return localOverageCalculationOption;
    }

    /**
     * Auto generated setter method
     *
     * @param param OverageCalculationOption
     */
    public void setOverageCalculationOption(java.lang.String param) {
        localOverageCalculationOptionTracker = true;

        this.localOverageCalculationOption = param;

    }

    /**
     * field for OveragePrice
     */

    protected java.math.BigDecimal localOveragePrice;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localOveragePriceTracker = false;

    public boolean isOveragePriceSpecified() {
        return localOveragePriceTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getOveragePrice() {
        return localOveragePrice;
    }

    /**
     * Auto generated setter method
     *
     * @param param OveragePrice
     */
    public void setOveragePrice(java.math.BigDecimal param) {
        localOveragePriceTracker = true;

        this.localOveragePrice = param;

    }

    /**
     * field for OverageUnusedUnitsCreditOption
     */

    protected java.lang.String localOverageUnusedUnitsCreditOption;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localOverageUnusedUnitsCreditOptionTracker = false;

    public boolean isOverageUnusedUnitsCreditOptionSpecified() {
        return localOverageUnusedUnitsCreditOptionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getOverageUnusedUnitsCreditOption() {
        return localOverageUnusedUnitsCreditOption;
    }

    /**
     * Auto generated setter method
     *
     * @param param OverageUnusedUnitsCreditOption
     */
    public void setOverageUnusedUnitsCreditOption(java.lang.String param) {
        localOverageUnusedUnitsCreditOptionTracker = true;

        this.localOverageUnusedUnitsCreditOption = param;

    }

    /**
     * field for Price
     */

    protected java.math.BigDecimal localPrice;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localPriceTracker = false;

    public boolean isPriceSpecified() {
        return localPriceTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getPrice() {
        return localPrice;
    }

    /**
     * Auto generated setter method
     *
     * @param param Price
     */
    public void setPrice(java.math.BigDecimal param) {
        localPriceTracker = true;

        this.localPrice = param;

    }

    /**
     * field for PriceChangeOption
     */

    protected java.lang.String localPriceChangeOption;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localPriceChangeOptionTracker = false;

    public boolean isPriceChangeOptionSpecified() {
        return localPriceChangeOptionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getPriceChangeOption() {
        return localPriceChangeOption;
    }

    /**
     * Auto generated setter method
     *
     * @param param PriceChangeOption
     */
    public void setPriceChangeOption(java.lang.String param) {
        localPriceChangeOptionTracker = true;

        this.localPriceChangeOption = param;

    }

    /**
     * field for PriceIncreasePercentage
     */

    protected java.math.BigDecimal localPriceIncreasePercentage;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localPriceIncreasePercentageTracker = false;

    public boolean isPriceIncreasePercentageSpecified() {
        return localPriceIncreasePercentageTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getPriceIncreasePercentage() {
        return localPriceIncreasePercentage;
    }

    /**
     * Auto generated setter method
     *
     * @param param PriceIncreasePercentage
     */
    public void setPriceIncreasePercentage(java.math.BigDecimal param) {
        localPriceIncreasePercentageTracker = true;

        this.localPriceIncreasePercentage = param;

    }

    /**
     * field for ProcessedThroughDate
     */

    protected java.util.Calendar localProcessedThroughDate;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localProcessedThroughDateTracker = false;

    public boolean isProcessedThroughDateSpecified() {
        return localProcessedThroughDateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getProcessedThroughDate() {
        return localProcessedThroughDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param ProcessedThroughDate
     */
    public void setProcessedThroughDate(java.util.Calendar param) {
        localProcessedThroughDateTracker = true;

        this.localProcessedThroughDate = param;

    }

    /**
     * field for ProductRatePlanChargeId
     */

    protected com.zuora.api.ID localProductRatePlanChargeId;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localProductRatePlanChargeIdTracker = false;

    public boolean isProductRatePlanChargeIdSpecified() {
        return localProductRatePlanChargeIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ID
     */
    public com.zuora.api.ID getProductRatePlanChargeId() {
        return localProductRatePlanChargeId;
    }

    /**
     * Auto generated setter method
     *
     * @param param ProductRatePlanChargeId
     */
    public void setProductRatePlanChargeId(com.zuora.api.ID param) {
        localProductRatePlanChargeIdTracker = true;

        this.localProductRatePlanChargeId = param;

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
     * field for RatePlanId
     */

    protected com.zuora.api.ID localRatePlanId;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localRatePlanIdTracker = false;

    public boolean isRatePlanIdSpecified() {
        return localRatePlanIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ID
     */
    public com.zuora.api.ID getRatePlanId() {
        return localRatePlanId;
    }

    /**
     * Auto generated setter method
     *
     * @param param RatePlanId
     */
    public void setRatePlanId(com.zuora.api.ID param) {
        localRatePlanIdTracker = true;

        this.localRatePlanId = param;

    }

    /**
     * field for RolloverBalance
     */

    protected java.math.BigDecimal localRolloverBalance;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localRolloverBalanceTracker = false;

    public boolean isRolloverBalanceSpecified() {
        return localRolloverBalanceTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getRolloverBalance() {
        return localRolloverBalance;
    }

    /**
     * Auto generated setter method
     *
     * @param param RolloverBalance
     */
    public void setRolloverBalance(java.math.BigDecimal param) {
        localRolloverBalanceTracker = true;

        this.localRolloverBalance = param;

    }

    /**
     * field for Segment
     */

    protected int localSegment;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localSegmentTracker = false;

    public boolean isSegmentSpecified() {
        return localSegmentTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getSegment() {
        return localSegment;
    }

    /**
     * Auto generated setter method
     *
     * @param param Segment
     */
    public void setSegment(int param) {
        localSegmentTracker = true;

        this.localSegment = param;

    }

    /**
     * field for TCV
     */

    protected java.math.BigDecimal localTCV;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localTCVTracker = false;

    public boolean isTCVSpecified() {
        return localTCVTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getTCV() {
        return localTCV;
    }

    /**
     * Auto generated setter method
     *
     * @param param TCV
     */
    public void setTCV(java.math.BigDecimal param) {
        localTCVTracker = true;

        this.localTCV = param;

    }

    /**
     * field for TriggerDate
     */

    protected java.util.Calendar localTriggerDate;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localTriggerDateTracker = false;

    public boolean isTriggerDateSpecified() {
        return localTriggerDateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getTriggerDate() {
        return localTriggerDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param TriggerDate
     */
    public void setTriggerDate(java.util.Calendar param) {
        localTriggerDateTracker = true;

        this.localTriggerDate = param;

    }

    /**
     * field for TriggerEvent
     */

    protected java.lang.String localTriggerEvent;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localTriggerEventTracker = false;

    public boolean isTriggerEventSpecified() {
        return localTriggerEventTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTriggerEvent() {
        return localTriggerEvent;
    }

    /**
     * Auto generated setter method
     *
     * @param param TriggerEvent
     */
    public void setTriggerEvent(java.lang.String param) {
        localTriggerEventTracker = true;

        this.localTriggerEvent = param;

    }

    /**
     * field for UnusedUnitsCreditRates
     */

    protected java.math.BigDecimal localUnusedUnitsCreditRates;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localUnusedUnitsCreditRatesTracker = false;

    public boolean isUnusedUnitsCreditRatesSpecified() {
        return localUnusedUnitsCreditRatesTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getUnusedUnitsCreditRates() {
        return localUnusedUnitsCreditRates;
    }

    /**
     * Auto generated setter method
     *
     * @param param UnusedUnitsCreditRates
     */
    public void setUnusedUnitsCreditRates(java.math.BigDecimal param) {
        localUnusedUnitsCreditRatesTracker = true;

        this.localUnusedUnitsCreditRates = param;

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
     * field for UpToPeriods
     */

    protected long localUpToPeriods;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localUpToPeriodsTracker = false;

    public boolean isUpToPeriodsSpecified() {
        return localUpToPeriodsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return long
     */
    public long getUpToPeriods() {
        return localUpToPeriods;
    }

    /**
     * Auto generated setter method
     *
     * @param param UpToPeriods
     */
    public void setUpToPeriods(long param) {
        localUpToPeriodsTracker = true;

        this.localUpToPeriods = param;

    }

    /**
     * field for UsageRecordRatingOption
     */

    protected java.lang.String localUsageRecordRatingOption;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localUsageRecordRatingOptionTracker = false;

    public boolean isUsageRecordRatingOptionSpecified() {
        return localUsageRecordRatingOptionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUsageRecordRatingOption() {
        return localUsageRecordRatingOption;
    }

    /**
     * Auto generated setter method
     *
     * @param param UsageRecordRatingOption
     */
    public void setUsageRecordRatingOption(java.lang.String param) {
        localUsageRecordRatingOptionTracker = true;

        this.localUsageRecordRatingOption = param;

    }

    /**
     * field for UseDiscountSpecificAccountingCode
     */

    protected boolean localUseDiscountSpecificAccountingCode;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localUseDiscountSpecificAccountingCodeTracker = false;

    public boolean isUseDiscountSpecificAccountingCodeSpecified() {
        return localUseDiscountSpecificAccountingCodeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getUseDiscountSpecificAccountingCode() {
        return localUseDiscountSpecificAccountingCode;
    }

    /**
     * Auto generated setter method
     *
     * @param param UseDiscountSpecificAccountingCode
     */
    public void setUseDiscountSpecificAccountingCode(boolean param) {
        localUseDiscountSpecificAccountingCodeTracker = true;

        this.localUseDiscountSpecificAccountingCode = param;

    }

    /**
     * field for Version
     */

    protected long localVersion;

    /*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
    protected boolean localVersionTracker = false;

    public boolean isVersionSpecified() {
        return localVersionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return long
     */
    public long getVersion() {
        return localVersion;
    }

    /**
     * Auto generated setter method
     *
     * @param param Version
     */
    public void setVersion(long param) {
        localVersionTracker = true;

        this.localVersion = param;

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
                    "type", namespacePrefix + ":RatePlanCharge", xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                    "type", "RatePlanCharge", xmlWriter);
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
        if (localApplyDiscountToTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "ApplyDiscountTo", xmlWriter);

            if (localApplyDiscountTo == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localApplyDiscountTo);

            }

            xmlWriter.writeEndElement();
        }
        if (localBillCycleDayTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "BillCycleDay", xmlWriter);

            if (localBillCycleDay == java.lang.Integer.MIN_VALUE) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localBillCycleDay));
            }

            xmlWriter.writeEndElement();
        }
        if (localBillCycleTypeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "BillCycleType", xmlWriter);

            if (localBillCycleType == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localBillCycleType);

            }

            xmlWriter.writeEndElement();
        }
        if (localBillingPeriodAlignmentTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "BillingPeriodAlignment",
                    xmlWriter);

            if (localBillingPeriodAlignment == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localBillingPeriodAlignment);

            }

            xmlWriter.writeEndElement();
        }
        if (localChargedThroughDateTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "ChargedThroughDate", xmlWriter);

            if (localChargedThroughDate == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localChargedThroughDate));

            }

            xmlWriter.writeEndElement();
        }
        if (localChargeModelTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "ChargeModel", xmlWriter);

            if (localChargeModel == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localChargeModel);

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
        if (localChargeTypeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "ChargeType", xmlWriter);

            if (localChargeType == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localChargeType);

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
        if (localDiscountAmountTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "DiscountAmount", xmlWriter);

            if (localDiscountAmount == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localDiscountAmount));

            }

            xmlWriter.writeEndElement();
        }
        if (localDiscountLevelTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "DiscountLevel", xmlWriter);

            if (localDiscountLevel == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localDiscountLevel);

            }

            xmlWriter.writeEndElement();
        }
        if (localDiscountPercentageTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "DiscountPercentage", xmlWriter);

            if (localDiscountPercentage == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localDiscountPercentage));

            }

            xmlWriter.writeEndElement();
        }
        if (localDMRCTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "DMRC", xmlWriter);

            if (localDMRC == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localDMRC));

            }

            xmlWriter.writeEndElement();
        }
        if (localDTCVTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "DTCV", xmlWriter);

            if (localDTCV == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localDTCV));

            }

            xmlWriter.writeEndElement();
        }
        if (localEffectiveEndDateTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "EffectiveEndDate", xmlWriter);

            if (localEffectiveEndDate == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localEffectiveEndDate));

            }

            xmlWriter.writeEndElement();
        }
        if (localEffectiveStartDateTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "EffectiveStartDate", xmlWriter);

            if (localEffectiveStartDate == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localEffectiveStartDate));

            }

            xmlWriter.writeEndElement();
        }
        if (localIncludedUnitsTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "IncludedUnits", xmlWriter);

            if (localIncludedUnits == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localIncludedUnits));

            }

            xmlWriter.writeEndElement();
        }
        if (localIsLastSegmentTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "IsLastSegment", xmlWriter);

            if (false) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localIsLastSegment));
            }

            xmlWriter.writeEndElement();
        }
        if (localMRRTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "MRR", xmlWriter);

            if (localMRR == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localMRR));

            }

            xmlWriter.writeEndElement();
        }
        if (localNameTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "Name", xmlWriter);

            if (localName == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localName);

            }

            xmlWriter.writeEndElement();
        }
        if (localNumberOfPeriodsTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "NumberOfPeriods", xmlWriter);

            if (localNumberOfPeriods == java.lang.Long.MIN_VALUE) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localNumberOfPeriods));
            }

            xmlWriter.writeEndElement();
        }
        if (localOriginalIdTracker) {
            if (localOriginalId == null) {

                writeStartElement(null, "http://object.api.zuora.com/",
                        "OriginalId", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localOriginalId.serialize(new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "OriginalId"),
                        xmlWriter);
            }
        }
        if (localOverageCalculationOptionTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "OverageCalculationOption",
                    xmlWriter);

            if (localOverageCalculationOption == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localOverageCalculationOption);

            }

            xmlWriter.writeEndElement();
        }
        if (localOveragePriceTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "OveragePrice", xmlWriter);

            if (localOveragePrice == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localOveragePrice));

            }

            xmlWriter.writeEndElement();
        }
        if (localOverageUnusedUnitsCreditOptionTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace,
                    "OverageUnusedUnitsCreditOption", xmlWriter);

            if (localOverageUnusedUnitsCreditOption == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localOverageUnusedUnitsCreditOption);

            }

            xmlWriter.writeEndElement();
        }
        if (localPriceTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "Price", xmlWriter);

            if (localPrice == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localPrice));

            }

            xmlWriter.writeEndElement();
        }
        if (localPriceChangeOptionTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "PriceChangeOption", xmlWriter);

            if (localPriceChangeOption == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localPriceChangeOption);

            }

            xmlWriter.writeEndElement();
        }
        if (localPriceIncreasePercentageTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "PriceIncreasePercentage",
                    xmlWriter);

            if (localPriceIncreasePercentage == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localPriceIncreasePercentage));

            }

            xmlWriter.writeEndElement();
        }
        if (localProcessedThroughDateTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "ProcessedThroughDate",
                    xmlWriter);

            if (localProcessedThroughDate == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localProcessedThroughDate));

            }

            xmlWriter.writeEndElement();
        }
        if (localProductRatePlanChargeIdTracker) {
            if (localProductRatePlanChargeId == null) {

                writeStartElement(null, "http://object.api.zuora.com/",
                        "ProductRatePlanChargeId", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localProductRatePlanChargeId.serialize(
                        new javax.xml.namespace.QName(
                                "http://object.api.zuora.com/",
                                "ProductRatePlanChargeId"), xmlWriter);
            }
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
        if (localRatePlanIdTracker) {
            if (localRatePlanId == null) {

                writeStartElement(null, "http://object.api.zuora.com/",
                        "RatePlanId", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localRatePlanId.serialize(new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "RatePlanId"),
                        xmlWriter);
            }
        }
        if (localRolloverBalanceTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "RolloverBalance", xmlWriter);

            if (localRolloverBalance == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localRolloverBalance));

            }

            xmlWriter.writeEndElement();
        }
        if (localSegmentTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "Segment", xmlWriter);

            if (localSegment == java.lang.Integer.MIN_VALUE) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localSegment));
            }

            xmlWriter.writeEndElement();
        }
        if (localTCVTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "TCV", xmlWriter);

            if (localTCV == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localTCV));

            }

            xmlWriter.writeEndElement();
        }
        if (localTriggerDateTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "TriggerDate", xmlWriter);

            if (localTriggerDate == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localTriggerDate));

            }

            xmlWriter.writeEndElement();
        }
        if (localTriggerEventTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "TriggerEvent", xmlWriter);

            if (localTriggerEvent == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localTriggerEvent);

            }

            xmlWriter.writeEndElement();
        }
        if (localUnusedUnitsCreditRatesTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "UnusedUnitsCreditRates",
                    xmlWriter);

            if (localUnusedUnitsCreditRates == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localUnusedUnitsCreditRates));

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
        if (localUpToPeriodsTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "UpToPeriods", xmlWriter);

            if (localUpToPeriods == java.lang.Long.MIN_VALUE) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localUpToPeriods));
            }

            xmlWriter.writeEndElement();
        }
        if (localUsageRecordRatingOptionTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "UsageRecordRatingOption",
                    xmlWriter);

            if (localUsageRecordRatingOption == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localUsageRecordRatingOption);

            }

            xmlWriter.writeEndElement();
        }
        if (localUseDiscountSpecificAccountingCodeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace,
                    "UseDiscountSpecificAccountingCode", xmlWriter);

            if (false) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localUseDiscountSpecificAccountingCode));
            }

            xmlWriter.writeEndElement();
        }
        if (localVersionTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "Version", xmlWriter);

            if (localVersion == java.lang.Long.MIN_VALUE) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localVersion));
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
                "http://object.api.zuora.com/", "RatePlanCharge"));
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
        if (localApplyDiscountToTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "ApplyDiscountTo"));

            elementList.add(localApplyDiscountTo == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localApplyDiscountTo));
        }
        if (localBillCycleDayTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "BillCycleDay"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localBillCycleDay));
        }
        if (localBillCycleTypeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "BillCycleType"));

            elementList.add(localBillCycleType == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localBillCycleType));
        }
        if (localBillingPeriodAlignmentTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "BillingPeriodAlignment"));

            elementList.add(localBillingPeriodAlignment == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localBillingPeriodAlignment));
        }
        if (localChargedThroughDateTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "ChargedThroughDate"));

            elementList.add(localChargedThroughDate == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localChargedThroughDate));
        }
        if (localChargeModelTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "ChargeModel"));

            elementList.add(localChargeModel == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localChargeModel));
        }
        if (localChargeNumberTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "ChargeNumber"));

            elementList.add(localChargeNumber == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localChargeNumber));
        }
        if (localChargeTypeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "ChargeType"));

            elementList.add(localChargeType == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localChargeType));
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
        if (localDiscountAmountTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "DiscountAmount"));

            elementList.add(localDiscountAmount == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localDiscountAmount));
        }
        if (localDiscountLevelTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "DiscountLevel"));

            elementList.add(localDiscountLevel == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localDiscountLevel));
        }
        if (localDiscountPercentageTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "DiscountPercentage"));

            elementList.add(localDiscountPercentage == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localDiscountPercentage));
        }
        if (localDMRCTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "DMRC"));

            elementList.add(localDMRC == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localDMRC));
        }
        if (localDTCVTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "DTCV"));

            elementList.add(localDTCV == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localDTCV));
        }
        if (localEffectiveEndDateTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "EffectiveEndDate"));

            elementList.add(localEffectiveEndDate == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localEffectiveEndDate));
        }
        if (localEffectiveStartDateTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "EffectiveStartDate"));

            elementList.add(localEffectiveStartDate == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localEffectiveStartDate));
        }
        if (localIncludedUnitsTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "IncludedUnits"));

            elementList.add(localIncludedUnits == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localIncludedUnits));
        }
        if (localIsLastSegmentTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "IsLastSegment"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localIsLastSegment));
        }
        if (localMRRTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "MRR"));

            elementList.add(localMRR == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localMRR));
        }
        if (localNameTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Name"));

            elementList.add(localName == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localName));
        }
        if (localNumberOfPeriodsTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "NumberOfPeriods"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localNumberOfPeriods));
        }
        if (localOriginalIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "OriginalId"));

            elementList.add(localOriginalId == null ? null : localOriginalId);
        }
        if (localOverageCalculationOptionTracker) {
            elementList
                    .add(new javax.xml.namespace.QName(
                            "http://object.api.zuora.com/",
                            "OverageCalculationOption"));

            elementList.add(localOverageCalculationOption == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localOverageCalculationOption));
        }
        if (localOveragePriceTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "OveragePrice"));

            elementList.add(localOveragePrice == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localOveragePrice));
        }
        if (localOverageUnusedUnitsCreditOptionTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/",
                    "OverageUnusedUnitsCreditOption"));

            elementList
                    .add(localOverageUnusedUnitsCreditOption == null ? null
                            : org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToString(localOverageUnusedUnitsCreditOption));
        }
        if (localPriceTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Price"));

            elementList.add(localPrice == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localPrice));
        }
        if (localPriceChangeOptionTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "PriceChangeOption"));

            elementList.add(localPriceChangeOption == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localPriceChangeOption));
        }
        if (localPriceIncreasePercentageTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "PriceIncreasePercentage"));

            elementList.add(localPriceIncreasePercentage == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localPriceIncreasePercentage));
        }
        if (localProcessedThroughDateTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "ProcessedThroughDate"));

            elementList.add(localProcessedThroughDate == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localProcessedThroughDate));
        }
        if (localProductRatePlanChargeIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "ProductRatePlanChargeId"));

            elementList.add(localProductRatePlanChargeId == null ? null
                    : localProductRatePlanChargeId);
        }
        if (localQuantityTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Quantity"));

            elementList.add(localQuantity == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localQuantity));
        }
        if (localRatePlanIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "RatePlanId"));

            elementList.add(localRatePlanId == null ? null : localRatePlanId);
        }
        if (localRolloverBalanceTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "RolloverBalance"));

            elementList.add(localRolloverBalance == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localRolloverBalance));
        }
        if (localSegmentTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Segment"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localSegment));
        }
        if (localTCVTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "TCV"));

            elementList.add(localTCV == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localTCV));
        }
        if (localTriggerDateTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "TriggerDate"));

            elementList.add(localTriggerDate == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localTriggerDate));
        }
        if (localTriggerEventTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "TriggerEvent"));

            elementList.add(localTriggerEvent == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localTriggerEvent));
        }
        if (localUnusedUnitsCreditRatesTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "UnusedUnitsCreditRates"));

            elementList.add(localUnusedUnitsCreditRates == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localUnusedUnitsCreditRates));
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
        if (localUpToPeriodsTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "UpToPeriods"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localUpToPeriods));
        }
        if (localUsageRecordRatingOptionTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "UsageRecordRatingOption"));

            elementList.add(localUsageRecordRatingOption == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localUsageRecordRatingOption));
        }
        if (localUseDiscountSpecificAccountingCodeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/",
                    "UseDiscountSpecificAccountingCode"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localUseDiscountSpecificAccountingCode));
        }
        if (localVersionTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Version"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localVersion));
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
        public static RatePlanCharge parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            RatePlanCharge object = new RatePlanCharge();

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

                        if (!"RatePlanCharge".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader
                                    .getNamespaceContext().getNamespaceURI(
                                            nsPrefix);
                            return (RatePlanCharge) com.zuora.api.object.ExtensionMapper
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
                        "ApplyDiscountTo").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setApplyDiscountTo(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "BillCycleDay")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setBillCycleDay(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToInt(content));

                    } else {

                        object.setBillCycleDay(java.lang.Integer.MIN_VALUE);

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                    object.setBillCycleDay(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "BillCycleType")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setBillCycleType(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "BillingPeriodAlignment").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setBillingPeriodAlignment(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "ChargedThroughDate").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setChargedThroughDate(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "ChargeModel")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setChargeModel(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "ChargeType")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setChargeType(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/",
                        "DiscountAmount").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setDiscountAmount(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "DiscountLevel")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setDiscountLevel(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "DiscountPercentage").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setDiscountPercentage(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "DMRC")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setDMRC(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "DTCV")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setDTCV(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "EffectiveEndDate").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setEffectiveEndDate(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "EffectiveStartDate").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setEffectiveStartDate(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "IncludedUnits")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setIncludedUnits(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "IsLastSegment")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setIsLastSegment(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToBoolean(content));

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
                        "http://object.api.zuora.com/", "MRR")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setMRR(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "Name")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setName(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "NumberOfPeriods").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setNumberOfPeriods(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToLong(content));

                    } else {

                        object.setNumberOfPeriods(java.lang.Long.MIN_VALUE);

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                    object.setNumberOfPeriods(java.lang.Long.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "OriginalId")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setOriginalId(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setOriginalId(com.zuora.api.ID.Factory
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
                        "OverageCalculationOption").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setOverageCalculationOption(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "OveragePrice")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setOveragePrice(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "OverageUnusedUnitsCreditOption").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setOverageUnusedUnitsCreditOption(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "Price")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setPrice(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "PriceChangeOption").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setPriceChangeOption(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "PriceIncreasePercentage").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setPriceIncreasePercentage(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "ProcessedThroughDate")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setProcessedThroughDate(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "ProductRatePlanChargeId").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setProductRatePlanChargeId(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setProductRatePlanChargeId(com.zuora.api.ID.Factory
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
                        "http://object.api.zuora.com/", "RatePlanId")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setRatePlanId(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setRatePlanId(com.zuora.api.ID.Factory
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
                        "RolloverBalance").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setRolloverBalance(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "Segment")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setSegment(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToInt(content));

                    } else {

                        object.setSegment(java.lang.Integer.MIN_VALUE);

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                    object.setSegment(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "TCV")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setTCV(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "TriggerDate")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setTriggerDate(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "TriggerEvent")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setTriggerEvent(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "UnusedUnitsCreditRates").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setUnusedUnitsCreditRates(org.apache.axis2.databinding.utils.ConverterUtil
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

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "UpToPeriods")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setUpToPeriods(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToLong(content));

                    } else {

                        object.setUpToPeriods(java.lang.Long.MIN_VALUE);

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                    object.setUpToPeriods(java.lang.Long.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/",
                        "UsageRecordRatingOption").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setUsageRecordRatingOption(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "UseDiscountSpecificAccountingCode")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setUseDiscountSpecificAccountingCode(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToBoolean(content));

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
                        "http://object.api.zuora.com/", "Version")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setVersion(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToLong(content));

                    } else {

                        object.setVersion(java.lang.Long.MIN_VALUE);

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                    object.setVersion(java.lang.Long.MIN_VALUE);

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
