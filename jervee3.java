import java.util.Scanner;
class jervee3 
{
 public static void main(String[] args) 
 {
	Scanner jerv = new Scanner(System.in);
	String letter;
	

	System.out.println("Enter letter: ");
	letter = jerv.nextLine();
	
	switch(letter)
	{
		case 'A':
		case 'a':
		System.out.println("Outstanding");
		break;

		case 'B':
		case 'b':
		System.out.println("Verygood");
		break;

		case 'C':
		case 'c':
		System.out.println("Fair");
		break;

		case 'F':
		case 'f'	:
		System.out.println("Failed");
		break;

		default:
		System.out.println("Invalid");
	}
 }
}