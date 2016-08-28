/**
 * @author Bui Thi Thuy Quynh
 * @date 24/08/2016
 * @version 2.0
 */

package exercise111;

/**
 * @description enum for type of currency
 */
public enum TypeCurrency {
	
	USD(22.250, 22.335),
	EUR(24.457, 25.050),
	AUD(16.530, 17.226);
	
	private double pricePurchase;
	private double priceSale;
	
	private TypeCurrency(double pricePurchase, double priceSale) {
		this.pricePurchase = pricePurchase;
		this.priceSale = priceSale;
	}

	public double getPricePurchase() {
		return pricePurchase;
	}

	public void setPricePurchase(double pricePurchase) {
		this.pricePurchase = pricePurchase;
	}

	public double getPriceSale() {
		return priceSale;
	}

	public void setPriceSale(double priceSale) {
		this.priceSale = priceSale;
	}
}
