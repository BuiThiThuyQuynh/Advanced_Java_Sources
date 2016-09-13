package exercise53;

/**
 * The MaxThread class find max of array using multi-thread.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-13
 */
public class MaxThread extends Thread {

	private int low;
	private int high;
	private int[] array;
	private int max;
	
	public MaxThread(int low, int high, int[] array) {
		this.low = low;
		this.high = high;
		this.array = array;
		this.max = array[0];
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

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	@Override
	public void run() {
		for (int i = this.low; i < this.high; i++) {
			if (array[i] > max)
				this.max = this.array[i];
		}
	}
}
