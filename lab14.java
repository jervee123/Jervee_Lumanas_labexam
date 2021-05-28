
import java.util.Scanner;
class lab14 {
public static void main(String[] args) {

	int age;
	Scanner jerv = new Scanner(System.in);
	
	System.out.println("Enter Age: ");
	age = jerv.nextInt();
	
	if (age <=5) {
		System.out.println("Infant");
	}
	else if (age >=6 && age <=10) {
		System.out.println("Toddler");
	}
	else if (age >=11 && age <=15) {
		System.out.println("Teen");
	}
	else if (age >=16 && age <=19) {
		System.out.println("Teenager");
	}
	else {
		System.out.println("Adult");
	}
	}
}
