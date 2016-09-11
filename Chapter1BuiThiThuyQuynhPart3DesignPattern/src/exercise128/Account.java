package exercise128;

import java.util.ArrayList;
import java.util.List;

/**
 * The Account class manages the information of account.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-10
 */
public class Account {

	private List<Observer> observers;
	private double state = 10000000;
	
	public Account() {
		observers = new ArrayList<Observer>();
	}

	public Account(List<Observer> observers, double state) {
		observers = new ArrayList<Observer>();
		this.observers = observers;
		this.state = state;
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public double getState() {
		return state;
	}

	/**
	 * This method is used to set state of account and
	 *  notify all of observers when state of account was changed.
	 * @param No.
	 * @return No.
	 */
	public void setState(double state) {
		this.state = state;
		notifyAllObserver();	
	}
	
	/**
	 * This method is used to add new observer.
	 * @param No.
	 * @return No.
	 */
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	/**
	 * This method is used to get message to all of observers.
	 * @return No.
	 */
	public void notifyAllObserver() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
