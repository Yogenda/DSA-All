package Sorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraySorting2 {

	public static void main(String[] args) {
		
			int x[] = {10,4,5,1,8};
			
			System.out.println("Actual Values ");
			for(int i=0;i<x.length;i++)
			{
				System.out.print(x[i] + "\t");
			}
			
			Arrays.sort(x);
		
			System.out.println("\nSorting Values Asending order ");
			for(int i=0;i<x.length;i++)
			{
				System.out.print(x[i] + "\t");
			}

	}

}
