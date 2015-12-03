package org.game.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;


public class Game {
	private int secretNum;
//	@Digits(integer=3, fraction=0, message="{javax.validation.constraints.Digits.message}")
	
	@Digits(integer=3, fraction=0, message="{typeMismatch}")
	private int guess;
	private int attempt;
	
	private Message message;
	
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	public int getSecretNum() {
		return secretNum;
	}
	public void setSecretNum(int secretNum) {
		this.secretNum = secretNum;
	}
	public int getGuess() {
		return guess;
	}
	public void setGuess(int guess) {
		this.guess = guess;
	}
	public int getAttempt() {
		return attempt;
	}
	public void setAttempt(int attempt) {
		this.attempt = attempt;
	}
	
}
