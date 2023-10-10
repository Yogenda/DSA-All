package BeanPack;

public class Employee {

	private int empno;
	private String ename;
	
	public Employee(int empno, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;
	}
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}

	public void PrintEmpDetails()
	{
		System.out.println("Employee Number : " + this.getEmpno());
		System.out.println("Employee Name : " + this.getEname());
	}
}
