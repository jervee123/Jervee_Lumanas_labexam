import java.util.Scanner;
class fibonacci{
public static void main(String[] args) {

Scanner jerv = new Scanner(System.in);
int x = 123;

int e = fan(x);
		
		System.out.println(e);
	}
public static int fan(int e){
	int a = 1;
	int b;
	int c = 0;

for (int i = 1; i <=e; i++){
	b=c;
	c=b+a;
	a=b;
}
return c;
}
}