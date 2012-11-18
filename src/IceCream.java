
import java.util.Scanner;
public class IceCream
{
public static void main(String[]args)
{
	Scanner scan=new Scanner(System.in);
	Flavors.ListFlavors();
	System.out.println("What flavor of ice cream is your favorite?");
	int flavor=scan.nextInt();
	Flavors flavorobject=new Flavors(flavor);
	
	
}}


