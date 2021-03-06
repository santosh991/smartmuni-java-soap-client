
package com.smartmuni.services.soap.smartobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoundingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoundingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="ROUND_UP"/>
 *     &lt;enumeration value="ROUND_DOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoundingType")
@XmlEnum
public enum RoundingType {

    NONE,
    ROUND_UP,
    ROUND_DOWN;

    public String value() {
        return name();
    }

    public static RoundingType fromValue(String v) {
        return valueOf(v);
    }

}
