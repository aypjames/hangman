package hangman;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "hello";
		int guessCounter = 0;
		
		char[] guessingWord = word.toCharArray();
		
		
		for (int i = 0; i < guessingWord.length; i++) {
			System.out.print("_ ");
		}
		
		char userGuess = 'h';
		String userGuess2 = "people";
	
		
		// a function to convert the a guessed word into a chars array and to lowercase
		// a function to convert to check if word matches
		// a function to print out dashes for the length of the word
		
		
//		for (int i = 0; i < guessingWord.length; i++) {
//			System.out.print(guessingWord[i]);
//		}
		
		for (char i : guessingWord) {
			if (i == userGuess) {
				System.out.print(i + " ");
			} else {
				System.out.print("_ ");
			}
		}
		
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("What is your guess?");
//		
//		String userGuess1 = s.nextLine();
//		
//		if (userGuess1.length() > 1) {
//			System.out.println("You have guessed the whole word: " + userGuess1);
//		} else {
//			System.out.println("You have guessed the letter: " + userGuess1);
//		}
//		
//		System.out.println("What is your next guess?");
//		String userGuess2 = s.nextLine();
//		
//		System.out.println("What is your next guess?");
//		String userGuess3 = s.nextLine();
//		
//		System.out.println("What is your next guess?");
//		String userGuess4 = s.nextLine();
//		
//		System.out.println("What is your next guess?");
//		String userGuess5 = s.nextLine();
//		
//		System.out.println("What is your next guess?");
//		String userGuess6 = s.nextLine();
//		
//		System.out.println("What is your next guess?");
//		String userGuess7 = s.nextLine();
	}

}
