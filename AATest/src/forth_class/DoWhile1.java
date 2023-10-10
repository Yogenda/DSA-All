package forth_class;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch="";
		float grTotal=0.0f;
		
		do {
			System.out.println("Product Name : ");
			String pname = sc.next();

			System.out.println("Product Price : ");
			float price = sc.nextFloat();

			System.out.println("No of Items : ");
			int items = sc.nextInt();
			
			float total= price*items;
			
			grTotal=grTotal+total;
			
			System.out.println("Total Amount : " + total);
			
			System.out.println("1 more product(Y/N) ");
			ch=sc.next();
		}while(ch.equalsIgnoreCase("Y"));
		System.out.println("Yea lo aap ka final bill "+grTotal);
	}

}
