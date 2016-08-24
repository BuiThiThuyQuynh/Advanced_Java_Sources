/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 *  Class manges the book
 */

package classes;

import java.text.DecimalFormat;

public class Exercise112ManagementBook {

	Exercise112TextBook[] listTextBook;
	Exercise112ReferenceBook[] listReferenceBook;
	
	public Exercise112ManagementBook() {
		
	}

	public Exercise112ManagementBook(Exercise112TextBook[] listTextBook, Exercise112ReferenceBook[] listReferenceBook) {
		this.listTextBook = listTextBook;
		this.listReferenceBook = listReferenceBook;
	}

	public Exercise112TextBook[] getListTextBook() {
		return listTextBook;
	}

	public void setListTextBook(Exercise112TextBook[] listTextBook) {
		this.listTextBook = listTextBook;
	}

	public Exercise112ReferenceBook[] getListReferenceBook() {
		return listReferenceBook;
	}

	public void setListReferenceBook(Exercise112ReferenceBook[] listReferenceBook) {
		this.listReferenceBook = listReferenceBook;
	}
	
	/**
	 * Function: summary fee of textbook
	 * Input: no
	 * Output: totals amount of textbook
	 */
	public double calFeeTextBook() {
		double result = 0;
		for (int i = 0; i < this.listTextBook.length; i++) 
			result += this.listTextBook[i].calFee();
		
		return result;
	}
	
	/**
	 * Function: summary fee of reference book
	 * Input: no
	 * Output: totals amount of reference book
	 */
	public double calFeeReferBook() {
		double result = 0;
		for (int i = 0; i < this.listReferenceBook.length; i++) 
			result += this.listReferenceBook[i].calFee();
		
		return result;
	}
	
	/**
	 * Function: average price of reference book
	 * Input: no
	 * Output: average price of reference book
	 */
	public double averagePriceReferBook() {
		if (listReferenceBook.length == 0)
			return 0;
		
		return calFeeReferBook() / listReferenceBook.length;
	}
	
	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("#,###");
		String result = "";
		
		result += "======= INFORMATION OF TEXTBOOK ========\n";
		for (int i = 0; i < this.listTextBook.length; i++) {
			result += this.listTextBook[i].toString() + "\n";
			System.out.println("---------------");
		}
		
		result += "======= INFORMATION OF REFERENCE BOOKS =======\n";
		for (int i = 0; i < this.listReferenceBook.length; i++) {
			result += this.listReferenceBook[i].toString() + "\n";
			System.out.println("------------------");
		}
		
		result += "============================\n";
		result += "Totals amount of textbook: " + format.format(calFeeTextBook()) + "\n";
		result += "Totals amount of reference book: " + format.format(calFeeReferBook()) + "\n";
		result += "Average price of reference book: " + format.format(averagePriceReferBook()) + "\n";
		return result;
	}
}