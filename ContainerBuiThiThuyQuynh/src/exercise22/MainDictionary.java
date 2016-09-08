package exercise22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Bui Thi Thuy Quynh
 * @date 07/09/2016
 * @version 1.0
 * 
 * @description Class handles for others classes about dictionary
 */
public class MainDictionary {

	/**
	 * @description function show menu for user choose
	 * @param0 input 
	 * @param1 dictionary
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void showMenu(BufferedReader input, Dictionary dictionary) throws NumberFormatException, IOException {
		// Show menu
		System.out.println("======== MENU ==========");
		System.out.println("1. View dictionary");
		System.out.println("2. Add word");
		System.out.println("3. Search word");
		System.out.println("4. Remove word");
		System.out.println("5. Exit");
		
		// Check choosing of user and show information for corresponding action 
		int choose = Integer.parseInt(input.readLine());
		while (choose <= 0 || choose > 5) {
			System.out.println("Please choose from 1 to 5");
			System.out.println("CHOOSE");
			System.out.println("1. View dictionary");
			System.out.println("2. Add word");
			System.out.println("3. Search word");
			System.out.println("4. Remove word");
			System.out.println("5. Exit");
			choose = Integer.parseInt(input.readLine());
		}

		switch (choose) {
		case 1:
			viewDictionary(dictionary, input);
			break;
		case 2:
			addWord(dictionary, input);
			break;
		case 3:
			searchWord(dictionary, input);
			break;
		case 4:
			removeWord(dictionary, input);
			break;
		case 5:
		default:
			System.out.println("Application ended");
			break;
		}
	}
	
	/**
	 * @description show list word in dictionary
	 * @param0 dictionary
	 * @param1 input
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void viewDictionary(Dictionary dictionary, BufferedReader input) throws NumberFormatException, IOException {
		// Check list word in dictionary not null --> show list word in dictionary
		// Else application ask user want to add new word or not. 
		// 		If user choose yes, application will allow user add new word to dictionary
		if (dictionary.getDictionary().size() != 0)
			System.out.println(dictionary.toString());
		else {
			System.out.println("Dictionary do not have word to view");
			
			System.out.println("Do you add new word to dictionay?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			
			int choose = Integer.parseInt(input.readLine());
			while (choose <= 0 || choose > 2) {
				System.out.println("Please choose 1 or 2");
				System.out.println("Do you add new word to dictionay?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				choose = Integer.parseInt(input.readLine());
			}
			
			switch (choose) {
			case 1:
				addWord(dictionary, input);
				break;
			case 2:
			default:
				break;
			}
		}
	}
	
	/**
	 * @description show information for addition new word to dictionary
	 * @param dictionary
	 * @param input
	 * @throws IOException
	 */
	public static void addWord(Dictionary dictionary, BufferedReader input) throws IOException {
		boolean again = true;
		Word word;
		
		// Enter the information for new word and allow user continue entering if user want
		while (again) {
			System.out.println("Enter word: ");
			String english = input.readLine();
			
			System.out.println("Enter meaning: ");
			String vietnamese = input.readLine();
			
			word = new Word(english, vietnamese);
			dictionary.addWord(word);
			viewDictionary(dictionary, input);
			
			System.out.println("Do you continue add new word?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			
			int choose = Integer.parseInt(input.readLine());
			while (choose <= 0 || choose > 2) {
				System.out.println("Please choose 1 or 2");
				System.out.println("Do you continue add new word?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				choose = Integer.parseInt(input.readLine());
			}
			
			switch (choose) {
			case 1:
				continue;
			case 2:
			default:
				again = false;
				break;
			}
		}
		
		showMenu(input, dictionary);
	}
	
	/**
	 * @description show information for searching word in dictionary
	 * @param dictionary
	 * @param input
	 * @throws IOException
	 */
	public static void searchWord(Dictionary dictionary, BufferedReader input) throws IOException {
		// Check list word in dictionary is null --> allow user add new word to dictionary
		// Else application require user enter key word for searching and show result. 
		if (dictionary.getDictionary().size() == 0)
			viewDictionary(dictionary, input);
		else {
			System.out.println("Enter word want to search: ");
			String wordSearch = input.readLine();
			
			Word word = new Word(wordSearch, "");
			Word wordFound = dictionary.searchWord(word);
			
			System.out.println("Search result: ");
			if (wordFound == null)
				System.out.println(wordSearch + " was not found");
			else
				System.out.println(wordFound.toString());
		}
		
		showMenu(input, dictionary);
	}
	
	/**
	 * @description show information for deletion word in dictionary
	 * @param dictionary
	 * @param input
	 * @throws IOException
	 */
	public static void removeWord(Dictionary dictionary, BufferedReader input) throws IOException {
		// Check list word in dictionary is null --> allow user add new word to dictionary
		// Else application require user enter key word for deleting and show result. 
		if (dictionary.getDictionary().size() == 0)
			viewDictionary(dictionary, input);
		else {
			System.out.println("Enter word want to remove: ");
			String wordRemove = input.readLine();
			
			Word word = new Word(wordRemove, "");
			System.out.println("Remove result:");
			System.out.println(dictionary.deleteWord(word));
			viewDictionary(dictionary, input);
		}
		
		showMenu(input, dictionary);
	}

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
		Dictionary dictionary = new Dictionary();
		try {
			showMenu(input, dictionary);
		}
		catch (IOException | NumberFormatException ex) {
			System.out.println("Exception: " + ex);
		}
	}
}
