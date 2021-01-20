package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FoodCollection {

	public static void main(String[] args) {
		String BreakFast="Idli";
		String Lunch="GreeRice";
		String BreakFast1="Dosa";
		
		Collection foodItems=new ArrayList();
		foodItems.add(BreakFast);
		foodItems.add(Lunch);
		foodItems.add(BreakFast1);
		
		int totalFoodItems=foodItems.size();
		System.out.println("totalFoodItems:"+totalFoodItems);
		
		Iterator iterator=foodItems.iterator();
		int count=0;
		while(iterator.hasNext()) {
			Object obj=iterator.next();
			if(obj instanceof String) {
				System.out.println("String found");
				count++;
				System.out.println(count);
			}
		}
		
	}

}
