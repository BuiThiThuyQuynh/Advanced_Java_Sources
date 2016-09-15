package exercise21;

import java.text.DecimalFormat;

/**
 * @author Bui Thi Thuy Quynh
 * @date 07/09/2016
 * @version 1.0
 * 
 * @description Class manages the information of an CD
 */
public class CD implements Comparable<CD> {
	
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
	 * @description get the information of an CD
	 * @return string about information of an CD
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
	
	/**
	 * @description override compareTo method to compare two CD object
	 * @return 
	 */
	@Override
	public int compareTo(CD o) {
		return (this.name).compareTo(o.name);
	}
}
