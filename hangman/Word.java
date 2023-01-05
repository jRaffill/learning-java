package java21.hangman;

public class Word {
	public String word;
	int letters;
	char[] wordArray;
	public boolean guessed;
	public char[] displayWord;

	
	
	Word(String inputWord) {
		word = inputWord;
		letters = word.length();
		wordArray = new char[letters];
		displayWord = new char[letters];
		
		for (int i = 0; i < letters; i++) {
			displayWord[i] = '_';
		}	
		for (int i = 0; i < letters; i++) {
			wordArray[i] = word.charAt(i);
		}
	}

	void guessLetter(char letter) {
		guessed = true;
		for (int i = 0; i < letters; i++) {
			if (letter == wordArray[i]) {
				displayWord[i] = letter;
			}
			if (displayWord[i] == '_') {guessed = false;}
		}
	}
	
	void print() {
		String toPrint = "";
		for (int i = 0; i < letters; i++) {
			toPrint += displayWord[i] + " ";
		}
		System.out.println(toPrint);
	}
	
}
