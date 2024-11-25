package com.service;

import java.sql.SQLException;

import com.daoEx.Studentdao;

// CREATE TABLE
public class studService {
	public void createTable() throws ClassNotFoundException, SQLException {
			Studentdao sd = new Studentdao();
			System.out.println("Service run Succesfully....");
			sd.createTable();
		}
	
	
	// INSERT DATA
		public void insertData() throws ClassNotFoundException, SQLException {
			Studentdao sd = new Studentdao();
			System.out.println("Service run Succesfully....");
			sd.insertData();
		}

		// UPDATE DATA
		public void updateData() throws ClassNotFoundException, SQLException {
			Studentdao sd = new Studentdao();
			System.out.println("Service run Succesfully....");
			sd.updateData();
		}
		
		// DELETE DATA
		public void deleteData() throws ClassNotFoundException, SQLException {
			Studentdao sd = new Studentdao();
			System.out.println("Service run Succesfully....");
			sd.deleteData();		
		}
		
		// FETCH DATA
		public void fetchData() throws ClassNotFoundException, SQLException {
			Studentdao sd = new Studentdao();
			System.out.println("Service run Succesfully....");
			sd.fetchData();	
		}
	}
