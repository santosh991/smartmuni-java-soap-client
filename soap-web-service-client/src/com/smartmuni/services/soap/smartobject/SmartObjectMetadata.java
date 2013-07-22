
package com.smartmuni.services.soap.smartobject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartObjectMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartObjectMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.smartmuni.com/soap/smartobject}SmartObject">
 *       &lt;sequence>
 *         &lt;element name="buttons" type="{http://services.smartmuni.com/soap/smartobject}Button" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="childRelationships" type="{http://services.smartmuni.com/soap/smartobject}SmartRelationship" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="creatable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="deletable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fields" type="{http://services.smartmuni.com/soap/smartobject}SmartField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pluralLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="smallIcon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updatable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="urlDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlEdit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlNew" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartObjectMetadata", propOrder = {
    "buttons",
    "childRelationships",
    "creatable",
    "deletable",
    "description",
    "fields",
    "label",
    "pluralLabel",
    "searchable",
    "smallIcon",
    "updatable",
    "urlDetail",
    "urlEdit",
    "urlNew"
})
public class SmartObjectMetadata
    extends SmartObject
{

    @XmlElement(nillable = true)
    protected List<Button> buttons;
    @XmlElement(nillable = true)
    protected List<SmartRelationship> childRelationships;
    protected Boolean creatable;
    protected Boolean deletable;
    protected String description;
    @XmlElement(nillable = true)
    protected List<SmartField> fields;
    protected String label;
    protected String pluralLabel;
    protected Boolean searchable;
    protected String smallIcon;
    protected Boolean updatable;
    protected String urlDetail;
    protected String urlEdit;
    protected String urlNew;

    /**
     * Gets the value of the buttons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buttons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getButtons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Button }
     * 
     * 
     */
    public List<Button> getButtons() {
        if (buttons == null) {
            buttons = new ArrayList<Button>();
        }
        return this.buttons;
    }

    /**
     * Gets the value of the childRelationships property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childRelationships property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildRelationships().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmartRelationship }
     * 
     * 
     */
    public List<SmartRelationship> getChildRelationships() {
        if (childRelationships == null) {
            childRelationships = new ArrayList<SmartRelationship>();
        }
        return this.childRelationships;
    }

    /**
     * Gets the value of the creatable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreatable() {
        return creatable;
    }

    /**
     * Sets the value of the creatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreatable(Boolean value) {
        this.creatable = value;
    }

    /**
     * Gets the value of the deletable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeletable() {
        return deletable;
    }

    /**
     * Sets the value of the deletable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeletable(Boolean value) {
        this.deletable = value;
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
     * Gets the value of the fields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmartField }
     * 
     * 
     */
    public List<SmartField> getFields() {
        if (fields == null) {
            fields = new ArrayList<SmartField>();
        }
        return this.fields;
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
     * Gets the value of the pluralLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluralLabel() {
        return pluralLabel;
    }

    /**
     * Sets the value of the pluralLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluralLabel(String value) {
        this.pluralLabel = value;
    }

    /**
     * Gets the value of the searchable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchable() {
        return searchable;
    }

    /**
     * Sets the value of the searchable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchable(Boolean value) {
        this.searchable = value;
    }

    /**
     * Gets the value of the smallIcon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmallIcon() {
        return smallIcon;
    }

    /**
     * Sets the value of the smallIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmallIcon(String value) {
        this.smallIcon = value;
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

    /**
     * Gets the value of the urlDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlDetail() {
        return urlDetail;
    }

    /**
     * Sets the value of the urlDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlDetail(String value) {
        this.urlDetail = value;
    }

    /**
     * Gets the value of the urlEdit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlEdit() {
        return urlEdit;
    }

    /**
     * Sets the value of the urlEdit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlEdit(String value) {
        this.urlEdit = value;
    }

    /**
     * Gets the value of the urlNew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlNew() {
        return urlNew;
    }

    /**
     * Sets the value of the urlNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlNew(String value) {
        this.urlNew = value;
    }

}
