import java.util.Scanner;
class main
{ 
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		arithmetic object1 = new arithmetic();
		student object2 = new student();
		System.out.println("Enter Width: ");
		int width = input.nextInt();
		System.out.println("Enter Length: ");
		int length = input.nextInt();
		
		int area = object1.bes(width,length);
		int perimeter = object1.per(width,length);
		System.out.println("The Area is: " + area);
		System.out.println("The Perimeter is: " + perimeter);

		if (width > length){			
			System.out.println(object2.student1);
		}
		if (width < length){
			System.out.println(object2.student2);
		}
		if(width == length){
			
			System.out.println(object2.student3);
		}
	}
}