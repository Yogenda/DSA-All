package nestedloops;
/*
 * 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3
 * 1 2 
 * 1 
 */
public class nslp4 {

	public static void main(String[] args) {
		
		int x = 5;
		while(x>=1)
		{
			int y = 1;
			while(y<=x)
			{
				System.out.print(y + "   ");
				y++;
			}
			System.out.println();
			x--;
		}
		
		System.out.println("For Loop ");
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + "   ");
			}
			System.out.println();
		}
	}

}
