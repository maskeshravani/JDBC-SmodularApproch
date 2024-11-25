package com.daoEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Studentdao {

	// CREATE TABLE
	public void createTable() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197", "root", "root");
		Statement s = c.createStatement();

		s.executeUpdate("create table Register(id int primary key, name varchar(50), age int)");
		System.out.println("Table Created Succesfully");
		c.close();

	}

	// INSERT DATA
	public void insertData() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197", "root", "root");
		Statement s = c.createStatement();

		s.executeUpdate("insert into student values(5,'Avi', 23,88)");
		System.out.println("Data Inserted Succesufully....");
		c.close();

	}

	//UPDATE DATA
	public void updateData() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197", "root", "root");
		Statement s = c.createStatement();

		s.executeUpdate("update student set name = 'Rushi' where id = 4");
		System.out.println("Data Updated Succesfully..");
		c.close();
	}

	// DELETE DATA
	public void deleteData() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197", "root", "root");
		Statement s = c.createStatement();

		s.executeUpdate("delete from student where id = 5 ");
		System.out.println("Data Deleted Succesfully..");
		c.close();
	}

	// FETCH DATA
	public void fetchData() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197", "root", "root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from student");

		while (rs.next()) {
			System.out.println("Emp_Id: " + rs.getInt(1) + "  Name:  " + rs.getString(2) + "   Age:  " + rs.getInt(3)
					+ "Marks: " + rs.getInt(4));

		}
		c.close();
	}
}
