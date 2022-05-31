package net.camcar.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MySQLDriver {

	private final static String URL = "jdbc:mysql://localhost:3306/jdbc?useSSL=false";
	private final static String USER = "root";
	private final static String PASS = "MySQLP@ss2022";
	private final static String SELECT = "SELECT * FROM users";
	private final static String CREATE = "CREATE TABLE users(id int(3) primary key, name varchar(20), email varchar(20), country varchar(20), password varchar(20));";
	private final static String DELETE = "DELETE FROM users WHERE id = 1";
	private final static String INSERT_PREPARED_STATEMENT = "INSERT INTO users (id, name, email, country, password) VALUES (?, ?, ?, ?, ?)";
	private final static String SELECT_PREPARED_STATEMENT = "SELECT id, name, email, country, password FROM users WHERE id = ?";
	private final static String UPDATE_PREPARED_STATEMENT = "UPDATE users SET name = ? WHERE id = ?";
	private final static String DELETE_PREPARED_STATEMENT = "DELETE  FROM users WHERE id = ?";

	public static void main(String[] args) {

		MySQLDriver driver = new MySQLDriver();
//		driver.selectFrom();
//		driver.createTable();
//		driver.deleteRecord();
//		driver.insertRecordWithPreparedStatement();
//		driver.selectWithPreparedStatement();
//		driver.updateRecordWithPreparedStatement();
//		driver.deleteRecordWithPreparedStatement();
//		driver.batchInsert();
//		driver.batchInsertWithPreparedStatement();
//		driver.batchUpdate();
//		driver.batchUpdateWithPreparedStatement();
//		driver.transactionManagement();
		driver.insertMultipleRowsDynamically();

	}

	public void selectFrom() {
		try (Connection connection = DriverManager.getConnection(URL, USER, PASS);
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(SELECT)) {

			System.out.println(SELECT);
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String email = resultSet.getString("email");
				String country = resultSet.getString("country");
				String password = resultSet.getString("password");
				System.out.println(id + ", " + name + ", "+email+", " + country + ", " + password);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void createTable() {
		try (Connection connection = DriverManager.getConnection(URL, USER, PASS);
				Statement statement = connection.createStatement();) {

			boolean result = statement.execute(CREATE);
			System.out.println(CREATE);
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteRecord() {
		try(Connection connection = DriverManager.getConnection(URL, USER, PASS);
				Statement statement = connection.createStatement();){
			int result = statement.executeUpdate(DELETE);
			System.out.println(DELETE);
			System.out.println("Number of records affected : "+result);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertRecordWithPreparedStatement() {
		System.out.println(INSERT_PREPARED_STATEMENT);
		try(Connection connection = DriverManager.getConnection(URL, USER, PASS);
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PREPARED_STATEMENT);){
			preparedStatement.setInt(1, 3);
			preparedStatement.setString(2, "Lorena");
			preparedStatement.setString(3, "lorena@gmail.com");
			preparedStatement.setString(4, "Colombia");
			preparedStatement.setString(5, "Secret1");
			System.out.println(preparedStatement);
			int result = preparedStatement.executeUpdate();
			System.out.println(result);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void selectWithPreparedStatement() {
		System.out.println(SELECT_PREPARED_STATEMENT);
		try(Connection connection = DriverManager.getConnection(URL, USER, PASS);
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PREPARED_STATEMENT);){
			
			preparedStatement.setInt(1, 1);
			System.out.println(preparedStatement);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String email = resultSet.getString("email");
				String country = resultSet.getString("country");
				String password = resultSet.getString("password");
				System.out.println(id + ", " + name + ", "+email+", " + country + ", " + password);
				
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateRecordWithPreparedStatement() {
		System.out.println(UPDATE_PREPARED_STATEMENT);
		try(Connection connection = DriverManager.getConnection(URL, USER, PASS);
				PreparedStatement preparedstatement = connection.prepareStatement(UPDATE_PREPARED_STATEMENT);){
			preparedstatement.setString(1, "Mireya");
			preparedstatement.setInt(2, 1);
			System.out.println(preparedstatement);
			preparedstatement.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteRecordWithPreparedStatement() {
		System.out.println(DELETE_PREPARED_STATEMENT);
		try(Connection connection = DriverManager.getConnection(URL, USER, PASS);
				PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PREPARED_STATEMENT);){
			preparedStatement.setInt(1, 3);
			int result = preparedStatement.executeUpdate();
			System.out.println("number of records affected: "+result);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void batchInsert() {
		try(Connection connection = DriverManager.getConnection(URL, USER, PASS);
				Statement statement = connection.createStatement();){
			
			connection.setAutoCommit(false);
			
			statement.addBatch("INSERT INTO users VALUES (3, 'Camilo', 'camilo@globant.com', 'Colombia', '123');");
			statement.addBatch("INSERT INTO users VALUES (4, 'Ian', 'ian@gmail.com', 'Mexico', '123');");
			statement.addBatch("INSERT INTO users VALUES (5, 'Ruth', 'Ruth@globant.com', 'Peru', '123');");
			statement.addBatch("INSERT INTO users VALUES (6, 'Elizabeth', 'eli@gmail.com', 'Honduras', '123');");
			statement.addBatch("INSERT INTO users VALUES (7, 'Pedro', 'pedro@gmail.com', 'España', '123');");
			
			int [] createdCount = statement.executeBatch();
			
			System.out.println(Arrays.toString(createdCount));
			connection.commit();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void batchInsertWithPreparedStatement() {
		try(Connection connection = DriverManager.getConnection(URL, USER, PASS);
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PREPARED_STATEMENT);){
			connection.setAutoCommit(false);
			
			addBatch(preparedStatement, 8, "Francisco", "fran@gmail.com", "Colombia", "456");
			addBatch(preparedStatement, 9, "Obama", "obama@gmail.com", "US", "456");
			addBatch(preparedStatement, 10, "Raj", "raj@gmail.com", "India", "456");
			addBatch(preparedStatement, 11, "Novaj", "novaj@gmail.com", "Rusia", "456");
			
			int[] createCount = preparedStatement.executeBatch();
			System.out.println(Arrays.toString(createCount));
			connection.commit();
			connection.setAutoCommit(true);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void addBatch(PreparedStatement preparedStatement, int id, String name, String email, String country, String password) throws SQLException {
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, email);
		preparedStatement.setString(4, country);
		preparedStatement.setString(5, password);
		preparedStatement.addBatch();
	}
	
	public void batchUpdate() {
		try(Connection connection = DriverManager.getConnection(URL, USER, PASS);
				Statement statement = connection.createStatement();){
			connection.setAutoCommit(false);
			
			statement.addBatch("UPDATE users SET password = 'p@ssCam' WHERE id =3;");
			statement.addBatch("UPDATE users SET password = 'p@ssIan' WHERE id =4;");
			statement.addBatch("UPDATE users SET password = 'p@ssRuth' WHERE id =5;");
			statement.addBatch("UPDATE users SET password = 'p@ssEli' WHERE id =6;");
			
			int[] createCount = statement.executeBatch();
			System.out.println(Arrays.toString(createCount));
			connection.commit();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void batchUpdateWithPreparedStatement() {
		try(Connection connection = DriverManager.getConnection(URL, USER, PASS);
				PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PREPARED_STATEMENT);){
			
			connection.setAutoCommit(false);
			
			addBatch(preparedStatement, 7, "pedro");
			addBatch(preparedStatement, 8, "francisco");
			addBatch(preparedStatement, 9, "obama");
			addBatch(preparedStatement, 10, "raj");
			
			int[] createCount = preparedStatement.executeBatch();
			System.out.println(Arrays.toString(createCount));
			connection.commit();
			connection.setAutoCommit(true);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void addBatch(PreparedStatement preparedStatement, int id, String name) throws SQLException {
		preparedStatement.setString(1, name);
		preparedStatement.setInt(2, id);
		preparedStatement.addBatch();
	}
	
	public void transactionManagement() {
		try(Connection conn = DriverManager.getConnection(URL, USER, PASS);) {
			conn.setAutoCommit(false);
			try (PreparedStatement insertStmt = conn.prepareStatement(INSERT_PREPARED_STATEMENT);
					PreparedStatement updateStmt = conn.prepareStatement(UPDATE_PREPARED_STATEMENT)){
				
				insertStmt.setInt(1, 12);
				insertStmt.setString(2, "Jeferson");
				insertStmt.setString(3, "jeferson@gmail.com");
				insertStmt.setString(4, "Colombia");
				insertStmt.setString(5, "Secret");
				insertStmt.executeUpdate();
				
				updateStmt.setString(1, "Yeferson");
				updateStmt.setInt(2, 12);
				updateStmt.executeUpdate();
				
				conn.commit();
				
				System.out.println("Transaction is commited successfully");
				
			} catch (SQLException e) {
				e.printStackTrace();
				if(conn != null) {
					try {
						System.out.println("Transaction is being rolled back");
						conn.rollback();
					} catch (SQLException e2) {
						e2.printStackTrace();
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertMultipleRowsDynamically() {
		
		List<User> list =new ArrayList<>();
		list.add(new User(13, "Denial", "denial@gmail.com", "US", "123"));
		list.add(new User(14, "Rocky", "rocky@gmail.com", "US", "123"));
		list.add(new User(15, "Steve", "steve@gmail.com", "US", "123"));
		list.add(new User(16, "Ramesh", "ramesh@gmail.com", "India", "123"));
		
		try(Connection connection = DriverManager.getConnection(URL, USER, PASS);
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PREPARED_STATEMENT);){
			
			connection.setAutoCommit(false);
			
			for (Iterator<User> iterator = list.iterator(); iterator.hasNext();) {
				User user = (User) iterator.next();
				addBatch(preparedStatement, user.getId(), user.getName(), user.getEmail(), user.getCountry(), user.getPassword());				
			}
			int[] createCount = preparedStatement.executeBatch();
			System.out.println(Arrays.toString(createCount));
			connection.commit();
			connection.setAutoCommit(true);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
