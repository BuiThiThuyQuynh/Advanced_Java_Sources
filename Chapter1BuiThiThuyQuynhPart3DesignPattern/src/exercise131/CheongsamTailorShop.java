package exercise131;

/**
 * The CheongsamTailorShop class implements the sew() method of TailorShop class that
 * simply sews a cheongsam.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-01
 */
public class CheongsamTailorShop extends TailorShop {

	/**
	 * This method is used to sew a cheongsam,
	 * override sew() method of TailorShop class.
	 * @param No.
	 * @return AoDai This is cheongsam which was sewed.
	 */
	@Override
	public AoDai sew() {
		return new Cheongsam();
	}

}