
package com.smartmuni.services.soap.smartobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BondType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BondType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNDETERMINED"/>
 *     &lt;enumeration value="NINETEEN_ELEVIN_ACT"/>
 *     &lt;enumeration value="NINETEEN_FIFTEEN_ACT"/>
 *     &lt;enumeration value="BOND_ANTICIPATION_NOTE"/>
 *     &lt;enumeration value="GENERAL_OBLIGATION"/>
 *     &lt;enumeration value="MARKS_ROOS"/>
 *     &lt;enumeration value="MELLO_ROOS"/>
 *     &lt;enumeration value="REVENUE"/>
 *     &lt;enumeration value="TAX_ALLOCATION_BOND"/>
 *     &lt;enumeration value="TAX_REVENUE_ANTICIPATION_NOTE"/>
 *     &lt;enumeration value="LIMITED_OBLIGATION_IMPROVEMENT_BOND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BondType")
@XmlEnum
public enum BondType {

    UNDETERMINED,
    NINETEEN_ELEVIN_ACT,
    NINETEEN_FIFTEEN_ACT,
    BOND_ANTICIPATION_NOTE,
    GENERAL_OBLIGATION,
    MARKS_ROOS,
    MELLO_ROOS,
    REVENUE,
    TAX_ALLOCATION_BOND,
    TAX_REVENUE_ANTICIPATION_NOTE,
    LIMITED_OBLIGATION_IMPROVEMENT_BOND;

    public String value() {
        return name();
    }

    public static BondType fromValue(String v) {
        return valueOf(v);
    }

}
