
import java.util.Scanner;
 class lab25 {
public static void main(String[] args) {
	
	int num;
	Scanner jerv = new Scanner(System.in);
	
	System.out.println("Enter Number: ");
	num = jerv.nextInt();
	
	for (int x = 1; x <= num; x++) {
		System.out.println("*");
	}
	}
}