package com.assignment5.p7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MainClass {

	private static PreparedStatement prepareStatement;

	public static void main(String[] args) throws ClassNotFoundException {
		Scanner scanner = new Scanner(System.in);

		Class.forName("org.postgresql.Driver");

		Connection connection = null;

		PreparedStatement preparedStatement = null;

		ResultSet resultSet = null;

		String query = "";

		try {

			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/springboot", "postgres",
					"Pranil@2003");

			try {
				try {
					preparedStatement = connection
							.prepareStatement("CREATE TABLE District(Name text, area int, population int)");
					int executeUpdate = preparedStatement.executeUpdate();
					if (1 == executeUpdate) {
						System.out.println("Table is Created...");
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

				while (true) {
					showMenu();
					int option = scanner.nextInt();

					switch (option) {
					case 1 -> {
						System.out.println("Write Data To Insert :");
						District district = getData(scanner);
						try {
							int affetedRow = insertData(connection, preparedStatement, district);
							System.out.println(affetedRow+" row inserted...");
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					case 2 -> {
						System.out.println("Enter Correct name for Modify the Data");
						String findByName = scanner.next();

						try {
							updateData(findByName, connection, preparedStatement, resultSet, scanner);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					case 3 -> {
						System.out.println("Enter Correct name for Delete the Data");
						String findByName = scanner.next();

						try {
							deleteData(findByName, connection, preparedStatement, scanner, resultSet);
						} catch (Exception e) {
							e.printStackTrace();
						}

					}
					case 4 -> {
						System.out.println("Enter Correct name for Search the Data");
						String findByName = scanner.next();

						try {
							searchData(findByName, connection, preparedStatement, scanner, resultSet);
						} catch (Exception e) {
							e.printStackTrace();
						}

					}
					case 5 -> {
						System.out.println("View All the Data");

						try {
							viewData(connection, preparedStatement, scanner, resultSet);
						} catch (Exception e) {
							e.printStackTrace();
						}

					}
					case 6 -> System.exit(1);

					default -> throw new IllegalArgumentException("Unexpected value: " + option);
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void viewData(Connection connection, PreparedStatement preparedStatement, Scanner scanner,
			ResultSet resultSet) throws SQLException {
		if (checkPresentOrNot(connection, preparedStatement, resultSet)) {
		} else {
			System.out.println("Record Not Available");
		}

	}

	private static boolean checkPresentOrNot(Connection connection, PreparedStatement preparedStatement,
			ResultSet resultSet) throws SQLException {
		preparedStatement = connection.prepareStatement("SELECT * FROM DISTRICT");
		resultSet = preparedStatement.executeQuery();
		int count = 0;
		System.out.println("name\t\tarea\t\tpopulation");
		while (resultSet.next()) {
			System.out
					.println(resultSet.getString(1) + " \t\t " + resultSet.getInt(2) + " \t\t " + resultSet.getInt(3));
			count++;

		}
		System.out.println("\n\n");
		return count != 0 ? true : false;
	}

	private static void searchData(String findByName, Connection connection, PreparedStatement preparedStatement,
			Scanner scanner, ResultSet resultSet) throws SQLException {
		if (checkPresentOrNot(findByName, connection, preparedStatement, resultSet)) {
		} else {
			System.out.println("Record Not Available");
		}

	}

	private static void deleteData(String findByName, Connection connection, PreparedStatement preparedStatement,
			Scanner scanner, ResultSet resultSet) throws SQLException {
		if (checkPresentOrNot(findByName, connection, preparedStatement, resultSet)) {
			try {
				preparedStatement = connection.prepareStatement("delete from DISTRICT where name='" + findByName + "'");
				int executeUpdate = preparedStatement.executeUpdate();
				if (executeUpdate != 1) {
					System.out.println("Delete Failed..." + executeUpdate);
				}
			} catch (Exception e) {
				System.out.println("Delete Failed...");
				System.out.println("Delete " + e.getMessage());
			}
		} else {
			System.out.println("Record Not Available");
		}

	}

	private static void updateData(String findByName, Connection connection, PreparedStatement preparedStatement,
			ResultSet resultSet, Scanner scanner) throws SQLException {

		if (checkPresentOrNot(findByName, connection, preparedStatement, resultSet)) {

			District newData = getNewData(scanner);

			try {
				preparedStatement = connection.prepareStatement("UPDATE DISTRICT SET area='" + newData.area()
						+ "',population='" + newData.population() + "' where name='" + findByName + "'");
				int executeUpdate = preparedStatement.executeUpdate();
				if (executeUpdate != 1) {
					System.out.println("Update Failed..." + executeUpdate);
				}
			} catch (Exception e) {
				System.out.println("Update Failed...");
				System.out.println("Update " + e.getMessage());
			}

		} else {
			System.out.println("Sorry " + findByName + " record not available...");
		}

	}

	private static District getNewData(Scanner scanner) {
		System.out.println("Enter area : ");
		int area = scanner.nextInt();

		System.out.println("Enter population : ");
		int population = scanner.nextInt();
		return new District("", area, population);
	}

	private static boolean checkPresentOrNot(String findByName, Connection connection,
			PreparedStatement preparedStatement, ResultSet resultSet) throws SQLException {

		preparedStatement = connection.prepareStatement("SELECT * FROM DISTRICT WHERE name='" + findByName + "'");
		resultSet = preparedStatement.executeQuery();
		int count = 0;
		System.out.println("name\t\tarea\t\tpopulation");
		while (resultSet.next()) {
			System.out
					.println(resultSet.getString(1) + " \t\t " + resultSet.getInt(2) + " \t\t " + resultSet.getInt(3));
			count++;

		}
		System.out.println("\n\n");
		return count != 0 ? true : false;

	}

	private static int insertData(Connection connection, PreparedStatement preparedStatement, District district)
			throws SQLException {
		preparedStatement = connection.prepareStatement("INSERT INTO DISTRICT(NAME,AREA,POPULATION) VALUES(?,?,?)");
		preparedStatement.setString(1, district.name());
		preparedStatement.setInt(2, district.area());
		preparedStatement.setInt(3, district.population());
		int executeUpdate = preparedStatement.executeUpdate();
		return executeUpdate;
	}

	private static District getData(Scanner scanner) {
		System.out.println("Enter name : ");
		String name = scanner.next();

		System.out.println("Enter area : ");
		int area = scanner.nextInt();

		System.out.println("Enter population : ");
		int population = scanner.nextInt();

		return new District(name, area, population);
	}

	private static void showMenu() {
		System.out.println("Choose Following option");
		System.out.println("1.Insert\t\t2.Modify\t\t3.Delete\t\t4.Search\t\t5.View All\t\t6.Exit");
	}
}
