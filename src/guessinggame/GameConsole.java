package guessinggame;

import java.util.Scanner;

/**
 * Plays game using input from a user.
 * @author Pappim Pipatkasrira
 * @version 2017.01.20
 */

public class GameConsole {

	Scanner input = new Scanner(System.in);

	/**
	 * Start the game
	 * @param game - GuessingGame that received from main class
	 */
	public int play (GuessingGame game){		
		boolean checkGuess = true;
		int answer;
		do{
			System.out.print(game.getHint() + "What is your guess? ");
			answer = input.nextInt();
			checkGuess = game.guess(answer);
		}while(!checkGuess);
		System.out.print(game.getHint());
		return answer;
	}

}
