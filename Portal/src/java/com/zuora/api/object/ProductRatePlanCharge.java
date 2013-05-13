/**
 * ProductRatePlanCharge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.zuora.api.object;

/**
 * ProductRatePlanCharge bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class ProductRatePlanCharge extends com.zuora.api.object.ZObject
        implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name =
	 * ProductRatePlanCharge Namespace URI = http://object.api.zuora.com/
	 * Namespace Prefix = ns2
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
     * field for BillingPeriod
     */

    protected java.lang.String localBillingPeriod;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localBillingPeriodTracker = false;

    public boolean isBillingPeriodSpecified() {
        return localBillingPeriodTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getBillingPeriod() {
        return localBillingPeriod;
    }

    /**
     * Auto generated setter method
     *
     * @param param BillingPeriod
     */
    public void setBillingPeriod(java.lang.String param) {
        localBillingPeriodTracker = true;

        this.localBillingPeriod = param;

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
     * field for DefaultQuantity
     */

    protected java.math.BigDecimal localDefaultQuantity;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localDefaultQuantityTracker = false;

    public boolean isDefaultQuantitySpecified() {
        return localDefaultQuantityTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getDefaultQuantity() {
        return localDefaultQuantity;
    }

    /**
     * Auto generated setter method
     *
     * @param param DefaultQuantity
     */
    public void setDefaultQuantity(java.math.BigDecimal param) {
        localDefaultQuantityTracker = true;

        this.localDefaultQuantity = param;

    }

    /**
     * field for DeferredRevenueAccount
     */

    protected java.lang.String localDeferredRevenueAccount;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localDeferredRevenueAccountTracker = false;

    public boolean isDeferredRevenueAccountSpecified() {
        return localDeferredRevenueAccountTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDeferredRevenueAccount() {
        return localDeferredRevenueAccount;
    }

    /**
     * Auto generated setter method
     *
     * @param param DeferredRevenueAccount
     */
    public void setDeferredRevenueAccount(java.lang.String param) {
        localDeferredRevenueAccountTracker = true;

        this.localDeferredRevenueAccount = param;

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
     * field for MaxQuantity
     */

    protected java.math.BigDecimal localMaxQuantity;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localMaxQuantityTracker = false;

    public boolean isMaxQuantitySpecified() {
        return localMaxQuantityTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getMaxQuantity() {
        return localMaxQuantity;
    }

    /**
     * Auto generated setter method
     *
     * @param param MaxQuantity
     */
    public void setMaxQuantity(java.math.BigDecimal param) {
        localMaxQuantityTracker = true;

        this.localMaxQuantity = param;

    }

    /**
     * field for MinQuantity
     */

    protected java.math.BigDecimal localMinQuantity;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localMinQuantityTracker = false;

    public boolean isMinQuantitySpecified() {
        return localMinQuantityTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getMinQuantity() {
        return localMinQuantity;
    }

    /**
     * Auto generated setter method
     *
     * @param param MinQuantity
     */
    public void setMinQuantity(java.math.BigDecimal param) {
        localMinQuantityTracker = true;

        this.localMinQuantity = param;

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
     * field for NumberOfPeriod
     */

    protected long localNumberOfPeriod;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localNumberOfPeriodTracker = false;

    public boolean isNumberOfPeriodSpecified() {
        return localNumberOfPeriodTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return long
     */
    public long getNumberOfPeriod() {
        return localNumberOfPeriod;
    }

    /**
     * Auto generated setter method
     *
     * @param param NumberOfPeriod
     */
    public void setNumberOfPeriod(long param) {
        localNumberOfPeriodTracker = true;

        this.localNumberOfPeriod = param;

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
     * field for ProductRatePlanChargeTierData
     */

    protected com.zuora.api.ProductRatePlanChargeTierData localProductRatePlanChargeTierData;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localProductRatePlanChargeTierDataTracker = false;

    public boolean isProductRatePlanChargeTierDataSpecified() {
        return localProductRatePlanChargeTierDataTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ProductRatePlanChargeTierData
     */
    public com.zuora.api.ProductRatePlanChargeTierData getProductRatePlanChargeTierData() {
        return localProductRatePlanChargeTierData;
    }

    /**
     * Auto generated setter method
     *
     * @param param ProductRatePlanChargeTierData
     */
    public void setProductRatePlanChargeTierData(
            com.zuora.api.ProductRatePlanChargeTierData param) {
        localProductRatePlanChargeTierDataTracker = true;

        this.localProductRatePlanChargeTierData = param;

    }

    /**
     * field for ProductRatePlanId
     */

    protected com.zuora.api.ID localProductRatePlanId;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localProductRatePlanIdTracker = false;

    public boolean isProductRatePlanIdSpecified() {
        return localProductRatePlanIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.zuora.api.ID
     */
    public com.zuora.api.ID getProductRatePlanId() {
        return localProductRatePlanId;
    }

    /**
     * Auto generated setter method
     *
     * @param param ProductRatePlanId
     */
    public void setProductRatePlanId(com.zuora.api.ID param) {
        localProductRatePlanIdTracker = true;

        this.localProductRatePlanId = param;

    }

    /**
     * field for RecognizedRevenueAccount
     */

    protected java.lang.String localRecognizedRevenueAccount;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRecognizedRevenueAccountTracker = false;

    public boolean isRecognizedRevenueAccountSpecified() {
        return localRecognizedRevenueAccountTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getRecognizedRevenueAccount() {
        return localRecognizedRevenueAccount;
    }

    /**
     * Auto generated setter method
     *
     * @param param RecognizedRevenueAccount
     */
    public void setRecognizedRevenueAccount(java.lang.String param) {
        localRecognizedRevenueAccountTracker = true;

        this.localRecognizedRevenueAccount = param;

    }

    /**
     * field for RevenueRecognitionRuleName
     */

    protected java.lang.String localRevenueRecognitionRuleName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRevenueRecognitionRuleNameTracker = false;

    public boolean isRevenueRecognitionRuleNameSpecified() {
        return localRevenueRecognitionRuleNameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getRevenueRecognitionRuleName() {
        return localRevenueRecognitionRuleName;
    }

    /**
     * Auto generated setter method
     *
     * @param param RevenueRecognitionRuleName
     */
    public void setRevenueRecognitionRuleName(java.lang.String param) {
        localRevenueRecognitionRuleNameTracker = true;

        this.localRevenueRecognitionRuleName = param;

    }

    /**
     * field for RevRecCode
     */

    protected java.lang.String localRevRecCode;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRevRecCodeTracker = false;

    public boolean isRevRecCodeSpecified() {
        return localRevRecCodeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getRevRecCode() {
        return localRevRecCode;
    }

    /**
     * Auto generated setter method
     *
     * @param param RevRecCode
     */
    public void setRevRecCode(java.lang.String param) {
        localRevRecCodeTracker = true;

        this.localRevRecCode = param;

    }

    /**
     * field for RevRecTriggerCondition
     */

    protected java.lang.String localRevRecTriggerCondition;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRevRecTriggerConditionTracker = false;

    public boolean isRevRecTriggerConditionSpecified() {
        return localRevRecTriggerConditionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getRevRecTriggerCondition() {
        return localRevRecTriggerCondition;
    }

    /**
     * Auto generated setter method
     *
     * @param param RevRecTriggerCondition
     */
    public void setRevRecTriggerCondition(java.lang.String param) {
        localRevRecTriggerConditionTracker = true;

        this.localRevRecTriggerCondition = param;

    }

    /**
     * field for SmoothingModel
     */

    protected java.lang.String localSmoothingModel;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSmoothingModelTracker = false;

    public boolean isSmoothingModelSpecified() {
        return localSmoothingModelTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSmoothingModel() {
        return localSmoothingModel;
    }

    /**
     * Auto generated setter method
     *
     * @param param SmoothingModel
     */
    public void setSmoothingModel(java.lang.String param) {
        localSmoothingModelTracker = true;

        this.localSmoothingModel = param;

    }

    /**
     * field for SpecificBillingPeriod
     */

    protected long localSpecificBillingPeriod;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSpecificBillingPeriodTracker = false;

    public boolean isSpecificBillingPeriodSpecified() {
        return localSpecificBillingPeriodTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return long
     */
    public long getSpecificBillingPeriod() {
        return localSpecificBillingPeriod;
    }

    /**
     * Auto generated setter method
     *
     * @param param SpecificBillingPeriod
     */
    public void setSpecificBillingPeriod(long param) {
        localSpecificBillingPeriodTracker = true;

        this.localSpecificBillingPeriod = param;

    }

    /**
     * field for Taxable
     */

    protected boolean localTaxable;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTaxableTracker = false;

    public boolean isTaxableSpecified() {
        return localTaxableTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getTaxable() {
        return localTaxable;
    }

    /**
     * Auto generated setter method
     *
     * @param param Taxable
     */
    public void setTaxable(boolean param) {
        localTaxableTracker = true;

        this.localTaxable = param;

    }

    /**
     * field for TaxCode
     */

    protected java.lang.String localTaxCode;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTaxCodeTracker = false;

    public boolean isTaxCodeSpecified() {
        return localTaxCodeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTaxCode() {
        return localTaxCode;
    }

    /**
     * Auto generated setter method
     *
     * @param param TaxCode
     */
    public void setTaxCode(java.lang.String param) {
        localTaxCodeTracker = true;

        this.localTaxCode = param;

    }

    /**
     * field for TaxMode
     */

    protected java.lang.String localTaxMode;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTaxModeTracker = false;

    public boolean isTaxModeSpecified() {
        return localTaxModeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTaxMode() {
        return localTaxMode;
    }

    /**
     * Auto generated setter method
     *
     * @param param TaxMode
     */
    public void setTaxMode(java.lang.String param) {
        localTaxModeTracker = true;

        this.localTaxMode = param;

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
     * field for UseTenantDefaultForPriceChange
     */

    protected boolean localUseTenantDefaultForPriceChange;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localUseTenantDefaultForPriceChangeTracker = false;

    public boolean isUseTenantDefaultForPriceChangeSpecified() {
        return localUseTenantDefaultForPriceChangeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getUseTenantDefaultForPriceChange() {
        return localUseTenantDefaultForPriceChange;
    }

    /**
     * Auto generated setter method
     *
     * @param param UseTenantDefaultForPriceChange
     */
    public void setUseTenantDefaultForPriceChange(boolean param) {
        localUseTenantDefaultForPriceChangeTracker = true;

        this.localUseTenantDefaultForPriceChange = param;

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
                    "type", namespacePrefix + ":ProductRatePlanCharge",
                    xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                    "type", "ProductRatePlanCharge", xmlWriter);
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
        if (localBillingPeriodTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "BillingPeriod", xmlWriter);

            if (localBillingPeriod == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localBillingPeriod);

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
        if (localDefaultQuantityTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "DefaultQuantity", xmlWriter);

            if (localDefaultQuantity == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localDefaultQuantity));

            }

            xmlWriter.writeEndElement();
        }
        if (localDeferredRevenueAccountTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "DeferredRevenueAccount",
                    xmlWriter);

            if (localDeferredRevenueAccount == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localDeferredRevenueAccount);

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
        if (localMaxQuantityTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "MaxQuantity", xmlWriter);

            if (localMaxQuantity == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localMaxQuantity));

            }

            xmlWriter.writeEndElement();
        }
        if (localMinQuantityTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "MinQuantity", xmlWriter);

            if (localMinQuantity == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localMinQuantity));

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
        if (localNumberOfPeriodTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "NumberOfPeriod", xmlWriter);

            if (localNumberOfPeriod == java.lang.Long.MIN_VALUE) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localNumberOfPeriod));
            }

            xmlWriter.writeEndElement();
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
        if (localProductRatePlanChargeTierDataTracker) {
            if (localProductRatePlanChargeTierData == null) {

                writeStartElement(null, "http://object.api.zuora.com/",
                        "ProductRatePlanChargeTierData", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localProductRatePlanChargeTierData.serialize(
                        new javax.xml.namespace.QName(
                                "http://object.api.zuora.com/",
                                "ProductRatePlanChargeTierData"), xmlWriter);
            }
        }
        if (localProductRatePlanIdTracker) {
            if (localProductRatePlanId == null) {

                writeStartElement(null, "http://object.api.zuora.com/",
                        "ProductRatePlanId", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localProductRatePlanId.serialize(new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "ProductRatePlanId"),
                        xmlWriter);
            }
        }
        if (localRecognizedRevenueAccountTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "RecognizedRevenueAccount",
                    xmlWriter);

            if (localRecognizedRevenueAccount == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localRecognizedRevenueAccount);

            }

            xmlWriter.writeEndElement();
        }
        if (localRevenueRecognitionRuleNameTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "RevenueRecognitionRuleName",
                    xmlWriter);

            if (localRevenueRecognitionRuleName == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localRevenueRecognitionRuleName);

            }

            xmlWriter.writeEndElement();
        }
        if (localRevRecCodeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "RevRecCode", xmlWriter);

            if (localRevRecCode == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localRevRecCode);

            }

            xmlWriter.writeEndElement();
        }
        if (localRevRecTriggerConditionTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "RevRecTriggerCondition",
                    xmlWriter);

            if (localRevRecTriggerCondition == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localRevRecTriggerCondition);

            }

            xmlWriter.writeEndElement();
        }
        if (localSmoothingModelTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "SmoothingModel", xmlWriter);

            if (localSmoothingModel == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localSmoothingModel);

            }

            xmlWriter.writeEndElement();
        }
        if (localSpecificBillingPeriodTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "SpecificBillingPeriod",
                    xmlWriter);

            if (localSpecificBillingPeriod == java.lang.Long.MIN_VALUE) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localSpecificBillingPeriod));
            }

            xmlWriter.writeEndElement();
        }
        if (localTaxableTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "Taxable", xmlWriter);

            if (false) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localTaxable));
            }

            xmlWriter.writeEndElement();
        }
        if (localTaxCodeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "TaxCode", xmlWriter);

            if (localTaxCode == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localTaxCode);

            }

            xmlWriter.writeEndElement();
        }
        if (localTaxModeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace, "TaxMode", xmlWriter);

            if (localTaxMode == null) {
                // write the nil attribute

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localTaxMode);

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
        if (localUseTenantDefaultForPriceChangeTracker) {
            namespace = "http://object.api.zuora.com/";
            writeStartElement(null, namespace,
                    "UseTenantDefaultForPriceChange", xmlWriter);

            if (false) {

                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);

            } else {
                xmlWriter
                        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(localUseTenantDefaultForPriceChange));
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
                "http://object.api.zuora.com/", "ProductRatePlanCharge"));
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
        if (localBillingPeriodTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "BillingPeriod"));

            elementList.add(localBillingPeriod == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localBillingPeriod));
        }
        if (localBillingPeriodAlignmentTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "BillingPeriodAlignment"));

            elementList.add(localBillingPeriodAlignment == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localBillingPeriodAlignment));
        }
        if (localChargeModelTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "ChargeModel"));

            elementList.add(localChargeModel == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localChargeModel));
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
        if (localDefaultQuantityTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "DefaultQuantity"));

            elementList.add(localDefaultQuantity == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localDefaultQuantity));
        }
        if (localDeferredRevenueAccountTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "DeferredRevenueAccount"));

            elementList.add(localDeferredRevenueAccount == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localDeferredRevenueAccount));
        }
        if (localDescriptionTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Description"));

            elementList.add(localDescription == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localDescription));
        }
        if (localDiscountLevelTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "DiscountLevel"));

            elementList.add(localDiscountLevel == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localDiscountLevel));
        }
        if (localIncludedUnitsTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "IncludedUnits"));

            elementList.add(localIncludedUnits == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localIncludedUnits));
        }
        if (localMaxQuantityTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "MaxQuantity"));

            elementList.add(localMaxQuantity == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localMaxQuantity));
        }
        if (localMinQuantityTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "MinQuantity"));

            elementList.add(localMinQuantity == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localMinQuantity));
        }
        if (localNameTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Name"));

            elementList.add(localName == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localName));
        }
        if (localNumberOfPeriodTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "NumberOfPeriod"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localNumberOfPeriod));
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
        if (localOverageUnusedUnitsCreditOptionTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/",
                    "OverageUnusedUnitsCreditOption"));

            elementList
                    .add(localOverageUnusedUnitsCreditOption == null ? null
                            : org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToString(localOverageUnusedUnitsCreditOption));
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
        if (localProductRatePlanChargeTierDataTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/",
                    "ProductRatePlanChargeTierData"));

            elementList.add(localProductRatePlanChargeTierData == null ? null
                    : localProductRatePlanChargeTierData);
        }
        if (localProductRatePlanIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "ProductRatePlanId"));

            elementList.add(localProductRatePlanId == null ? null
                    : localProductRatePlanId);
        }
        if (localRecognizedRevenueAccountTracker) {
            elementList
                    .add(new javax.xml.namespace.QName(
                            "http://object.api.zuora.com/",
                            "RecognizedRevenueAccount"));

            elementList.add(localRecognizedRevenueAccount == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localRecognizedRevenueAccount));
        }
        if (localRevenueRecognitionRuleNameTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/",
                    "RevenueRecognitionRuleName"));

            elementList.add(localRevenueRecognitionRuleName == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localRevenueRecognitionRuleName));
        }
        if (localRevRecCodeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "RevRecCode"));

            elementList.add(localRevRecCode == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localRevRecCode));
        }
        if (localRevRecTriggerConditionTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "RevRecTriggerCondition"));

            elementList.add(localRevRecTriggerCondition == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localRevRecTriggerCondition));
        }
        if (localSmoothingModelTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "SmoothingModel"));

            elementList.add(localSmoothingModel == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localSmoothingModel));
        }
        if (localSpecificBillingPeriodTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "SpecificBillingPeriod"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localSpecificBillingPeriod));
        }
        if (localTaxableTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "Taxable"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localTaxable));
        }
        if (localTaxCodeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "TaxCode"));

            elementList.add(localTaxCode == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localTaxCode));
        }
        if (localTaxModeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "TaxMode"));

            elementList.add(localTaxMode == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localTaxMode));
        }
        if (localTriggerEventTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/", "TriggerEvent"));

            elementList.add(localTriggerEvent == null ? null
                    : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localTriggerEvent));
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
        if (localUseDiscountSpecificAccountingCodeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/",
                    "UseDiscountSpecificAccountingCode"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localUseDiscountSpecificAccountingCode));
        }
        if (localUseTenantDefaultForPriceChangeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://object.api.zuora.com/",
                    "UseTenantDefaultForPriceChange"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localUseTenantDefaultForPriceChange));
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
        public static ProductRatePlanCharge parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            ProductRatePlanCharge object = new ProductRatePlanCharge();

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

                        if (!"ProductRatePlanCharge".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader
                                    .getNamespaceContext().getNamespaceURI(
                                            nsPrefix);
                            return (ProductRatePlanCharge) com.zuora.api.object.ExtensionMapper
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
                        "http://object.api.zuora.com/", "BillingPeriod")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setBillingPeriod(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/",
                        "DefaultQuantity").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setDefaultQuantity(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "DeferredRevenueAccount").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setDeferredRevenueAccount(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "MaxQuantity")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setMaxQuantity(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "MinQuantity")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setMinQuantity(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "NumberOfPeriod").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setNumberOfPeriod(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToLong(content));

                    } else {

                        object.setNumberOfPeriod(java.lang.Long.MIN_VALUE);

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                    object.setNumberOfPeriod(java.lang.Long.MIN_VALUE);

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
                        "ProductRatePlanChargeTierData").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setProductRatePlanChargeTierData(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setProductRatePlanChargeTierData(com.zuora.api.ProductRatePlanChargeTierData.Factory
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
                        "ProductRatePlanId").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue)
                            || "1".equals(nillableValue)) {
                        object.setProductRatePlanId(null);
                        reader.next();

                        reader.next();

                    } else {

                        object.setProductRatePlanId(com.zuora.api.ID.Factory
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
                        "RecognizedRevenueAccount").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setRecognizedRevenueAccount(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "RevenueRecognitionRuleName").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setRevenueRecognitionRuleName(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "RevRecCode")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setRevRecCode(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "RevRecTriggerCondition").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setRevRecTriggerCondition(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "SmoothingModel").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setSmoothingModel(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "SpecificBillingPeriod").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setSpecificBillingPeriod(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToLong(content));

                    } else {

                        object.setSpecificBillingPeriod(java.lang.Long.MIN_VALUE);

                        reader.getElementText(); // throw away text nodes if
                        // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                    object.setSpecificBillingPeriod(java.lang.Long.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                        "http://object.api.zuora.com/", "Taxable")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setTaxable(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "TaxCode")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setTaxCode(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/", "TaxMode")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setTaxMode(org.apache.axis2.databinding.utils.ConverterUtil
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
                        "http://object.api.zuora.com/",
                        "UseTenantDefaultForPriceChange").equals(reader
                        .getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue)
                            && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setUseTenantDefaultForPriceChange(org.apache.axis2.databinding.utils.ConverterUtil
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
