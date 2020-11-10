public class MobileBrandTester{

public static void main(String[] names)
{
	
	String mobileBrandRedmi="REDMI";
	
	MobileBrand convertedRedmiFromString=MobileBrand.valueOf(mobileBrandRedmi);
	
	System.out.println(convertedRedmiFromString);
	
	
	MobileBrand[] allMobileBrands =MobileBrand.values();
	System.out.println(allMobileBrands.length);
	//length will be +1 of index
	for(int mobileBrands=0;mobileBrands<allMobileBrands.length;mobileBrands++){
		System.out.println("index " + mobileBrands);
		MobileBrand mobileBrandValue=allMobileBrands[mobileBrands];
		System.out.println("mobileBrand enum Value " + mobileBrandValue);
		
	}
	
	
	
}

}
