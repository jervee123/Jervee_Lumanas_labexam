import java.util.Scanner;
 class lab1 {
	
	public static void main(String[] args){
		String name, course, section, contact;
		Scanner jerv = new Scanner(System.in);

		System.out.println("Enter Name: ");
		name = jerv.nextLine();

		System.out.println("Enter Section: ");
		section = jerv.nextLine();

		System.out.println("Enter Course: ");
		course = jerv.nextLine();

		System.out.println("Enter Contact#: ");
		contact = jerv.nextLine();

		System.out.println("Name: " +name);
		System.out.println("Section: " +section);
		System.out.println("Course: " +course);
		System.out.println("Contact#: " +contact);
	}
}