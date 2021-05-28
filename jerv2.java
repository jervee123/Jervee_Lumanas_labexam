import java.util.Scanner;
class jerv2{
	public static void main(String[] args) {
		Scanner jerv = new Scanner(System.in);
		String fword;
		int num;

		System.out.println("Enter First Word: ");
		fword = jerv.nextLine();
		System.out.println("Enter Number: ");
		num = jerv.nextInt();

		System.out.println(fword + "............................................................" + num);
	}
}