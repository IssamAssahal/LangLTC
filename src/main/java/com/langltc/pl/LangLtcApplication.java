package com.langltc.pl;

import com.langltc.pl.models.Employee;
import com.langltc.pl.models.Student;
import com.langltc.pl.models.utilities.DateUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

@SpringBootApplication
public class LangLtcApplication {

    public static void main(String[] args) {
        SpringApplication.run(LangLtcApplication.class, args);


        //Object Employee build by Lombok Builder Annotatoion
//        Employee employee=new Employee.EmployeeBuilder().department("kjkj").build();
        Employee employee = Employee.builder()
                .employeeId(10)
                .department("gfgfg")
                .firstName("gfgfg")
                .middleName("gfgfg")
                .lastName("gfgfg")
                .age(45)
                .address("gfgfg")
                .phoneNumber("gfgfg")
                .email("gfgfg")
                .baseSalary(12.11f)
                .workingHours(10f)
                .bonus(14f)
                .hiredDate(LocalDate.now())
                .build();
        System.out.println(employee.toString());


               /* .setId(10)
                .setDepartment("gfgfg")
                .setfirstName("gfgfg")
                .setmiddleName("gfgfg")
                .setlastName("gfgfg")
                .setAge(45)
                .setAddress("gfgfg")
                .setPhoneNumber("gfgfg")
                .setEmail("gfgfg")
                .setBaseSalary(12.11f)
                .setWorkingHours(10f)
                .setBonus(14f)
                .setHiredDate(LocalDate.now())
                .build();*/


        Student student = Student.builder()
                .studentId(10)
                .firstName("gfgfg")
                .middleName("gfgfg")
                .lastName("gfgfg")
                .age(45)
                .address("gfgfg")
                .phoneNumber("gfgfg")
                .email("gfgfg")
                .registerDate(LocalDate.now())
                .finishDate(LocalDate.of(2019, Month.JANUARY, 1))
                .build();
        System.out.println(student.toString());
        student.getEnrolled(student.getFinishDate());
    }
}
