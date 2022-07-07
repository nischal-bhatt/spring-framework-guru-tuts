package sfg1.sfg1.di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PrimaryGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "hello world - from the primary bean";
	}

}
