
package com.smartmuni.services.soap.smartobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FieldType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Boolean"/>
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="TextArea"/>
 *     &lt;enumeration value="Currency"/>
 *     &lt;enumeration value="Number"/>
 *     &lt;enumeration value="Percent"/>
 *     &lt;enumeration value="Date"/>
 *     &lt;enumeration value="DateTime"/>
 *     &lt;enumeration value="Lookup"/>
 *     &lt;enumeration value="Address"/>
 *     &lt;enumeration value="MasterDetail"/>
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="URL"/>
 *     &lt;enumeration value="Picklist"/>
 *     &lt;enumeration value="Rule"/>
 *     &lt;enumeration value="Phone"/>
 *     &lt;enumeration value="RollUp"/>
 *     &lt;enumeration value="Calculated"/>
 *     &lt;enumeration value="Bytes"/>
 *     &lt;enumeration value="List"/>
 *     &lt;enumeration value="ObjectType"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FieldType")
@XmlEnum
public enum FieldType {

    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),
    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("TextArea")
    TEXT_AREA("TextArea"),
    @XmlEnumValue("Currency")
    CURRENCY("Currency"),
    @XmlEnumValue("Number")
    NUMBER("Number"),
    @XmlEnumValue("Percent")
    PERCENT("Percent"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Lookup")
    LOOKUP("Lookup"),
    @XmlEnumValue("Address")
    ADDRESS("Address"),
    @XmlEnumValue("MasterDetail")
    MASTER_DETAIL("MasterDetail"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    URL("URL"),
    @XmlEnumValue("Picklist")
    PICKLIST("Picklist"),
    @XmlEnumValue("Rule")
    RULE("Rule"),
    @XmlEnumValue("Phone")
    PHONE("Phone"),
    @XmlEnumValue("RollUp")
    ROLL_UP("RollUp"),
    @XmlEnumValue("Calculated")
    CALCULATED("Calculated"),
    @XmlEnumValue("Bytes")
    BYTES("Bytes"),
    @XmlEnumValue("List")
    LIST("List"),
    @XmlEnumValue("ObjectType")
    OBJECT_TYPE("ObjectType");
    private final String value;

    FieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FieldType fromValue(String v) {
        for (FieldType c: FieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
