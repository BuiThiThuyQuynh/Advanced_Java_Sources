package exercise84;

/**
 * @author ThuyQuynh
 * @since 2016-09-16
 * @version 1.0
 * 
 * This is class manages the information of a category
 * 	as category table in database.
 */
public class Category {

	private int id;
	private String name;
	private String description;
	
	public Category() {
		
	}

	public Category(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * This method is used to get the information of a category
	 * @param No.
	 * @return string about information of a category.
	 */
	@Override
	public String toString() {
		return id + "\t" + name + "\t" + description + "\n";
	}
}
