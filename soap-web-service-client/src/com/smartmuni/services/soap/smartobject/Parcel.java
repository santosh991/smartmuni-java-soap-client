
package com.smartmuni.services.soap.smartobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Parcel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Parcel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.smartmuni.com/soap/smartobject}SmartObject">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="checkDigit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="county" type="{http://services.smartmuni.com/soap/smartobject}County" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="situsAddress" type="{http://services.smartmuni.com/soap/smartobject}Address" minOccurs="0"/>
 *         &lt;element name="taxRateArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parcel", propOrder = {
    "active",
    "checkDigit",
    "county",
    "description",
    "situsAddress",
    "taxRateArea"
})
public class Parcel
    extends SmartObject
{

    protected Boolean active;
    protected String checkDigit;
    protected County county;
    protected String description;
    protected Address situsAddress;
    protected String taxRateArea;

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the checkDigit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckDigit() {
        return checkDigit;
    }

    /**
     * Sets the value of the checkDigit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckDigit(String value) {
        this.checkDigit = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link County }
     *     
     */
    public County getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link County }
     *     
     */
    public void setCounty(County value) {
        this.county = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the situsAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getSitusAddress() {
        return situsAddress;
    }

    /**
     * Sets the value of the situsAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setSitusAddress(Address value) {
        this.situsAddress = value;
    }

    /**
     * Gets the value of the taxRateArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRateArea() {
        return taxRateArea;
    }

    /**
     * Sets the value of the taxRateArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRateArea(String value) {
        this.taxRateArea = value;
    }

}
