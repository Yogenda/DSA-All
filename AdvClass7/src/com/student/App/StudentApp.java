package com.student.App;

import java.util.Scanner;
import com.student.dmloperations.*;

public class StudentApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentOperations std = new StudentOperations();
		while(true)
		{
			System.out.println("1. Add New Student\n2. View All Students\n3. Search Student\n4. Update Student\n5. Delete Student\n6. Exit");
			System.out.println("Pick Your Choice : ");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Roll Number ");
				int rno = sc.nextInt();
				System.out.println("Student Name ");
				String sna = sc.next();
				System.out.println("Course ");
				String cur = sc.next();
				System.out.println("Fees ");
				float fee = sc.nextFloat();
				
				if(std.AddNewStudent(rno, sna, cur, fee).equals("Success"))
					System.out.println("Student Details are added....");
				break;
			case 2:
				std.ShowAllStudents();
				break;
			case 3:
				System.out.println("Roll Number ");
				rno = sc.nextInt();
				std.SearchStudent(rno);
				break;
			case 4:
				System.out.println("Roll Number ");
				rno = sc.nextInt();
				System.out.println("New name of the Student ");
				sna = sc.next();
				
				if(std.UpdateStudent(sna, rno).equals("Success"))
					System.out.println("Updated Student....");
				break;
			case 5:
				System.out.println("Roll Number ");
				rno = sc.nextInt();
				if(std.DeleteStudent(rno).equals("Success"))
					System.out.println("Student Deleted..");
				break;
			case 6:
				System.out.println("Thanks for using app");
				System.exit(0);
			}
		}
	}

}
