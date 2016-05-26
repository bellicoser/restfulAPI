/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.bean;

/**
 *
 * @author P0007
 */
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@XmlRootElement(name = "enrollmentBean")
@JsonIgnoreProperties(ignoreUnknown = true)
public class EnrollmentBean {

    String merchantId;
    String password;
    String cardNumber;
    String cardExp;
    String cardSecurityCode;
    String userAgent;
    String termURL;
    String amount;
    String currency;
    String AuthenticationStatus;
    String CAVV;
    String ECI;
    String XID;


    public String getAuthenticationStatus() {
        return AuthenticationStatus;
    }

    public void setAuthenticationStatus(String AuthenticationStatus) {
        this.AuthenticationStatus = AuthenticationStatus;
    }

    public String getCAVV() {
        return CAVV;
    }

    public void setCAVV(String CAVV) {
        this.CAVV = CAVV;
    }

    public String getECI() {
        return ECI;
    }

    public void setECI(String ECI) {
        this.ECI = ECI;
    }

    public String getXID() {
        return XID;
    }

    public void setXID(String XID) {
        this.XID = XID;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardExp() {
        return cardExp;
    }

    public void setCardExp(String cardExp) {
        this.cardExp = cardExp;
    }

    public String getCardSecurityCode() {
        return cardSecurityCode;
    }

    public void setCardSecurityCode(String cardSecurityCode) {
        this.cardSecurityCode = cardSecurityCode;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getTermURL() {
        return termURL;
    }

    public void setTermURL(String termURL) {
        this.termURL = termURL;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
