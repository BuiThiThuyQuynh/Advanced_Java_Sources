package exercise62;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import exercise62.Word;

/**
 * @author Bui Thi Thuy Quynh
 * @since 2016-09-14
 * @version 1.0
 * 
 * This is class manages the information of list word from a paragraph.
 */
public class ManagementWord {

	Set<Word> listWord = new HashSet<Word>();
	
	public ManagementWord() {
		
	}

	public ManagementWord(Set<Word> listWord) {
		this.listWord = listWord;
	}
	
	public Set<Word> getListWord() {
		return listWord;
	}

	public void setListWord(Set<Word> listWord) {
		this.listWord = listWord;
	}

	/**
	  * This method is used to add a word to list from paragraph
	  * @param word Word is added.
	  * @return Nothing.
	  */
	public void addWord(Word word) {
		listWord.add(word);
	}
	
	/**
	 * This method is used to search a word to paragraph
	 * @param word Word want to search
	 * @return Word This is information of word was found. 
	 * 		If word was not found, method will return null.
	 */
	public Word getWord(String word) {
		for (Word item : listWord) {
			if(item.getWord().equals(word)) {
				return item;
			}
		}
		return null;
	}
	
	/**
	  * This method is used to update word's frequency.
	  * @param word Word was updated.
	  * @return Nothing.
	  */
	public void updateWord(String word) {
		Word w = getWord(word);
		listWord.remove(w);
		listWord.add(new Word(w.getWord(), w.getFrequency() + 1));
	}
	
	/**
	 * This method is used to get list word in paragraph.
	 * @param No.
	 * @return list word in paragraph.
	 */
	@Override
	public String toString() {
		String result = "===== LIST WORD IN PARAGRAPH =====\n";
		result += "WORD\tFREQUENCE\n";
		ArrayList<Word> list = new ArrayList<Word>(listWord);
		Collections.sort(list);
		for (Word word : list) {
			result += word.toString();
		}
		return result;
	}
}
