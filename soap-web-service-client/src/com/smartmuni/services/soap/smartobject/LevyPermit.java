
package com.smartmuni.services.soap.smartobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LevyPermit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LevyPermit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.smartmuni.com/soap/smartobject}SmartObject">
 *       &lt;sequence>
 *         &lt;element name="applied" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="applyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="levy" type="{http://services.smartmuni.com/soap/smartobject}Levy" minOccurs="0"/>
 *         &lt;element name="permit" type="{http://services.smartmuni.com/soap/smartobject}Permit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LevyPermit", propOrder = {
    "applied",
    "applyDate",
    "levy",
    "permit"
})
public class LevyPermit
    extends SmartObject
{

    protected Boolean applied;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applyDate;
    protected Levy levy;
    protected Permit permit;

    /**
     * Gets the value of the applied property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplied() {
        return applied;
    }

    /**
     * Sets the value of the applied property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplied(Boolean value) {
        this.applied = value;
    }

    /**
     * Gets the value of the applyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplyDate() {
        return applyDate;
    }

    /**
     * Sets the value of the applyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplyDate(XMLGregorianCalendar value) {
        this.applyDate = value;
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
     * Gets the value of the permit property.
     * 
     * @return
     *     possible object is
     *     {@link Permit }
     *     
     */
    public Permit getPermit() {
        return permit;
    }

    /**
     * Sets the value of the permit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Permit }
     *     
     */
    public void setPermit(Permit value) {
        this.permit = value;
    }

}
