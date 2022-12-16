package com.example.demo.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {


    @GetMapping
    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "Nithin",
                        "nithin.xavier@gmail.com",
                        LocalDate.of(1998,11,22),
                        24 )
        );
    }
}
