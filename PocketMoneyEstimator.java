package com.Xworkz.basics.pocket;

public class PocketMoneyEstimator {
	private static double totalAmount;
	public static void request(double amount,String day) {
		System.out.println("invoked request");
		System.out.println("arg 1, amount:"+amount);
		System.out.println("arg 2, day:"+day);
		totalAmount=totalAmount+amount;
		System.out.println("Total Amount after request"+ totalAmount);
		System.out.println("Exit :: request");
	}
	public static void expenditure(double amount) {
		System.out.println("invoked expenditure");
		System.out.println("arg 1,amount:"+amount);
		totalAmount=totalAmount-amount;
		System.out.println("total Amount after expenditure"+ totalAmount);
		System.out.println("Exit :: expenditure");
	}
	public static double getTotalAmount()
	{
		return totalAmount;
	}

}
