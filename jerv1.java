import java.util.Scanner;
class jerv1{
public static void main(String[] args) {

Scanner jerv = new Scanner(System.in);

int num, num2;

System.out.println("Enter Start: ");
num = jerv.nextInt();
System.out.println("Enter End: ");
num2 = jerv.nextInt();

for (int x=num; num<=num2; num++){
			System.out.println(num);
		}
	}
}