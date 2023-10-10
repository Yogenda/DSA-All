package Arrays;

import java.util.Scanner;

public class SearchValueInArray {
	// Accept set of values into an array(Single), then search for 
	// particular value in array weather it is existed or not. 
	// if it exist print "Existed"
	// if it not exist print "Not Existed"
	//x=[10,20,40,30,45];
	//n=20
	//o/p existed
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size of the array : ");
		int size = sc.nextInt();
		
		int x[] = new int[size];
		System.out.println("Enter " + size + " Values");
		for(int i=0;i<size;i++)
		{
			x[i] = sc.nextInt();
		}
		
		System.out.println("Array Values : ");
		for(int n : x) // foreach loop
		{
			System.out.print(n + "  ");
		}
		
		System.out.println("\nEnter value to search");
		int sVal = sc.nextInt();
		
		boolean b = false;
		for(int n : x) // foreach loop
		{
			if(sVal==n)
			{
				b = true;
				break;
			}
		}
		
		if(b==true)
			System.out.println(sVal + " Value existed");
		else
			System.out.println(sVal + " Value not existed");
	}

}
