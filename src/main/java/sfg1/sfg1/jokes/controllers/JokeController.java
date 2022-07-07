package sfg1.sfg1.jokes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sfg1.sfg1.jokes.services.JokeService;

@Controller
public class JokeController {

	private final JokeService jokeService;

	
	public JokeController(JokeService jokeService) {
		
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/",""})
	public String showJoke(Model model)
	{
		model.addAttribute("joke",jokeService.getJokes());
		
		return "index";
	}
	
	
}
