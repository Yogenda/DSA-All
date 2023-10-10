package com.jdbc.customrowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jdbc.models.Dept;

public class DeptRowMapper implements RowMapper<Dept>{

	public Dept mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dept dept = new Dept();
		dept.setDeptno(rs.getInt("deptno"));
		dept.setDeptname(rs.getString("deptname"));
		dept.setLoc(rs.getString("loc"));
		return dept;
	}
}
