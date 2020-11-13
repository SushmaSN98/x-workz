package com.Xworkz.hotel;

public class HotelMenuSearch {
private static String[] foodItems = {"Snacks","CoolDrinks","Salad","Dosa","Roti","Roti","Soups"};
	
	public static void search(String item) {
		System.out.println("Total items available " + foodItems.length);
		System.out.println("arg1 :" + item);
		boolean itemFound = false;
		
		for (int count = 0; count < foodItems.length; count++) {
			String menuItem = foodItems[count];
			if (menuItem.equals(item)) {
				itemFound = true;
				break;
			} 
			else {
				itemFound = false;
			}
		}
		if (itemFound) {
			System.out.println("item is found ");
		} 
		else {
			System.out.println("item is not found");
		}
	}
	public static int totalFoodItems() {
	return foodItems.length;
	}

}


