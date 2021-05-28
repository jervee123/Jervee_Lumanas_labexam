
import java.util.Scanner;
 class lab12 {
public static void main(String[] args){
	
	int age;
	Scanner jerv = new Scanner(System.in);
	
	System.out.println("Enter age: ");
	age = jerv.nextInt();
	
	if (age <18) {
		System.out.println("Minor");
	} 
	else {
		System.out.println("Adult");
	}
	}
}