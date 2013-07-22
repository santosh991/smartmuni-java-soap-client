
package com.smartmuni.services.soap.smartobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxRateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxRateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="TAX_PERCENT"/>
 *     &lt;enumeration value="TAX_AMOUNT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxRateType")
@XmlEnum
public enum TaxRateType {

    NONE,
    TAX_PERCENT,
    TAX_AMOUNT;

    public String value() {
        return name();
    }

    public static TaxRateType fromValue(String v) {
        return valueOf(v);
    }

}
