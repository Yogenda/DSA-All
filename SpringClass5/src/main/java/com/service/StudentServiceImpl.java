package com.service;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.models.Student;

public class StudentServiceImpl implements StudentService {

	private DataSource datasource; // it is meant hold connection of db
	private JdbcTemplate jt; // it is meant for sql operations
	/*
	 * syntax JdbcTemplate jt = new JdbcTemplate(connobject);
	 */

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
		jt = new JdbcTemplate(datasource);
		// System.out.println("Connected SuccessFully....");
	}

	public String AddNewStudent(Student std) {
		String sql = "Insert into Student(sname, course, fees) values(?,?,?)";
		int result = jt.update(sql, new Object[] { std.getSname(), std.getCourse(), std.getFees() });
		if (result >= 1)
			return "Success";

		return "Error";
	}

	public List<Student> ShowAll() {
		String sql = "select * from Student";
		List<Student> stdShowAll = jt.query(sql, new BeanPropertyRowMapper(Student.class));
		return stdShowAll;
	}

	
	public Student SearchStudent(int rollno) {
		String sql = "Select * from Student where rollno=?";
		Student std = null;
		try {
			std = jt.queryForObject(sql, new Object[] { rollno }, new BeanPropertyRowMapper(Student.class));
		} catch (Exception ex) {
			std = null;
		}
		return std;
	}

	public String DeleteStudent(int rollno) {
		String sql = "Delete from Student where rollno=?";

		int result = jt.update(sql, new Object[] { rollno });
		if (result >= 1)
			return "Deleted";
		return "Error";
	}

	public String UpdateStudentName(Student std) {
		String sql = "Update Student set sname=? where rollno=?";
		int result = jt.update(sql, new Object[] { std.getSname(), std.getRollno() });

		if (result >= 1)
			return "Updated...";
		return "Error";
	}
}
