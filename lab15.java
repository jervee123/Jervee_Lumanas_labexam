
import java.util.Scanner;
class lab15 {
public static void main(String[] args){
	
	int x, y;
	Scanner jerv = new Scanner(System.in);
	
	System.out.println("Enter X Value: ");
	x = jerv.nextInt();
	System.out.println("Enter Y Value: ");
	y = jerv.nextInt();
	
	if ( x>=0 && y >=0) {
		System.out.println("Is in Quadrant I");
	}
	else if (x <0 && y >=0) {
		System.out.println("Is in Quadrant II");
	}
	else if (x <0 && y <0) {
		System.out.println("Is in Quadrant III");
	}
	else {
		System.out.println("Is in Quadrant IV");
	}
	}	
}