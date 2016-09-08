package exercise22;

/**
 * @author Bui Thi Thuy Quynh
 * @date 07/09/2016
 * @version 1.0
 * 
 * @description Class manages the information of an word
 */
public class Word {

	private String word;
	private String meaning;
	
	public Word() {
		
	}

	public Word(String word, String meaning) {
		this.word = word;
		this.meaning = meaning;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	
	/**
	 * @description get the information of an word
	 * @return string about information of an word
	 */
	@Override
	public String toString() {
		String result = getWord() + "\t" + getMeaning() + "\n";
		return result;
	}
}
