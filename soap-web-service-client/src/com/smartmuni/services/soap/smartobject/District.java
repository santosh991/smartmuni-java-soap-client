
package com.smartmuni.services.soap.smartobject;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for District complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="District">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.smartmuni.com/soap/smartobject}SmartObject">
 *       &lt;sequence>
 *         &lt;element name="administrationAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="administrationFeeType" type="{http://services.smartmuni.com/soap/smartobject}AdministrationFeeType" minOccurs="0"/>
 *         &lt;element name="agency" type="{http://services.smartmuni.com/soap/smartobject}Agency" minOccurs="0"/>
 *         &lt;element name="cutoffDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cutoffType" type="{http://services.smartmuni.com/soap/smartobject}CutoffType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fund" type="{http://services.smartmuni.com/soap/smartobject}Fund" minOccurs="0"/>
 *         &lt;element name="maximumTaxRounding" type="{http://services.smartmuni.com/soap/smartobject}RoundingType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "District", propOrder = {
    "administrationAmount",
    "administrationFeeType",
    "agency",
    "cutoffDate",
    "cutoffType",
    "description",
    "fund",
    "maximumTaxRounding"
})
public class District
    extends SmartObject
{

    protected BigDecimal administrationAmount;
    protected AdministrationFeeType administrationFeeType;
    protected Agency agency;
    protected String cutoffDate;
    protected CutoffType cutoffType;
    protected String description;
    protected Fund fund;
    protected RoundingType maximumTaxRounding;

    /**
     * Gets the value of the administrationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdministrationAmount() {
        return administrationAmount;
    }

    /**
     * Sets the value of the administrationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdministrationAmount(BigDecimal value) {
        this.administrationAmount = value;
    }

    /**
     * Gets the value of the administrationFeeType property.
     * 
     * @return
     *     possible object is
     *     {@link AdministrationFeeType }
     *     
     */
    public AdministrationFeeType getAdministrationFeeType() {
        return administrationFeeType;
    }

    /**
     * Sets the value of the administrationFeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrationFeeType }
     *     
     */
    public void setAdministrationFeeType(AdministrationFeeType value) {
        this.administrationFeeType = value;
    }

    /**
     * Gets the value of the agency property.
     * 
     * @return
     *     possible object is
     *     {@link Agency }
     *     
     */
    public Agency getAgency() {
        return agency;
    }

    /**
     * Sets the value of the agency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agency }
     *     
     */
    public void setAgency(Agency value) {
        this.agency = value;
    }

    /**
     * Gets the value of the cutoffDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCutoffDate() {
        return cutoffDate;
    }

    /**
     * Sets the value of the cutoffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCutoffDate(String value) {
        this.cutoffDate = value;
    }

    /**
     * Gets the value of the cutoffType property.
     * 
     * @return
     *     possible object is
     *     {@link CutoffType }
     *     
     */
    public CutoffType getCutoffType() {
        return cutoffType;
    }

    /**
     * Sets the value of the cutoffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CutoffType }
     *     
     */
    public void setCutoffType(CutoffType value) {
        this.cutoffType = value;
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
     * Gets the value of the maximumTaxRounding property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingType }
     *     
     */
    public RoundingType getMaximumTaxRounding() {
        return maximumTaxRounding;
    }

    /**
     * Sets the value of the maximumTaxRounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingType }
     *     
     */
    public void setMaximumTaxRounding(RoundingType value) {
        this.maximumTaxRounding = value;
    }

}
