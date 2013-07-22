package com.smartmuni.client;

import java.text.ParseException;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;

import com.smartmuni.services.soap.smartobject.Bond;
import com.smartmuni.services.soap.smartobject.BondDebtSchedule;
import com.smartmuni.services.soap.smartobject.SmartObject;

public class RetrieveBondSample extends BaseSample {

	public static void main(String[] args) throws DatatypeConfigurationException, ParseException {
		
		RetrieveBondSample retrieveBondSample = new RetrieveBondSample();
				
		// Process login
		retrieveBondSample.login(args[0], args[1], args[2]);
		
		// Retrieve the bond
		Bond bond = retrieveBondSample.getBond();

		// Display the bond name
		System.out.println(bond.getName());

		// Retrieve the bond debt schedile
		List<SmartObject> smartObjects = retrieveBondSample.getBondDebtSchedule(bond);
		
		// Display the payment amount due for each bond debt schedule payment date
		for (SmartObject smartObject : smartObjects) {
			
			BondDebtSchedule bondDebtSchedule = (BondDebtSchedule)smartObject;
			
			System.out.println(bondDebtSchedule.getPaymentAmount());
		}
		
		// Logout of the system
		retrieveBondSample.logout();
	}

	/**
	 * @return
	 * @throws DatatypeConfigurationException
	 * @throws ParseException
	 */
	public Bond getBond() throws DatatypeConfigurationException, ParseException {

		Bond bond = null;

		try {

			// Query for an existing bond
			List<SmartObject> smartObjects = smartmuniService.query("Select bond From Bond bond Where (bond.name = '130531-01-PB-05')");
			
			// If the bond was found then retrieve it from the list
			if (smartObjects.size() > 0) {
				bond = (Bond)smartObjects.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bond;
	}

	/**
	 * @param bond
	 * @return
	 * @throws DatatypeConfigurationException
	 * @throws ParseException
	 */
	public List<SmartObject> getBondDebtSchedule(Bond bond) throws DatatypeConfigurationException, ParseException {

		List<SmartObject> smartObjects = null;

		try {

			// Query for an existing bond debt schedule
			smartObjects = smartmuniService.query("Select bondDebtSchedule From BondDebtSchedule bondDebtSchedule Where (bondDebtSchedule.bond.name = '130531-01-PB-05')");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return smartObjects;
	}
}
