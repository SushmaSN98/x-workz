public class ReportGradeCalculator{
	
	
	public static void main(String[] a)
	{
		
		System.out.println("JVM invoked main()");
		
		String percentage=ReportGrade.report(78);
		System.out.println("return value from report()"+percentage);
		
		System.out.println("EXIT::main()");
	}
	}
	
	