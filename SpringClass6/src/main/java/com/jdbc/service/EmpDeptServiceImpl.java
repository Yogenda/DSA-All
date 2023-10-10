package com.jdbc.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jdbc.customrowmappers.DeptRowMapper;
import com.jdbc.customrowmappers.EmpDeptRowMapper;
import com.jdbc.customrowmappers.EmpRowMapper;
import com.jdbc.models.Dept;
import com.jdbc.models.EmpDept;
import com.jdbc.models.Employee;

public class EmpDeptServiceImpl implements EmpDeptService{

	DataSource dt;
	JdbcTemplate jt;
	
	public DataSource getDt() {
		return dt;
	}

	public void setDt(DataSource dt) {
		this.dt = dt;
		jt = new JdbcTemplate(dt);
	}

	public List<EmpDept> ShowAllWithDeptName() {
		String sql = "select e.empno, e.ename, e.job, e.sal, \r\n"
				+ "d.deptno, d.deptname, d.loc \r\n"
				+ "from emp as e inner join dept as d\r\n"
				+ "on e.deptno = d.deptno";
		
		List<EmpDept>  empall = jt.query(sql, new EmpDeptRowMapper());
		return empall;
	}

	public List<Employee> ShowAllEmps() {
		String sql= "Select * from Emp";
		
		List<Employee>  empall = jt.query(sql, new EmpRowMapper());
		return empall;
	}

	public List<Dept> ShwoAllDepts() {
		String sql = "Select * from Dept";
		List<Dept>  deptall = jt.query(sql, new DeptRowMapper());
		return deptall;
	}

	public EmpDept ShowEmpinfoWithDeptName(int empno) {
		// TODO Auto-generated method stub
		return null;
	}

	public EmpDept ShowAllEmpsWithDeptName(int dno) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
