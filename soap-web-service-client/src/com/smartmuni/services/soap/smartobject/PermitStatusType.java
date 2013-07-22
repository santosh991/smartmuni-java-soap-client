
package com.smartmuni.services.soap.smartobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PermitStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PermitStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ISSUED"/>
 *     &lt;enumeration value="FINALIZED"/>
 *     &lt;enumeration value="EXPIRED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PermitStatusType")
@XmlEnum
public enum PermitStatusType {

    ISSUED,
    FINALIZED,
    EXPIRED;

    public String value() {
        return name();
    }

    public static PermitStatusType fromValue(String v) {
        return valueOf(v);
    }

}
