package number_guessing;

public class User {
	
	public static void main(String[] args){
		GuessingGame game = new GuessingGame(20);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}
	
}
