package com.jdbc.customrowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jdbc.models.Employee;

public class EmpRowMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setEmpno(rs.getInt("empno"));
		emp.setEname(rs.getString("ename"));
		emp.setJob(rs.getString("job"));
		emp.setSal(rs.getInt("sal"));
		emp.setDeptno(rs.getInt("deptno"));
		return emp;
	}

}
