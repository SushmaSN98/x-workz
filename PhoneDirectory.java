package com.Xworkz.phone;

public class PhoneDirectory {
private static String[] phone = {"7349557375","8152887864","9148301172","7349558174"};
	
	
	public static void find(String number) {
		System.out.println("search kareyuvudu");
		System.out.println("Total phoneNo available" + phone.length);
		System.out.println("arg1 :" + number);
		boolean phoneNoFound = false;
		for (int count = 0; count < phone.length; count++) {
			String phoneNumber=phone[count];
			if (phoneNumber.equals(number)) {
				phoneNoFound = true;
				break;
			} else {
			
				phoneNoFound = false;
			}

		}
		if (phoneNoFound) {
			System.out.println("phoneNo is found ");
		} else {
			System.out.println("phoneNo is not found");
		}
		System.out.println("search nirgamana");

	}

	public static int totalPhoneNo() {
		return  phone.length;
	}
}





