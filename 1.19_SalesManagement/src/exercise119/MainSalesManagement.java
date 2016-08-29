/**
 * @author Bui Thi Thuy Quynh
 * @version 1.0
 * @created 29/08/2016
 */

package exercise119;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description class handles for all of class others in package
 */
public class MainSalesManagement {

	/**
	 * @description function for check format of phone number
	 * @param0 phone number
	 * @return phone number is correct format or not
	 */
	public static boolean checkPhone(String phone) {
		Pattern pattern = Pattern.compile("^[0][89][0-9]{8}|[0][1][0-9]{9}$");
		Matcher matcher = pattern.matcher(phone);
		return matcher.matches();
	}
	
	/**
	 * @description function for check format of email
	 * @param0 email
	 * @return email is correct format or not
	 */
	public static boolean checkEmail(String email) {
		Pattern pattern = Pattern.compile("^[_\\w-]+(\\.[_\\w-]+)*@[\\w-]+\\.[\\w]{2,}(\\.[A-Za-z]{2,})*$");
		Matcher matcher = pattern.matcher(email);
		
		return matcher.matches();
	}
	
	/**
	 * @description function for check format of identity card number
	 * @param0 identity card number
	 * @return identity card number is correct format or not
	 */
	public static boolean checkIdentityCardNumber(String identityCardNumber) {
		Pattern pattern = Pattern.compile("^[0-9]{9}$");
		Matcher matcher = pattern.matcher(identityCardNumber);
		return matcher.matches();
	}

	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			/**
			 * enter the information of order as date of order, print order or not
			 */
			System.out.println("Order date (dd/MM/yyyy):");
			String date = input.readLine();
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			dateFormat.setLenient(false);
			
			Date orderDate = dateFormat.parse(date);
			
