package number_guessing;

/**
 * Main class of Guessing Game.
 * @author Pappim Pipatkasrira
 * @version 2017.01.20
 */

public class User {
	
	public static void main(String[] args){
		GuessingGame game = new GuessingGame(20);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}
	
}
