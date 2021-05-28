
import java.util.Scanner;
 class lab9{
public static void main(String[] args) {
	int num1, num2, sum, percentage;
	Scanner jerve = new Scanner(System.in);
	
	System.out.println("Enter First Number: ");
	num1 = jerve.nextInt();
	System.out.println("Enter Second Number: ");
	num2 = jerve.nextInt();
	
	sum = num1 + num2;
	percentage = sum * 30 / 100;
	
	System.out.println("The 30% of the sum of " + num1 + " " + "an " + num2 + " " + "is " + percentage);
	}
}