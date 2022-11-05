package spring.guru.dependecyinjection.controllers;

import org.springframework.stereotype.Controller;


@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello");

        return "Hi Folks";
    }
}
