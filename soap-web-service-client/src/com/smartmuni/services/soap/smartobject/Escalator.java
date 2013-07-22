
package com.smartmuni.services.soap.smartobject;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Escalator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Escalator">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.smartmuni.com/soap/smartobject}SmartObject">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endFiscalYear" type="{http://services.smartmuni.com/soap/smartobject}FiscalYear" minOccurs="0"/>
 *         &lt;element name="levyClass" type="{http://services.smartmuni.com/soap/smartobject}LevyClass" minOccurs="0"/>
 *         &lt;element name="startFiscalYear" type="{http://services.smartmuni.com/soap/smartobject}FiscalYear" minOccurs="0"/>
 *         &lt;element name="type" type="{http://services.smartmuni.com/soap/smartobject}EscalatorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Escalator", propOrder = {
    "amount",
    "description",
    "endFiscalYear",
    "levyClass",
    "startFiscalYear",
    "type"
})
public class Escalator
    extends SmartObject
{

    protected BigDecimal amount;
    protected String description;
    protected FiscalYear endFiscalYear;
    protected LevyClass levyClass;
    protected FiscalYear startFiscalYear;
    protected EscalatorType type;

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
     * Gets the value of the endFiscalYear property.
     * 
     * @return
     *     possible object is
     *     {@link FiscalYear }
     *     
     */
    public FiscalYear getEndFiscalYear() {
        return endFiscalYear;
    }

    /**
     * Sets the value of the endFiscalYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiscalYear }
     *     
     */
    public void setEndFiscalYear(FiscalYear value) {
        this.endFiscalYear = value;
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
     * Gets the value of the startFiscalYear property.
     * 
     * @return
     *     possible object is
     *     {@link FiscalYear }
     *     
     */
    public FiscalYear getStartFiscalYear() {
        return startFiscalYear;
    }

    /**
     * Sets the value of the startFiscalYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiscalYear }
     *     
     */
    public void setStartFiscalYear(FiscalYear value) {
        this.startFiscalYear = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EscalatorType }
     *     
     */
    public EscalatorType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscalatorType }
     *     
     */
    public void setType(EscalatorType value) {
        this.type = value;
    }

}
