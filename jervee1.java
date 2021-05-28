import java.util.Scanner;
class jervee1 
{
 public static void main(String[] args) 
 {
	Scanner jerv = new Scanner(System.in);
	String name, gender;
	boolean status;
	String singlemarried;

	System.out.println("Enter name: ");
	name = jerv.nextLine();
	
	System.out.println("Enter gender: ");
	gender = jerv.nextLine();

	System.out.println("Are you Single? True/False: ");
	status = jerv.nextBoolean();

	switch(gender)
	{
		case 'Male':
		case 'male':
			singlemarried = status ? "Hi Mr. " + name + "How's single life?" : "Hi Mr. " + name + "How's married life?":
		System.out.println(singlemarried);
		break;

		case 'Female':
		case 'female':
			singlemarried = status ? "Hi Miss " + name + "How's single life?" : "Hi Mrs. " + name + "How's married life?":
		System.out.println(singlemarried);
		break;

		default:
		System.out.println("Invalid");
	}
 }
}