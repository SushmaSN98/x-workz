package com.Xworkz.phone;

public class PhoneNumberTester {
	public static void main(String[] args) {
	
		System.out.println("jvm kareyuvudu main");

		System.out.println("Total items to search" + PhoneDirectory. totalPhoneNo());
		PhoneDirectory.find("9148301172");

		System.out.println("main nirgamana");
	}
}




