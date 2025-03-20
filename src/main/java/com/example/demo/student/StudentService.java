package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

import static java.util.List.*;
//@Component
@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
}
