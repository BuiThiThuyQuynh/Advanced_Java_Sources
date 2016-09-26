package xmlfile;

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

import jdbc.CD;

/**
 * @author ThuyQuynh
 * @since 2016-09-19
 * @version 1.0
 * 
 * This is class manages connection connect to cd.xml file.
 */
public class ManagementCDByXML {

	List<CD> cds;
	
	public ManagementCDByXML() {
		
	}
	
	public List<CD> getCds() {
		return cds;
	}

	public void setCds(List<CD> cds) {
		this.cds = cds;
	}

	/** This method is used to get document of file from file path
	 * @param filePath This is path of XML file.
	 * @return Document This is document of XML file.
	 * @throws FileNotFoundException
	 * @throws SAXException
	 * @throws IOException
	 * @throws ParserConfigurationException
	 */
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
			rootElement = doc.createElement("store"); // create root
			doc.appendChild(rootElement);
		}
		return doc;
	}
	
	/**
	 * This method is used to get a CD from a node in XML file.
	 * @param node Node contain the information of CD.
	 * @return CD This is CD in node.
	 */
	private CD getCD(Node node) {
		CD cd = new CD();
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			Element element = (Element) node;
			cd.setId(Integer.parseInt(element.getElementsByTagName("id")
					.item(0).getChildNodes().item(0).getNodeValue()));
			cd.setName(element.getElementsByTagName("name")
					.item(0).getChildNodes().item(0).getNodeValue());
			cd.setSinger(element.getElementsByTagName("singer")
					.item(0).getChildNodes().item(0).getNodeValue());
			cd.setNumberSongs(Integer.parseInt(element.getElementsByTagName("numbersongs")
					.item(0).getChildNodes().item(0).getNodeValue()));
			cd.setPrice(Double.parseDouble(element.getElementsByTagName("price")
					.item(0).getChildNodes().item(0).getNodeValue()));
			
		}
		
		return cd;
	}
	
	/**
	 * This method is used to read list CDs from XML file and set them to list.
	 * @param filePath This is path of XML file.
	 * @return Nothing.
	 * @throws FileNotFoundException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	public List<CD> readCDs(String filePath) 
			throws FileNotFoundException, ParserConfigurationException, 
			SAXException, IOException {
		cds = new ArrayList<CD>();
		try {
			Document doc = getDocument(filePath);
			Element rootElement = doc.getDocumentElement();
			
			NodeList nodeList = rootElement.getElementsByTagName("cd");
			for (int i = 0; i < nodeList.getLength(); i++) {
				CD cd = getCD(nodeList.item(i));
				cds.add(cd);
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return cds;
	}
	
	/**
	 * This method is used to write list CDs to XML file.
	 * @param filePath This is path of XML file.
	 * @throws FileNotFoundException
	 * @throws SAXException
	 * @throws IOException
	 * @throws ParserConfigurationException
	 * @throws TransformerException
	 */
	public void writeCDs(String filePath) 
			throws FileNotFoundException, SAXException, 
			IOException, ParserConfigurationException,
			TransformerException {
		Document doc= getDocument(filePath);
		Element rootElement = doc.getDocumentElement();
		
		while (rootElement.hasChildNodes())
			rootElement.removeChild(rootElement.getFirstChild());
		
		for (CD item : cds) {
			// Create contact in cd node
			Element cd = doc.createElement("cd");
			rootElement.appendChild(cd);
			
			// Create name node in id node
			Element id = doc.createElement("id");
			id.appendChild(doc.createTextNode(String.valueOf(item.getId())));
			cd.appendChild(id);
			
			// Create name node in name node
			Element name = doc.createElement("name");
			name.appendChild(doc.createTextNode(item.getName()));
			cd.appendChild(name);
			
			// Create name node in singer node
			Element singer = doc.createElement("singer");
			singer.appendChild(doc.createTextNode(item.getSinger()));
			cd.appendChild(singer);
			
			// Create name node in numbersongs node
			Element numberSongs = doc.createElement("numbersongs");
			numberSongs.appendChild(doc.createTextNode(String.valueOf(item.getNumberSongs())));
			cd.appendChild(numberSongs);
			
			// Create name node in price node
			Element price = doc.createElement("price");
			price.appendChild(doc.createTextNode(String.valueOf(item.getPrice())));
			cd.appendChild(price);			
		}
		
		// Write document to XML file.
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
		
		System.out.println("File was saved");
	}
}
