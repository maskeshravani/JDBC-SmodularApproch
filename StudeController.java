package com.controller;

import java.sql.SQLException;

import com.daoEx.Studentdao;
import com.service.studService;

public class StudeController {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		studService ss = new studService();
		System.out.println("Controller run Succesfully...");
		//ss.createTable();
		// ss.insertData();
		// ss.updateData();
		// ss.deleteData();
		ss.fetchData();
	}

}
