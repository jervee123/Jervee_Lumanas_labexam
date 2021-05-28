import java.util.Scanner;
class Swtich2 
{
 public static void main(String[] args) 
 {
	Scanner jerv = new Scanner(System.in);
	String letter;
	char color;

	System.out.println("Enter Color letter: ");
	letter = jerv.nextLine();
	color = letter.charAt(0);

	switch(color)
	{
		case 'r':
		case 'R':
		System.out.println("The letter that you choose is equivalent to RED");
		break;

		case 'b':
		case 'B':
		System.out.println("The letter that you choose is equivalent to BLUE");
		break;

		case 'c':
		case 'C':
		System.out.println("YOUR SYSTEM HAVE BEEN ATTACKED BY A HACKER!!!!!!!!!!!");
		break;

		default:
		System.out.println("Invalid");
	}
 }
}