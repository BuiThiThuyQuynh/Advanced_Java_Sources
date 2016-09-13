package exercise92;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Bui Thi Thuy Quynh
 * @version 1.0
 * @since 07/09/2016
 * 
 * Class manages the information of an CD
 */
public class CD {
	
	private String id;
	private String name;
	private String singer;
	private int numOfSongs;
	private double price;
	private String language;
	
	public CD() {
		
	}

	public CD(String id, String name, String singer, int numOfSongs, double price, String language) {
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.numOfSongs = numOfSongs;
		this.price = price;
		this.language = language;
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
	
	public String getLanguage() {
		return language;
	}
	

	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * Function: print the information of an CD
	 * Input: no
	 * Output: string about information of an CD
	 */
	@Override
	public String toString() {
		Locale currentLocal = new Locale("en", "US");
		ResourceBundle message = ResourceBundle.getBundle(language, currentLocal);
		
		DecimalFormat formatter = new DecimalFormat("#,###");
		String result = message.getString("id") + ": " + id + "\n";
		
		result += message.getString("name") + ": "+ name + "\n";
		result += message.getString("singer") +": " + singer + "\n";
		result += message.getString("numberSongs") + ": " + numOfSongs + "\n";
		result += message.getString("price") + ": " + formatter.format(price) + "\n";
		result += "-------------------------------------------\n";
		
		return result;
	}
}
