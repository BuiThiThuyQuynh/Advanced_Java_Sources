package exercise131;

/**
 * The ModernAoDaiTailorShop class implements the sew() method of TailorShop class that
 * simply sews a modern ao dai.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-01
 */
public class ModernAodaiTailorShop extends TailorShop {

	/**
	 * This method is used to sew a modern ao dai,
	 * override sew() method of TailorShop class.
	 * @param No.
	 * @return AoDai This is modern ao dai which was sewed.
	 */
	@Override
	public AoDai sew() {
		return new ModernAoDai();
	}

}