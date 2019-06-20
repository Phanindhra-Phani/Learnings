//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.19 at 04:10:08 PM IST 
//


package com.migration.soapservice.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Root response element, includes the details of
 * 				request info, bureau data, and SM outcomes
 * 
 * <p>Java class for DecisionEngineEvalResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecisionEngineEvalResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SMOutcomes" type="{http://migration.com/soapservice/entity}SMOutcomes" minOccurs="0"/>
 *         &lt;element name="CoApplicantInfo" type="{http://migration.com/soapservice/entity}ResponseCoApplicantInfo" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="ApplicantInfo" type="{http://migration.com/soapservice/entity}ResponseApplicantInfo" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionEngineEvalResponse", propOrder = {
    "smOutcomes",
    "coApplicantInfo",
    "applicantInfo"
})
@XmlRootElement(name = "DecisionEngineEvalResponse")
public class DecisionEngineEvalResponse {

    @XmlElement(name = "SMOutcomes")
    protected SMOutcomes smOutcomes;
    @XmlElement(name = "CoApplicantInfo")
    protected List<ResponseCoApplicantInfo> coApplicantInfo;
    @XmlElement(name = "ApplicantInfo")
    protected List<ResponseApplicantInfo> applicantInfo;

    /**
     * Gets the value of the smOutcomes property.
     * 
     * @return
     *     possible object is
     *     {@link SMOutcomes }
     *     
     */
    public SMOutcomes getSMOutcomes() {
        return smOutcomes;
    }

    /**
     * Sets the value of the smOutcomes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SMOutcomes }
     *     
     */
    public void setSMOutcomes(SMOutcomes value) {
        this.smOutcomes = value;
    }

    /**
     * Gets the value of the coApplicantInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coApplicantInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoApplicantInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseCoApplicantInfo }
     * 
     * 
     */
    public List<ResponseCoApplicantInfo> getCoApplicantInfo() {
        if (coApplicantInfo == null) {
            coApplicantInfo = new ArrayList<ResponseCoApplicantInfo>();
        }
        return this.coApplicantInfo;
    }

    /**
     * Gets the value of the applicantInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicantInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicantInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseApplicantInfo }
     * 
     * 
     */
    public List<ResponseApplicantInfo> getApplicantInfo() {
        if (applicantInfo == null) {
            applicantInfo = new ArrayList<ResponseApplicantInfo>();
        }
        return this.applicantInfo;
    }

}
