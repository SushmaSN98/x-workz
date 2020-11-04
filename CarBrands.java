public class CarBrands{
public static String[] getBrands(){
System.out.println("invoked  getBrands");
String[] carBrands={"Maruthi-Suzuki","Hyundai","Mahindra","Audi","BMW"};
System.out.println("brand size"+carBrands.length);

for(int cars=0;cars<carBrands.length;cars++)
{
	System.out.println("brands number"+cars);
	String carBrand=carBrands[cars];
	System.out.println("carBrand"+carBrand);
}
return carBrands;
}
}






