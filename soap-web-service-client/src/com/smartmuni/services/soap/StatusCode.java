
package com.smartmuni.services.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL_OR_NONE_OPERATION_ROLLED_BACK"/>
 *     &lt;enumeration value="ALREADY_IN_PROCESS"/>
 *     &lt;enumeration value="CANNOT_REPARENT_RECORD"/>
 *     &lt;enumeration value="CIRCULAR_DEPENDENCY"/>
 *     &lt;enumeration value="DELETE_FAILED"/>
 *     &lt;enumeration value="DELETE_OPERATION_TOO_LARGE"/>
 *     &lt;enumeration value="DELETE_REQUIRED_ON_CASCADE"/>
 *     &lt;enumeration value="DEPENDENCY_EXISTS"/>
 *     &lt;enumeration value="DUPLICATE_EXTERNAL_ID"/>
 *     &lt;enumeration value="DUPLICATE_VALUE"/>
 *     &lt;enumeration value="ENTITY_IS_ARCHIVED"/>
 *     &lt;enumeration value="ENTITY_IS_DELETED"/>
 *     &lt;enumeration value="ENTITY_IS_LOCKED"/>
 *     &lt;enumeration value="FIELD_INTEGRITY_EXCEPTION"/>
 *     &lt;enumeration value="INVALID_ARGUMENT_TYPE"/>
 *     &lt;enumeration value="INVALID_FIELD"/>
 *     &lt;enumeration value="INVALID_ID_FIELD"/>
 *     &lt;enumeration value="INVALID_OPERATION"/>
 *     &lt;enumeration value="INVALID_SESSION_ID"/>
 *     &lt;enumeration value="INVALID_STATUS"/>
 *     &lt;enumeration value="INVALID_TYPE"/>
 *     &lt;enumeration value="INVALID_TYPE_FOR_OPERATION"/>
 *     &lt;enumeration value="LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="MALFORMED_ID"/>
 *     &lt;enumeration value="MISSING_ARGUMENT"/>
 *     &lt;enumeration value="NUMBER_OUTSIDE_VALID_RANGE"/>
 *     &lt;enumeration value="QUERY_TIMEOUT"/>
 *     &lt;enumeration value="REQUEST_RUNNING_TOO_LONG"/>
 *     &lt;enumeration value="REQUIRED_FIELD_MISSING"/>
 *     &lt;enumeration value="STRING_TOO_LONG"/>
 *     &lt;enumeration value="UNDELETE_FAILED"/>
 *     &lt;enumeration value="UNKNOWN_EXCEPTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusCode")
@XmlEnum
public enum StatusCode {

    ALL_OR_NONE_OPERATION_ROLLED_BACK,
    ALREADY_IN_PROCESS,
    CANNOT_REPARENT_RECORD,
    CIRCULAR_DEPENDENCY,
    DELETE_FAILED,
    DELETE_OPERATION_TOO_LARGE,
    DELETE_REQUIRED_ON_CASCADE,
    DEPENDENCY_EXISTS,
    DUPLICATE_EXTERNAL_ID,
    DUPLICATE_VALUE,
    ENTITY_IS_ARCHIVED,
    ENTITY_IS_DELETED,
    ENTITY_IS_LOCKED,
    FIELD_INTEGRITY_EXCEPTION,
    INVALID_ARGUMENT_TYPE,
    INVALID_FIELD,
    INVALID_ID_FIELD,
    INVALID_OPERATION,
    INVALID_SESSION_ID,
    INVALID_STATUS,
    INVALID_TYPE,
    INVALID_TYPE_FOR_OPERATION,
    LIMIT_EXCEEDED,
    MALFORMED_ID,
    MISSING_ARGUMENT,
    NUMBER_OUTSIDE_VALID_RANGE,
    QUERY_TIMEOUT,
    REQUEST_RUNNING_TOO_LONG,
    REQUIRED_FIELD_MISSING,
    STRING_TOO_LONG,
    UNDELETE_FAILED,
    UNKNOWN_EXCEPTION;

    public String value() {
        return name();
    }

    public static StatusCode fromValue(String v) {
        return valueOf(v);
    }

}
