package com.example.demo.Student;

import java.time.LocalDate;
import java.util.List;

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
