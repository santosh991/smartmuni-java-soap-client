
package com.smartmuni.services.soap.smartobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstallmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InstallmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FIRST"/>
 *     &lt;enumeration value="SECOND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InstallmentType")
@XmlEnum
public enum InstallmentType {

    FIRST,
    SECOND;

    public String value() {
        return name();
    }

    public static InstallmentType fromValue(String v) {
        return valueOf(v);
    }

}
