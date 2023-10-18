package first;
import java.util.Scanner;

public class FirstClass {
	public static void main(String args[]) {
		int a = 6;
		int b;
		System.out.println(a); // 6
		++a;
		System.out.println(a); // 7
		System.out.println(a = a + 5);// 8
		a = a + 6;
		System.out.println(a);
		
		int c = 5;
		System.out.println(--c);//4
		System.out.println(c--);//4
		System.out.println(c=c-2);//1
		
		c=c*3; // c*=3
		System.out.println(c);
		c+=6;
		System.out.println(c);
		c-=4;
		System.out.println(c);
		
		int x=7;
		System.out.println(x/2);
		System.out.println(x%2);
		float y=67;
		boolean z = x<y ?true:false;
		System.out.println(z);
		
		char ch = (char)y;
		System.out.println(ch);
		
		int h = (int)y;
		System.out.println(h);
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter you lucky number: ");
//		int u = sc.nextInt();
//		System.out.println("your lucky number is: "+u);
		
//		System.out.print("Enter your name: ");
//		String str = sc.next();
//		System.out.println("YOur name is: "+str);
		System.out.println("Enter your new name: ");
		String str = sc.nextLine();
		System.out.println("YOur name is: "+str);
	}
}
