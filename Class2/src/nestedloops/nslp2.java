package nestedloops;
/*
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 */
public class nslp2 {

	public static void main(String[] args) {
		
		int x = 1;
		while(x<=5)
		{
			int y = 1;
			while(y<=5)
			{
				System.out.print(y + "   ");
				y++;
			}
			System.out.println();
			x++;
		}
		
		System.out.println("For Loop ");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + "   ");
			}
			System.out.println();
		}
	}

}
