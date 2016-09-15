package exercise24;

import java.util.ArrayList;
import java.util.List;

/**
 * The PetManager<T> class is used to manage list cats.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-11
 */
public class PetManager<T> {

	private List<T> pets;
	
	public PetManager() {
		
	}

	public PetManager(List<T> pets) {
		this.pets = pets;
	}

	public List<T> getPets() {
		if (pets == null)
			pets = new ArrayList<>();
		return pets;
	}

	public void setPets(List<T> pets) {
		this.pets = pets;
	}
	
	
}
