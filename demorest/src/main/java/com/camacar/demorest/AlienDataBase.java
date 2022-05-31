package com.camacar.demorest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Class emulating a DDBB
 * @author cristian.cardozo
 *
 */

import java.util.ArrayList;
import java.util.List;

public class AlienDataBase {

	
	private Connection conn = null;

	private final static String URL = "jdbc:mysql://localhost:3306/restdb?useSSL=false";
	private final static String USER = "root";
	private final static String PASS = "MySQLP@ss2022";

	public AlienDataBase() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER, PASS);
		} catch (Exception e) {
			System.err.print(e);
			e.printStackTrace();
		}
	}

	public List<Alien> getAliens() {
		List<Alien> aliens = new ArrayList<>();
		String query = "SELECT * FROM aliens";
		try(Statement stmt = conn.createStatement();){
			ResultSet result = stmt.executeQuery(query);
			while(result.next()	) {
				Alien alien = new Alien();
				alien.setId(result.getInt(1));
				alien.setName(result.getString(2));
				alien.setPoints(result.getInt(3));
				
				aliens.add(alien);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return aliens;
	}

	public Alien getAlien(int id) {
		Alien alien = new Alien();
		String query = "SELECT * FROM aliens WHERE id = ?";
		try(PreparedStatement stmt = conn.prepareStatement(query)){
			stmt.setInt(1, id);
			ResultSet result = stmt.executeQuery();
			if(result.next()) {
				alien.setId(result.getInt(1));
				alien.setName(result.getString(2));
				alien.setPoints(result.getInt(3));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return alien;
	}

	public void createAlien(Alien alien) {
		String insert = "INSERT INTO aliens VALUES (?, ?, ?)";
		try(PreparedStatement stmt = conn.prepareStatement(insert);){
			stmt.setInt(1, alien.getId());
			stmt.setString(2, alien.getName());
			stmt.setInt(3, alien.getPoints());
			stmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateAlien(Alien alien) {
		String insert = "UPDATE aliens SET name = ?, points = ? WHERE id = ?";
		try(PreparedStatement stmt = conn.prepareStatement(insert);){
			stmt.setString(1, alien.getName());
			stmt.setInt(2, alien.getPoints());
			stmt.setInt(3, alien.getId());
			if(stmt.executeUpdate()==0)
				createAlien(alien);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteAlien(int id) {
		String delete = "DELETE FROM aliens WHERE id = ?";
		try(PreparedStatement stmt = conn.prepareStatement(delete);){
			stmt.setInt(1, id);
			stmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
