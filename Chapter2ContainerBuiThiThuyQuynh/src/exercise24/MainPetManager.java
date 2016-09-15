package exercise24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Manage pets in shop</h1>
 * The MainPetManager program implements an application that
 * 	shows all of pets in shop
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-11
 */
public class MainPetManager {

	/**
	 * This is the main method which is used to show all of pets
	 * 	in shop.
	 * @param args Unused.
	 * @return Nothing.
	 * @exception IOException On input error.
	 * @see IOException.
	 */
	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			// Enter list name of dog
			System.out.println("Enter list name of dog seperate by commas:");
			String listDog = input.readLine();
			
			// Enter list name of cat
			System.out.println("Enter list name of cat seperate by commas:");
			String listCat = input.readLine();
			
			// Create to list dog and cat
			PetManager<Dog> managerDog = new PetManager<Dog>();
			PetManager<Cat> managerCat = new PetManager<Cat>();
			
			String[] splitDog = listDog.split(",");
			String[] splitCat = listCat.split(",");
			
			// Add list dog and cat to managerPets
			for (String dogName : splitDog) {
				managerDog.getPets().add(new Dog(dogName.trim()));
			}
			
			for (String catName : splitCat) {
				managerCat.getPets().add(new Cat(catName.trim()));
			}
			
			// Add list dog and cat to a same list.
			List<String> shop = new ArrayList<String>();
			
			for (Dog dog : managerDog.getPets()) {
				shop.add("Dog: " + dog.getName());
			}
			
			for (Cat cat : managerCat.getPets()) {
				shop.add("Cat: " + cat.getName());
			}
			
			// Print list dog and cat in shop
			System.out.println("======= LIST PET ===========");
			for (String pet : shop) {
				System.out.println(pet);
			}
		}
		catch (IOException ex) {
			System.out.println("Exception: " + ex);
		}
	}

}
