/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 *  Class handles for Exercise111TransactionGold class, Exercise110TransactionCurrency class
 */

package exercise111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class MainManagementTransaction {

	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		TransactionGold[] listTransGold = new TransactionGold[0];
		TransactionCurrency[] listTransCurrency =  new TransactionCurrency[0];
		ManagementTransaction managementTransaction = new ManagementTransaction();
		
		TransactionGold transactionGold;
		TransactionCurrency transactionCurrency;
		
		boolean flag = true;
		try {
			while (flag) {
				System.out.println("ENTER GENERAL INFORMATION OF A TRANSACTION");
				System.out.println("Enter id:");
				String id = input.readLine();
				
				System.out.println("Enter date of transaction (dd/MM/yyyy):");
				String date = input.readLine();
				
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				dateFormat.setLenient(false);
				
				Date dateOfTransaction = dateFormat.parse(date);
			
				System.out.println("Enter quantity:");
				int quantity = Integer.parseInt(input.readLine());
				
				while (quantity < 0) {
					System.out.println("Quantity must be greater than or equal to 0");
					System.out.println("Enter quantity:");
					quantity = Integer.parseInt(input.readLine());
				}
				
				System.out.println("CHOOSE TYPE OF TRANSACTION");
				System.out.println("1. Gold");
				System.out.println("2. Currency");
				int choose = Integer.parseInt(input.readLine());
				while (choose !=1 && choose != 2) {
					System.out.println("Please choose 1 or 2");
					System.out.println("CHOOSE TYPE OF TRANSACTION");
					System.out.println("1. Gold");
					System.out.println("2. Currency");
					choose = Integer.parseInt(input.readLine());
				}

				
				
				switch (choose) {
					case 1:
						System.out.println("Enter type of GOLD: ");
						System.out.println("1. 18K");
						System.out.println("2. 24K");
						System.out.println("3. SJC");
						int typeOfGold = Integer.parseInt(input.readLine());
						
						while (typeOfGold != 1 && typeOfGold != 2 && typeOfGold != 3) {
							System.out.println("Please choose 1 or 2 or 3");
							System.out.println("Enter type of GOLD: ");
							System.out.println("1. 18K");
							System.out.println("2. 24K");
							System.out.println("3. SJC");
							typeOfGold = Integer.parseInt(input.readLine());
						}
						
						TypeGold typeGold = TypeGold.GOLD18K;
						double price = 0;
						switch (typeOfGold) {
						case 1:
							typeGold = TypeGold.GOLD18K;
							price = TypeGold.GOLD18K.getPrice();
							break;
						case 2:
							typeGold = TypeGold.GOLD24K;
							price = TypeGold.GOLD24K.getPrice();
							break;
						case 3:
							typeGold = TypeGold.GOLDSJC;
							price = TypeGold.GOLDSJC.getPrice();
							break;
							
						}
						
						
						listTransGold = Arrays.copyOf(listTransGold, listTransGold.length + 1);
						transactionGold = new TransactionGold(id, dateOfTransaction, price, quantity, typeGold);
						listTransGold[listTransGold.length - 1] = transactionGold;
						
//						managementTransaction.setListTransCurrency(listTransCurrency);
//						managementTransaction.setListTransGold(listTransGold);
//						
//						System.out.println(managementTransaction.printTransacGold());
						
						break;
					case 2:
						System.out.println("Enter type of currency: ");
						System.out.println("1. USD");
						System.out.println("2. EUR");
						System.out.println("3. AUD");
						int typeOfCurrency = Integer.parseInt(input.readLine());
						
						while (typeOfCurrency != 1 && typeOfCurrency != 2 && typeOfCurrency != 3) {
							System.out.println("Please choose 1 or 2 or 3");
							System.out.println("Enter type of currency: ");
							System.out.println("1. USD");
							System.out.println("2. EUR");
							System.out.println("3. AUD");
							typeOfCurrency = Integer.parseInt(input.readLine());
						}
						
						System.out.println("Enter type of transaction: ");
						System.out.println("1. Purchase");
						System.out.println("2. Sale");
						int typeOfTrans = Integer.parseInt(input.readLine());
						
						while (typeOfTrans != 1 && typeOfTrans != 2) {
							System.out.println("Please choose 1 or 2");
							System.out.println("Enter type of transaction: ");
							System.out.println("1. Purchase");
							System.out.println("2. Sale");
							typeOfTrans = Integer.parseInt(input.readLine());
						}
						
						TypeCurrency typeCurrency = TypeCurrency.USD;
						TypeTransaction typeTransaction = TypeTransaction.PURCHASE;
						price = 0;
						if (typeOfTrans == 1)
							typeTransaction = TypeTransaction.PURCHASE;
						else
							typeTransaction = TypeTransaction.SALE;
						switch (typeOfTrans) {
						case 1:
							typeCurrency = TypeCurrency.USD;
							if (typeOfTrans == 1)
								price = TypeCurrency.USD.getPricePurchase();
							else
								price = TypeCurrency.USD.getPriceSale();
							break;
						case 2:
							typeCurrency = TypeCurrency.EUR;
							if (typeOfTrans == 1)
								price = TypeCurrency.EUR.getPricePurchase();
							else
								price = TypeCurrency.EUR.getPriceSale();
							break;
						case 3:
							typeCurrency = TypeCurrency.AUD;
							if (typeOfTrans == 1)
								price = TypeCurrency.AUD.getPricePurchase();
							else
								price = TypeCurrency.AUD.getPriceSale();
							break;
							
						}
						
						listTransCurrency = Arrays.copyOf(listTransCurrency, listTransCurrency.length + 1);
						transactionCurrency = new TransactionCurrency(id, dateOfTransaction, price, 
								quantity, typeCurrency, typeTransaction);
						listTransCurrency[listTransCurrency.length - 1] = transactionCurrency;
						
						break;
				}
				
				managementTransaction.setListTransCurrency(listTransCurrency);
				managementTransaction.setListTransGold(listTransGold);
				if (choose == 1)
					System.out.println(managementTransaction.printTransacGold());
				else
					System.out.println(managementTransaction.printTransacCurrency());
				
				int flagAddTrans = 0;
				while (flagAddTrans == 0) {
					System.out.println("Are you add a new computer [y/n]?");
					String temp = input.readLine();
					switch (temp) {
					case "y":
					case "Y":
						flagAddTrans = 1;
						break;
					case "n":
					case "N":
						flagAddTrans = 2;
						flag = false;
						break;
					default:
						System.out.println("This choose don't have. Please choosing again!");
						break;
					}
				}
				
				if (flagAddTrans == 1) {
					continue;
				}
				else {
					System.out.println("The end");
					break;
				}
			}
		}
		catch (IOException | NumberFormatException | ParseException ex) {
			System.out.println("Exception: " + ex);
		}

	}

}
