package com.cgi.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cgi.model.Employee;

public class EmployeeMapper implements RowMapper<Employee>
{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee=new Employee();
		employee.setCode(rs.getString("code"));
		employee.setName(rs.getString("name"));
		return employee;
	}
	
}
