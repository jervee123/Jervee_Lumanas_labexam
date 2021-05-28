
import java.util.Scanner;
class lab13{
public static void main(String[] args){
	
	double quiz, stand, exam, total;
	Scanner jerv = new Scanner(System.in);
	
	System.out.println("Enter Quiz: ");
	quiz = jerv.nextDouble();
	System.out.println("Enter Class Standing: ");
	stand = jerv.nextDouble();
	System.out.println("Enter Exam: ");
	exam = jerv.nextDouble();
	
	total = (quiz * .40) + (stand * .10) + (exam * .50);
	
	if (total >=50) {
		System.out.println("Passed");
	}
	else {
		System.out.println("Failed");
	}
	}
}