			System.out.println("Do you print order?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			int choosePrintOrder = Integer.parseInt(input.readLine());
			while (choosePrintOrder !=1 && choosePrintOrder != 2) {
				System.out.println("Please choose 1 or 2");
				System.out.println("Do you print order?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				choosePrintOrder = Integer.parseInt(input.readLine());
			}

			boolean printOrder = false;
			switch (choosePrintOrder) {
				case 1:
					printOrder = true;
					break;
				case 2:
					break;
			}
			
			/**
			 * enter order detail as name of product, price of product, quantity of product
			 */
			boolean flag = true;
			OrderDetail[] arrayOrderDetail = new OrderDetail[0];
			OrderDetail orderDetail;
			Product product;
			while (flag) {
				System.out.println("ENTER INFORMATION OF ORDER DETAIL");
				System.out.println("Name of product:");
				String nameProduct = input.readLine();
				
				System.out.println("Price of product:");
				double price = Double.parseDouble(input.readLine());
				
				while (price < 0) {
					System.out.println("Price of product must be greater than or equal to 0");
					System.out.println("Price of product:");
					price = Double.parseDouble(input.readLine());
				}
				
				System.out.println("Quantity of product:");
				int quantity = Integer.parseInt(input.readLine());
				
				while (quantity < 0) {
					System.out.println("Quantity of product must be greater than or equal to 0");
					System.out.println("Quantity of product:");
					quantity = Integer.parseInt(input.readLine());
				}
				
				arrayOrderDetail = Arrays.copyOf(arrayOrderDetail, arrayOrderDetail.length + 1);
				product = new Product(nameProduct, price);
				orderDetail = new OrderDetail(quantity, product);
				arrayOrderDetail[arrayOrderDetail.length - 1] = orderDetail;
				
				/**
				 * ask if user want to add new order detail
				 */
				int flagAddOrderDetail = 0;
				while (flagAddOrderDetail == 0) {
					System.out.println("Are you add a order detail [y/n]?");
					String temp = input.readLine();
					switch (temp) {
					case "y":
					case "Y":
						flagAddOrderDetail = 1;
						break;
					case "n":
					case "N":
						flagAddOrderDetail = 2;
						flag = false;
						break;
					default:
						System.out.println("This choose don't have. Please choosing again!");
						break;
					}
				}
				
				if (flagAddOrderDetail == 1) {
					continue;
				}
				else {
					break;
				}
			}
			
			/**
			 * print order after user ordered (do not have customer card and payment card)
			 */
			Order order = new Order(orderDate, printOrder, arrayOrderDetail);
			order.setStatus("Just ordered");
			System.out.println(order.printOrder());
			
			/**
			 * enter number of customer card if user have
			 */
			System.out.println("Do you have customer card?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			int chooseCustomerCard = Integer.parseInt(input.readLine());
			while (chooseCustomerCard !=1 && chooseCustomerCard != 2) {
				System.out.println("Please choose 1 or 2");
				System.out.println("Do you have customer card?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				chooseCustomerCard = Integer.parseInt(input.readLine());
			}

			/**
			 * get information of customer card from keyboard
			 */
			String customerID = "";
			String name = "";
			String address = "";
			String email = "";
			String phoneNumber = "";
			String identityCardNumber = "";
			switch (chooseCustomerCard) {
				case 1:
					/**
					 * enter the general information of a customer on order
					 */
					System.out.println("INFORMATION OF CUSTOMER");
					System.out.println("Name: ");
					name = input.readLine();
					
					System.out.println("Address: ");
					address = input.readLine();
					
					System.out.println("Email: ");
					email = input.readLine();
					
					while (!checkEmail(email)) {
						System.out.println("Email is wrong format. Please enter again");
						System.out.println("Email:");
						email = input.readLine();
					}
					
					System.out.println("Phone number: ");
					phoneNumber = input.readLine();
					
					while (!checkPhone(phoneNumber)) {
						System.out.println("Phone number is wrong format. Please enter again");
						System.out.println("Phone number:");
						phoneNumber = input.readLine();
					}
					
					System.out.println("Identity card number: ");
					identityCardNumber = input.readLine();
					
					while (!checkIdentityCardNumber(identityCardNumber)) {
						System.out.println("Identity card number is wrong format. Please enter again");
						System.out.println("Identity card number:");
						identityCardNumber = input.readLine();
					}
					
					System.out.println("Card number:");
					customerID = input.readLine();
					
					break;
				case 2:
					break;
			}
			
			/**
			 * if user want to pay for order
			 */
			System.out.println("Do you pay?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			int choosePay = Integer.parseInt(input.readLine());
			while (choosePay !=1 && choosePay != 2) {
				System.out.println("Please choose 1 or 2");
				System.out.println("Do you pay?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				choosePay = Integer.parseInt(input.readLine());
			}
			
			/**
			 * get information of payment card from keyboard
			 */
			String status = "";
			int choosePaymentCard = 0;
			Date expirationDate = null;
			double maxDebt = 0;
			String type = "";
			double balance = 0;
			String cardPayment = "";
			switch (choosePay) {
			case 1:
				/**
				 * enter the general information of a payment card on order
				 */
				System.out.println("INFORMATION OF CARD");
				System.out.println("Name: ");
				name = input.readLine();
				
				System.out.println("Address: ");
				address = input.readLine();
				
				System.out.println("Email: ");
				email = input.readLine();
				
				while (!checkEmail(email)) {
					System.out.println("Email is wrong format. Please enter again");
					System.out.println("Email:");
					email = input.readLine();
				}
				
				System.out.println("Phone number: ");
				phoneNumber = input.readLine();
				
				while (!checkPhone(phoneNumber)) {
					System.out.println("Phone number is wrong format. Please enter again");
					System.out.println("Phone number:");
					phoneNumber = input.readLine();
				}
				
				System.out.println("Identity card number: ");
				identityCardNumber = input.readLine();
				
				while (!checkIdentityCardNumber(identityCardNumber)) {
					System.out.println("Identity card number is wrong format. Please enter again");
					System.out.println("Identity card number:");
					identityCardNumber = input.readLine();
				}
				
				System.out.println("Enter number of payment card:");
				cardPayment = input.readLine();
				
				/**
				 * enter type of card that user want to use for payment
				 */
				System.out.println("TYPE OF CARD");
				System.out.println("1. Credit Card");
				System.out.println("2. ATM Card");
				choosePaymentCard = Integer.parseInt(input.readLine());
				while (choosePaymentCard !=1 && choosePaymentCard != 2) {
					System.out.println("Please choose 1 or 2");
					System.out.println("TYPE OF CARD");
					System.out.println("1. Credit Card");
					System.out.println("2. ATM Card");
					choosePaymentCard = Integer.parseInt(input.readLine());
				}

				switch (choosePaymentCard) {
					case 1:						
						expirationDate = dateFormat.parse("31/12/2020");
						maxDebt = 8000000;
						type = "Visa";
						break;
					case 2:
						balance = 5000000;
						break;
				}
				
				break;
			case 2:
				status = "Just ordered";
				System.out.println("You don't pay for this order");
				break;
			}
			
			// Initialization a customer card
			Customer customer = new Customer(address, email, identityCardNumber, name, phoneNumber, customerID);
			
			// Initialization a card for payment
			Card card;
			if (choosePaymentCard == 1)
				card = new CreditCard(address, email, identityCardNumber, name, phoneNumber, 
						cardPayment, expirationDate, maxDebt, type);
			else
				card = new ATMCard(address, email, identityCardNumber, name, phoneNumber, 
						cardPayment, balance);
			
			
			// Initialization a order from all information above
			order = new Order(orderDate, printOrder, status, card, arrayOrderDetail, customer);
			
			// Print order
			if (choosePaymentCard == 1 && !card.checkCard(order.calTotalAmount())) {
				System.out.println("You don't have enought money for payment. Please pay later.");
				order.setStatus("Just ordered");
			}
			else {
				card.updateCard(order.calTotalAmount());
				order.setStatus("Paid");
				System.out.println(order.toString());
			}
		}
		catch (IOException | NumberFormatException | ParseException ex) {
			System.out.println("Exception: " + ex);
		}

	}

}
