
package com.smartmuni.services.soap.smartobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CutoffType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CutoffType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="PERMIT_DATE"/>
 *     &lt;enumeration value="CO_DATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CutoffType")
@XmlEnum
public enum CutoffType {

    NONE,
    PERMIT_DATE,
    CO_DATE;

    public String value() {
        return name();
    }

    public static CutoffType fromValue(String v) {
        return valueOf(v);
    }

}
