package com.Xworkz.place;

public class BusSearch {
private static String[] places={"Mysore","Banglore","Shimoga","Tirupathi","Manglore"};
	
	
	public static void search(String place) {
		System.out.println("search kareyuvudu");
		System.out.println("Total places available" + places.length);
		System.out.println("arg1 :" +  places);
		boolean placeFound = false;
		for (int count = 0; count < places.length; count++) {
		
			String place1= places[count];
			if (place1.equals(place)) {
			
				placeFound = true;
				break;
			} else {
				
				placeFound = false;
			}

		}

		if ( placeFound) {
			System.out.println("place is found ");
		} 
		else {
			System.out.println("place is not found");
		}
		System.out.println("search nirgamana");



	}

	public static int totalPlaces() {
		return places.length;
	}


}



