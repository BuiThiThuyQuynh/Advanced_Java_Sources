/**
 * @author Bui Thi Thuy Quynh
 * @created 01/09/2016
 * @version 1.0
 */

package exercise131;

/**
 * @description class concrete factory in factory method, extends from TailorShop class
 */
public class CheongsamTailorShop extends TailorShop {

	@Override
	public AoDai sew() {
		return new Cheongsam();
	}

}