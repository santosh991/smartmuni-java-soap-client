
package com.smartmuni.services.soap.smartobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnerParcel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OwnerParcel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.smartmuni.com/soap/smartobject}SmartObject">
 *       &lt;sequence>
 *         &lt;element name="fiscalYear" type="{http://services.smartmuni.com/soap/smartobject}FiscalYear" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://services.smartmuni.com/soap/smartobject}Owner" minOccurs="0"/>
 *         &lt;element name="parcel" type="{http://services.smartmuni.com/soap/smartobject}Parcel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnerParcel", propOrder = {
    "fiscalYear",
    "owner",
    "parcel"
})
public class OwnerParcel
    extends SmartObject
{

    protected FiscalYear fiscalYear;
    protected Owner owner;
    protected Parcel parcel;

    /**
     * Gets the value of the fiscalYear property.
     * 
     * @return
     *     possible object is
     *     {@link FiscalYear }
     *     
     */
    public FiscalYear getFiscalYear() {
        return fiscalYear;
    }

    /**
     * Sets the value of the fiscalYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiscalYear }
     *     
     */
    public void setFiscalYear(FiscalYear value) {
        this.fiscalYear = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link Owner }
     *     
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Owner }
     *     
     */
    public void setOwner(Owner value) {
        this.owner = value;
    }

    /**
     * Gets the value of the parcel property.
     * 
     * @return
     *     possible object is
     *     {@link Parcel }
     *     
     */
    public Parcel getParcel() {
        return parcel;
    }

    /**
     * Sets the value of the parcel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parcel }
     *     
     */
    public void setParcel(Parcel value) {
        this.parcel = value;
    }

}
