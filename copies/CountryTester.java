package com.Xworkz.copies;

import com.Xworkz.copies.constructor.Country;

public class CountryTester {

	public static void main(String[] args) {
		Country country=new Country("INDIA","NewDelhi","Rupee",28,"Hindi",1947,"Hockey",
				"Unity In Diversity");
		System.out.println("Name Of Country"+country.name);
		System.out.println("Capital Of Country"+country.capital);
		System.out.println("Currency Of Country"+country.currency);
		System.out.println("States Of Country"+country.states);
		System.out.println("Langauge Of Country"+country.langauge);
		System.out.println("YOI Of Country"+country.YOI);
		System.out.println("Game Of Country"+country.game);
		System.out.println("Culture Of Country"+country.culture);
		
		

	}

}
