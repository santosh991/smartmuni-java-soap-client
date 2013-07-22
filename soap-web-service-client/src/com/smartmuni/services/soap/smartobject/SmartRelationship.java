
package com.smartmuni.services.soap.smartobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartRelationship">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.smartmuni.com/soap/smartobject}SimpleObject">
 *       &lt;sequence>
 *         &lt;element name="cascadeDelete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="childSmartObject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smartObjectMetadata" type="{http://services.smartmuni.com/soap/smartobject}SmartObjectMetadata" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartRelationship", propOrder = {
    "cascadeDelete",
    "childSmartObject",
    "field",
    "name",
    "smartObjectMetadata"
})
public class SmartRelationship
    extends SimpleObject
{

    protected boolean cascadeDelete;
    protected String childSmartObject;
    protected String field;
    protected String name;
    protected SmartObjectMetadata smartObjectMetadata;

    /**
     * Gets the value of the cascadeDelete property.
     * 
     */
    public boolean isCascadeDelete() {
        return cascadeDelete;
    }

    /**
     * Sets the value of the cascadeDelete property.
     * 
     */
    public void setCascadeDelete(boolean value) {
        this.cascadeDelete = value;
    }

    /**
     * Gets the value of the childSmartObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildSmartObject() {
        return childSmartObject;
    }

    /**
     * Sets the value of the childSmartObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildSmartObject(String value) {
        this.childSmartObject = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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

}
