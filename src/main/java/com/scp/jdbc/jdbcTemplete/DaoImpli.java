package com.scp.jdbc.jdbcTemplete;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class DaoImpli implements DaoLayer {
			
	/*
	 * <--------------------------------------NamedParameterJdbcTemplate--------------------------------------------------->
	 */
	
	/*NamedParameterJdbcTemplate namedparameterjdbctemplate;
	

	public NamedParameterJdbcTemplate getNamedparameterjdbctemplate() {
		return namedparameterjdbctemplate;
	}
	public void setNamedparameterjdbctemplate(NamedParameterJdbcTemplate namedparameterjdbctemplate) {
		this.namedparameterjdbctemplate = namedparameterjdbctemplate;
	}



	public int saveEmployee(Employee e) {
		Map namedParameters = new HashMap();
		namedParameters.put("empId", e.empId);
		namedParameters.put("empName", e.empName);
		namedparameterjdbctemplate.update("INSERT INTO empployee1 (empId,empName) VALUES (:empId, :empName)", namedParameters);
		System.out.println("created");
		return 0;
	}

	public Employee getEmployee(int empId) {
		String sql = "SELECT empId, empName FROM empployee1 WHERE empId = :empId";
		SqlParameterSource namedparam=new MapSqlParameterSource("empId",empId);
		return getNamedparameterjdbctemplate().queryForObject(sql, namedparam, new EmployeeMapper());
//		return Employee;
	}

	public int deleteEmployee(int empId) {
		 String sql = "delete From empployee1 WHERE empId =:empId ";
		 SqlParameterSource namedparam=new MapSqlParameterSource("empId",empId);
		int returnvalue= getNamedparameterjdbctemplate().update(sql, namedparam);

		return returnvalue;
	}

	public int updateEmployee(Employee e) {
		Map<String, Object> param=new HashMap();
		param.put("empId", e.empId);
		param.put("empName", e.empName);
		
		String s="update empployee1 set empName= :empName where empId = :empId ";
		
		return getNamedparameterjdbctemplate().update(s, param);
		
	}

	public List<Employee> getAllEmployee() {
		
		return namedparameterjdbctemplate.query("select * from empployee1", new EmployeeMapper());
	}
*/
	/*
 * --------------------------<jdbc templete>----------------------------------
 */
/*	// DataSource dataSource;
	JdbcTemplate jdbctemplete;

	public void setJdbctemplete(JdbcTemplate jdbctemplete) {
		this.jdbctemplete = jdbctemplete;
	}

	public int saveEmployee(Employee e) {
		// JdbcTemplate jdbctemplete = new JdbcTemplate(dataSource);
		int id = e.empId;
		String name = e.empName;
		Object p[] = { id, name };
		String query = "insert into empployee2 values(?,?)";
		return jdbctemplete.update(query, p);

	}

	public Employee getEmployee(int empId) {

		return jdbctemplete.queryForObject("select * from empployee2 where empId =" + empId, new EmployeeMapper());

	}

	public int deleteEmployee(int empId) {

		return jdbctemplete.update("delete from empployee2 where empId = ?", empId);

	}

	public int updateEmployee(Employee e) {

		return jdbctemplete.update("update empployee2 set empId=?,empName=?", e.getEmpId(), e.getEmpName());
	}

	public List<Employee> getAllEmployee() {

		return jdbctemplete.query("select * from empployee2", new EmployeeMapper());

	}*/
	
	SimpleJdbcTemplate Simplejdbctemplate; 

	public SimpleJdbcTemplate getSimplejdbctemplate() {
			return Simplejdbctemplate;
		}	
	public void setSimplejdbctemplate(SimpleJdbcTemplate simplejdbctemplate) {
		this.Simplejdbctemplate = simplejdbctemplate;
	}



	public int saveEmployee(Employee e) {
		// JdbcTemplate jdbctemplete = new JdbcTemplate(dataSource);
				int id = e.empId;
				String name = e.empName;
				Object p[] = { id, name };
				String query = "insert into empployee2 values(?,?)";
				return Simplejdbctemplate.update(query, p);
		
	}

	public Employee getEmployee(int empId) {
		return Simplejdbctemplate.queryForObject("select * from empployee2 where empId =" + empId, new EmployeeMapper());
	}

	public int deleteEmployee(int empId) {
		
		return Simplejdbctemplate.update("delete from empployee2 where empId = ?", empId);
	}

	public int updateEmployee(Employee e) {
		Map<String, Object> param=new HashMap();
		param.put("empId", e.empId);
		param.put("empName", e.empName);
		
		String s="update empployee1 set empName= :empName where empId = :empId ";
		
		return getSimplejdbctemplate().update(s, param);
		
	}

	public List<Employee> getAllEmployee() {
		
		return Simplejdbctemplate.query("select * from empployee2", new EmployeeMapper());
	}
	
	


}
