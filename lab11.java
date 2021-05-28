
import java.util.Scanner;
 class lab11{
public static void main(String[] args){
	int exe1, exe2, exe3, average;
	Scanner jerv = new Scanner(System.in);
	
	System.out.println("Exercise 1: ");
	exe1 = jerv.nextInt();
	System.out.println("Exercise 2: ");
	exe2 = jerv.nextInt();
	System.out.println("Exercise 3: ");
	exe3 = jerv.nextInt();
	
	average = (exe1 + exe2 + exe3) / 3;
	System.out.println("Average: " + average);
	}
}