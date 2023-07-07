package com.cg.beanlifecycle;

import java.sql.SQLException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws SQLException {

		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("lifecycle.xml");

		EmployeeDao dao = c.getBean("empDao", EmployeeDao.class);// e
		System.out.println(dao);// e
		dao.selectAllRows(); // e

		// 1 c.registerShutdownHook();

		/*
		 * Hello h = c.getBean("hello",Hello.class); h.sample();
		 */
		c.close();


	}

}
