package com.jdbc.models;

/*
 * select e.empno, e.ename, e.job, e.sal, 
d.deptno, d.deptname, d.loc 
from emp as e inner join dept as d
on e.deptno = d.deptno;
 */
public class EmpDept {

	private int empno;
	private String  ename;
	private String job;
	private int sal;
	private int deptno;
	private String deptname;
	private String loc;
	
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
}
