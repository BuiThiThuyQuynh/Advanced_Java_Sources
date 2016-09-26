package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ThuyQuynh
 * @since 2016-09-19
 * @version 1.0
 * 
 * This is class control connection connect to CD table in database.
 */
public class CDController {

	ConnectionDB connDB = new ConnectionDB();
	
	/**
	 * This method is used to add new CD to table.
	 * @param cd This is CD which was added to table.
	 * @return Nothing.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void addCD(CD cd) throws ClassNotFoundException, SQLException {
		try (Connection conn = connDB.connect()) {
			String sql = "insert into cd(name, singer, numbersongs, price)"
					+ " values ('" + cd.getName() + "', '" + cd.getSinger() + "', " + cd.getNumberSongs()
					+ ", " + cd.getPrice() + ");";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			preStatement.execute();
			
			conn.close();
		}
	}
	
	/**
	 * This method is used to update a CD in database.
	 * @param cd This is CD which was updated.
	 * @return Nothing.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void updateCD(CD cd) throws ClassNotFoundException, SQLException {
		try (Connection conn = connDB.connect()) {
			String sql = "update cd set numbersongs = " + cd.getNumberSongs() + ", price = " + cd.getPrice()
							+ " where id = " + cd.getId() + ";";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			preStatement.execute();
			
			conn.close();
		}
	}
	
	/**
	 * This method is used to remove a CD from table.
	 * @param id This is id of CD was removed.
	 * @return Nothing.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void deleteCD(int id) throws ClassNotFoundException, SQLException {
		try (Connection conn = connDB.connect()) {
			String sql = "delete from cd where id = " + id + ";";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			preStatement.execute();
			
			conn.close();
		}
	}
	
	/**
	 * This method is used to search a CD in table by name.
	 * @param keyword This is search key.
	 * @return List<CD> This is search result.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<CD> searchCD(String keyword) throws ClassNotFoundException, SQLException {
		List<CD> results = new ArrayList<CD>();
		try (Connection conn = connDB.connect()) {
			Statement statement = conn.createStatement();
			String sql = "select id, name, singer, numbersongs, price from cd"
					+ " where name like '%" + keyword + "%' or singer like '%" + keyword + "%'";
			
			ResultSet resultsSet = statement.executeQuery(sql);
			while (resultsSet.next()) {
				CD cd = new CD();
				cd.setId(resultsSet.getInt(1));
				cd.setName(resultsSet.getString(2));
				cd.setSinger(resultsSet.getString(3));
				cd.setNumberSongs(resultsSet.getInt(4));
				cd.setPrice(resultsSet.getDouble(5));
				
				results.add(cd);
			}
			
			conn.close();
		}
		
		return results;
	}
	
	/**
	 * This method is used to get list CD from cd table.
	 * @param No.
	 * @return List<CD> This is list CD from cd table in cdstore database.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<CD> getAllCDs() throws ClassNotFoundException, SQLException {
		List<CD> results = new ArrayList<CD>();
		try (Connection conn = connDB.connect()) {
			Statement statement = conn.createStatement();
			String sql = "select id, name, singer, numbersongs, price from cd";
			
			ResultSet resultsSet = statement.executeQuery(sql);
			while (resultsSet.next()) {
				CD cd = new CD();
				cd.setId(resultsSet.getInt(1));
				cd.setName(resultsSet.getString(2));
				cd.setSinger(resultsSet.getString(3));
				cd.setNumberSongs(resultsSet.getInt(4));
				cd.setPrice(resultsSet.getDouble(5));
				
				results.add(cd);
			}
			
			conn.close();
		}
		
		return results;
	}
}
