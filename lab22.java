
import java.util.Scanner;
 class lab22{
public static void main(String[] args) {

	int num1, num2, num3, num4, num5, poss = 0, nega = 0;
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
	
	if (num1 > 0) {
		poss++;
	} else if (num1 < 0) {
		nega++;
	}
	if (num2 > 0) {
		poss++;
	} else if (num2 < 0) {
		nega++;
	}
	if (num3 > 0) {
		poss++;
	} else if (num3 < 0) {
		nega++;
	}
	if (num4 > 0) {
		poss++;
	} else if (num4 < 0) {
		nega++;
	}
	if (num5 > 0) {
		poss++;
	} else if (num5 < 0) {
		nega++;
	}
	System.out.println("\nNumber of Positive Number: " + poss);
	System.out.println("Number of Negatuve Number: " + nega);
	}
}