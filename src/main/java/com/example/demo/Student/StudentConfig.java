package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
                 Student nithin = new Student(
                         "Nithin",
                         "nithin.xavier@gmail.com",
                         LocalDate.of(1998,11,22),
                         24
                 );
                 Student neethu = new Student(
                        "Neethu",
                        "neethu.xavier@gmail.com",
                        LocalDate.of(2001,11,24),
                        20
            );
                 repository.saveAll(
                         List.of(nithin,neethu)
                 );
        };
    }
}
