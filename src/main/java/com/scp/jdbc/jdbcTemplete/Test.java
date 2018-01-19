package com.scp.jdbc.jdbcTemplete;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		Employee emp1=new Employee(10, "Nitin");
		Employee emp2=new Employee(10, "sandip");
		Employee emp3=new Employee(12, "amar");
		Employee emp4=new Employee(13, "vishal");
		ApplicationContext AC=new FileSystemXmlApplicationContext("D:\\java code\\jdbcTemplete\\src\\main\\java\\spring-servlet.xml");
		
		DaoImpli DI= (DaoImpli)AC.getBean("myDAO");
		/*
		DI.saveEmployee(emp2);
		DI.saveEmployee(emp3);
		DI.saveEmployee(emp4);*/
//		DI.deleteEmployee(10);
//		System.out.println(DI.getEmployee(12));
		
//		System.out.println(DI.updateEmployee(emp2));
//		System.out.println(DI.getEmployee(10));
		
//		System.out.println(DI.getAllEmployee());
		
		
		
		
		
		
	/*	DI.saveEmployee(emp1);
		DI.saveEmployee(emp2);
		DI.saveEmployee(emp3);
		DI.saveEmployee(emp4);*/
//		System.out.println(DI.getEmployee(10));
//		System.out.println(DI.getEmployee(12));
//		DI.deleteEmployee(10);
//		DI.updateEmployee(emp4);
//		System.out.println(DI.getAllEmployee());
		
		
		
		
		
		
		
		DI.saveEmployee(emp1);
		DI.saveEmployee(emp2);
		DI.saveEmployee(emp3);
		DI.saveEmployee(emp4);
		
	}

}
