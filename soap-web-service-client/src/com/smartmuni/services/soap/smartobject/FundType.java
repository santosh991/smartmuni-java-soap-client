
package com.smartmuni.services.soap.smartobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FundType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEBT_SERVICE_FUND"/>
 *     &lt;enumeration value="DEBT_SERVICE_RESERVE_FUND"/>
 *     &lt;enumeration value="MANDATORY_REDEMPTION_FUND"/>
 *     &lt;enumeration value="OPERATIONS_AND_MAINTENANCE_FUND"/>
 *     &lt;enumeration value="RENEWAL_AND_REPLACEMENT_FUND"/>
 *     &lt;enumeration value="RESERVE_MAINTENANCE_FUND"/>
 *     &lt;enumeration value="RESERVE_FUND"/>
 *     &lt;enumeration value="SINKING_FUND"/>
 *     &lt;enumeration value="SURPLUS_FUND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FundType")
@XmlEnum
public enum FundType {

    DEBT_SERVICE_FUND,
    DEBT_SERVICE_RESERVE_FUND,
    MANDATORY_REDEMPTION_FUND,
    OPERATIONS_AND_MAINTENANCE_FUND,
    RENEWAL_AND_REPLACEMENT_FUND,
    RESERVE_MAINTENANCE_FUND,
    RESERVE_FUND,
    SINKING_FUND,
    SURPLUS_FUND;

    public String value() {
        return name();
    }

    public static FundType fromValue(String v) {
        return valueOf(v);
    }

}
