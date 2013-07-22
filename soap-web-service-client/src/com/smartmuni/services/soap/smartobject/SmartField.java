
package com.smartmuni.services.soap.smartobject;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartField">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.smartmuni.com/soap/smartobject}SmartObject">
 *       &lt;sequence>
 *         &lt;element name="decimalPlaces" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayFormula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="referenceTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="smartObjectMetadata" type="{http://services.smartmuni.com/soap/smartobject}SmartObjectMetadata" minOccurs="0"/>
 *         &lt;element name="summaryField" type="{http://services.smartmuni.com/soap/smartobject}SmartField" minOccurs="0"/>
 *         &lt;element name="summaryType" type="{http://services.smartmuni.com/soap/smartobject}SummaryType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://services.smartmuni.com/soap/smartobject}FieldType" minOccurs="0"/>
 *         &lt;element name="updatable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartField", propOrder = {
    "decimalPlaces",
    "description",
    "displayFormula",
    "label",
    "length",
    "referenceTo",
    "required",
    "sequence",
    "smartObjectMetadata",
    "summaryField",
    "summaryType",
    "type",
    "updatable"
})
public class SmartField
    extends SmartObject
{

    protected BigDecimal decimalPlaces;
    protected String description;
    protected String displayFormula;
    protected String label;
    protected BigDecimal length;
    protected String referenceTo;
    protected Boolean required;
    protected BigDecimal sequence;
    protected SmartObjectMetadata smartObjectMetadata;
    protected SmartField summaryField;
    protected SummaryType summaryType;
    protected FieldType type;
    protected Boolean updatable;

    /**
     * Gets the value of the decimalPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * Sets the value of the decimalPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecimalPlaces(BigDecimal value) {
        this.decimalPlaces = value;
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
     * Gets the value of the displayFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayFormula() {
        return displayFormula;
    }

    /**
     * Sets the value of the displayFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayFormula(String value) {
        this.displayFormula = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLength(BigDecimal value) {
        this.length = value;
    }

    /**
     * Gets the value of the referenceTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceTo() {
        return referenceTo;
    }

    /**
     * Sets the value of the referenceTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceTo(String value) {
        this.referenceTo = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSequence(BigDecimal value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the smartObjectMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link SmartObjectMetadata }
     *     
     */
    public SmartObjectMetadata getSmartObjectMetadata() {
        return smartObjectMetadata;
    }

    /**
     * Sets the value of the smartObjectMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartObjectMetadata }
     *     
     */
    public void setSmartObjectMetadata(SmartObjectMetadata value) {
        this.smartObjectMetadata = value;
    }

    /**
     * Gets the value of the summaryField property.
     * 
     * @return
     *     possible object is
     *     {@link SmartField }
     *     
     */
    public SmartField getSummaryField() {
        return summaryField;
    }

    /**
     * Sets the value of the summaryField property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartField }
     *     
     */
    public void setSummaryField(SmartField value) {
        this.summaryField = value;
    }

    /**
     * Gets the value of the summaryType property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryType }
     *     
     */
    public SummaryType getSummaryType() {
        return summaryType;
    }

    /**
     * Sets the value of the summaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryType }
     *     
     */
    public void setSummaryType(SummaryType value) {
        this.summaryType = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FieldType }
     *     
     */
    public FieldType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldType }
     *     
     */
    public void setType(FieldType value) {
        this.type = value;
    }

    /**
     * Gets the value of the updatable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdatable() {
        return updatable;
    }

    /**
     * Sets the value of the updatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdatable(Boolean value) {
        this.updatable = value;
    }

}
