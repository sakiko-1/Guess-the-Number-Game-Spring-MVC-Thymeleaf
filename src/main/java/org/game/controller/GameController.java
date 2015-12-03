package org.game.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.game.model.*;
import org.game.service.MessageService;

@Controller
public class GameController {

	private MessageService messageService = new MessageService();
	
	 @RequestMapping("/")
	 public String index(final Game game) {
		 game.setSecretNum(messageService.generateSecretNum());;
		 game.setAttempt(messageService.resetAttempt());
		 game.setMessage(new Message());
		 return "index";
	 }
	 
	 @RequestMapping(value="/guess", method=RequestMethod.POST)
     public String guess(@Valid final Game game, BindingResult bindingResult) {
		 System.out.println("number " + game.getGuess()); // test
		 System.out.println("attempt " + game.getAttempt()); // test
		 System.out.println("secretNumber " + game.getSecretNum()); // test

		 game.setMessage(messageService.checkUserGuess(game));
		 return "index";
     }
	 	 
}
