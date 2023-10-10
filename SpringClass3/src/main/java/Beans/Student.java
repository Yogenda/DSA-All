package Beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int rollno;
	private String sname;
	private List<String>  qualifications;
	private Set<String>   courses;
	private Map<String, String>  course_faculty;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<String> getQualifications() {
		return qualifications;
	}
	public void setQualifications(List<String> qualifications) {
		this.qualifications = qualifications;
	}
	public Set<String> getCourses() {
		return courses;
	}
	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}
	public Map<String, String> getCourse_faculty() {
		return course_faculty;
	}
	public void setCourse_faculty(Map<String, String> course_faculty) {
		this.course_faculty = course_faculty;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", qualifications=" + qualifications + ", courses="
				+ courses + ", course_faculty=" + course_faculty + "]";
	}
}
