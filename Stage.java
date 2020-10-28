public class Stage{

public static String ageDefinition(int age)
	{
		
		System.out.println("invoked ageDefinition()");
		System.out.println("Age : "+age);
		if(age<=12){
			System.out.println("Age is greater than or equal to 12");
			return "Child";
		}
		if(age>13 && age<19)
		{
			System.out.println("Age is greater than 13 and lesser than 19");
			return "Teenager";
		}
		
		if (age>20 && age<55)
		{
		System.out.println("Age is greater than 20 and lesser than 55");
		return "Adult";
		}
		return "Old";
		}
		}


		
		
		