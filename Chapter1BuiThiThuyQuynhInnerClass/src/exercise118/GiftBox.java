/**
 * @author Bui Thi Thuy Quynh
 * @date 24/08/2016
 * @version 1.0
 */

package exercise118;

/**
 * @description Class manages the information about gift box
 */
public class GiftBox {

	public final int PRICE = 10000;
	
	private String shape;
	private String color;
	
	public GiftBox(String shape, String color) {
		this.shape = shape;
		this.color = color;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * @description class manages the information of gift in gift box
	 */
	class Gift {
		
		final int FEE = 200;
		
		private String name;
		private double weight;
		
		public Gift(String name, double weight) {
			this.name = name;
			this.weight = weight;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}

		public double calFee() {
			return weight * FEE + GiftBox.this.PRICE;
		}
		
		/**
		 * @function show the information of gift box
		 * @return string about the information of gift box
		 */
		@Override
		public String toString() {
			String result = "Shape's giftbox: " + GiftBox.this.shape + "\n";
			result += "Color's giftbox: " + GiftBox.this.color + "\n";
			result += "Name's gift: " + this.name + "\n";
			result += "Weight: " + this.weight + "g\n";
			result += "Fee: " + this.calFee() + "VND\n";
			return result;
		}
	}
}
