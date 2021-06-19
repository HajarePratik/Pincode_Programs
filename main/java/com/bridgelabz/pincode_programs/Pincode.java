package com.bridgelabz.pincode_programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pincode 
{
	
		// Method to validate the pincode
		public boolean isvalidpincode(String pincode) 
		{
			//Regex to check valid pin code
			
			Pattern pattern;
			Matcher matcher;
			String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
			pattern = Pattern.compile(regex);
			matcher = p.matcher(pincode);
			
			return m.matches();
		}

		public static void main(String[] args) 
		{
			
			Pincode PC = new Pincode();
			
			 //UC1 To check pincode is valid or not
			String pin = "400088";
			System.out.println(pin+" is Pin Code " + " : " + PC.isvalidpincode(pin));
			
			// UC2 To check pincode with adding a char to starting and is valid or not
			String pin2 = "A400088";
			System.out.println(pin2+" is Pin Code " + " : " + PC.isvalidpincode(pin2));
			
			// UC3 To check pincode with adding a char to ending and is valid or not
			String pin3 = "400088B";
			System.out.println(pin3+" is Pin Code " + " : " + PC.isvalidpincode(pin3));
			
			// UC4 To check pincode with adding a space and is valid or not
			String pin4 = "400 088";
			System.out.println(pin4+" is Pin Code " + " : " + PC.isvalidpincode(pin4));
		}
		
		// this method for test case 
		public boolean validedpincode(String pincode) 
		{
			return Pattern.matches("^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$", pincode);
		}
		

}
