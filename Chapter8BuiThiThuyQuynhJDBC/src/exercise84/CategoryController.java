package exercise84;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import exercise82.ConnectionDB;

/**
 * @author ThuyQuynh
 * @since 2016-09-16
 * @version 1.0
 * 
 * This is class control connection connect to category table in database.
 */
public class CategoryController {

	ConnectionDB connDB = new ConnectionDB();
	private List<Category> cate;
	
	public CategoryController() {
		
	}

	/**
	 * This method is used to get list category in table
	 * 	and set them to list.
	 * @param No.
	 * @return List<Category> This is list category in table.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<Category> getCategory() throws ClassNotFoundException, SQLException {
		cate = new ArrayList<Category>();
		
		try (Connection conn = connDB.connect()) {
			Statement statement = conn.createStatement();
			String sql = "select id, name, description from category";
			ResultSet results = statement.executeQuery(sql);
			
			while (results.next()) {
				Category category = new Category();
				category.setId(results.getInt("id"));
				category.setName(results.getString("name"));
				category.setDescription(results.getString("description"));
				cate.add(category);
			}
			
			conn.close();
		}
		
		return cate;
	}
	

}
