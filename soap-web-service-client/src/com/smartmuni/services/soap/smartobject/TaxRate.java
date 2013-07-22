
package com.smartmuni.services.soap.smartobject;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxRate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.smartmuni.com/soap/smartobject}SmartObject">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="levyClass" type="{http://services.smartmuni.com/soap/smartobject}LevyClass" minOccurs="0"/>
 *         &lt;element name="rateAndMethodStep" type="{http://services.smartmuni.com/soap/smartobject}RateAndMethodStep" minOccurs="0"/>
 *         &lt;element name="taxRateType" type="{http://services.smartmuni.com/soap/smartobject}TaxRateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxRate", propOrder = {
    "amount",
    "description",
    "levyClass",
    "rateAndMethodStep",
    "taxRateType"
})
public class TaxRate
    extends SmartObject
{

    protected BigDecimal amount;
    protected String description;
    protected LevyClass levyClass;
    protected RateAndMethodStep rateAndMethodStep;
    protected TaxRateType taxRateType;

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
     * Gets the value of the levyClass property.
     * 
     * @return
     *     possible object is
     *     {@link LevyClass }
     *     
     */
    public LevyClass getLevyClass() {
        return levyClass;
    }

    /**
     * Sets the value of the levyClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevyClass }
     *     
     */
    public void setLevyClass(LevyClass value) {
        this.levyClass = value;
    }

    /**
     * Gets the value of the rateAndMethodStep property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndMethodStep }
     *     
     */
    public RateAndMethodStep getRateAndMethodStep() {
        return rateAndMethodStep;
    }

    /**
     * Sets the value of the rateAndMethodStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndMethodStep }
     *     
     */
    public void setRateAndMethodStep(RateAndMethodStep value) {
        this.rateAndMethodStep = value;
    }

    /**
     * Gets the value of the taxRateType property.
     * 
     * @return
     *     possible object is
     *     {@link TaxRateType }
     *     
     */
    public TaxRateType getTaxRateType() {
        return taxRateType;
    }

    /**
     * Sets the value of the taxRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxRateType }
     *     
     */
    public void setTaxRateType(TaxRateType value) {
        this.taxRateType = value;
    }

}
