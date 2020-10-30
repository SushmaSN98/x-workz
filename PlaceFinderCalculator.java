public class PlaceFinderCalculator{
	
	
	public static void main(String[] a)
	{
		
		System.out.println("JVM invoked main()");
		
		String distance=PlaceFinder.place(538.3);
		System.out.println("return value from place()"+distance);
		
		System.out.println("EXIT::main()");
	}
	}
	