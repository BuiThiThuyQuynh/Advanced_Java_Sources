/**
 * @author Bui Thi Thuy Quynh
 * @version 1.0
 * @created 29/08/2016
 */

package exercise119;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description class manages the information of a order
 */
public class Order {

	private final double RATE = 0.1;
	private Date orderDate;
	private boolean printOrder;
	private String status;
	private Card m_Card;
	private Customer m_Customer;
	public OrderDetail[] m_OrderDetail;

	public Order(){

	}
	
	public Order(Date orderDate, boolean printOrder, OrderDetail[] m_OrderDetail) {
		this.orderDate = orderDate;
		this.printOrder = printOrder;
		this.m_OrderDetail = m_OrderDetail;
	}

	public Order(Date orderDate, boolean printOrder, String status, Card m_Card, OrderDetail[] m_OrderDetail,
			Customer m_Customer) {
		this.orderDate = orderDate;
		this.printOrder = printOrder;
		this.status = status;
		this.m_Card = m_Card;
		this.m_OrderDetail = m_OrderDetail;
		this.m_Customer = m_Customer;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public boolean isPrintOrder() {
		return printOrder;
	}

	public void setPrintOrder(boolean printOrder) {
		this.printOrder = printOrder;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Card getM_Card() {
		return m_Card;
	}

	public void setM_Card(Card m_Card) {
		this.m_Card = m_Card;
	}

	public OrderDetail[] getM_OrderDetail() {
		return m_OrderDetail;
	}

	public void setM_OrderDetail(OrderDetail[] m_OrderDetail) {
		this.m_OrderDetail = m_OrderDetail;
	}
	
	public Customer getM_Customer() {
		return m_Customer;
	}

	public void setM_Customer(Customer m_Customer) {
		this.m_Customer = m_Customer;
	}

	/**
	 * @description function for calculating sub total amount of an order
	 * @return sub total amount of an order
	 */
	public double calSubTotal(){
		double result = 0;
		if (m_OrderDetail.length == 0)
			return 0;
		for (int i = 0; i < this.m_OrderDetail.length; i++) {
			result += m_OrderDetail[i].calLineTotal();
		}
		
		return result;
	}

	/**
	 * @description function for calculating tax of an order
	 * @return tax of order if order was printed
	 */
	public double calTax(){
		return this.printOrder ? RATE * calSubTotal() : 0;
	}

	/**
	 * @description function for calculating total amount of an order
	 * @return total amount of an order
	 */
	public double calTotalAmount(){
		return calSubTotal() + calTax();
	}

	/**
	 * @description get information of order (have Customer card and Card for payment)
	 * @return string about the information of order
	 */
	@Override
	public String toString() {
		DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
		String result = "INFORMATION OF CUSTOMER\n";
		result += m_Customer.toString();
		result += "INFORMATION OF PAYMENT CARD\n";
		result += m_Card.toString() + "\n";
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		result += "Order date: " + dateFormat.format(this.orderDate) + "\n";
		result += "Print order: " + (this.printOrder ? "yes\n" : "no\n");
		result += "Status of order: " + this.status + "\n";
		result += "==============================\n";
		result += "No.\t\tName\t\tPrice\t\tQuantity\n";
		
		for (int i = 0; i < m_OrderDetail.length; i++) {
			result += (i + 1) + "\t" + m_OrderDetail[i].toString();
		}
		
		result += "==============================\n";
		result += "Sub total amount: " + decimalFormat.format(calSubTotal()) + "VND\n";
		result += "Tax: " + decimalFormat.format(calTax()) + "VND\n";
		result += "Total amount: " + decimalFormat.format(calTotalAmount()) + "VND\n";
		return result;
	}
	
	/**
	 * @description get information of order after customer ordered (do not have Customer card and Card for payment)
	 * @return string about the information of order
	 */
	public String printOrder() {
		DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
		String result = "=========================\n";
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		result += "Order date: " + dateFormat.format(this.orderDate) + "\n";
		result += "Print order: " + (this.printOrder ? "yes\n" : "no\n");
		result += "Status of order: " + this.status + "\n";
		result += "==============================\n";
		
		for (int i = 0; i < m_OrderDetail.length; i++) {
			result += (i + 1) + "\t" + m_OrderDetail[i].toString();
		}
		
		result += "==============================\n";
		result += "Sub total amount: " + decimalFormat.format(calSubTotal()) + "VND\n";
		result += "Tax: " + decimalFormat.format(calTax()) + "VND\n";
		result += "Total amount: " + decimalFormat.format(calTotalAmount()) + "VND\n";
		return result;
	}
}