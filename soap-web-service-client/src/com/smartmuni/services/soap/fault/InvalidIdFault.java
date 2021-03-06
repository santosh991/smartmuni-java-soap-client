
package com.smartmuni.services.soap.fault;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "InvalidIdFault", targetNamespace = "http://services.smartmuni.com/soap/fault")
public class InvalidIdFault extends Exception {

	private static final long serialVersionUID = 1195029650661303728L;

	/**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ApiFaultInfo faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public InvalidIdFault(String message, ApiFaultInfo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public InvalidIdFault(String message, ApiFaultInfo faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.smartmuni.services.soap.fault.ApiFaultInfo
     */
    public ApiFaultInfo getFaultInfo() {
        return faultInfo;
    }

}
