//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.24 at 11:02:00 AM AST 
//


package com.example.consumesoapwebservice1.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdentifierType" type="{http://yesser.gov.sa/SaudiPost/SPWaselAddressService/version/1.0}ItemChoiceType1"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LaborOfficeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "identifierType",
    "identifier",
    "laborOfficeID"
})
@XmlRootElement(name = "GetCommercialWaselAddress")
public class GetCommercialWaselAddress {

    @XmlElement(name = "IdentifierType", required = true)
    @XmlSchemaType(name = "string")
    protected ItemChoiceType1 identifierType;
    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElement(name = "LaborOfficeID")
    protected int laborOfficeID;

    /**
     * Gets the value of the identifierType property.
     * 
     * @return
     *     possible object is
     *     {@link ItemChoiceType1 }
     *     
     */
    public ItemChoiceType1 getIdentifierType() {
        return identifierType;
    }

    /**
     * Sets the value of the identifierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemChoiceType1 }
     *     
     */
    public void setIdentifierType(ItemChoiceType1 value) {
        this.identifierType = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the laborOfficeID property.
     * 
     */
    public int getLaborOfficeID() {
        return laborOfficeID;
    }

    /**
     * Sets the value of the laborOfficeID property.
     * 
     */
    public void setLaborOfficeID(int value) {
        this.laborOfficeID = value;
    }

}
