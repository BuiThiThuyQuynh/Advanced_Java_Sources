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

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DepartmentManagement {

	List<Department> departments;
	
	public DepartmentManagement(String filePath) throws FileNotFoundException, ParserConfigurationException, SAXException, IOException {
		readFile(filePath);
	}
	
	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
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
		}
		else {
			rootElement = doc.createElement("company"); // create root
			doc.appendChild(rootElement);
		}
		return doc;
	}
	
	private Department getDepartment(Node node) {
		Department department = new Department();
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			Element element = (Element) node;
			department.setId(Integer.parseInt(element.getElementsByTagName("id")
					.item(0).getChildNodes().item(0).getNodeValue()));
			department.setName(element.getElementsByTagName("name")
					.item(0).getChildNodes().item(0).getNodeValue());
		}
		
		return department;
	}
	
	public void readFile(String filePath) 
			throws FileNotFoundException, ParserConfigurationException, 
			SAXException, IOException {
		departments = new ArrayList<Department>();
		try {
			Document doc = getDocument(filePath);
			Element rootElement = doc.getDocumentElement();
			
			NodeList nodeList = rootElement.getElementsByTagName("department");
			for (int i = 0; i < nodeList.getLength(); i++) {
				Department department = getDepartment(nodeList.item(i));
				departments.add(department);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public String toString() {
		String result = "====== LIST DEPARTMENT ==========\n";
		result += "ID\tName\n";
		for (int i = 0; i < departments.size(); i++) {
			result += (i + 1) + ". \t" + departments.get(i).toString();
		}
		return result;
	}
}
