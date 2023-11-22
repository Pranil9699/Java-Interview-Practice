package com.assignment5.p2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class MainClass {

	public static void main(String[] args) throws ClassNotFoundException {

		Class.forName("org.postgresql.Driver");
		Connection connection = null;
		ResultSetMetaData resultSetMetaData = null;
		ResultSet resultSet = null;

		try {

			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/springboot", "postgres",
					"Pranil@2003");
			PreparedStatement prepareStatement = connection.prepareStatement("select * from person");
			resultSet = prepareStatement.executeQuery();

			resultSetMetaData = resultSet.getMetaData();

			System.out.println("Number of Col :" + resultSetMetaData.getColumnCount());
			for (int i = 0; i < resultSetMetaData.getColumnCount(); i++) {

				System.out.println("Data type of Col :" + resultSetMetaData.getColumnTypeName((i + 1)));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
