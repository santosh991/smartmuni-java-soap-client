
package com.smartmuni.services.soap.fault;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "MalformedQueryFault", targetNamespace = "http://services.smartmuni.com/soap/fault")
public class MalformedQueryFault extends Exception {

	private static final long serialVersionUID = -6968308413836482804L;

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
    public MalformedQueryFault(String message, ApiFaultInfo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public MalformedQueryFault(String message, ApiFaultInfo faultInfo, Throwable cause) {
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
