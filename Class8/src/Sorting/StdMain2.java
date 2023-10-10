package Sorting;

import java.util.*;

public class StdMain2 {

	public static void main(String[] args) {
		List<Student2>  stdList = new ArrayList<Student2>();
		
		Student2 std = new Student2(105, "Pavan", "Java", 15000.00f);
		
		stdList.add(std);
		std = new Student2(102, "Kiran", "Java", 12000.00f);
		stdList.add(std);
		std = new Student2(101, "Shiva", "Java", 10000.00f);
		stdList.add(std);
		std = new Student2(104, "Lava", "Java", 11000.00f);
		stdList.add(std);
		std = new Student2(103, "Kalyan", "Java", 8000.00f);
		stdList.add(std);
		
		System.out.println("Actual Data : ");
		for(Student2 s : stdList)
		{
			System.out.println(s);
		}
		
		SortingBasedOnRollno  rollnosort = new SortingBasedOnRollno();
		Collections.sort(stdList, rollnosort);
		
		
		System.out.println("Sorted Data in Asending Order based on Roll Number : ");
		for(Student2 s : stdList)
		{
			System.out.println(s);
		}
		
		SortingBasedOnFees  feessort = new SortingBasedOnFees();
		Collections.sort(stdList, feessort);
		
		System.out.println("Sorted Data in Asending Order based on Fees : ");
		for(Student2 s : stdList)
		{
			System.out.println(s);
		}
	}

}
