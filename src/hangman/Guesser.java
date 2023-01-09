package hangman;

public class Guesser {
	
	String word;
	int wordcount = 0;
	
	public Guesser(String word) {
		this.wordcount = word.length();
	}

}
