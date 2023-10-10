package swtpack;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		// Accept month number, then check no of days present in that month
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Month Number(1-12) ");
		int mno = sc.nextInt();
		
		switch(mno)
		{
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31 days");
			break;
		case 2:
			System.out.println("28/29 days");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30 days");
			break;
		default:
			System.out.println("Invalid Month Number");	
		}
//System.out.println("Out of Switch");
	}

}
