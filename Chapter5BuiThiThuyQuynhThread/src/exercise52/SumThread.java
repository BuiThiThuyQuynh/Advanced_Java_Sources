package exercise52;

/**
 * The SumThread class calculate sum of array using multi-thread.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-13
 */
public class SumThread extends Thread {

	private int low;
	private int high;
	private int[] array;
	private int sum = 0;
	
	public SumThread(int low, int high, int[] array) {
		this.low = low;
		this.high = high;
		this.array = array;
	}
	
	public int getLow() {
		return low;
	}

	public void setLow(int low) {
		this.low = low;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public void run() {
		for (int i = this.low; i < this.high; i++) {
			this.sum += this.array[i];
		}
	}
}
