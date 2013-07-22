
package com.smartmuni.services.soap.smartobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaskStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_STARTED"/>
 *     &lt;enumeration value="IN_PROGRESS"/>
 *     &lt;enumeration value="COMPLETE"/>
 *     &lt;enumeration value="WAITING"/>
 *     &lt;enumeration value="DEFERRED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaskStatusType")
@XmlEnum
public enum TaskStatusType {

    NOT_STARTED,
    IN_PROGRESS,
    COMPLETE,
    WAITING,
    DEFERRED;

    public String value() {
        return name();
    }

    public static TaskStatusType fromValue(String v) {
        return valueOf(v);
    }

}
