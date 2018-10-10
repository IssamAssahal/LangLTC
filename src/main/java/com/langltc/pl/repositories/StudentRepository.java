package com.langltc.pl.repositories;

import com.langltc.pl.models.Student;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


/**
 * Created by Issam As-sahal ISA On 10/5/2018
 * 1:52 PM
 **/


public interface StudentRepository extends JpaRepository<Student,Long> {

    Optional <Student> findByFirstNameIgnoreCase(String name);
    long count();
}
