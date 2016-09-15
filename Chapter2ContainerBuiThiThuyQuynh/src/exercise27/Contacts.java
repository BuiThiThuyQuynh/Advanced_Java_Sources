package exercise27;

import java.util.HashMap;
import java.util.Map;

/**
 * The Contacts class is used to manage contacts.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-11
 */
public class Contacts {

	private Map<String, String> contacts = new HashMap<String, String>();
	
	public Contacts() {
		
	}
	
	public Contacts(Map<String, String> contacts) {
		this.contacts = contacts;
	}

	public Map<String, String> getContacts() {
		return contacts;
	}

	public void setContacts(Map<String, String> contacts) {
		this.contacts = contacts;
	}
	
	/**
	 * This method is used to add a contact.
	 * @param name This is name of contact.
	 * @param phoneNumber This is phone number of contact.
	 * @return Nothing.
	 */
	public void addContact(String name, String phoneNumber) {
		contacts.put(name, phoneNumber);
	}
	
	/**
	 * This method is used to search relation a contact.
	 * @param s This is name or phone number of contact.
	 * @return Map<String, String> This is list search result.
	 */
	public Map<String, String> searchContactRelation(String s) {
		Map<String, String> result = new HashMap<String, String>();
		
		for (String key : contacts.keySet()) {
			if(key.contains(s) || contacts.get(key).contains(s)) {
				result.put(key, contacts.get(key));
			}
		}
		return result                                                                                                                                ;
	}
	
	/**
	 * This method is used to search exactly a contact.
	 * @param s This is name or phone number of contact.
	 * @return Map<String, String> This is list search result.
	 */
	public String searchContactCorrect(String s) {
		for (String key : contacts.keySet()) {
			if(key.equals(s) || contacts.get(key).equals(s)) {
				if (key.equals(s))
					return contacts.get(key);
				else
					return key;
			}
		}
		return null;                                                                                                                                
	}
	
	/**
	 * This method is used to check a contact existing or not.
	 * @param name This is name of contact.
	 * @return boolean Name of this contact existed or not.
	 */
	public boolean checkContact(String name) {
		return contacts.containsKey(name);
	}
	
	/**
	 * This method is used to update a contact.
	 * @param name This is name of contact which was updated.
	 * @param phoneNumber This is new phone number of contact.
	 * @return String This is update result.
	 */
	public String updateContact(String name, String phoneNumber) {
		if (checkContact(name)) {
			contacts.put(name, phoneNumber);
			return name + " was updated";
		}
		return name + " was not found";
	}
	
	/**
	 * This method is used to delete a contact.
	 * @param s This is name or phone number of contact.
	 * @return String This is delete result.
	 */
	public String deleteContact(String s) {
		if (searchContactCorrect(s) != null) {
			if (contacts.containsKey(s)) {
				contacts.remove(s, searchContactCorrect(s));
			}
			else {
				contacts.remove(searchContactCorrect(s), s);
			}
			return s + " was removed";
		}
		return s + " was not found";
	}
	
	/**
	 * This method is used to get list contacts.
	 * @param No.
	 * @return String This is all of contacts included name and phone number.
	 */
	@Override
	public String toString() {
		String result = "===== CONTACTS =====\n";
		result += "Name\tPhone number\n";
		for (String key : contacts.keySet()) {
			result += key + "\t" + contacts.get(key).toString() + "\n";
		}
		return result;
	}
}
