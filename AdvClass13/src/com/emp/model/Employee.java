package com.emp.model;
import javax.persistence.*;
/*
 * Configuring mappings for database using Annotations
 * @Entity :- to convert class into table
 * @Table(name="nnnn") :- to provide table name
 * @Id :- to set primary key
 * @GeneratedValue :- to generate values automatically starts from 1
 	@Column :- to specify column name for db
 */

@Entity
@Table(name="EmpInfo")
public class Employee {

	@Id   // primary key
	@GeneratedValue
	private int empno;
	
	@Column(name="empname")
	private String ename;
	
	@Column(name="designation")
	private String job;
	
	@Column(name="salary")
	private float  sal;
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
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + "]";
	}
	
	
}
