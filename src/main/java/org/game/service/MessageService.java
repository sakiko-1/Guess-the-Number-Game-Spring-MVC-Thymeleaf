package org.game.service;

import java.util.InputMismatchException;
import java.util.Random;

import org.game.model.*;

public class MessageService {
	
	String messageTooSmall;
	String messageTooBig;
	String messageCorrect;
	String messageGameOver;
	
	// check user's guess and display message
	public Message checkUserGuess(Game game) {
		Message message = new Message();
		try {
			if(!(game.getMessage().isGameOver()) && (game.getAttempt() < 10)) {
				if(game.getGuess() < game.getSecretNum()) {
					message.setMessage("Too small!");
				} else if(game.getGuess() > game.getSecretNum()) {
					message.setMessage("Too big!");
				} else {
					message.setMessage("Correct!!! Congrats!!!");
					message.setGameOver(true);
				} game.setAttempt((game.getAttempt()+1));
				
			} else if(game.getMessage().isGameOver() && (game.getAttempt() >= 10)){
				message.setGameOver(true);
				message.setMessage("Game Over!!!");
			} else {
				message.setGameOver(true);
			}
		}
		catch (InputMismatchException e) {
			message.setMessage("Please enter a number only");
		}
		return message;
	}
	
	// generate a random secret number
	public int generateSecretNum() {
		Random rand = new Random();
		int secretNum = rand.nextInt(100) + 1;
		return secretNum;
	}
	
	// reset attempt
	public int resetAttempt() {
		int attempt = 0;
		return attempt;
	}
}
