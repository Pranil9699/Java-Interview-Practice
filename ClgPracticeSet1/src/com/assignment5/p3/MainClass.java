package com.assignment5.p3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;;

public class MainClass {

	public static void main(String[] args) throws ClassNotFoundException {
		ArrayList<Country> countries = new ArrayList<Country>();

		countries.add(new Country("United States", "North America", "Washington, D.C.", "North"));
		countries.add(new Country("Brazil", "South America", "Brasília", "South"));
		countries.add(new Country("India", "Asia", "New Delhi", "South"));
		countries.add(new Country("Nigeria", "Africa", "Abuja", "West"));
		countries.add(new Country("Canada", "North America", "Ottawa", "North"));
		countries.add(new Country("Australia", "Oceania", "Canberra", "Oceania"));
		countries.add(new Country("France", "Europe", "Paris", "Europe"));
		countries.add(new Country("Mexico", "North America", "Mexico City", "North"));
		countries.add(new Country("South Africa", "Africa", "Pretoria", "Southern"));
		countries.add(new Country("Japan", "Asia", "Tokyo", "East"));

//		countries.forEach(e -> System.out.println(e.toString()));

		Class.forName("org.postgresql.Driver");

		Connection connection = null;

		ResultSet resultSet = null;
		PreparedStatement prepareStatement = null;
		int tCreate = 0;

		try {

			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/springboot", "postgres",
					"Pranil@2003");
			try {
//				if (1 == dropTable(connection, prepareStatement)) {
					prepareStatement = connection.prepareStatement(
							"Create table Country(name text,continent text ,capital text,region text)");
					tCreate = prepareStatement.executeUpdate();
					System.out.println(tCreate + " Done");
//				} else {
//					System.out.println("table is present");
//				}
			} catch (Exception e) {
				System.out.println("table is already present");
			}
			tCreate = 1;
			int resultCount = 0;
			if (tCreate == 1) {
				for (Country country : countries) {
					System.out.println("here...");
					String halfQuery = "Insert into Country(name,continent,capital,region) values(?,?,?,?)";
					prepareStatement = connection.prepareStatement(halfQuery);
					prepareStatement.setString(1, country.name());
					prepareStatement.setString(2, country.continent());
					prepareStatement.setString(3, country.capital());
					prepareStatement.setString(4, country.region());
					resultCount += prepareStatement.executeUpdate();

				}

				System.out.println(resultCount + " rows inserted");
			}
			prepareStatement = connection.prepareStatement("Select * from country where region='West'");
			resultSet = prepareStatement.executeQuery();
			System.out.println("The Country's Located on West Resion are :");
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1) + "\t\t" + resultSet.getString(2) + "\t\t"
						+ resultSet.getString(3) + "\t\t" + resultSet.getString(4));
			}

			resultSet.close();
			prepareStatement.close();
			connection.close();
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
	}

	private static int dropTable(Connection connection, PreparedStatement prepareStatement) throws SQLException {
		try {
			int i = connection.prepareStatement("drop table Country").executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
