package class6;

public class Array6 {

	public static void main(String[] args) {
		int a[][]= {{2,5,6,7},{3,5},{7,9,5,8,7}};
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
