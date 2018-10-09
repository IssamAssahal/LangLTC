package com.langltc.pl.controllers;

import com.langltc.pl.models.Employee;
import com.langltc.pl.repositories.EmployeeRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * Created by Issam As-sahal ISA On 10/5/2018
 * 6:47 PM
 **/
@Log
@RestController
@RequestMapping("/Employee")
public class EmployeeController {
    @Autowired
    EmployeeRepository  employeeRepository;

    @RequestMapping("/getEmployee")
    public List<Employee> getEmployee(){

        log.info("List all the Employees");
        return employeeRepository.findAll() ;
    }
}
