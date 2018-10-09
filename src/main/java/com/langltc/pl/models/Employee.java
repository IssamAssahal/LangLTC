package com.langltc.pl.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * Created by Issam As-sahal ISA On 10/2/2018
 * 8:27 PM
 **/
@Data
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
//@RequiredArgsConstructor
     @Entity
public class Employee extends SchoolPiadMember implements CalculateHoursSalary {

//    @Setter @Getter
    @Id
    private long employeeId;
    private  String department;
    private String email;

    public Employee() {
    }

    @Builder
    public Employee(long employeeId,String department,String firstName, String middleName, String lastName, int age, String address, String phoneNumber, String email, float baseSalary, float workingHours, float bonus, LocalDate hiredDate) {
        super(firstName, middleName, lastName, age, address, phoneNumber, email, baseSalary, workingHours, bonus, hiredDate);
        this.employeeId = employeeId;
        this.department = department;
    }





//    public static EmployeeBuilder builder() {
//        return new EmployeeBuilder();
//
//    }


    @Override
    public float calculateMonthlyFinialSalary() {
        return 0;
    }

    @Override
    public float calculateMonthlyWorkingHours() {
        return 0;
    }
}
