public class TheaterFinder
{
public static void bestTheaterInBagalkotUsingString(String theaterName)
{
System.out.println("invoked bestTheaterInBagalkotUsingString");

System.out.println("arg 1 theaterName: "+theaterName);
switch(theaterName){
    case "Vasavitalkies":
	System.out.println("case is :" +theaterName);
	System.out.println("Booked on saturday");
	break;
	case "Shaktitalkies":
	System.out.println("case is :" +theaterName);
	System.out.println("Booked on sunday");
	break;
	case "Vaibhavtheater":
	System.out.println("case is :" +theaterName);
	System.out.println("Booked on monday");
	break;
	default :
    System.out.println("no theater macthed");
		
	}
	
	System.out.println("EXIt:: bestTheaterInBagalkotUsingString");
	}
	public static void bestTheaterInBagalkotUsingEnum(Theater theaterName)
	{
	System.out.println("invoked bestTheaterInBagalkotUsingString");
	System.out.println("arg 1 theaterName: "+theaterName);
    switch(theaterName)
	{
      case VASAVITALKIES :
	  System.out.println("case is :" +theaterName);
	  System.out.println("show time 10 to 1");
	  break;
	  case SHAKTITALKIES :
	  System.out.println("case is :" +theaterName);
	  System.out.println("show time 1 to 4");
	  break;
	  case VAIBHAVTHEATER :
	  System.out.println("case is :" +theaterName);
	  System.out.println("show time 7 to 10 ");
	  break;
	  default :
    System.out.println("no theater macthed");
		
	}
	
	System.out.println("EXIt:: bestTheaterInBagalkotUsingEnum");
	}
}


	
	
	
	
	
	
	