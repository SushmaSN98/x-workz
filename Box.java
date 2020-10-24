public class Box{
public static void main(String[] colours)
{
System.out.println("invoked main method from Box");

int sizeOfMainParam=colours.length;
System.out.println("sizeOfMainParam :"+sizeOfMainParam);
Paint.brush(colours[2]);

System.out.println("Exit main method");
}
}


