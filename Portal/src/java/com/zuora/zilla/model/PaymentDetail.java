package com.zuora.zilla.model;

public class PaymentDetail {

    private String id;
    private String cardHolderName;
    private String maskedNumber;
    private Integer expirationYear;
    private Integer expirationMonth;
    private String cardType;
    private Boolean isDefault;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getMaskedNumber() {
        return maskedNumber;
    }

    public void setMaskedNumber(String maskedNumber) {
        this.maskedNumber = maskedNumber;
    }

    public Integer getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(Integer expirationYear) {
        this.expirationYear = expirationYear;
    }

    public Integer getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(Integer expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean aDefault) {
        this.isDefault = aDefault;
    }
}
