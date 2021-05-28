import java.util.Scanner;
class jervee2 
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
		System.out.println("Red");
		break;

		case 'b':
		case 'B':
		System.out.println("Blue");
		break;

		default:
		System.out.println("Invalid");
	}
 }
}