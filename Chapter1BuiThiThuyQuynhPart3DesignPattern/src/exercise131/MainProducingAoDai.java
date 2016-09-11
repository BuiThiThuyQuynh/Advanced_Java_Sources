package exercise131;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>Sew a ao dai</h1>
 * The MainProducingAoDai program implements an application that
 * sews ao dai and prints the output on the screen.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-05
 */
public class MainProducingAoDai {

	/**
	 * This is the main method which makes use of getAoDai() method and sew() method.
	 * @param args Unused.
	 * @return Nothing.
	 * @exception IOException On input error.
	 * @exception NumberFormatException On number format error.
	 * @see IOException.
	 * @see NumberFormatException.
	 */
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		TailorShop factory;
		AoDai product;
		try {
			// Show menu for user select ao dai which want to sew and check validate choice
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
			
			// Sew shape that user selected
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