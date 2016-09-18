package exercise71;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * The Contacts class is used to manage contacts.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-11
 */
public class Contacts {

	private Map<String, String> contacts;
	
	
	public Contacts(String filePath) {
		try {
			readFile(filePath);
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	public Document getDocument(String filePath) 
			throws FileNotFoundException, SAXException, 
			IOException, ParserConfigurationException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.newDocument();
		
		Element rootElement;
		File xmlFile = new File(filePath);
		
		if (xmlFile.isFile()) {
			doc = builder.parse(new FileInputStream(xmlFile));
			doc.getDocumentElement().normalize();
			//rootElement = doc.getDocumentElement(); // get root
		}
		else {
			rootElement = doc.createElement("contacts"); // create root
			doc.appendChild(rootElement);
		}
		return doc;
	}
	
	public String delete(String name, String filePath) 
			throws FileNotFoundException, SAXException, 
			IOException, ParserConfigurationException {
		Document doc= getDocument(filePath);
		Element rootElement = doc.getDocumentElement();
		
		
		NodeList nodeList = rootElement.getElementsByTagName("contact");
		for (int i = 0; i < nodeList.getLength(); i++) {
			
			Contact contact = getContact(nodeList.item(i));
			if (contact.getName().equals(name)) {
				while (nodeList.item(i).hasChildNodes())
					nodeList.item(i).removeChild(nodeList.item(i).getFirstChild());
				return name + " was removed";
			}
		}
		return name + " was not found";
	}
	
	public void writeContact(String filePath) 
			throws FileNotFoundException, SAXException, 
			IOException, ParserConfigurationException,
			TransformerException {
		Document doc= getDocument(filePath);
		Element rootElement = doc.getDocumentElement();
		
		while (rootElement.hasChildNodes())
			rootElement.removeChild(rootElement.getFirstChild());
		
		for (String key : contacts.keySet()) {
			
			// Create contact in root node
			Element contact = doc.createElement("contact");
			rootElement.appendChild(contact);
			
			// Create name node in contact node
			Element name = doc.createElement("name");
			name.appendChild(doc.createTextNode(key));
			contact.appendChild(name);
			
			// Create name node in contact node
			Element phone = doc.createElement("phone");
			phone.appendChild(doc.createTextNode(contacts.get(key)));
			contact.appendChild(phone);
			
			
		}
		
		TransformerFactory transFactory = TransformerFactory.newInstance();
		Transformer transformer = transFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty(OutputKeys.METHOD, "xml");
		transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
		
		DOMSource source = new DOMSource(doc);
		
		File xmlFile = new File(filePath);
		StreamResult result = new StreamResult(xmlFile);
		transformer.transform(source, result);
		
		System.out.println("File saved");
	}
	
	private Contact getContact(Node node) {
		Contact contact = new Contact();
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			Element element = (Element) node;
			
			contact.setName(element.getElementsByTagName("name")
					.item(0).getChildNodes().item(0).getNodeValue());
			contact.setPhone(element.getElementsByTagName("phone")
					.item(0).getChildNodes().item(0).getNodeValue());
		}
		
		return contact;
	}
	
	public void readFile(String filePath) 
			throws FileNotFoundException, ParserConfigurationException, 
			SAXException, IOException {
		contacts = new HashMap<String, String>();
		try {

			Document doc = getDocument(filePath);
			Element rootElement = doc.getDocumentElement();
			//System.out.println("root:" + rootElement.getNodeName());
			
			NodeList nodeList = rootElement.getElementsByTagName("contact");
			for (int i = 0; i < nodeList.getLength(); i++) {
				Contact contact = getContact(nodeList.item(i));
				contacts.put(contact.getName(), contact.getPhone());
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
