package jdbc;

import java.io.Serializable;
import java.text.DecimalFormat;

/**
 * @author ThuyQuynh
 * @since 2016-09-19
 * @version 1.0
 * 
 * This is class manages the information of a CD
 * 	as CD table in database.
 */
public class CD implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String singer;
	private int numberSongs;
	private double price;
	
	public CD() {
		
	}

	public CD(int id, String name, String singer, int numberSongs, double price) {
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.numberSongs = numberSongs;
		this.price = price;
	}
	
	public CD(String name, String singer, int numberSongs, double price) {
		this.name = name;
		this.singer = singer;
		this.numberSongs = numberSongs;
		this.price = price;
	}

	public CD(int id, int numberSongs, double price) {
		this.id = id;
		this.numberSongs = numberSongs;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public int getNumberSongs() {
		return numberSongs;
	}

	public void setNumberSongs(int numberSongs) {
		this.numberSongs = numberSongs;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * This methods is used to get the information of an CD
	 * @param No.
	 * @return String This is string about information of an CD
	 */
	@Override
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("#,###");
		String result = "ID:" + id + "\n";
		result += "Name: " + name + "\n";
		result += "Singer: " + singer + "\n";
		result += "Number of songs: " + numberSongs + "\n";
		result += "Price: " + formatter.format(price) + "\n";
		
		return result;
	}

}
