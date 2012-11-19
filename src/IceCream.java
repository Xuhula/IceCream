
import java.util.Scanner;
public class IceCream
{
public static void main(String[]args)
{
	Scanner scan=new Scanner(System.in);
	Flavors.ListFlavors();
	System.out.println("What flavor of ice cream is your favorite?");
	int flavor=scan.nextInt();
	scan.close();
	Flavors flavorobject=new Flavors(flavor);
	flavorobject.setFlavor(3);
	flavorobject.getFlavor();
	flavorobject.AddNuts(true); 
	flavorobject.AddSyrup(false);
	flavorobject.setSyrupAndNuts(false, false);
	System.out.println(flavorobject.getSyrupAndNuts());
	System.out.println(flavorobject.getFlavor());
	
	System.out.println(flavorobject.Receipt(true));
	System.out.print(flavorobject);
	
}}


