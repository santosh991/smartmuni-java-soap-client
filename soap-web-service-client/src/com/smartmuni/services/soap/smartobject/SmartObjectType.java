
package com.smartmuni.services.soap.smartobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.smartmuni.com/soap/smartobject}SmartObject">
 *       &lt;sequence>
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
@XmlType(name = "SmartObjectType", propOrder = {
    "smartObjectMetadata"
})
public class SmartObjectType
    extends SmartObject
{

    protected SmartObjectMetadata smartObjectMetadata;

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
