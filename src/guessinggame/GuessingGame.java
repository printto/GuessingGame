package guessinggame;

import java.util.Random;

/**
 * Game of guessing a secret number.
 * @author Pappim Pipatkasrira
 * @version 2017.01.20
 */

public class GuessingGame {

	/**
	 * all variables here
	 */
	int secret = 0;
	int upperBound = 0;
	int count = 0;
	String hint = "I'm thinking of a number between 1 and XX\n";
	
	/**
	 * Initialize new game.
	 * Initialize secret and hint
	 * @param upperBound Upperbound that user inputs.
	 */
	public GuessingGame(int upperBound) {
		this.upperBound = upperBound;
		secret = getRandomNumber(upperBound);
		hint = "I'm thinking of a number between 1 and "+upperBound+"\n";
	}
	
	/**
	 * @return Upper bound of the secret
	 */
	public int getUpperbound(){
		return upperBound;
	}
	
	/**
<<<<<<< HEAD:src/guessinggame/GuessingGame.java
	 * @return count of the game
=======
	 * Initialize new game.
	 * Initialize secret and hint
	 * @param upperBound Upperbound that user inputs.
>>>>>>> a8631cee1c8cd433676325e964a87a7136fbde78:src/number_guessing/GuessingGame.java
	 */
	public int getCount(){
		return count;
	}
	
	/**
	 * Input guess number and calculate boolean
	 * @param number The answer that user inputs.
	 * @return guess Return a results in boolean.
	 */
	public boolean guess (int number){
		count++;
		if(secret == number){
			hint = "Correct. The secret is "+number+".\nYou used "+count+" guesses.\n";
			return true;
		}
		else{
			setHint(number);
			return false;
		}
	}
	
	/**
	 * Set hint to too small or too big
	 * @param number Number that user input, revieved from "guess" method.
	 */
	private void setHint (int number){
		if(secret > number){
			hint = "Sorry, your guess is too small.\n";
		}
		else{
			hint = "Sorry, you're guess is too large.\n";
		}
	}
	
	/**
	 * for retuning hint as a String
	 * @return hint returned as a String
	 */
	public String getHint(){
		return hint;
	}

	/**
	 * Generate random number
	 * @param limit Upperbound
	 * @return randomNumber
	 */
	private int getRandomNumber(int limit){
		long seed = System.currentTimeMillis( );
		Random rand = new Random( seed );
		return rand.nextInt(limit) + 1;
	}


}
