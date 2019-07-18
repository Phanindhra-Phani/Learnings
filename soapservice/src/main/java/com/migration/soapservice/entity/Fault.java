//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.19 at 04:10:08 PM IST 
//


package com.migration.soapservice.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Fault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faultcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="faultstring" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="faultfactor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="detail" type="{http://migration.com/soapservice/entity}FaultDetail"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fault", propOrder = {
    "faultcode",
    "faultstring",
    "faultfactor",
    "detail"
})
public class Fault {

    @XmlElement(required = true)
    protected String faultcode;
    @XmlElement(required = true)
    protected String faultstring;
    @XmlElement(required = true)
    protected String faultfactor;
    @XmlElement(required = true)
    protected FaultDetail detail;

    /**
     * Gets the value of the faultcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultcode() {
        return faultcode;
    }

    /**
     * Sets the value of the faultcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultcode(String value) {
        this.faultcode = value;
    }

    /**
     * Gets the value of the faultstring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultstring() {
        return faultstring;
    }

    /**
     * Sets the value of the faultstring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultstring(String value) {
        this.faultstring = value;
    }

    /**
     * Gets the value of the faultfactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultfactor() {
        return faultfactor;
    }

    /**
     * Sets the value of the faultfactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultfactor(String value) {
        this.faultfactor = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link FaultDetail }
     *     
     */
    public FaultDetail getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultDetail }
     *     
     */
    public void setDetail(FaultDetail value) {
        this.detail = value;
    }

}