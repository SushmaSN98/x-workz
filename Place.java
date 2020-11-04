public class Place{
public static void main(String[] countryNames)
{
System.out.println("JVM invoked main");

for(int loop=0;loop<countryNames.length;loop++)
{
System.out.println("looping number"+loop);
String mainMethodArg=countryNames[loop];
System.out.println("mainMetodArg"+mainMethodArg);
}
System.out.println("Exit :: main");
}
}

