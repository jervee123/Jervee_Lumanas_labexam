
import java.util.Scanner;
 class lab8 {
public static void main(String[] args) {

	int num1, num2, sum;
	Scanner jerv = new Scanner(System.in);
	
	System.out.println("Enter First number: ");
	num1 = jerv.nextInt();
	System.out.println("Second number: ");
	num2 = jerv.nextInt();
	
	sum = num1 + num2;
	System.out.println("Sum: " +sum);
	}
}