package Third_class;
import java.util.*;
public class Cond2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of A: ");
		int a=sc.nextInt();
		System.out.println("Enter the Value of B: ");
		int b=sc.nextInt();
		System.out.println("Enter the Value of C: ");
		int c=sc.nextInt();
		if((a>b)&&(a>c)) {
			System.out.println("A is greater then B and C :)");
		}else if((b>a)&&(b>c)){
			System.out.println("B is greater then A and C..");
		}else if((c>a)&&(c>b)) {
			System.out.println("C is Greater then A and B....");
		}else {
			System.out.println("Values are same or it is negative");
		}
	}

}
