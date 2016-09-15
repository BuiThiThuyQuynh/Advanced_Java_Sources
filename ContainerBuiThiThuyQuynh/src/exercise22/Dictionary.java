package exercise22;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Bui Thi Thuy Quynh
 * @date 07/09/2016
 * @version 1.0
 * 
 * @description Class manages the information of list word
 */
public class Dictionary {

	private Set<Word> dictionary = new HashSet<Word>();
	
	public Dictionary() {
		
	}

	public Dictionary(Set<Word> dictionary) {
		this.dictionary = dictionary;
	}

	public Set<Word> getDictionary() {
		return dictionary;
	}

	public void setDictionary(Set<Word> dictionary) {
		this.dictionary = dictionary;
	}
	
	/**
	 * @description function for addition a word to dictionary
	 * @param information of word want to add
	 */
	public void addWord(Word word) {
		dictionary.add(word);
	}
	
	/**
	 * @description function for searching a word to dictionary
	 * @param word want to search
	 * @return information of word was found
	 */
	public Word searchWord(Word word) {
		for (Word item : dictionary) {
			if(item.getWord().equals(word.getWord())) {
				return item;
			}
		}
		return null;
	}
	
	/**
	 * @description function for deletion a word to dictionary
	 * @param word want to delete
	 * @return message inform word was removed or not
	 */
	public String deleteWord(Word word) {
		if (searchWord(word) != null) {
			dictionary.remove(searchWord(word));
			return word.getWord() + " was removed from dictonary";
		}
		return word.getWord() + " was not found";
	}
	
	/**
	 * @description get list word in diction
	 * @return list word in diction
	 */
	@Override
	public String toString() {
		String result = "===== LIST WORD IN DICTIONARY =====\n";
		
		for (Word word : dictionary) {
			result += word.toString();
		}
		return result;
	}
}
