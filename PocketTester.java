package com.Xworkz.basics.pocket;

public class PocketTester {

	public static void main(String[] args) {
		
		System.out.println("JVM invoked main method");
        PocketMoneyEstimator.request(25, "Monday");
        PocketMoneyEstimator.request(150, "Tuesday");
        PocketMoneyEstimator.expenditure(40);
        
        System.out.println("PocketMoneyEstimator.getTotalAmount()");
        System.out.println("Exit :: main method");
         
        
	}

}
