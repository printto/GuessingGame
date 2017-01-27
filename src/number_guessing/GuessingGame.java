package number_guessing;

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
	 * Get variables
	 */
	public int getSecret(){
		return secret;
	}
	
	public int getUpperbound(){
		return upperBound;
	}
	
	public int getCount(){
		return count;
	}

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
	public void setHint (int number){
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
