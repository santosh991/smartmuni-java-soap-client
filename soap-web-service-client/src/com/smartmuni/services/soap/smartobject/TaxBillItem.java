
package com.smartmuni.services.soap.smartobject;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxBillItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxBillItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.smartmuni.com/soap/smartobject}SmartObject">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="taxBill" type="{http://services.smartmuni.com/soap/smartobject}TaxBill" minOccurs="0"/>
 *         &lt;element name="type" type="{http://services.smartmuni.com/soap/smartobject}TaxBillItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxBillItem", propOrder = {
    "amount",
    "taxBill",
    "type"
})
public class TaxBillItem
    extends SmartObject
{

    protected BigDecimal amount;
    protected TaxBill taxBill;
    protected TaxBillItemType type;

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
     *     {@link TaxBillItemType }
     *     
     */
    public TaxBillItemType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxBillItemType }
     *     
     */
    public void setType(TaxBillItemType value) {
        this.type = value;
    }

}
