
package com.smartmuni.services.soap.smartobject;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LevyClass complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LevyClass">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.smartmuni.com/soap/smartobject}SmartObject">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="district" type="{http://services.smartmuni.com/soap/smartobject}District" minOccurs="0"/>
 *         &lt;element name="expectedMaximumLevyRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="levyRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="rule" type="{http://services.smartmuni.com/soap/smartobject}Rule" minOccurs="0"/>
 *         &lt;element name="taxLevyBasisType" type="{http://services.smartmuni.com/soap/smartobject}TaxLevyBasisType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LevyClass", propOrder = {
    "description",
    "district",
    "expectedMaximumLevyRate",
    "levyRate",
    "rule",
    "taxLevyBasisType"
})
public class LevyClass
    extends SmartObject
{

    protected String description;
    protected District district;
    protected BigDecimal expectedMaximumLevyRate;
    protected BigDecimal levyRate;
    protected Rule rule;
    protected TaxLevyBasisType taxLevyBasisType;

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
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link District }
     *     
     */
    public District getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link District }
     *     
     */
    public void setDistrict(District value) {
        this.district = value;
    }

    /**
     * Gets the value of the expectedMaximumLevyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExpectedMaximumLevyRate() {
        return expectedMaximumLevyRate;
    }

    /**
     * Sets the value of the expectedMaximumLevyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExpectedMaximumLevyRate(BigDecimal value) {
        this.expectedMaximumLevyRate = value;
    }

    /**
     * Gets the value of the levyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLevyRate() {
        return levyRate;
    }

    /**
     * Sets the value of the levyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLevyRate(BigDecimal value) {
        this.levyRate = value;
    }

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link Rule }
     *     
     */
    public Rule getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rule }
     *     
     */
    public void setRule(Rule value) {
        this.rule = value;
    }

    /**
     * Gets the value of the taxLevyBasisType property.
     * 
     * @return
     *     possible object is
     *     {@link TaxLevyBasisType }
     *     
     */
    public TaxLevyBasisType getTaxLevyBasisType() {
        return taxLevyBasisType;
    }

    /**
     * Sets the value of the taxLevyBasisType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxLevyBasisType }
     *     
     */
    public void setTaxLevyBasisType(TaxLevyBasisType value) {
        this.taxLevyBasisType = value;
    }

}
