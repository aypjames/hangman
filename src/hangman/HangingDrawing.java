package hangman;

public class HangingDrawing {
	
	public static void hangingDrawing(int livesRemaining) {
		if (livesRemaining == 6) {
			System.out.println("__|___");
		}
		if (livesRemaining == 5) {
			System.out.println("  |   ");
			System.out.println("  |   ");
			System.out.println("  |   ");
			System.out.println("__|___");
		}
		if (livesRemaining == 4) {
			System.out.println("  |   ");
			System.out.println("  |   ");
			System.out.println("  |   ");
			System.out.println("  |   ");
			System.out.println("  |   ");
			System.out.println("  |   ");
			System.out.println("__|___");
		}
		if (livesRemaining == 3) {
			System.out.println("________");
			System.out.println("  |   ");
			System.out.println("  |   ");
			System.out.println("  |   ");
			System.out.println("  |   ");
			System.out.println("  |   ");
			System.out.println("  |   ");
			System.out.println("__|___");
		}
		if (livesRemaining == 2) {
			System.out.println("________");
			System.out.println("  |    |  ");
			System.out.println("  |    O");
			System.out.println("  |   ");
			System.out.println("  |   ");
			System.out.println("  |   ");
			System.out.println("  |   ");
			System.out.println("__|___");
		}
		if (livesRemaining == 1) {
			System.out.println("________");
			System.out.println("  |    |  ");
			System.out.println("  |    O");
			System.out.println("  |   /|\\");
			System.out.println("  |   ");
			System.out.println("  |   ");
			System.out.println("  |   ");
			System.out.println("__|___");
		}
		if (livesRemaining == 0) {
			System.out.println("________");
			System.out.println("  |    |  ");
			System.out.println("  |    O");
			System.out.println("  |   /|\\");
			System.out.println("  |    |");
			System.out.println("  |   / \\");
			System.out.println("  |   ");
			System.out.println("__|___");
		}
	}

}
