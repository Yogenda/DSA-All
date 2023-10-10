package Sorting;

public class Student2  {

	private int rollno;
	private String sname;
	private String course;
	private float fees;
	
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	
	public Student2(int rollno, String sname, String course, float fees) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.course = course;
		this.fees = fees;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", course=" + course + ", fees=" + fees + "]";
	}

}
