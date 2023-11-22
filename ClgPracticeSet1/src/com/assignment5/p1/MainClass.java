package com.assignment5.p1;

import java.sql.*;
import java.io.*;

public class MainClass {
	public static void main(String[] args) throws ClassNotFoundException {

		Class.forName("org.postgresql.Driver");
		Connection connection = null;

		Statement statement = null;

		ResultSet resultSet = null;

		try {
			System.out.println("hi");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/springboot", "postgres",
					"Pranil@2003");
			if (connection == null)
				System.out.println("Connection failed...");
			else {
				System.out.println("Done");
				String tableName = "person";

				DatabaseMetaData metaData = connection.getMetaData();
				ResultSet tables = metaData.getTables(null, null, tableName, null);

				if (!tables.next()) {
					statement = connection.createStatement();
					statement.executeUpdate(
							"CREATE TABLE person (PID int PRIMARY KEY, name varchar(20), gender char, birth_year int)");
					System.out.println("Table 'person' is created.");
				} else {
					System.out.println("Table 'person' is already present.");
				}

				for (int i = 5; i < 10; i++) {
					Person person = null;
					if (i % 2 == 0) {
						person = new Person((i + 1), "Pranil " + i, 'M', 1991 + i);
					} else {
						person = new Person((i + 1), "Shradha " + i, 'F', 1999 + i);
					}
					String query = "INSERT INTO PERSON(PID,NAME,GENDER,BIRTH_YEAR)VALUES(" + person.PID() + ",'"
							+ person.name() + "','" + person.gender() + "'," + person.birth_year() + ")";
					statement = connection.createStatement();
					int resultCount = statement.executeUpdate(query);
					System.out.println("Person data enter " + resultCount);

				}
				resultSet = statement.executeQuery("SELECT * FROM PERSON");
				System.out.println("Data is: ");
				System.out.println("PID\tname\t\tgender\t\tbirth_year");
				int i = 0;
				while (resultSet.next()) {
					System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t\t"
							+ resultSet.getString(3) + "\t\t" + resultSet.getInt(4));
				}
			}
			connection.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
/*
 * 
 * #URL spring.datasource.url=jdbc:postgresql://localhost:5432/springboot
 * #username spring.datasource.username=postgres #password
 * spring.datasource.password=Pranil@2003
 */
