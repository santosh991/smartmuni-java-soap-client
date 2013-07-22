
package com.smartmuni.services.soap.smartobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxLevyBasisType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxLevyBasisType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BUILDING_SQ_FEET"/>
 *     &lt;enumeration value="NUMBER_OF_UNITS"/>
 *     &lt;enumeration value="TAXABLE_ACRES"/>
 *     &lt;enumeration value="PER_PARCEL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxLevyBasisType")
@XmlEnum
public enum TaxLevyBasisType {

    BUILDING_SQ_FEET,
    NUMBER_OF_UNITS,
    TAXABLE_ACRES,
    PER_PARCEL;

    public String value() {
        return name();
    }

    public static TaxLevyBasisType fromValue(String v) {
        return valueOf(v);
    }

}
