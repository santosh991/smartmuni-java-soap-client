
package com.smartmuni.services.soap.smartobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FolderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FolderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DOCUMENTS"/>
 *     &lt;enumeration value="EMAIL_TEMPLATES"/>
 *     &lt;enumeration value="REPORTS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FolderType")
@XmlEnum
public enum FolderType {

    DOCUMENTS,
    EMAIL_TEMPLATES,
    REPORTS;

    public String value() {
        return name();
    }

    public static FolderType fromValue(String v) {
        return valueOf(v);
    }

}
