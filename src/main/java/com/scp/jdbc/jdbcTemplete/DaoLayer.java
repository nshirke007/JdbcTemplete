package com.scp.jdbc.jdbcTemplete;

import java.util.List;

public interface DaoLayer {
	public int saveEmployee(Employee e);
	public Employee getEmployee(int i);
	public int deleteEmployee(int i);
	public int updateEmployee(Employee e);
	public List<Employee> getAllEmployee();

}
