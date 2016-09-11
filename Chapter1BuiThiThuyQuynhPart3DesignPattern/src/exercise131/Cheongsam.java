package exercise131;

/**
 * The Cheongsam class implements the getAodai() method of AoDai class that
 * gets the information of cheongsam.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-01
 */
public class Cheongsam extends AoDai {

	/**
	 * This method is used to get information of cheongsam which was sewed,
	 * 	override getAoDai() method of AoDai class.
	 * @param No.
	 * @return String This is the information of cheongsam which was sewed.
	 */
	@Override
	public String getAoDai() {
		return "Cheongsam was sewed";
	}
}