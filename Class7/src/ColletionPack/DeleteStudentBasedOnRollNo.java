package ColletionPack;

import java.util.*;

public class DeleteStudentBasedOnRollNo {

	public static void main(String[] args) {
		List<Student>  stdList = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		Student std = new Student(101, "Pavan", "Java", 12000.00f);
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
		System.out.println("Roll Number to Search : ");
		int rno = sc.nextInt();
		boolean b = false;
		for(Student s : stdList)
		{
			if(s.getRollno()==rno)
			{
				System.out.println(s);
				stdList.remove(s);
				b = true;
				System.out.println("Student Deleted..");
				System.out.println(stdList);
				break;
			}
		}
		
		if(b==false)
			System.out.println("Student Not Found....");
	}

}
