//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.19 at 04:10:08 PM IST 
//


package com.migration.soapservice.entity;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StrategyOutcome complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrategyOutcome">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NodeID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OutcomeName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RandomNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TestGroupID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TestGroupName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TestGroupSetID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TestGroupSetName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
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
@XmlType(name = "StrategyOutcome", propOrder = {
    "nodeID",
    "outcomeName",
    "randomNumber",
    "testGroupID",
    "testGroupName",
    "testGroupSetID",
    "testGroupSetName"
})
public class StrategyOutcome {

    @XmlElement(name = "NodeID")
    protected BigInteger nodeID;
    @XmlElement(name = "OutcomeName")
    protected String outcomeName;
    @XmlElement(name = "RandomNumber")
    protected BigInteger randomNumber;
    @XmlElement(name = "TestGroupID")
    protected BigInteger testGroupID;
    @XmlElement(name = "TestGroupName")
    protected String testGroupName;
    @XmlElement(name = "TestGroupSetID")
    protected BigInteger testGroupSetID;
    @XmlElement(name = "TestGroupSetName")
    protected String testGroupSetName;

    /**
     * Gets the value of the nodeID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNodeID() {
        return nodeID;
    }

    /**
     * Sets the value of the nodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNodeID(BigInteger value) {
        this.nodeID = value;
    }

    /**
     * Gets the value of the outcomeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutcomeName() {
        return outcomeName;
    }

    /**
     * Sets the value of the outcomeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutcomeName(String value) {
        this.outcomeName = value;
    }

    /**
     * Gets the value of the randomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRandomNumber() {
        return randomNumber;
    }

    /**
     * Sets the value of the randomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRandomNumber(BigInteger value) {
        this.randomNumber = value;
    }

    /**
     * Gets the value of the testGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTestGroupID() {
        return testGroupID;
    }

    /**
     * Sets the value of the testGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTestGroupID(BigInteger value) {
        this.testGroupID = value;
    }

    /**
     * Gets the value of the testGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestGroupName() {
        return testGroupName;
    }

    /**
     * Sets the value of the testGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestGroupName(String value) {
        this.testGroupName = value;
    }

    /**
     * Gets the value of the testGroupSetID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTestGroupSetID() {
        return testGroupSetID;
    }

    /**
     * Sets the value of the testGroupSetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTestGroupSetID(BigInteger value) {
        this.testGroupSetID = value;
    }

    /**
     * Gets the value of the testGroupSetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestGroupSetName() {
        return testGroupSetName;
    }

    /**
     * Sets the value of the testGroupSetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestGroupSetName(String value) {
        this.testGroupSetName = value;
    }

}
