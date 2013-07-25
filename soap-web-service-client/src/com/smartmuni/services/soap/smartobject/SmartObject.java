
package com.smartmuni.services.soap.smartobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SmartObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.smartmuni.com/soap/smartobject}SimpleObject">
 *       &lt;sequence>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smartObjectType" type="{http://services.smartmuni.com/soap/smartobject}SmartObjectType" minOccurs="0"/>
 *         &lt;element name="updatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartObject", propOrder = {
    "createdDate",
    "name",
    "smartObjectType",
    "updatedDate"
})
@XmlSeeAlso({
    User.class,
    SmartObjectMetadata.class,
    Property.class,
    Payment.class,
    Lien.class,
    OwnerParcel.class,
    UserRole.class,
    Button.class,
    Fund.class,
    SmartObjectType.class,
    Project.class,
    FiscalYear.class,
    Permit.class,
    Profile.class,
    Levy.class,
    SmartField.class,
    District.class,
    Task.class,
    Bond.class,
    Escalator.class,
    Agency.class,
    BondDebtSchedule.class,
    Report.class,
    TaxRateArea.class,
    TaxRate.class,
    LevyPermit.class,
    Opportunity.class,
    LevyClass.class,
    LienDebtSchedule.class,
    TaxBill.class,
    Owner.class,
    Folder.class,
    Contact.class,
    Contract.class,
    County.class,
    TaxBillItem.class,
    MaxTax.class,
    Parcel.class,
    RateAndMethodStep.class
})
public abstract class SmartObject
    extends SimpleObject
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected String name;
    protected SmartObjectType smartObjectType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDate;

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the smartObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link SmartObjectType }
     *     
     */
    public SmartObjectType getSmartObjectType() {
        return smartObjectType;
    }

    /**
     * Sets the value of the smartObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartObjectType }
     *     
     */
    public void setSmartObjectType(SmartObjectType value) {
        this.smartObjectType = value;
    }

    /**
     * Gets the value of the updatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Sets the value of the updatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedDate(XMLGregorianCalendar value) {
        this.updatedDate = value;
    }

}
