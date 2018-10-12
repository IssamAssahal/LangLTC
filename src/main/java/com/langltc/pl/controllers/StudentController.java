package com.langltc.pl.controllers;

import com.langltc.pl.models.Student;
import com.langltc.pl.repositories.StudentRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

/**
 * Created by Issam As-sahal ISA On 10/5/2018
 * 1:09 PM
 **/
@Log
@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @GetMapping(path = {"/", ""} /*, produces = "application/json"*/)
    public ResponseEntity<List<Student>> getStudent() {
        log.info("List all the student");
        List<Student> studentRepositoryAll = studentRepository.findAll();
        return new ResponseEntity<>(studentRepositoryAll, HttpStatus.OK);
    }


    @GetMapping(path = "/id/{id}")
    public ResponseEntity<Optional<Student>> getStudentById(@PathVariable Long id) {
        log.info("Search for student by id");
        Optional<Student> student = studentRepository.findById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping(path = "/name/{name}")
    public Optional<Student> getStudentByName(@PathVariable String name) {
        log.info("Search for student by name");
        return studentRepository.findByFirstNameIgnoreCase(name);
    }

    @GetMapping(path = "/lastName/{lastName}")
    public Optional<Student> getStudentByLastName(@PathVariable String lastName) {
        log.info("Search for student by LastName");
        return studentRepository.findByLastNameIgnoreCase(lastName);
    }

    @GetMapping(path = "/registerDate/{dateVariable}")
    public Optional<Student> getStudentByRegisterDate(@PathVariable String dateVariable) {
        log.info("Register Date Before conversion from String to LocalDate " + dateVariable);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateVariable, formatter);
        log.info("Register Date after conversion from String to LocalDate " + date);
        return studentRepository.findByRegisterDate(date);

    }

    @GetMapping(path = "/count")
    public long getStudentCount() {
        log.info("Count all the students");
        return studentRepository.count();
    }

    @PostMapping(path = "/")
    public ResponseEntity<Student> addStudent(@Valid @RequestBody Student student) {
        log.info("Add student");
        Student student1 = studentRepository.save(student);
        return new ResponseEntity<>(student1, HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> addStudent(@PathVariable long id) {
        log.info("Add student");
        studentRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    public void writeExam() {
        String a = null;
        if (a != null) {
            
        }
    }

}

