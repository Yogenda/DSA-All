package loops;

public class lp2 {

	public static void main(String[] args) {
		//print all even numbers b/w 1-20 and vice versa.
		// 2 4 6 8 10..... 20
		int x = 2;
		while(x<=20)
		{
			System.out.print(x + "\t");  // \t tab = 8 spaces
			x=x+2;
		}
		System.out.println(); // line break
		x = 20;
		while(x>=1)
		{
			System.out.print(x + "\t"); 
			x=x-2;
		}
	}

}
