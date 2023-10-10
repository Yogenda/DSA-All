package Arrays;

public class JArray {
// jagged arary
	public static void main(String[] args) {

		int x[][] = { { 10, 20, 30, 40 }, { 50, 60 }, { 70, 80, 90 } };
		System.out.println("No of Rows : " + x.length);
		System.out.println("1st row no of values : " + x[0].length);
		System.out.println("2nd row no of values : " + x[1].length);
		System.out.println("3rd row no of values : " + x[2].length);

		System.out.println("Jagged Array Values ");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + "   ");
			}
			System.out.println();
		}
	}

}
