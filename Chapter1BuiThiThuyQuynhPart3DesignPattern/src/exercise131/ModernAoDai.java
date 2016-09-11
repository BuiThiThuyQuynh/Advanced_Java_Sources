package exercise131;

/**
 * The ModernAoDai class implements the getAodai() method of AoDai class that
 * gets the information of modern ao dai.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-01
 */
public class ModernAoDai extends AoDai {

	/**
	 * This method is used to get information of modern ao dai which was sewed,
	 * 	override getAoDai() method of AoDai class.
	 * @param No.
	 * @return String This is the information of modern ao dai which was sewed.
	 */
	@Override
	public String getAoDai() {
		return "Modern ao dai was sewed";
	}

}