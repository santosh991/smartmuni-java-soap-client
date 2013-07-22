
package com.smartmuni.services.soap.smartobject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Levy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Levy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.smartmuni.com/soap/smartobject}SmartObject">
 *       &lt;sequence>
 *         &lt;element name="administrativeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="backupLevyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="district" type="{http://services.smartmuni.com/soap/smartobject}District" minOccurs="0"/>
 *         &lt;element name="expectedMaximumLevyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="fiscalYear" type="{http://services.smartmuni.com/soap/smartobject}FiscalYear" minOccurs="0"/>
 *         &lt;element name="interestAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="levyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="numberOfParcels" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="principalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="properties" type="{http://services.smartmuni.com/soap/smartobject}Property" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reserveAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="specialTaxRequirementAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="statusType" type="{http://services.smartmuni.com/soap/smartobject}StatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Levy", propOrder = {
    "administrativeAmount",
    "backupLevyAmount",
    "description",
    "district",
    "expectedMaximumLevyAmount",
    "fiscalYear",
    "interestAmount",
    "levyAmount",
    "numberOfParcels",
    "principalAmount",
    "properties",
    "reserveAmount",
    "specialTaxRequirementAmount",
    "statusType"
})
public class Levy
    extends SmartObject
{

    protected BigDecimal administrativeAmount;
    protected BigDecimal backupLevyAmount;
    protected String description;
    protected District district;
    protected BigDecimal expectedMaximumLevyAmount;
    protected FiscalYear fiscalYear;
    protected BigDecimal interestAmount;
    protected BigDecimal levyAmount;
    protected Long numberOfParcels;
    protected BigDecimal principalAmount;
    @XmlElement(nillable = true)
    protected List<Property> properties;
    protected BigDecimal reserveAmount;
    protected BigDecimal specialTaxRequirementAmount;
    protected StatusType statusType;

    /**
     * Gets the value of the administrativeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdministrativeAmount() {
        return administrativeAmount;
    }

    /**
     * Sets the value of the administrativeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdministrativeAmount(BigDecimal value) {
        this.administrativeAmount = value;
    }

    /**
     * Gets the value of the backupLevyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBackupLevyAmount() {
        return backupLevyAmount;
    }

    /**
     * Sets the value of the backupLevyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBackupLevyAmount(BigDecimal value) {
        this.backupLevyAmount = value;
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
     * Gets the value of the expectedMaximumLevyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExpectedMaximumLevyAmount() {
        return expectedMaximumLevyAmount;
    }

    /**
     * Sets the value of the expectedMaximumLevyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExpectedMaximumLevyAmount(BigDecimal value) {
        this.expectedMaximumLevyAmount = value;
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
     * Gets the value of the interestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterestAmount() {
        return interestAmount;
    }

    /**
     * Sets the value of the interestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterestAmount(BigDecimal value) {
        this.interestAmount = value;
    }

    /**
     * Gets the value of the levyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLevyAmount() {
        return levyAmount;
    }

    /**
     * Sets the value of the levyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLevyAmount(BigDecimal value) {
        this.levyAmount = value;
    }

    /**
     * Gets the value of the numberOfParcels property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfParcels() {
        return numberOfParcels;
    }

    /**
     * Sets the value of the numberOfParcels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfParcels(Long value) {
        this.numberOfParcels = value;
    }

    /**
     * Gets the value of the principalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrincipalAmount() {
        return principalAmount;
    }

    /**
     * Sets the value of the principalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrincipalAmount(BigDecimal value) {
        this.principalAmount = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the properties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Property }
     * 
     * 
     */
    public List<Property> getProperties() {
        if (properties == null) {
            properties = new ArrayList<Property>();
        }
        return this.properties;
    }

    /**
     * Gets the value of the reserveAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReserveAmount() {
        return reserveAmount;
    }

    /**
     * Sets the value of the reserveAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReserveAmount(BigDecimal value) {
        this.reserveAmount = value;
    }

    /**
     * Gets the value of the specialTaxRequirementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpecialTaxRequirementAmount() {
        return specialTaxRequirementAmount;
    }

    /**
     * Sets the value of the specialTaxRequirementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpecialTaxRequirementAmount(BigDecimal value) {
        this.specialTaxRequirementAmount = value;
    }

    /**
     * Gets the value of the statusType property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatusType() {
        return statusType;
    }

    /**
     * Sets the value of the statusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatusType(StatusType value) {
        this.statusType = value;
    }

}
