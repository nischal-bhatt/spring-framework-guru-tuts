package sfg1.sfg1.di.services;

import org.springframework.stereotype.Component;

@Component
public class ConstructorGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello World - Constructor";
	}

}
