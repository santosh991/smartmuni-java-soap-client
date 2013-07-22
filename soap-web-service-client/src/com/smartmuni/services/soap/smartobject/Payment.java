
package com.smartmuni.services.soap.smartobject;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.smartmuni.com/soap/smartobject}SmartObject">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="checkNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fund" type="{http://services.smartmuni.com/soap/smartobject}Fund" minOccurs="0"/>
 *         &lt;element name="installment" type="{http://services.smartmuni.com/soap/smartobject}InstallmentType" minOccurs="0"/>
 *         &lt;element name="parcel" type="{http://services.smartmuni.com/soap/smartobject}Parcel" minOccurs="0"/>
 *         &lt;element name="paymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="taxBill" type="{http://services.smartmuni.com/soap/smartobject}TaxBill" minOccurs="0"/>
 *         &lt;element name="type" type="{http://services.smartmuni.com/soap/smartobject}PaymentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payment", propOrder = {
    "amount",
    "checkNumber",
    "description",
    "fund",
    "installment",
    "parcel",
    "paymentDate",
    "taxBill",
    "type"
})
public class Payment
    extends SmartObject
{

    protected BigDecimal amount;
    protected String checkNumber;
    protected String description;
    protected Fund fund;
    protected InstallmentType installment;
    protected Parcel parcel;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDate;
    protected TaxBill taxBill;
    protected PaymentType type;

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
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
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
     * Gets the value of the fund property.
     * 
     * @return
     *     possible object is
     *     {@link Fund }
     *     
     */
    public Fund getFund() {
        return fund;
    }

    /**
     * Sets the value of the fund property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fund }
     *     
     */
    public void setFund(Fund value) {
        this.fund = value;
    }

    /**
     * Gets the value of the installment property.
     * 
     * @return
     *     possible object is
     *     {@link InstallmentType }
     *     
     */
    public InstallmentType getInstallment() {
        return installment;
    }

    /**
     * Sets the value of the installment property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallmentType }
     *     
     */
    public void setInstallment(InstallmentType value) {
        this.installment = value;
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
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the taxBill property.
     * 
     * @return
     *     possible object is
     *     {@link TaxBill }
     *     
     */
    public TaxBill getTaxBill() {
        return taxBill;
    }

    /**
     * Sets the value of the taxBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxBill }
     *     
     */
    public void setTaxBill(TaxBill value) {
        this.taxBill = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setType(PaymentType value) {
        this.type = value;
    }

}
