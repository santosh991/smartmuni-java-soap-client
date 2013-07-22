
package com.smartmuni.services.soap.smartobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdministrationFeeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdministrationFeeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="FIXED"/>
 *     &lt;enumeration value="PERCENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdministrationFeeType")
@XmlEnum
public enum AdministrationFeeType {

    NONE,
    FIXED,
    PERCENT;

    public String value() {
        return name();
    }

    public static AdministrationFeeType fromValue(String v) {
        return valueOf(v);
    }

}
