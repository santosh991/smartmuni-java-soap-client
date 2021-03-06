
package com.smartmuni.services.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.smartmuni.services.soap.fault.InvalidIdFault;
import com.smartmuni.services.soap.fault.InvalidSmartObjectFault;
import com.smartmuni.services.soap.fault.LoginFault;
import com.smartmuni.services.soap.fault.MalformedQueryFault;
import com.smartmuni.services.soap.fault.UnexpectedErrorFault;
import com.smartmuni.services.soap.smartobject.SmartObject;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SmartmuniService", targetNamespace = "http://services.smartmuni.com/soap")
@XmlSeeAlso({
    com.smartmuni.services.soap.ObjectFactory.class,
    com.smartmuni.services.soap.fault.ObjectFactory.class,
    com.smartmuni.services.soap.smartobject.ObjectFactory.class
})
public interface SmartmuniService {


    /**
     * 
     * @param queryString
     * @return
     *     returns java.util.List<com.smartmuni.services.soap.smartobject.SmartObject>
     * @throws InvalidIdFault
     * @throws UnexpectedErrorFault
     * @throws MalformedQueryFault
     * @throws InvalidSmartObjectFault
     */
    @WebMethod(action = "query")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "query", targetNamespace = "http://services.smartmuni.com/soap", className = "com.smartmuni.services.soap.Query")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "http://services.smartmuni.com/soap", className = "com.smartmuni.services.soap.QueryResponse")
    public List<SmartObject> query(
        @WebParam(name = "queryString", targetNamespace = "")
        String queryString)
        throws InvalidIdFault, InvalidSmartObjectFault, MalformedQueryFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param username
     * @param password
     * @return
     *     returns com.smartmuni.services.soap.LoginResult
     * @throws LoginFault
     */
    @WebMethod(action = "login")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://services.smartmuni.com/soap", className = "com.smartmuni.services.soap.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://services.smartmuni.com/soap", className = "com.smartmuni.services.soap.LoginResponse")
    public LoginResult login(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password)
        throws LoginFault
    ;

    /**
     * 
     * @throws UnexpectedErrorFault
     */
    @WebMethod(action = "logout")
    @RequestWrapper(localName = "logout", targetNamespace = "http://services.smartmuni.com/soap", className = "com.smartmuni.services.soap.Logout")
    @ResponseWrapper(localName = "logoutResponse", targetNamespace = "http://services.smartmuni.com/soap", className = "com.smartmuni.services.soap.LogoutResponse")
    public void logout()
        throws UnexpectedErrorFault
    ;

    /**
     * 
     * @param smartObjects
     * @return
     *     returns java.util.List<com.smartmuni.services.soap.SaveResult>
     * @throws UnexpectedErrorFault
     * @throws InvalidSmartObjectFault
     */
    @WebMethod(action = "create")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "create", targetNamespace = "http://services.smartmuni.com/soap", className = "com.smartmuni.services.soap.Create")
    @ResponseWrapper(localName = "createResponse", targetNamespace = "http://services.smartmuni.com/soap", className = "com.smartmuni.services.soap.CreateResponse")
    public List<SaveResult> create(
        @WebParam(name = "smartObjects", targetNamespace = "")
        List<SmartObject> smartObjects)
        throws InvalidSmartObjectFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param ids
     * @return
     *     returns java.util.List<com.smartmuni.services.soap.DeleteResult>
     * @throws UnexpectedErrorFault
     */
    @WebMethod(action = "delete")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "delete", targetNamespace = "http://services.smartmuni.com/soap", className = "com.smartmuni.services.soap.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://services.smartmuni.com/soap", className = "com.smartmuni.services.soap.DeleteResponse")
    public List<DeleteResult> delete(
        @WebParam(name = "ids", targetNamespace = "")
        List<String> ids)
        throws UnexpectedErrorFault
    ;

    /**
     * 
     * @param smartObjects
     * @return
     *     returns java.util.List<com.smartmuni.services.soap.SaveResult>
     * @throws UnexpectedErrorFault
     * @throws InvalidSmartObjectFault
     */
    @WebMethod(action = "update")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "update", targetNamespace = "http://services.smartmuni.com/soap", className = "com.smartmuni.services.soap.Update")
    @ResponseWrapper(localName = "updateResponse", targetNamespace = "http://services.smartmuni.com/soap", className = "com.smartmuni.services.soap.UpdateResponse")
    public List<SaveResult> update(
        @WebParam(name = "smartObjects", targetNamespace = "")
        List<SmartObject> smartObjects)
        throws InvalidSmartObjectFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param ids
     * @param smartObjectType
     * @return
     *     returns java.util.List<com.smartmuni.services.soap.smartobject.SmartObject>
     * @throws InvalidIdFault
     * @throws UnexpectedErrorFault
     * @throws InvalidSmartObjectFault
     */
    @WebMethod(action = "retrieve")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retrieve", targetNamespace = "http://services.smartmuni.com/soap", className = "com.smartmuni.services.soap.Retrieve")
    @ResponseWrapper(localName = "retrieveResponse", targetNamespace = "http://services.smartmuni.com/soap", className = "com.smartmuni.services.soap.RetrieveResponse")
    public List<SmartObject> retrieve(
        @WebParam(name = "smartObjectType", targetNamespace = "")
        String smartObjectType,
        @WebParam(name = "ids", targetNamespace = "")
        List<String> ids)
        throws InvalidIdFault, InvalidSmartObjectFault, UnexpectedErrorFault
    ;

}
