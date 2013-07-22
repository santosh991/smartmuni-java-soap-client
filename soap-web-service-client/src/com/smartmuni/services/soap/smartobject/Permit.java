
package com.smartmuni.services.soap.smartobject;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Permit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Permit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.smartmuni.com/soap/smartobject}SmartObject">
 *       &lt;sequence>
 *         &lt;element name="block" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buildingSquareFeet" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="certificateOfOccupancyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="county" type="{http://services.smartmuni.com/soap/smartobject}County" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfUnits" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://services.smartmuni.com/soap/smartobject}Owner" minOccurs="0"/>
 *         &lt;element name="parcel" type="{http://services.smartmuni.com/soap/smartobject}Parcel" minOccurs="0"/>
 *         &lt;element name="parcelMap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permitDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="scopeOfWork" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="situsAddress" type="{http://services.smartmuni.com/soap/smartobject}Address" minOccurs="0"/>
 *         &lt;element name="statusType" type="{http://services.smartmuni.com/soap/smartobject}PermitStatusType" minOccurs="0"/>
 *         &lt;element name="taxParcelNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tractPhase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Permit", propOrder = {
    "block",
    "building",
    "buildingSquareFeet",
    "certificateOfOccupancyDate",
    "classCode",
    "county",
    "description",
    "lot",
    "numberOfUnits",
    "owner",
    "parcel",
    "parcelMap",
    "permitDate",
    "scopeOfWork",
    "situsAddress",
    "statusType",
    "taxParcelNumber",
    "tract",
    "tractPhase",
    "unit"
})
public class Permit
    extends SmartObject
{

    protected String block;
    protected String building;
    protected BigDecimal buildingSquareFeet;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar certificateOfOccupancyDate;
    protected String classCode;
    protected County county;
    protected String description;
    protected String lot;
    protected BigDecimal numberOfUnits;
    protected Owner owner;
    protected Parcel parcel;
    protected String parcelMap;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar permitDate;
    protected String scopeOfWork;
    protected Address situsAddress;
    protected PermitStatusType statusType;
    protected String taxParcelNumber;
    protected String tract;
    protected String tractPhase;
    protected String unit;

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
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassCode(String value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link County }
     *     
     */
    public County getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link County }
     *     
     */
    public void setCounty(County value) {
        this.county = value;
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
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link Owner }
     *     
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Owner }
     *     
     */
    public void setOwner(Owner value) {
        this.owner = value;
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
     * Gets the value of the scopeOfWork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopeOfWork() {
        return scopeOfWork;
    }

    /**
     * Sets the value of the scopeOfWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopeOfWork(String value) {
        this.scopeOfWork = value;
    }

    /**
     * Gets the value of the situsAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getSitusAddress() {
        return situsAddress;
    }

    /**
     * Sets the value of the situsAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setSitusAddress(Address value) {
        this.situsAddress = value;
    }

    /**
     * Gets the value of the statusType property.
     * 
     * @return
     *     possible object is
     *     {@link PermitStatusType }
     *     
     */
    public PermitStatusType getStatusType() {
        return statusType;
    }

    /**
     * Sets the value of the statusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermitStatusType }
     *     
     */
    public void setStatusType(PermitStatusType value) {
        this.statusType = value;
    }

    /**
     * Gets the value of the taxParcelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxParcelNumber() {
        return taxParcelNumber;
    }

    /**
     * Sets the value of the taxParcelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxParcelNumber(String value) {
        this.taxParcelNumber = value;
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

}
