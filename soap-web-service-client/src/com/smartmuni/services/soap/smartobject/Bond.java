
package com.smartmuni.services.soap.smartobject;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Bond complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bond">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.smartmuni.com/soap/smartobject}SmartObject">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CUSIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capitalizedInterestAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="costOfIssuance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="couponRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstCouponDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="maturityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="outstandingPrincipalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="projectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="term" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="type" type="{http://services.smartmuni.com/soap/smartobject}BondType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bond", propOrder = {
    "amount",
    "cusip",
    "capitalizedInterestAmount",
    "costOfIssuance",
    "couponRate",
    "datedDate",
    "description",
    "firstCouponDate",
    "maturityDate",
    "outstandingPrincipalAmount",
    "projectName",
    "term",
    "type"
})
public class Bond
    extends SmartObject
{

    protected BigDecimal amount;
    @XmlElement(name = "CUSIP")
    protected String cusip;
    protected BigDecimal capitalizedInterestAmount;
    protected BigDecimal costOfIssuance;
    protected BigDecimal couponRate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datedDate;
    protected String description;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstCouponDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maturityDate;
    protected BigDecimal outstandingPrincipalAmount;
    protected String projectName;
    protected BigDecimal term;
    protected BondType type;

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
     * Gets the value of the cusip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSIP() {
        return cusip;
    }

    /**
     * Sets the value of the cusip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSIP(String value) {
        this.cusip = value;
    }

    /**
     * Gets the value of the capitalizedInterestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapitalizedInterestAmount() {
        return capitalizedInterestAmount;
    }

    /**
     * Sets the value of the capitalizedInterestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapitalizedInterestAmount(BigDecimal value) {
        this.capitalizedInterestAmount = value;
    }

    /**
     * Gets the value of the costOfIssuance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostOfIssuance() {
        return costOfIssuance;
    }

    /**
     * Sets the value of the costOfIssuance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostOfIssuance(BigDecimal value) {
        this.costOfIssuance = value;
    }

    /**
     * Gets the value of the couponRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCouponRate() {
        return couponRate;
    }

    /**
     * Sets the value of the couponRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCouponRate(BigDecimal value) {
        this.couponRate = value;
    }

    /**
     * Gets the value of the datedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatedDate() {
        return datedDate;
    }

    /**
     * Sets the value of the datedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatedDate(XMLGregorianCalendar value) {
        this.datedDate = value;
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
     * Gets the value of the firstCouponDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstCouponDate() {
        return firstCouponDate;
    }

    /**
     * Sets the value of the firstCouponDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstCouponDate(XMLGregorianCalendar value) {
        this.firstCouponDate = value;
    }

    /**
     * Gets the value of the maturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaturityDate() {
        return maturityDate;
    }

    /**
     * Sets the value of the maturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaturityDate(XMLGregorianCalendar value) {
        this.maturityDate = value;
    }

    /**
     * Gets the value of the outstandingPrincipalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutstandingPrincipalAmount() {
        return outstandingPrincipalAmount;
    }

    /**
     * Sets the value of the outstandingPrincipalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutstandingPrincipalAmount(BigDecimal value) {
        this.outstandingPrincipalAmount = value;
    }

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTerm(BigDecimal value) {
        this.term = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BondType }
     *     
     */
    public BondType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BondType }
     *     
     */
    public void setType(BondType value) {
        this.type = value;
    }

}
