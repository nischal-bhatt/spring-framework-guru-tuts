package sfg1.sfg1.di.controllers;

import org.springframework.stereotype.Controller;

import sfg1.sfg1.di.services.GreetingService;

@Controller
public class MyController {

	private final GreetingService greetingService;
	
	
	
	 public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}



	public String sayHello() 
	 {
		// System.out.println("hello");
		 
		 //return "hi folks";
		
		return greetingService.sayGreeting();
	 }
}
