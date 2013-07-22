
package com.smartmuni.services.soap.smartobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxBillType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxBillType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SECURED"/>
 *     &lt;enumeration value="SECURED_SUPPLEMENTAL"/>
 *     &lt;enumeration value="UNSECURED"/>
 *     &lt;enumeration value="UNSECURED_SUPPLEMENTAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxBillType")
@XmlEnum
public enum TaxBillType {

    SECURED,
    SECURED_SUPPLEMENTAL,
    UNSECURED,
    UNSECURED_SUPPLEMENTAL;

    public String value() {
        return name();
    }

    public static TaxBillType fromValue(String v) {
        return valueOf(v);
    }

}
