package exercise72;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

public class EmployeeManagement {

	List<Employee> employees;
	
	public EmployeeManagement(String filePath) throws FileNotFoundException, ParserConfigurationException, SAXException, IOException {
		readFile(filePath);
	}

	public EmployeeManagement(List<Employee> employees) {
		this.employees = employees;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public List<Employee> geEmployeeByDepartment(int departmentId) {
		List<Employee> result = new ArrayList<Employee>();
		
		for (Employee employee : employees) {
			if (employee.getDepartmentId() == departmentId)
				result.add(employee);
			}
		
		return result;
	}
	
	public String printListEmployee(int departmentId) {
		String result = "======== LIST EMPLOYEE IN DEPARTMENT " + departmentId
				+ "=================\n";
		result += "ID\tName\t\tSex\tBirth date\tSalary\tAddress\n";
		List<Employee> listEmployee = geEmployeeByDepartment(departmentId);
		for (Employee employee : listEmployee) {
			result += employee.toString();
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
			rootElement = doc.createElement("department"); // create root
			doc.appendChild(rootElement);
		}
		return doc;
	}
	
	private Employee getEmployee(Node node) {
		Employee employee = new Employee();
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			Element element = (Element) node;
			employee.setId(Integer.parseInt(element.getElementsByTagName("id")
					.item(0).getChildNodes().item(0).getNodeValue()));
			employee.setName(element.getElementsByTagName("name")
					.item(0).getChildNodes().item(0).getNodeValue());
			employee.setSex(Integer.parseInt(element.getElementsByTagName("sex")
					.item(0).getChildNodes().item(0).getNodeValue()));
			employee.setBirthDate(element.getElementsByTagName("birthdate")
					.item(0).getChildNodes().item(0).getNodeValue());
			employee.setSalary(Double.parseDouble(element.getElementsByTagName("salary")
					.item(0).getChildNodes().item(0).getNodeValue()));
			employee.setAddress(element.getElementsByTagName("address")
					.item(0).getChildNodes().item(0).getNodeValue());
			employee.setDepartmentId(Integer.parseInt(element.getElementsByTagName("departmentid")
					.item(0).getChildNodes().item(0).getNodeValue()));
		}
		
		return employee;
	}
	
	public void readFile(String filePath) 
			throws FileNotFoundException, ParserConfigurationException, 
			SAXException, IOException {
		employees = new ArrayList<Employee>();
		try {
			Document doc = getDocument(filePath);
			Element rootElement = doc.getDocumentElement();
			//System.out.println("root:" + rootElement.getNodeName());
			
			NodeList nodeList = rootElement.getElementsByTagName("employee");
			for (int i = 0; i < nodeList.getLength(); i++) {
				Employee employee = getEmployee(nodeList.item(i));
				employees.add(employee);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void writeContact(String filePath) 
			throws FileNotFoundException, SAXException, 
			IOException, ParserConfigurationException,
			TransformerException {
		Document doc= getDocument(filePath);
		Element rootElement = doc.getDocumentElement();
		
		while (rootElement.hasChildNodes())
			rootElement.removeChild(rootElement.getFirstChild());
		
		for (Employee item : employees) {
			
			// Create contact in root node
			Element employee = doc.createElement("employee");
			rootElement.appendChild(employee);
			
			// Create name node in contact node
			Element id = doc.createElement("id");
			id.appendChild(doc.createTextNode(String.valueOf(item.getId())));
			employee.appendChild(id);
			
			// Create name node in contact node
			Element name = doc.createElement("name");
			name.appendChild(doc.createTextNode(item.getName()));
			employee.appendChild(name);
			
			// Create name node in contact node
			Element sex = doc.createElement("sex");
			sex.appendChild(doc.createTextNode(String.valueOf(item.getSex())));
			employee.appendChild(name);
			
			// Create name node in contact node
			Element birthDate = doc.createElement("birhtdate");
			birthDate.appendChild(doc.createTextNode(item.getBirthDate()));
			employee.appendChild(birthDate);
			
			// Create name node in contact node
			Element salary = doc.createElement("salary");
			salary.appendChild(doc.createTextNode(String.valueOf(item.getSalary())));
			employee.appendChild(salary);
			
			// Create name node in contact node
			Element address = doc.createElement("address");
			address.appendChild(doc.createTextNode(item.getAddress()));
			employee.appendChild(address);
			
			// Create name node in contact node
			Element departmentId = doc.createElement("departmentid");
			departmentId.appendChild(doc.createTextNode(String.valueOf(item.getDepartmentId())));
			employee.appendChild(departmentId);
			
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
		
		System.out.println("Employee saved");
	}
}
