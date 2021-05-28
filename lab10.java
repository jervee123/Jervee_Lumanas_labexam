
import java.util.Scanner;
 class lab10{
public static void main(String[] args){
	String fname, lname, mname;
	Scanner jerv = new Scanner(System.in);
	
	System.out.println("Enter First Name: ");
	fname = jerv.nextLine();
	System.out.println("Enter Last Name: ");
	lname = jerv.nextLine();
	System.out.println("Enter Maiden Name: ");
	mname = jerv.nextLine();
	
	System.out.println("Your Fullname is");
	System.out.println(fname + ", " + lname + ", " + mname);
	
	}
}