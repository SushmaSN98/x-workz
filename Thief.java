public class Thief{
public static void steal()
{
System.out.println("invoked steal");
double packet=Reliance.getBudget();
System.out.println("steal budget"+ packet);
//Reliance.budget=0;
System.out.println("Reliance budget"+Reliance.getBudget());
System.out.println("Exit:: steal");
}
}

