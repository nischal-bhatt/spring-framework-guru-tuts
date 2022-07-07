package sfg1.sfg1.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("EN")
@Component("i18nService")
public class i18nEnglishGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "hello world english";
	}

}
