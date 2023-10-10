package com.jdbc.service;

import java.util.List;

import com.jdbc.models.Dept;
import com.jdbc.models.EmpDept;
import com.jdbc.models.Employee;

public interface EmpDeptService {

	public List<EmpDept>  ShowAllWithDeptName();
	public List<Employee>  ShowAllEmps();
	public List<Dept>  ShwoAllDepts();
	
	// Show Emp Info with Dept name based on Empno
	public EmpDept  ShowEmpinfoWithDeptName(int empno);
	// Show All Emp Info with Dept name based on Deptno
	public EmpDept  ShowAllEmpsWithDeptName(int dno);
	
	
}
