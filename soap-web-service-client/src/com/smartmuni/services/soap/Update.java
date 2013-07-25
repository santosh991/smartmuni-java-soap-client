
package com.smartmuni.services.soap;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.smartmuni.services.soap.smartobject.SmartObject;


/**
 * <p>Java class for update complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="update">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="smartObjects" type="{http://services.smartmuni.com/soap/smartobject}SmartObject" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update", propOrder = {
    "smartObjects"
})
public class Update {

    @XmlElement(required = true)
    protected List<SmartObject> smartObjects;

    /**
     * Gets the value of the smartObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smartObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmartObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmartObject }
     * 
     * 
     */
    public List<SmartObject> getSmartObjects() {
        if (smartObjects == null) {
            smartObjects = new ArrayList<SmartObject>();
        }
        return this.smartObjects;
    }

}
