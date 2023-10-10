package Beans;

public class Employee {

	private int empno;
	private String ename;
	private Address adrs;
	
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
	public Address getAdrs() {
		return adrs;
	}
	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}
	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", adrs=" + adrs + "]";
	}
	
	
}
