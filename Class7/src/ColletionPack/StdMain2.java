package ColletionPack;

import java.util.*;

public class StdMain2 {

	public static void main(String[] args) {
		List<Student>  stdList = new ArrayList<Student>();
		
		Student std = new Student(101, "Pavan", "Java", 12000.00f);
		System.out.println(std.toString());
		stdList.add(std);
		std = new Student(102, "Kiran", "Java", 12000.00f);
		stdList.add(std);
		std = new Student(103, "Shiva", "Java", 12000.00f);
		stdList.add(std);
		std = new Student(104, "Lava", "Java", 12000.00f);
		stdList.add(std);
		std = new Student(105, "Kalyan", "Java", 12000.00f);
		stdList.add(std);
		
		System.out.println(stdList);
		System.out.println("---------------");
		for(Student s : stdList)
		{
			System.out.println(s.getRollno() + "\t" + s.getSname() + "\t" + s.getCourse() + "\t" + s.getFees());
		}
		
		System.out.println("---------------");
		Iterator itr = stdList.iterator();
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			Student s = (Student)itr.next();
			System.out.println(s.getRollno() + "\t" + s.getSname() + "\t" + s.getCourse() + "\t" + s.getFees());
		}
	}
}
