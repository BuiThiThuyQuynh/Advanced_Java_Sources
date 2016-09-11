package exercise128;

import java.text.DecimalFormat;

/**
 * The MobileObserver class is used to notify 
 * 	by mobile when account was changed, extends from Observer class.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-10
 */
public class MobileObserver extends Observer {

	private Account account;
	
	public MobileObserver() {
		
	}
	
	public MobileObserver(Account account) {
		this.account = account;
	}

	/**
	 * This method is used to notify by email when account was changed, 
	 * 	override update() method of Observer class.
	 * @param No.
	 * @return No.
	 */
	@Override
	public void update() {
		DecimalFormat df = new DecimalFormat("#,###");
		
		System.out.println("Welcome ABC bank. Message was "
				+ "sent from mobile. Your account was changed"
				+ ". Current balance is " + df.format(account.getState()) + "VND");
	}
}
