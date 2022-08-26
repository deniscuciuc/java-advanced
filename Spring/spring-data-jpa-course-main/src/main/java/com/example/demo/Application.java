package com.example.demo;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student maria = new Student(
                    "Maria",
                    "Heiko",
                    "maria@gmail.com",
                    24
            );

            Student john = new Student(
                    "John",
                    "Heiko",
                    "john@gmail.com",
                    24
            );

            Student kevin = new Student(
                    "Kevin",
                    "Joshua",
                    "kevin@gmail.com",
                    31
            );


            studentRepository.save(kevin);

            studentRepository.deleteById(kevin.getId());
        };
    }

}
