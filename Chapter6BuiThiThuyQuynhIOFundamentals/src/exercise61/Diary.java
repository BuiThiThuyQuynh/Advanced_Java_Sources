package exercise61;

/**
 * This is class create a dairy
 * 
 * @author ThuyQuynh
 * @version 1.0
 * @since 2016-09-14
 */
public class Diary {

	private String date;
	private String content;

	public Diary() {

	}

	public Diary(String date, String content) {
		this.date = date;
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * This method is used to get the information of an dairy
	 * @param No.
	 * @return string about information of an dairy included create date and content.
	 */
	@Override
	public String toString() {
		String result = "Date: " + date + "\n";
		result += content + "\n";
		return result;
	}

}
