package Arrays;

public class Arr3 {

	public static void main(String[] args) {
			int x[][] = {{10,20,30},{40,50,60}};
			System.out.println(x[0][0] + "  " + x[0][1] + "  " + x[0][2]);
			System.out.println(x[1][0] + "  " + x[1][1] + "  " + x[1][2]);
			// here we have to use nested loops
			System.out.println(x.length);
			System.out.println("------------------------");
			for(int i=0;i<2;i++) // rows
			{
				for(int j=0;j<3;j++) // cols
				{
					System.out.print(x[i][j] + "  ");
				}
				System.out.println();
			}

	}

}
