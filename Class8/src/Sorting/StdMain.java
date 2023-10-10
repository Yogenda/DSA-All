package Sorting;

import java.util.*;

public class StdMain {

	public static void main(String[] args) {
		List<Student>  stdList = new ArrayList<Student>();
		
		Student std = new Student(105, "Pavan", "Java", 12000.00f);
		
		stdList.add(std);
		std = new Student(102, "Kiran", "Java", 12000.00f);
		stdList.add(std);
		std = new Student(101, "Shiva", "Java", 12000.00f);
		stdList.add(std);
		std = new Student(104, "Lava", "Java", 12000.00f);
		stdList.add(std);
		std = new Student(103, "Kalyan", "Java", 12000.00f);
		stdList.add(std);
		
		System.out.println("Actual Data : ");
		for(Student s : stdList)
		{
			System.out.println(s);
		}
		
		Collections.sort(stdList);
		
		
		System.out.println("Sorted Data in Asending Order : ");
		for(Student s : stdList)
		{
			System.out.println(s);
		}
		
		Collections.sort(stdList, Collections.reverseOrder());
		
		
		System.out.println("Sorted Data in Desending Order : ");
		for(Student s : stdList)
		{
			System.out.println(s);
		}
		
	}

}
