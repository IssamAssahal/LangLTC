package com.langltc.pl.controllers;

import com.langltc.pl.models.Student;
import com.langltc.pl.repositories.StudentRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Optional;

/**
 * Created by Issam As-sahal ISA On 10/5/2018
 * 1:09 PM
 **/
@Log
@RestController
@RequestMapping(path = "/")
public class StudentController {

    final
    StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @GetMapping(path = "/students"/*, produces = "application/json"*/)
    public List<Student> getStudent() {
        log.info("List all the student");
         return studentRepository.findAll();
    }

    @GetMapping(path = "/students/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id) {
        log.info("List all the student");
        return studentRepository.findById(id);
    }




}

