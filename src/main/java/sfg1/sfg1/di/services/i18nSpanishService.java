package sfg1.sfg1.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"ES","default"})
@Component("i18nService")
public class i18nSpanishService implements GreetingService{

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hola Munda";
	}

}
