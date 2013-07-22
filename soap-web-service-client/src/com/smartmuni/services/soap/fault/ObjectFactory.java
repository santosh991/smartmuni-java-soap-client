
package com.smartmuni.services.soap.fault;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.smartmuni.services.soap.fault package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LoginFaultInfo_QNAME = new QName("http://services.smartmuni.com/soap/fault", "LoginFaultInfo");
    private final static QName _MalformedQueryFault_QNAME = new QName("http://services.smartmuni.com/soap/fault", "MalformedQueryFault");
    private final static QName _UnexpectedErrorFault_QNAME = new QName("http://services.smartmuni.com/soap/fault", "UnexpectedErrorFault");
    private final static QName _InvalidIdFault_QNAME = new QName("http://services.smartmuni.com/soap/fault", "InvalidIdFault");
    private final static QName _InvalidSmartObjectFault_QNAME = new QName("http://services.smartmuni.com/soap/fault", "InvalidSmartObjectFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.smartmuni.services.soap.fault
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ApiFaultInfo }
     * 
     */
    public ApiFaultInfo createApiFaultInfo() {
        return new ApiFaultInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smartmuni.com/soap/fault", name = "LoginFaultInfo")
    public JAXBElement<ApiFaultInfo> createLoginFaultInfo(ApiFaultInfo value) {
        return new JAXBElement<ApiFaultInfo>(_LoginFaultInfo_QNAME, ApiFaultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smartmuni.com/soap/fault", name = "MalformedQueryFault")
    public JAXBElement<ApiFaultInfo> createMalformedQueryFault(ApiFaultInfo value) {
        return new JAXBElement<ApiFaultInfo>(_MalformedQueryFault_QNAME, ApiFaultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smartmuni.com/soap/fault", name = "UnexpectedErrorFault")
    public JAXBElement<ApiFaultInfo> createUnexpectedErrorFault(ApiFaultInfo value) {
        return new JAXBElement<ApiFaultInfo>(_UnexpectedErrorFault_QNAME, ApiFaultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smartmuni.com/soap/fault", name = "InvalidIdFault")
    public JAXBElement<ApiFaultInfo> createInvalidIdFault(ApiFaultInfo value) {
        return new JAXBElement<ApiFaultInfo>(_InvalidIdFault_QNAME, ApiFaultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smartmuni.com/soap/fault", name = "InvalidSmartObjectFault")
    public JAXBElement<ApiFaultInfo> createInvalidSmartObjectFault(ApiFaultInfo value) {
        return new JAXBElement<ApiFaultInfo>(_InvalidSmartObjectFault_QNAME, ApiFaultInfo.class, null, value);
    }

}
