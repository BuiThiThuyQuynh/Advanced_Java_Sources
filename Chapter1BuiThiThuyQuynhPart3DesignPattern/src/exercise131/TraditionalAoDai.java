package exercise131;

/**
 * The TraditionalAoDai class implements the getAodai() method of AoDai class that
 * gets the information of traditional ao dai.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-01
 */
public class TraditionalAoDai extends AoDai {

	/**
	 * This method is used to get information of traditional ao dai which was sewed,
	 * 	override getAoDai() method of AoDai class.
	 * @param No.
	 * @return String This is the information of traditional ao dai which was sewed.
	 */
	@Override
	public String getAoDai() {
		return "Traditinal ao dai was sewed";
	}
}