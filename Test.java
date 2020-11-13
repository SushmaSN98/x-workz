1-The compailetime is the programming term Which perform compailation of the code which is written by the Programmer,it convert Source code into
  Byte code . and In Runtime is the time where Byte code is running using JRE it refers Java Runtime Environment where Bytecode can be Excecuted.
2-The different types of variables are ,
   1-String->Its a type of variable Which stores text and it is Written to within in double quotes. 
     Eg: "Hello"
   2-int-> its a type of variable which stores integers or whole number. Eg: 14524 or -14524.
   3-float->Stores floating number .Eg:19.34 or -19.34
   4-char->Stores a single character and it is written in Single quotes. Eg:'A'
   5-boolean->it is a variable Which stores the value with two states that is True or False.
   
3-public class Conveter{
  public static void main(String[] args)
 {
 System.out.println("JVM invoked main method");
 System.out.println("The Program will convert String to number");

  String hoursInADay="24";
  byte convertedHoursInADay=Byte.parseByte(hoursInADay);
  System.out.println("converted byte: "+convertedHoursInADay);
 
  String statesOfKarnataka="29";
  short convertedStatesOfKarnataka=Short.parseShort(statesOfKarnataka);
  System.out.println("converted short: "+convertedStatesOfKarnataka);
 
  String secondsInADay="86400";
  int convertedSecondsInADay=Integer.parseInt(secondsInADay);
  System.out.println("converted int: "+convertedSecondsInADay);
 
  String speedOfLight="299792458";
  long convertedSpeedOfLight=Long.parseLong(speedOfLight);
  System.out.println("converted long: "+convertedSpeedOfLight);
 
  String valueOfRootThree="1.732f";
  float convertedValueOfRootThree=Float.parseFloat(valueOfRootThree);
  System.out.println("converted float: "+convertedValueOfRootThree);
 
  String valueOfPi="3.141592653589793238";
  double convertedValueOfPi=Double.parseDouble(valueOfPi);
  System.out.println("converted double: "+convertedValueOfPi);
 
  String colourOfMangoIsBlue ="false";;
  boolean convertedColourOfMangoIsBlue=Boolean.parseBoolean(colourOfMangoIsBlue);
  System.out.println("converted boolean: "+convertedColourOfMangoIsBlue);
 
  String grade="A";
  char convertedGrade=grade.charAt(0);
  System.out.println("converted char: "+convertedGrade);
 
  System.out.println("Exit :: main");
  }
  }
  
4-Method is a Block of code written on pupform some task and it allow to reuse the statement.
  Eg: public class Book{
      public static void main(String[] sn)
	  {
	  System.out.println("The Blue Umbrella");
	  }
	  }
  -->parameter is act as variable inside method and it is written within the parantesis and after the method.
  Eg: public class Name{
  public static void main(String[] s)
  {
  System.out.println("Sushma");
  }
  -->argument is defined as when a parameter is passed to the method it is called an argument.
  -->return types defines and constraints the data type of the value retirned from method.
5-Encapsulation->Hide the details and the process of binding and corresponding method into a single unit.
6-array->array is a collection of fixed data elements of same data types. eg:below example.
7-code to display elements of an array. 
 Eg: public class Forest
{
public static void main(String[] s)

{
System.out.println("invoked main method by JVM");
arrayOfColours();
System.out.println("exiting main method by JVM");
}
public static void arrayOfColours()
{
		 System.out.println("invoked arrayOfGrade");

		 String firstColour="Pink";
		 String secondColour="Red";
		 String  thirdColour="Blue";
		 string  fourthColour="Black";
		 char[] Colours={"Pink","Red","Blue","Black"};
		  System.out.println("Total elements "+sizeOfColours);

8-Method overloading-->The methods have same signature but different arguments.

  