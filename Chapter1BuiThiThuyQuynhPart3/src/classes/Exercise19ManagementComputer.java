/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 *  Class manages the information of a type of a type of desktop
 */

package classes;

import java.text.DecimalFormat;

public class Exercise19ManagementComputer {
	
	Exercise19Laptop[] laptops;
	Exercise19Desktop[] desktops;
	
	public Exercise19ManagementComputer() {
		
	}
	
	public Exercise19ManagementComputer(Exercise19Laptop[] laptops, Exercise19Desktop[] desktops) {
		this.laptops = laptops;
		this.desktops = desktops;
	}
	
	public Exercise19Laptop[] getLaptops() {
		return laptops;
	}
	
	public void setLaptops(Exercise19Laptop[] laptops) {
		this.laptops = laptops;
	}
	
	public Exercise19Desktop[] getDesktops() {
		return desktops;
	}
	
	public void setDesktops(Exercise19Desktop[] desktops) {
		this.desktops = desktops;
	}

	/**
	 * Function: calculation fee of type of laptops
	 * Input: no
	 * Output: totals amount of laptops
	 */
	public double sumFeeLapTop() {
		double result = 0;
		for (int i = 0; i < laptops.length; i++)
			result += laptops[i].calFee();
		return result;
	}
	
	/**
	 * Function: calculation fee of type of desktop
	 * Input: no
	 * Output: totals amount of desktop
	 */
	public double sumFeeDesktop() {
		double result = 0;
		for (int i = 0; i < desktops.length; i++)
			result += desktops[i].calFee();
		return result;
	}
	
	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("#,###");
		String result = "";
		result += "======= INFORMATION OF LAPTOPS ========\n";
		for (int i = 0; i < this.laptops.length; i++)
			result += this.laptops[i].toString() + "\n";
		
		result += "======= INFORMATION OF DESKTOPS =======\n";
		for (int i = 0; i < this.desktops.length; i++)
			result += this.desktops[i].toString() + "\n";
		
		result += "============= TOTALS AMOUNT ============\n";
		result += "Totals amount of laptops: " + format.format(sumFeeLapTop()) + "\n";
		result += "Totals amount of desktops: " + format.format(sumFeeDesktop()) + "\n";
		return result;
	}
}
