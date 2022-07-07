package sfg1.sfg1.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import sfg1.sfg1.di.services.GreetingService;

@Component
public class SetterInjectedcontroller {

	
	private GreetingService greetingService;

	@Qualifier("setterInjectedGreetingService")
    @Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting()
	{
		return greetingService.sayGreeting();
	}
}
