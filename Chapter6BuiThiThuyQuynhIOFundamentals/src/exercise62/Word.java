package exercise62;

/**
 * @author Bui Thi Thuy Quynh
 * @since 2016-09-14
 * @version 1.0
 * 
 * This is class manages the information of an word with word's frequency.
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
	 * This method is used to get the information of an word
	 * @param No.
	 * @return string about information of an word
	 */
	@Override
	public String toString() {
		String result = getWord() + "\t" + getFrequency() + "\n";
		return result;
	}
	
	/**
	 * This method is used to override compareTo method to compare two CD object
	 * @param o This is object which want to compare with this.
	 * @return int This is result of comparison.
	 */
	@Override
	public int compareTo(Word o) {
		return (this.word).compareTo(o.word);
	}
	
}
