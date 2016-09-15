package exercise26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import exercise26.Word;

public class MainManagementParagraph {
	
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
			//	word = new Word(managementWord.getWord(split[i]).getWord(), managementWord.getWord(split[i]).getFrequency());
				managementWord.updateWord(split[i]);
			}
		}
		
		System.out.println(managementWord.toString());
		
	}
	
	/**
	 * @description show information for searching word in paragraph
	 * @param paragraph
	 * @param input
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
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		ManagementWord listWord = new ManagementWord();
		try {
			// Enter paragraph
			System.out.println("Enter paragraph: ");
			String paragraph = input.readLine();
			
			// print word and frequency of word in paragraph
			splitParagraph(paragraph, listWord);
			
			// Search a word
			System.out.println("============================\n");
			searchWord(listWord, input);
			
		} catch (IOException ex) {
			System.out.println("Exception: " + ex);
		}

	}

}
