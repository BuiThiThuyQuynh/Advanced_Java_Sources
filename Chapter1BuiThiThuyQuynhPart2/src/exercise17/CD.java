/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * Class manages the information of an CD
 */

package exercise17;

import java.text.DecimalFormat;

public class CD {
	
	private String id;
	private String name;
	private String singer;
	private int numOfSongs;
	private double price;
	
	public CD() {
		
	}

	public CD(String id, String name, String singer, int numOfSongs, double price) {
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.numOfSongs = numOfSongs;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getNumOfSongs() {
		return numOfSongs;
	}

	public void setNumOfSongs(int numOfSongs) {
		this.numOfSongs = numOfSongs;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Function: print the information of an CD
	 * Input: no
	 * Output: string about information of an CD
	 */
	@Override
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("#,###");
		String result = "ID: " + id + "\n";
		
		result += "Name: " + name + "\n";
		result += "Singer: " + singer + "\n";
		result += "Number of songs: " + numOfSongs + "\n";
		result += "Price: " + formatter.format(price) + "\n";
		result += "-------------------------------------------\n";
		
		return result;
	}
}
