
import java.util.Scanner;
 class lab23{
public static void main(String[] args) {

	int num1, num2, num3, num4, num5, sum;
	Scanner jerv = new Scanner(System.in);
	
	System.out.println("Enter First Number: ");
	num1 = jerv.nextInt();
	
	System.out.println("Enter Second Number: ");
	num2 = jerv.nextInt();
	
	System.out.println("Enter Third Number: ");
	num3 = jerv.nextInt();
	
	System.out.println("Enter Fourth Number: ");
	num4 = jerv.nextInt();
	
	System.out.println("Enter Fifth Number: ");
	num5 = jerv.nextInt();
	
	sum = num1 + num2 + num3 + num4 + num5;
	System.out.println("\nSum of all numbers: " + sum);
	}
}