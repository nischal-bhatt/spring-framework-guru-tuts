package sfg1.sfg1.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import sfg1.sfg1.di.controllers.ConstructorInjectedController;
import sfg1.sfg1.di.controllers.I18nController;
import sfg1.sfg1.di.controllers.MyController;
import sfg1.sfg1.di.controllers.PropertyInjectedController;
import sfg1.sfg1.di.controllers.SetterInjectedcontroller;
import sfg1.sfg1.di.controllers.I18nController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
	   
		I18nController c = (I18nController) ctx.getBean("i18nController");
		System.out.println(c.sayHello());
		
		MyController myController = (MyController)ctx.getBean("myController");
	
	  // String greeting = myController.sayHello();
	   
	   System.out.println("------  Primary Bean");
	   System.out.println(myController.sayHello());
	   
	   System.out.println("------- Property");
	   
	   PropertyInjectedController p = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
	   System.out.println(p.getGreeting());
	   
	   System.out.println("------- setter");
	   
	   SetterInjectedcontroller s = (SetterInjectedcontroller) ctx.getBean("setterInjectedcontroller");
	   
	   System.out.println(s.getGreeting());
	   
	   System.out.println("------- constructor");
	   
	   ConstructorInjectedController cjs = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
	   
	   System.out.println(cjs.getGreeting());
	}

}
