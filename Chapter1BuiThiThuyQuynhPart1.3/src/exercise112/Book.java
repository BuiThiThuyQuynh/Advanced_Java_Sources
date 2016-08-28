/**
 * @author Bui Thi Thuy Quynh
 * @date 23/08/2016
 * @version 2.0
 */

package exercise112;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description class manages the information of a book
 */
public class Book {

	protected String id;
	protected String name;
	protected Date dateEntered;
	protected double price;
	protected int quantity;
	protected String publishingCompany;
	
	public Book() {
		
	}

	public Book(String id, String name, Date dateEntered, double price, int quantity,
			String publishingCompany) {
		this.id = id;
		this.name = name;
		this.dateEntered = dateEntered;
		this.price = price;
		this.quantity = quantity;
		this.publishingCompany = publishingCompany;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateEntered() {
		return dateEntered;
	}

	public void setDateEntered(Date dateEntered) {
		this.dateEntered = dateEntered;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
	
	/**
	 * @description function for calculating fee of a book
	 * @return fee of a book
	 */
	public double calFee() {
		return 0;
	}
	
	/**
	 * @description function for get all information of a book
	 * @return string about the information of a book
	 */
	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
		
		String result = "ID: " + this.id + "\n";
		result += "Name: " + this.name + "\n";
		result += "Entered date: " + dateFormat.format(this.dateEntered) + "\n";
		result += "Price: " + decimalFormat.format(this.price) + "\n";
		result += "Quantity: " + this.quantity + "\n";
		result += "Publishing company: " + this.publishingCompany + "\n";
		return result;
	}
}
