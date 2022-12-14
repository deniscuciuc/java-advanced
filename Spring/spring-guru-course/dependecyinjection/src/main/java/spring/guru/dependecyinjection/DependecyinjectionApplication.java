package spring.guru.dependecyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spring.guru.dependecyinjection.controllers.MyController;
import spring.guru.dependecyinjection.controllers.PropertyInjectedController;

@SpringBootApplication
public class DependecyinjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependecyinjectionApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("_________ Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
	}
}
