package exercise87;

public class Product {

	private int id;
	private String name;
	private double price;
	private int amount;
	private String image;
	private int categoryId;
	private String createdate;
	private int onSell;
	
	public Product() {
		
	}

	public Product(int id, String name, double price, int amount, String image, int categoryId, String createdate,
			int onSell) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.image = image;
		this.categoryId = categoryId;
		this.createdate = createdate;
		this.onSell = onSell;
	}
	
	public Product(String name, double price, int amount, String image, int categoryId, String createdate,
			int onSell) {
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.image = image;
		this.categoryId = categoryId;
		this.createdate = createdate;
		this.onSell = onSell;
	}
	
	

	public Product(int id, double price, int amount) {
		super();
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	public int getOnSell() {
		return onSell;
	}

	public void setOnSell(int onSell) {
		this.onSell = onSell;
	}
	
}
