package com.smartmuni.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import com.smartmuni.services.soap.SmartmuniService;
import com.smartmuni.services.soap.fault.LoginFault;
import com.smartmuni.services.soap.fault.UnexpectedErrorFault;

public class BaseSample {
	
	protected SmartmuniService smartmuniService;
	
	/**
	 * 
	 */
	public void login(String wsdlURI, String username, String password) {

		try {
			
			// Load the WSDL
			URL url = new URL(wsdlURI);
			
			// Set the namespace
	        QName qname = new QName("http://services.smartmuni.com/soap", "SmartmuniService");
	 
	        // Create the service
	        Service service = Service.create(url, qname);
	        
	        // Get the port
	        smartmuniService = service.getPort(SmartmuniService.class);
			
	        // Set the binding to maintain session state
			BindingProvider bindingProvider = (BindingProvider)smartmuniService;
			bindingProvider.getRequestContext().put(BindingProvider.SESSION_MAINTAIN_PROPERTY, true);
			bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://services.smartmuni.com/SmartmuniService");
			
			smartmuniService.login(username, password);
			
		} catch (LoginFault e) {
			System.out.println(e.getFaultInfo().getMessage());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	public void logout() {
		try {
			smartmuniService.logout();
		} catch (UnexpectedErrorFault e) {
			e.printStackTrace();
		}
	}
}
