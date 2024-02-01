package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
           Student john =  new Student(
                    "Bill",
                    "john@gmail.com",
                    LocalDate.of(2000, JANUARY, 4)

            );

            Student aaron =  new Student(
                    "Carter",
                    "aaron@gmail.com",
                    LocalDate.of(2001, MARCH, 14)

            );

            studentRepository.saveAll(List.of(john, aaron));
        };
    }
}
