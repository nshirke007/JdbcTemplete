package com.scp.jdbc.jdbcTemplete;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e=new Employee();
		e.setEmpId(rs.getInt("empId"));
		e.setEmpName(rs.getString("empName"));
		return e;
	}

}
