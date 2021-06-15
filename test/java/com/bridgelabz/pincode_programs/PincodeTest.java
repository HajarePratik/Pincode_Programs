package com.bridgelabz.pincode_programs;

import static org.junit.Assert.*;

import org.junit.Test;

public class PincodeTest {

	@Test
	public void passThePinCodeValidationItShouldReturnValidOrNot()
	{
		Pincode code = new Pincode();
		
		assertTrue(code.validedpincode("400088"));
		assertFalse(code.validedpincode("A400088"));
		assertFalse(code.validedpincode("400088B"));
		assertTrue(code.validedpincode("400 088"));
	
	}

}
