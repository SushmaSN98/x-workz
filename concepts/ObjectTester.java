package com.Xworkz.concepts;

import com.Xworkz.concepts.obj.Vehicle;

public class ObjectTester {
	public static void main(String[] args) {

		Vehicle.yom="2020";
		
		Vehicle vehicle=new Vehicle();
		//vehicle.displayInfo();
		vehicle.color="Black";
		Vehicle.owner="Sushma";
		vehicle.model="Baleno";
		
		vehicle.displayInfo();
		Vehicle vehicle2=new Vehicle();
		//vehicle2.displayInfo();
		vehicle2.color="Blue";
		vehicle2.model="Rolls Royce";
		vehicle2.displayInfo();
		
		
	}

}



