package java21.hangman;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Board {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static Word word = new Word("aftershock");
	static int guesses = word.letters + 5;
	
	public static void main(String[] arguments) throws IOException {
		word.print();
		takeInput();
	}
	
	public static void takeInput() throws IOException {
		System.out.println("You have " + guesses + " guesses remaining.");
		System.out.println("Input your next guess: ");
		String guessString = input.readLine();
		char guess = guessString.charAt(0);
		word.guessLetter(guess);
		word.print();
		guesses--;
		if (word.guessed) {
			System.out.println("You guessed \"" + word.word + "\" correctly.");
		}
		else if (guesses == 0) {
			System.out.println("You are out of guesses. The word was \"" + word.word + "\".");
		} else {
			takeInput();
		};
	}
}
