package exercise26;

/**
 * @author Bui Thi Thuy Quynh
 * @date 08/09/2016
 * @version 1.0
 * 
 * @description Class manages the information of an word
 */
public class Word implements Comparable<Word> {

	private String word;
	private int frequency ;
	
	public Word() {
		
	}

	public Word(String word, int frequency) {
		this.word = word;
		this.frequency = frequency;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	
	/**
	 * @description get the information of an word
	 * @return string about information of an word
	 */
	@Override
	public String toString() {
		String result = getWord() + "\t" + getFrequency() + "\n";
		return result;
	}
	
	/**
	 * @description override compareTo method to compare two CD object
	 * @return 
	 */
	@Override
	public int compareTo(Word o) {
		return (this.word).compareTo(o.word);
	}
	
}
