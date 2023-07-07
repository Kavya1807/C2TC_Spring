package com.cg.beanlifecycle;

import java.sql.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class EmployeeDao {

	private String url;
	private String username;
	private String password;
	private String Driver;

	// my connection obj
	Connection con;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		System.out.println("setting url");
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDriver() {
		return Driver;
	}

	public void setDriver(String driver) {
		Driver = driver;
	}

	//@PostConstruct
	void init() throws Exception, SQLException {
		System.out.println("inside the  custom init method.");
		createEmployeeDBConnection();

	}

	public void createEmployeeDBConnection() throws ClassNotFoundException, SQLException {
		System.out.println("creating connection for Employee db...");

		//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Class.forName(Driver);
		con = DriverManager.getConnection(url, username, password);

	}

	public void selectAllRows() throws SQLException {

		System.out.println("Retriving all Employees data.");

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM jdbc.em");

		while (rs.next()) {
			int EmployeeId = rs.getInt(1);
			String EmployeeName = rs.getString(2);
			float EmployeeSalary = rs.getFloat(3);
			String Job = rs.getString(4);

			System.out.println(EmployeeId + "  " + EmployeeName + "  " + EmployeeSalary + "  " + Job);

		}
	}

	public void deleteEmployeeRecord(int EmployeeId) throws SQLException {

		Statement stmt = con.createStatement();

		stmt.executeUpdate("Delete from emp where id = 5");

		System.out.println("Record deleted with Id: " + EmployeeId);

	}

	public void closeConnection() throws SQLException {
		// clean up job
		// close the connection

		con.close();

	}

	//@PreDestroy
	public void destroy() throws SQLException {

		System.out.println("inside destroy method");
		// clean up job
		closeConnection();

	}

}
