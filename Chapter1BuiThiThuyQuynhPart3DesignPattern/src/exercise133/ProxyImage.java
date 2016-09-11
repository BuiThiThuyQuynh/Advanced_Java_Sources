package exercise133;

/**
 * The ProxyImage class is used to display a real image
 *	 on the screen.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-11
 */
public class ProxyImage extends Image {

	private RealImage realImage;
	private String fileName;
	
	public ProxyImage() {
		
	}

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	public RealImage getRealImage() {
		return realImage;
	}

	public void setRealImage(RealImage realImage) {
		this.realImage = realImage;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	/**
	 * This method is used to display a image.
	 * @param No.
	 * @return Nothing.
	 */
	@Override
	public void display() {
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		
		realImage.display();
	}
}
