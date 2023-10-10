package com.jdbc.customrowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jdbc.models.EmpDept;

public class EmpDeptRowMapper implements RowMapper<EmpDept>{

	public EmpDept mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmpDept  empinfo = new EmpDept();
		empinfo.setEmpno(rs.getInt("empno"));
		empinfo.setEname(rs.getString("ename"));
		empinfo.setJob(rs.getString("job"));
		empinfo.setSal(rs.getInt("sal"));
		empinfo.setDeptno(rs.getInt("deptno"));
		empinfo.setDeptname(rs.getString("deptname"));
		empinfo.setLoc(rs.getString("loc"));
		return empinfo;
	}
}
