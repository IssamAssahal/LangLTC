package com.langltc.pl.repositories;


import com.langltc.pl.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Issam As-sahal ISA On 10/5/2018
 * 6:50 PM
 **/
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
