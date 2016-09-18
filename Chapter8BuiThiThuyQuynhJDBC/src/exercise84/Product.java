package exercise84;

/**
 * @author ThuyQuynh
 * @since 2016-09-16
 * @version 1.0
 * 
 * This is class manages the information of a product
 * 	as product table in database.
 */
public class Product {

	private int id;
	private String name;
	private double price;
	private int amount;
	private int categoryid;
	private String categoryName;
	
	public Product() {
		
	}

	public Product(int id, String name, double price, int amount, int categoryid) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.categoryid = categoryid;
	}
	
	public Product(int id, String name, double price, int amount, String categoryName) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.categoryName = categoryName;
	}
	
	public Product(String name, double price, int amount, int categoryid) {
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.categoryid = categoryid;
	}

	public Product(int id, double price, int amount) {
		this.id = id;
		this.price = price;
		this.amount = amount;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getCategoryid() {
		return categoryid;
	}
	
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	
	/**
	 * This method is used to get the information of a product
	 * 	if category name was not showed.
	 * @param No.
	 * @return string about information of a product.
	 */
	@Override
	public String toString() {
		String result = id + "\t" + name + "\t" + price + "\t" +
				amount + "\n";
		return result;
	}
	
	/**
	 * This method is used to get the information of a product
	 * 	if category name was showed.
	 * @param No.
	 * @return string about information of a product.
	 */
	public String printProduct() {
		String result = id + "\t" + name + "\t" + price + "\t" +
				amount + "\t" + categoryName + "\n";
		return result;
	}
}
