
package com.smartmuni.services.soap.smartobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LevyAmountRoundingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LevyAmountRoundingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="ROUND_EVEN_PENNY"/>
 *     &lt;enumeration value="ROUND_WHOLE_DOLLAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LevyAmountRoundingType")
@XmlEnum
public enum LevyAmountRoundingType {

    NONE,
    ROUND_EVEN_PENNY,
    ROUND_WHOLE_DOLLAR;

    public String value() {
        return name();
    }

    public static LevyAmountRoundingType fromValue(String v) {
        return valueOf(v);
    }

}
