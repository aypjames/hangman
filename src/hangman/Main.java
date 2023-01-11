package hangman;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String[] wordsList = {    "abruptly",
			    "absurd",
			    "abyss",
			    "affix",
			    "askew",
			    "avenue",
			    "awkward",
			    "axiom",
			    "azure",
			    "bagpipes",
			    "bandwagon",
			    "banjo",
			    "bayou",
			    "beekeeper",
			    "blitz",
			    "blizzard",
			    "boggle",
			    "bookworm",
			    "boxcar",
			    "boxful",
			    "buffalo",
			    "buffoon",
			    "buxom",
			    "buzzard",
			    "buzzing",
			    "buzzwords",
			    "caliph",
			    "cobweb",
			    "croquet",
			    "crypt",
			    "curacao",
			    "cycle",
			    "daiquiri",
			    "disavow",
			    "dizzying",
			    "duplex",
			    "dwarves",
			    "embezzle",
			    "equip",
			    "espionage",
			    "exodus",
			    "faking",
			    "fishhook",
			    "fixable",
			    "fjord",
			    "flapjack",
			    "flopping",
			    "fluffiness",
			    "flyby",
			    "foxglove",
			    "frazzled",
			    "frizzled",
			    "fuchsia",
			    "funny",
			    "gabby",
			    "galaxy",
			    "galvanize",
			    "glowworm",
			    "glyph",
			    "gnarly",
			    "gnostic",
			    "gossip",
			    "grogginess",
			    "haiku",
			    "haphazard",
			    "hyphen",
			    "iatrogenic",
			    "icebox",
			    "injury",
			    "ivory",
			    "ivy",
			    "jackpot",
			    "jaundice",
			    "jawbreaker",
			    "jaywalk",
			    "jelly",
			    "jigsaw",
			    "jinx",
			    "jiujitsu",
			    "jockey",
			    "jogging",
			    "joking",
			    "jovial",
			    "joyful",
			    "juicy",
			    "jukebox",
			    "jumbo",
			    "kayak",
			    "kazoo",
			    "keyhole",
			    "khaki",
			    "kilobyte",
			    "kiosk",
			    "lengths",
			    "lucky",
			    "luxury",
			    "lymph",
			    "marquis",
			    "matrix",
			    "megahertz",
			    "microwave",
			    "mnemonic",
			    "mystify",
			    "nowadays",
			    "onyx",
			    "oxidize",
			    "oxygen",
			    "pajama",
			    "peekaboo",
			    "phlegm",
			    "pixel",
			    "pizazz",
			    "pneumonia",
			    "polka",
			    "psyche",
			    "puppy",
			    "puzzling",
			    "quartz",
			    "queue",
			    "quiz",
			    "quizzes",
			    "quorum",
			    "rhubarb",
			    "rhythm",
			    "rickshaw",
			    "schnapps",
			    "snazzy",
			    "sphinx",
			    "spritz",
			    "squawk",
			    "staff",
			    "strength",
			    "stretch",
			    "stronghold",
			    "stymied",
			    "subway",
			    "swivel",
			    "thriftless",
			    "topaz",
			    "transcript",
			    "transgress",
			    "transplant",
			    "twelfth",
			    "twelfths",
			    "unknown",
			    "unworthy",
			    "unzip",
			    "uptown",
			    "vaporize",
			    "vodka",
			    "voodoo",
			    "vortex",
			    "walkway",
			    "waltz",
			    "wave",
			    "wavy",
			    "waxy",
			    "wellspring",
			    "whiskey",
			    "whizzing",
			    "witchcraft",
			    "wizard",
			    "wyvern",
			    "xylophone",
			    "yachtsman",
			    "youthful",
			    "yummy",
			    "zephyr",
			    "zigzag",
			    "zipper",
			    "zodiac",
			    "zombie"};
		
		String word = wordsList[(int) (Math.random() * wordsList.length)];
	   
		char[] wordClue = new char[word.length()];
	    for (int i = 0; i < word.length(); i++) {
	        wordClue[i] = '_';
	    }
	    
	    Scanner scanner = new Scanner(System.in);
	    int lives = 7;
	    
	    String livesText;
	    
	    if (lives == 1) {
	    	livesText = "life";
	    } else {
	    	livesText = "lives";
	    }
	    
	    while (lives > 0) {
	    	System.out.println("");
	        System.out.print("The word: ");
	        for (int i = 0; i < wordClue.length; i++) {
	        	System.out.print(wordClue[i] + " ");
	        }
	        System.out.print("(" + wordClue.length + " letters)");
	        System.out.println("");
	        System.out.println("Guess a letter or word:");
	        String guess = scanner.nextLine().toLowerCase();
	        boolean correctGuess = false;
	        if(guess.length() == word.length()){
	            if(guess.equals(word)){
	                System.out.println("You win! The word was " + word);
	                break;
	            }
	            else{
	                lives--;
	    	    	System.out.println("");
	                HangingDrawing.hangingDrawing(lives);
	                System.out.println("Sorry, that's not the word.");
	                System.out.println("You have " + lives + " " + livesText + " left");
	            }
	        }
	        else{
	            for (int i = 0; i < word.length(); i++) {
	                if (word.charAt(i) == guess.charAt(0)) {
	                    wordClue[i] = guess.charAt(0);
	                    correctGuess = true;
	                }
	            }
	            if (!correctGuess) {
	                lives--;
	    	    	System.out.println("");
	                HangingDrawing.hangingDrawing(lives);
	                System.out.println("Sorry, the word does not contain " + guess);
	                System.out.println("You have " + lives + " " + livesText + " left");
	            }
	            if (!new String(wordClue).contains("_")) {
	                System.out.println("You win! The word was " + word);
	                break;
	            }
	        }
	        if(lives == 0) {
	            System.out.println("you lost, The word was "+ word);
	        }
	    }


	}

}
