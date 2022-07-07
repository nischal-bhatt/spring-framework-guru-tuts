package sfg1.sfg1.di.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import sfg1.sfg1.di.services.GreetingService;

@Component
public class ConstructorInjectedController {

	
	private final GreetingService greetingService;

	public ConstructorInjectedController(@Qualifier("constructorGreetingService")GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting()
	{
		return greetingService.sayGreeting();
	}
	
}
