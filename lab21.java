
import java.util.Scanner;
class lab21{
public static void main(String[] args) {

	int num1, num2, num3, num4, num5, even = 0, odd = 0;
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
	
	if (num1 % 2 ==0) {
		even++;
	} else if (num1 % 2 ==1) {
		odd++;
	}
	if (num2 % 2 ==0) {
		even++;
	} else if (num2 % 2 ==1) {
		odd++;
	}
	if (num3 % 2 ==0) {
		even++;
	} else if (num3 % 2 ==1) {
		odd++;
	}
	if (num4 % 2 ==0) {
		even++;
	} else if (num4 % 2 ==1) {
		odd++;
	}
	if (num5 % 2 ==0) {
		even++;
	} else if (num5 % 2 ==1) {
		odd++;
	}
	System.out.println("Number of Even Number: " + even);
	System.out.println("Number of Odd Number: " + odd);
	}
}