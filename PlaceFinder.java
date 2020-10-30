public class PlaceFinder{
public static String place(double distance)
{
        System.out.println("invoked place()");
		System.out.println("distance : "+distance);
		if(distance==141.0){
			System.out.println("Place is Belgaum");
			return "Belgaum";
		    }
		    if(distance==103.2){
			System.out.println("Place is Gadag");
			return "Gadag";
		    }
			if(distance==122.3){
			System.out.println("Place is Hubli");
			return "Hubli";
			}
			if(distance==288.4){
			System.out.println("Place is Karwar");
			return "Karwar";
			}
			if(distance==315.6){
			System.out.println("Place is Shivamoga");
			return "Shivamoga";
			}
			if(distance==406.3){
			System.out.println("Place is Tumakuru");
			return "Tumakuru";
			}
			if(distance==422.6){
			System.out.println("Place is Udupi");
			return "Udupi";
			}
			if(distance==427.7){
			System.out.println("Place is Chikmagalur");
			return "Chikmagalur";
			}
		    if(distance==476.6){
		    System.out.println("Place is Manglore");
			return "Manglore";
			}
			if(distance==474.7){
			System.out.println("Place is Banglore");
			return "Banglore";
			}
			if(distance==538.3){
			System.out.println("Place is Kolar");
			return "Kolar";
			}
			if(distance==559.4){
			System.out.println("Place is Mysore");
			return "Mysore";
			}
			if(distance==10000){
			System.out.println("place is not in earth");
			return "not in earth";
			}
			System.out.println("No Match");		
		return "NO-MATCH";
			}
			}
			
		