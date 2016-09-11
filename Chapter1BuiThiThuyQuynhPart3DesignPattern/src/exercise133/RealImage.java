package exercise133;

/**
 * The RealImage class is used to display a real image
 * 	on the screen.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-11
 */
public class RealImage extends Image {
	
	private String fileName;
	
	public RealImage() {
		loadFromDisk();
	}	

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk();
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
		System.out.println("Displaying " + fileName);
		
	}
	
	/**
	 * This method is used to wait when image is displaying.
	 * @param No.
	 * @return Nothing.
	 */
	public void loadFromDisk() {
		System.out.println("Loading " + fileName);
	}
}
