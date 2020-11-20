package com.Xworkz.develop;

import com.Xworkz.develop.quality.Mobile;

public class QualityTester {
	public static void main(String[] args) {
		
		Mobile mobile=new Mobile();
		Mobile.company="Redmi";
		mobile.model="RedmiNote8Pro";
		mobile.colour="HaloWhite";
		mobile.battery="4500mAh";
		mobile.storage="64GB";
		
		mobile.displayInfo();
		
		Mobile mobile2=new Mobile();
		mobile2.model="RedmiNote8";
		mobile2.colour="NeptuneBlue";
		mobile2.battery="4000mAh";
		mobile2.storage="128GB";
		
		mobile2.displayInfo();
		
		Mobile mobile3=new Mobile();
		mobile3.model="RedmiNote9";
		mobile3.colour="ScarletRed";
		mobile3.battery="5020mAh";
		mobile3.storage="64GB";
		
		mobile3.displayInfo();
		
		Mobile mobile4=new Mobile();
		mobile4.model="Redmi8ADual";
		mobile4.colour="SeaBlue";
		mobile4.battery="5000mAh";
		mobile4.storage="32GB";
		
		mobile4.displayInfo();
		
		Mobile mobile5=new Mobile();
		mobile5.model="Redmi9Prime";
		mobile5.colour="MatteBlack";
		mobile5.battery="5020mAh";
		mobile5.storage="128GB";
		
		mobile5.displayInfo();
		
		Mobile mobile6=new Mobile();
		mobile6.model="Redmi9i";
		mobile6.colour="MidnightBlack";
		mobile6.battery="5000mAh";
		mobile6.storage="512GB";
		
		mobile6.displayInfo();
		
		Mobile mobile7=new Mobile();
		mobile7.model="RedmiNote9ProMax";
		mobile7.colour="AuroraBlue";
		mobile7.battery="5020mAh";
		mobile7.storage="64GB";
		
		mobile7.displayInfo();
		
		Mobile mobile8=new Mobile();
		mobile8.model="Mi10TPro";
		mobile8.colour="LunarSilver";
		mobile8.battery="4050mAh";
		mobile8.storage="128GB";
		
		mobile8.displayInfo();
		
		Mobile mobile9=new Mobile();
		mobile9.model="MiA2";
		mobile9.colour="Red";
		mobile9.battery="3010mAh";
		mobile9.storage="64GB";
		
		mobile9.displayInfo();
		
		}

}
