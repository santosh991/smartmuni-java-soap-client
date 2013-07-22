
package com.smartmuni.services.soap.smartobject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TaxBill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxBill">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.smartmuni.com/soap/smartobject}SmartObject">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="billDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fiscalYear" type="{http://services.smartmuni.com/soap/smartobject}FiscalYear" minOccurs="0"/>
 *         &lt;element name="parcel" type="{http://services.smartmuni.com/soap/smartobject}Parcel" minOccurs="0"/>
 *         &lt;element name="payments" type="{http://services.smartmuni.com/soap/smartobject}Payment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://services.smartmuni.com/soap/smartobject}TaxBillStatusType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://services.smartmuni.com/soap/smartobject}TaxBillType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxBill", propOrder = {
    "amount",
    "billDate",
    "dueDate",
    "fiscalYear",
    "parcel",
    "payments",
    "status",
    "type"
})
public class TaxBill
    extends SmartObject
{

    protected BigDecimal amount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar billDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueDate;
    protected FiscalYear fiscalYear;
    protected Parcel parcel;
    @XmlElement(nillable = true)
    protected List<Payment> payments;
    protected TaxBillStatusType status;
    protected TaxBillType type;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the billDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillDate() {
        return billDate;
    }

    /**
     * Sets the value of the billDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillDate(XMLGregorianCalendar value) {
        this.billDate = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

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

    /**
     * Gets the value of the payments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Payment }
     * 
     * 
     */
    public List<Payment> getPayments() {
        if (payments == null) {
            payments = new ArrayList<Payment>();
        }
        return this.payments;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TaxBillStatusType }
     *     
     */
    public TaxBillStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxBillStatusType }
     *     
     */
    public void setStatus(TaxBillStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TaxBillType }
     *     
     */
    public TaxBillType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxBillType }
     *     
     */
    public void setType(TaxBillType value) {
        this.type = value;
    }

}
