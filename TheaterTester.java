public class TheaterTester{
public static void main(String[] movies)
{

System.out.println("invoked main, doing switch and enum");
TheaterFinder.bestTheaterInBagalkotUsingString("Vasavitalkies");
String theaterName="VASAVITALKIES";
Theater enumTheaterName=Theater.valueOf(theaterName);
TheaterFinder.bestTheaterInBagalkotUsingEnum(enumTheaterName);
System.out.println("EXIT :: main, doing switch and enum");
}

}
