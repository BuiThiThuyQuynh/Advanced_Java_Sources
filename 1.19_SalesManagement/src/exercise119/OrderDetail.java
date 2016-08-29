/**
 * @author ThuyQuynh
 * @version 1.0
 * @created 29/08/2016
 */

package exercise119;

import java.text.DecimalFormat;

/**
 * @description class manages the information of a order detail
 */
public class OrderDetail {

	private int quantity;
	public Product m_Product;

	public OrderDetail(){

	}

	public OrderDetail(int quantity, Product m_Product) {
		this.quantity = quantity;
		this.m_Product = m_Product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getM_Product() {
		return m_Product;
	}

	public void setM_Product(Product m_Product) {
		this.m_Product = m_Product;
	}

	/**
	 * @description function for calculating line total amount of an order
	 * @return line total amount of an order
	 */
	public double calLineTotal(){
		return this.quantity * m_Product.getPrice();
	}
	
	/**
	 * @description get information of order detail
	 * @return string about the information of order detail
	 */
	@Override
	public String toString() {
		DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
		String result = m_Product.toString() + this.quantity + "\n";
		result += "Total amount: \t\t\t" + decimalFormat.format(calLineTotal()) + "VND\n";
		return result;
	}

}