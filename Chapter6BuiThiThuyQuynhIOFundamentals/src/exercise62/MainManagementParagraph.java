package exercise62;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import exercise62.Word;

/**
 * @author Bui Thi Thuy Quynh
 * @since 2016-09-14
 * @version 1.0
 * 
 * This is class count word's frequency in paragraph and search a word in paragraph.
 */
public class MainManagementParagraph {
	
	/**
	 * This method is used to read content of paragraph from text file.
	 * @param filePath This is path of text file read.
	 * @return String This is content of text file.
	 */
	public static String readFile(String filePath) {
		String result = "";
		try (BufferedReader in = new BufferedReader(new 
				FileReader(filePath))) {
			while (in.readLine() != null) {
				result += in.readLine();
			}
			
			in.close();
		}
		catch (IOException ex) {
			System.out.println("Exception: " + ex.getMessage());
		}
		
		return result;
	}
	
	/**
	 * This method is used to count word's frequency in paragraph 
	 * 	and print word + frequency on the screen.
	 * @param input This is paragraph was read from text file.
	 * @param managementWord This is class handling words was split from paragraph.
	 * @return Nothing.
	 */
	public static void splitParagraph(String input, ManagementWord managementWord) {
		String[] split = input.split(" [\n\t]?");
		Word word;
		int n = split.length;
		for (int i = 0; i < n; i++) {
			if (managementWord.getWord(split[i]) == null) {
				word = new Word(split[i], 1);
				managementWord.addWord(word);
			}
			else {
				managementWord.updateWord(split[i]);
			}
		}
		
		System.out.println(managementWord.toString());
		
	}
	
	/**
	 * This method is used to show information for searching word in paragraph
	 * @param managementWord This is class handling words was split from paragraph.
	 * @return Nothing.
	 * @throws IOException
	 */
	public static void searchWord(ManagementWord managementWord, BufferedReader input) throws IOException {
		// Check list word in dictionary is null --> allow user add new word to dictionary
		// Else application require user enter key word for searching and show result. 
		boolean again = true;
		while (again) {
			if (managementWord.getListWord().size() == 0)
				System.out.println("No word in list to search");
			else {
				System.out.println("Enter word want to search: ");
				String wordSearch = input.readLine();
				
				Word wordFound = managementWord.getWord(wordSearch);
				
				System.out.println("Search result: ");
				if (wordFound == null)
					System.out.println(wordSearch + " was not found");
				else
					System.out.println(wordFound.toString());
			}
			
			System.out.println("Do you continue searching?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			
			int choose = Integer.parseInt(input.readLine());
			while (choose <= 0 || choose > 2) {
				System.out.println("Please choose 1 or 2");
				System.out.println("Do you continue searching?");
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
				System.out.println("Application ended");
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		ManagementWord listWord = new ManagementWord();
		String filePath = "src/exercise62/document.txt";
		try {
			// Read paragraph from text file
			String contentFile = readFile(filePath);
			
			// Handling paragraph and print word + frequency of word in paragraph on the screen.
			splitParagraph(contentFile, listWord);
			
			// Search a word
			System.out.println("============================\n");
			searchWord(listWord, input);
			
		} catch (IOException ex) {
			System.out.println("Exception: " + ex);
		}

	}

}
