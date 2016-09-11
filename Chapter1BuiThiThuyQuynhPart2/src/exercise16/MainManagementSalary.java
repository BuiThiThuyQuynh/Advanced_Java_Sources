/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * Class handles for Exercise16Employee class
 */

package exercise16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class MainManagementSalary {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter full name of employee: ");
			String name = input.readLine();
			
			System.out.println("Enter coefficients salary: ");
			double coefficientsSalary = Double.parseDouble(input.readLine());
			
			while (coefficientsSalary < 0) {
				System.out.println("Coefficients salary must be greater than or equal to 0");
				System.out.println("Enter coefficients salary: ");
				coefficientsSalary = Double.parseDouble(input.readLine());
			}
			
			System.out.println("Enter numbers of family: ");
			int numberOfFamily = Integer.parseInt(input.readLine());
			
			while (numberOfFamily < 0) {
				System.out.println("Numbers of family must be greater than or equal to 0");
				System.out.println("Enter numbers of family: ");
				numberOfFamily = Integer.parseInt(input.readLine());
			}
			
			System.out.println("Enter allowance: ");
			double allowance = Double.parseDouble(input.readLine());
			
			while (allowance < 0) {
				System.out.println("Allowance must be greater than or equal to 0");
				System.out.println("Enter allowance: ");
				allowance = Double.parseDouble(input.readLine());
			}
			
			Employee employee = new Employee(name, coefficientsSalary, 
					numberOfFamily, allowance);
			
			System.out.println("-------------------------------------------");
			DecimalFormat formatter = new DecimalFormat("#,###");
			System.out.println("Salary: " + formatter.format(employee.calSalary()));
			System.out.println("Taxable salary: " + formatter.format(employee.calTaxableSalary()));
			System.out.println("Personal taxes: " + formatter.format(employee.calPersonalTaxes()));
			System.out.println("Real salary: " + formatter.format(employee.calRealSalary()));
		}
		catch (IOException | NumberFormatException ex) {
			System.out.println("Exception: " + ex);
		}
	}
}
