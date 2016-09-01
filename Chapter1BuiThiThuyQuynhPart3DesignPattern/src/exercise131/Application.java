/**
 * @author Bui Thi Thuy Quynh
 * @created 01/09/2016
 * @version 1.0
 */

package exercise131;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description class 
 */
public class Application {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		TailorShop factory;
		AoDai product;
		try {
			System.out.println("CHOOSE TYPE OF AO DAI: ");
			System.out.println("1. Traditional");
			System.out.println("2. Modern");
			System.out.println("3. Cheongsam");
			
			int choose = Integer.parseInt(input.readLine());
			
			while (choose != 1 && choose != 2 && choose != 3) {
				System.out.println("Only choose 1 or 2 or 3");
				System.out.println("CHOOSE TYPE OF AO DAI: ");
				System.out.println("1. Traditional");
				System.out.println("2. Modern");
				System.out.println("3. Cheongsam");
				
				choose = Integer.parseInt(input.readLine());
			}
			
			switch (choose) {
			case 1:
				factory = new TraditionalAoDaiTailorShop();
				product = factory.sew();
				System.out.println(product.getAoDai());
				break;
			case 2:
				factory = new ModernAodaiTailorShop();
				product = factory.sew();
				System.out.println(product.getAoDai());
				break;
			case 3:
				factory = new CheongsamTailorShop();
				product = factory.sew();
				System.out.println(product.getAoDai());
				break;
			default:
				break;
			
			}
		}
		catch (IOException | NumberFormatException ex) {
			System.out.println("Exception: " + ex);
		}
	}

}