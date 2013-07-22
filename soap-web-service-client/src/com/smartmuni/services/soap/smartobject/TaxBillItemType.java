
package com.smartmuni.services.soap.smartobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxBillItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxBillItemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASSESSMENT"/>
 *     &lt;enumeration value="INTEREST"/>
 *     &lt;enumeration value="CARRYOVER"/>
 *     &lt;enumeration value="INTEREST_CREDIT"/>
 *     &lt;enumeration value="AICA_CREDIT"/>
 *     &lt;enumeration value="DELINQUENT_PENALTY"/>
 *     &lt;enumeration value="COLLECTION_CHARGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxBillItemType")
@XmlEnum
public enum TaxBillItemType {

    ASSESSMENT,
    INTEREST,
    CARRYOVER,
    INTEREST_CREDIT,
    AICA_CREDIT,
    DELINQUENT_PENALTY,
    COLLECTION_CHARGE;

    public String value() {
        return name();
    }

    public static TaxBillItemType fromValue(String v) {
        return valueOf(v);
    }

}
