//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.19 at 04:10:08 PM IST 
//


package com.migration.soapservice.entity;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseCoApplicantInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseCoApplicantInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrevCoAppType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DebtOfCoApplicant" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="8"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CoAppMonthlyIncome" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="8"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseCoApplicantInfo", propOrder = {
    "prevCoAppType",
    "debtOfCoApplicant",
    "coAppMonthlyIncome"
})
public class ResponseCoApplicantInfo {

    @XmlElement(name = "PrevCoAppType")
    protected String prevCoAppType;
    @XmlElement(name = "DebtOfCoApplicant")
    protected BigDecimal debtOfCoApplicant;
    @XmlElement(name = "CoAppMonthlyIncome")
    protected BigDecimal coAppMonthlyIncome;

    /**
     * Gets the value of the prevCoAppType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevCoAppType() {
        return prevCoAppType;
    }

    /**
     * Sets the value of the prevCoAppType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevCoAppType(String value) {
        this.prevCoAppType = value;
    }

    /**
     * Gets the value of the debtOfCoApplicant property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebtOfCoApplicant() {
        return debtOfCoApplicant;
    }

    /**
     * Sets the value of the debtOfCoApplicant property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebtOfCoApplicant(BigDecimal value) {
        this.debtOfCoApplicant = value;
    }

    /**
     * Gets the value of the coAppMonthlyIncome property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoAppMonthlyIncome() {
        return coAppMonthlyIncome;
    }

    /**
     * Sets the value of the coAppMonthlyIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoAppMonthlyIncome(BigDecimal value) {
        this.coAppMonthlyIncome = value;
    }

}
