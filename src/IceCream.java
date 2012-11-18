
import java.util.Scanner;
public class IceCream
{
public static void main(String[]args)
{
	Scanner scan=new Scanner(System.in);
	Flavors.GetFlavors();
	System.out.println("What flavor of ice cream is your favorite?");
	String flavor=scan.nextLine();
	Flavors flavorobject=new Flavors(flavor);
	
	
}}


