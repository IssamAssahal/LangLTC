package com.langltc.pl.repositories;

import com.langltc.pl.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by Issam As-sahal ISA On 10/5/2018
 * 1:52 PM
 **/


public interface StudentRepository extends JpaRepository<Student,Long> {
}
