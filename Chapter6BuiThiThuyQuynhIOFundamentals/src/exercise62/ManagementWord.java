package exercise62;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import exercise62.Word;

/**
 * @author Bui Thi Thuy Quynh
 * @date 08/09/2016
 * @version 1.0
 * 
 * @description Class manages the information of an student
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
	  * @description function for addition a employee to list employee
	  * @param0 id of student
	  * @param1 student want to add
	  */
	public void addWord(Word word) {
		listWord.add(word);
	}
	
	/**
	 * @description function for searching a word to dictionary
	 * @param word want to search
	 * @return information of word was found
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
	  * @description function for addition a employee to list employee
	  * @param0 id of student
	  * @param1 student want to add
	  */
	public void updateWord(String word) {
		Word w = getWord(word);
		listWord.remove(w);
		listWord.add(new Word(w.getWord(), w.getFrequency() + 1));
	}
	
	/**
	 * @description get list word in diction
	 * @return list word in diction
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
