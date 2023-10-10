package com.service;

import java.util.List;

import com.models.Student;

public interface StudentService {
	public String AddNewStudent(Student std);
	public List<Student>  ShowAll();
	public Student SearchStudent(int rollno);
	public String DeleteStudent(int rollno);
	public String UpdateStudentName(Student std);
}