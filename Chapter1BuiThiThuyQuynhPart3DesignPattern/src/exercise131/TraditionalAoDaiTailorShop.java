package exercise131;

/**
 * The TraditionalAoDaiTailorShop class implements the sew() method of TailorShop class that
 * simply sews a traditional ao dai.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-01
 */
public class TraditionalAoDaiTailorShop extends TailorShop {

	/**
	 * This method is used to sew a traditional ao dai,
	 * override sew() method of TailorShop class.
	 * @param No.
	 * @return AoDai This is traditional ao dai which was sewed.
	 */
	@Override
	public AoDai sew() {
		return new TraditionalAoDai();
	}

}