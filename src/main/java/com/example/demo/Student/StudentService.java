package com.example.demo.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
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
