
package com.smartmuni.services.soap.smartobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxBillStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxBillStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PAID"/>
 *     &lt;enumeration value="PAID_FIRST"/>
 *     &lt;enumeration value="PAID_PARTIAL"/>
 *     &lt;enumeration value="UNPAID"/>
 *     &lt;enumeration value="TAX_SALE"/>
 *     &lt;enumeration value="DELINQUENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxBillStatusType")
@XmlEnum
public enum TaxBillStatusType {

    PAID,
    PAID_FIRST,
    PAID_PARTIAL,
    UNPAID,
    TAX_SALE,
    DELINQUENT;

    public String value() {
        return name();
    }

    public static TaxBillStatusType fromValue(String v) {
        return valueOf(v);
    }

}
