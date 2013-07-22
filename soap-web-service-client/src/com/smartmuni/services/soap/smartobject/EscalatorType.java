
package com.smartmuni.services.soap.smartobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EscalatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EscalatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ESCALATE"/>
 *     &lt;enumeration value="OVERRIDE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EscalatorType")
@XmlEnum
public enum EscalatorType {

    ESCALATE,
    OVERRIDE;

    public String value() {
        return name();
    }

    public static EscalatorType fromValue(String v) {
        return valueOf(v);
    }

}
