
package com.smartmuni.services.soap.smartobject;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Property complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Property">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.smartmuni.com/soap/smartobject}SmartObject">
 *       &lt;sequence>
 *         &lt;element name="administrativeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="backupLevyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="block" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buildingSquareFeet" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="certificateOfOccupancyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="density" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="escrowCloseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expectedMaximumLevyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="expectedMaximumLevyRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="interestAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="landUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="levy" type="{http://services.smartmuni.com/soap/smartobject}Levy" minOccurs="0"/>
 *         &lt;element name="levyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="levyClass" type="{http://services.smartmuni.com/soap/smartobject}LevyClass" minOccurs="0"/>
 *         &lt;element name="levyRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="lot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfPermits" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="numberOfUnits" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="parcel" type="{http://services.smartmuni.com/soap/smartobject}Parcel" minOccurs="0"/>
 *         &lt;element name="parcelMap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parcelNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permitDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="planArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prepayPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="prepayYear" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="principalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="reserveAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="subsidy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subsidyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="taxableLandArea" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalLandArea" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tractDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tractPhase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waterUsage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Property", propOrder = {
    "administrativeAmount",
    "backupLevyAmount",
    "block",
    "building",
    "buildingSquareFeet",
    "certificateOfOccupancyDate",
    "density",
    "description",
    "escrowCloseDate",
    "expectedMaximumLevyAmount",
    "expectedMaximumLevyRate",
    "interestAmount",
    "landUse",
    "levy",
    "levyAmount",
    "levyClass",
    "levyRate",
    "lot",
    "numberOfPermits",
    "numberOfUnits",
    "parcel",
    "parcelMap",
    "parcelNumber",
    "permitDate",
    "planArea",
    "prepayPercent",
    "prepayYear",
    "principalAmount",
    "reserveAmount",
    "subsidy",
    "subsidyAmount",
    "taxableLandArea",
    "totalLandArea",
    "tract",
    "tractDate",
    "tractPhase",
    "unit",
    "waterUsage",
    "zone"
})
public class Property
    extends SmartObject
{

    protected BigDecimal administrativeAmount;
    protected BigDecimal backupLevyAmount;
    protected String block;
    protected String building;
    protected BigDecimal buildingSquareFeet;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar certificateOfOccupancyDate;
    protected BigDecimal density;
    protected String description;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar escrowCloseDate;
    protected BigDecimal expectedMaximumLevyAmount;
    protected BigDecimal expectedMaximumLevyRate;
    protected BigDecimal interestAmount;
    protected String landUse;
    protected Levy levy;
    protected BigDecimal levyAmount;
    protected LevyClass levyClass;
    protected BigDecimal levyRate;
    protected String lot;
    protected BigDecimal numberOfPermits;
    protected BigDecimal numberOfUnits;
    protected Parcel parcel;
    protected String parcelMap;
    protected String parcelNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar permitDate;
    protected String planArea;
    protected BigDecimal prepayPercent;
    protected BigDecimal prepayYear;
    protected BigDecimal principalAmount;
    protected BigDecimal reserveAmount;
    protected String subsidy;
    protected BigDecimal subsidyAmount;
    protected BigDecimal taxableLandArea;
    protected BigDecimal totalLandArea;
    protected String tract;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tractDate;
    protected String tractPhase;
    protected String unit;
    protected BigDecimal waterUsage;
    protected String zone;

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
     * Gets the value of the block property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlock(String value) {
        this.block = value;
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * Gets the value of the buildingSquareFeet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBuildingSquareFeet() {
        return buildingSquareFeet;
    }

    /**
     * Sets the value of the buildingSquareFeet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBuildingSquareFeet(BigDecimal value) {
        this.buildingSquareFeet = value;
    }

    /**
     * Gets the value of the certificateOfOccupancyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCertificateOfOccupancyDate() {
        return certificateOfOccupancyDate;
    }

    /**
     * Sets the value of the certificateOfOccupancyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCertificateOfOccupancyDate(XMLGregorianCalendar value) {
        this.certificateOfOccupancyDate = value;
    }

    /**
     * Gets the value of the density property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDensity() {
        return density;
    }

    /**
     * Sets the value of the density property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDensity(BigDecimal value) {
        this.density = value;
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
     * Gets the value of the escrowCloseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEscrowCloseDate() {
        return escrowCloseDate;
    }

    /**
     * Sets the value of the escrowCloseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEscrowCloseDate(XMLGregorianCalendar value) {
        this.escrowCloseDate = value;
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
     * Gets the value of the landUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandUse() {
        return landUse;
    }

    /**
     * Sets the value of the landUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandUse(String value) {
        this.landUse = value;
    }

    /**
     * Gets the value of the levy property.
     * 
     * @return
     *     possible object is
     *     {@link Levy }
     *     
     */
    public Levy getLevy() {
        return levy;
    }

    /**
     * Sets the value of the levy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Levy }
     *     
     */
    public void setLevy(Levy value) {
        this.levy = value;
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
     * Gets the value of the lot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLot() {
        return lot;
    }

    /**
     * Sets the value of the lot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLot(String value) {
        this.lot = value;
    }

    /**
     * Gets the value of the numberOfPermits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfPermits() {
        return numberOfPermits;
    }

    /**
     * Sets the value of the numberOfPermits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfPermits(BigDecimal value) {
        this.numberOfPermits = value;
    }

    /**
     * Gets the value of the numberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Sets the value of the numberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfUnits(BigDecimal value) {
        this.numberOfUnits = value;
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
     * Gets the value of the parcelMap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelMap() {
        return parcelMap;
    }

    /**
     * Sets the value of the parcelMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelMap(String value) {
        this.parcelMap = value;
    }

    /**
     * Gets the value of the parcelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelNumber() {
        return parcelNumber;
    }

    /**
     * Sets the value of the parcelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelNumber(String value) {
        this.parcelNumber = value;
    }

    /**
     * Gets the value of the permitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPermitDate() {
        return permitDate;
    }

    /**
     * Sets the value of the permitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPermitDate(XMLGregorianCalendar value) {
        this.permitDate = value;
    }

    /**
     * Gets the value of the planArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanArea() {
        return planArea;
    }

    /**
     * Sets the value of the planArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanArea(String value) {
        this.planArea = value;
    }

    /**
     * Gets the value of the prepayPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrepayPercent() {
        return prepayPercent;
    }

    /**
     * Sets the value of the prepayPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrepayPercent(BigDecimal value) {
        this.prepayPercent = value;
    }

    /**
     * Gets the value of the prepayYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrepayYear() {
        return prepayYear;
    }

    /**
     * Sets the value of the prepayYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrepayYear(BigDecimal value) {
        this.prepayYear = value;
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
     * Gets the value of the subsidy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsidy() {
        return subsidy;
    }

    /**
     * Sets the value of the subsidy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsidy(String value) {
        this.subsidy = value;
    }

    /**
     * Gets the value of the subsidyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubsidyAmount() {
        return subsidyAmount;
    }

    /**
     * Sets the value of the subsidyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubsidyAmount(BigDecimal value) {
        this.subsidyAmount = value;
    }

    /**
     * Gets the value of the taxableLandArea property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxableLandArea() {
        return taxableLandArea;
    }

    /**
     * Sets the value of the taxableLandArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxableLandArea(BigDecimal value) {
        this.taxableLandArea = value;
    }

    /**
     * Gets the value of the totalLandArea property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalLandArea() {
        return totalLandArea;
    }

    /**
     * Sets the value of the totalLandArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalLandArea(BigDecimal value) {
        this.totalLandArea = value;
    }

    /**
     * Gets the value of the tract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTract() {
        return tract;
    }

    /**
     * Sets the value of the tract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTract(String value) {
        this.tract = value;
    }

    /**
     * Gets the value of the tractDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTractDate() {
        return tractDate;
    }

    /**
     * Sets the value of the tractDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTractDate(XMLGregorianCalendar value) {
        this.tractDate = value;
    }

    /**
     * Gets the value of the tractPhase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTractPhase() {
        return tractPhase;
    }

    /**
     * Sets the value of the tractPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTractPhase(String value) {
        this.tractPhase = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the waterUsage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWaterUsage() {
        return waterUsage;
    }

    /**
     * Sets the value of the waterUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWaterUsage(BigDecimal value) {
        this.waterUsage = value;
    }

    /**
     * Gets the value of the zone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZone() {
        return zone;
    }

    /**
     * Sets the value of the zone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZone(String value) {
        this.zone = value;
    }

}
