package spring.guru.dependecyinjection.controllers;

import spring.guru.dependecyinjection.services.GreetingService;
import spring.guru.dependecyinjection.services.GreetingServiceImpl;

public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingServiceImpl greetingServiceImpl) {
        this.greetingService = greetingServiceImpl;
    }

    public String getGreeting() {
        return greetingService.getGreeting();
    }
}
