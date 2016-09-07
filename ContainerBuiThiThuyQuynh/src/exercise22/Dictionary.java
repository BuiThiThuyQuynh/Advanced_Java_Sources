package exercise22;

import java.util.HashSet;
import java.util.Set;

public class Dictionary {

	Set<Word> dictionary = new HashSet<Word>();
	
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
	
	public void addWord(Word word) {
		dictionary.add(word);
	}
	
	public Word searchWord(Word word) {
		for (Word item : dictionary) {
			if(item.getWord().equals(word.getWord())) {
				return item;
			}
		}
		return null;
	}
	
	public String deleteWord(Word word) {
		if (searchWord(word) != null) {
			dictionary.remove(searchWord(word));
			return word.getWord() + " was removed from dictonary";
		}
		return word.getWord() + " was not found";
	}
	
	@Override
	public String toString() {
		String result = "===== LIST WORD IN DICTIONARY =====\n";
		
		for (Word word : dictionary) {
			result += word.toString();
		}
		return result;
	}
}
