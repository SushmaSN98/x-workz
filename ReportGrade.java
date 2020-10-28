public class ReportGrade{
public static String report(double percentage)
{
System.out.println("invoked report()");
		System.out.println("Percentage : "+percentage);
		if(percentage<=39){
			System.out.println("percentage is lesser than or equal to 39");
			return "F";
		}
		if(percentage<45)
		{
			System.out.println("percentage is lesser than 45");
			return "P";
		}
		
		if (percentage<60)
		{
		System.out.println("percentage is lesser than 60");
		return "D";
		}
		if (percentage<70)
		{
		System.out.println("percentage is lesser than 70");
		return "C";
		}
		if (percentage<75)
		{
		System.out.println("percentage is lesser than 75");
		return "B";
		}
		if (percentage<=80)
		{
		System.out.println("percentage is lesser than or equal to 80");
		return "A";
		}
		return "S";
		}
		}
		
