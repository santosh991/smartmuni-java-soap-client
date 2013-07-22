package com.smartmuni.client;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;

import com.smartmuni.services.soap.DeleteResult;
import com.smartmuni.services.soap.SmartmuniService;
import com.smartmuni.services.soap.fault.UnexpectedErrorFault;

public class DeleteBondSample extends BaseSample {

	private SmartmuniService smartmuniService;

	public static void main(String[] args) throws DatatypeConfigurationException, ParseException {
		
		DeleteBondSample deleteBondSample = new DeleteBondSample();
				
		// Process login
		deleteBondSample.login(args[0], args[1], args[2]);

		// Delete the bond
		deleteBondSample.delete("0092102");

		// Logout of the system
		deleteBondSample.logout();
		
	}
	
	/**
	 * @param id
	 */
	public void delete(String id) {
		
		try {
		ArrayList<String> ids = new ArrayList<String>();
		ids.add(id);
		
		List<DeleteResult> results = smartmuniService.delete(ids);
		
		for (DeleteResult result : results) {
			System.out.println(result.getId());
			System.out.println(result.isSuccess());
			
			if (result.getErrors() != null) {
				for (int index = 0; index < result.getErrors().size(); index++) {
					System.out.println(result.getErrors().get(index).getMessage());
				}
			}
		}
		} catch (UnexpectedErrorFault unexpectedErrorFault) {
			unexpectedErrorFault.printStackTrace();
		}
	}
}
