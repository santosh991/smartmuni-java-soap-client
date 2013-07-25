
package com.smartmuni.services.soap;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retrieve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retrieve">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="smartObjectType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ids" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieve", propOrder = {
    "smartObjectType",
    "ids"
})
public class Retrieve {

    @XmlElement(required = true)
    protected String smartObjectType;
    @XmlElement(required = true)
    protected List<String> ids;

    /**
     * Gets the value of the smartObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmartObjectType() {
        return smartObjectType;
    }

    /**
     * Sets the value of the smartObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmartObjectType(String value) {
        this.smartObjectType = value;
    }

    /**
     * Gets the value of the ids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIds() {
        if (ids == null) {
            ids = new ArrayList<String>();
        }
        return this.ids;
    }

}
