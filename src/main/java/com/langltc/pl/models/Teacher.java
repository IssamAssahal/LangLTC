package com.langltc.pl.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * Created by Issam As-sahal ISA On 10/3/2018
 * 1:48 PM
 **/

@Data
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
//@NoArgsConstructor
//@RequiredArgsConstructor
@Builder
@Entity
//@Table(name= "Teacher", schema = "langltc")
public class Teacher  extends SchoolPiadMember implements CalculateHoursSalary {
   @Id
    public long teacherId;
    private String level;

    public Teacher() {

    }

    public Teacher(long teacherId,String firstName, String middleName, String lastName, int age, String address, String phoneNumber, String email, float baseSalary, float workingHours, float bonus, LocalDate hiredDate,  String level) {
        super(firstName, middleName, lastName, age, address, phoneNumber, email, baseSalary, workingHours, bonus, hiredDate);
        this.teacherId = teacherId;
        this.level = level;
    }

    public void prepareTestPaper(){}
    public void markAttendance(){}
    public void checkPapers(){}
    public void prepareRecordCards(){}
    public void declareResults(){}

    @Override
    public float calculateMonthlyFinialSalary() {
        return 0;
    }

    @Override
    public float calculateMonthlyWorkingHours() {
        return 0;
    }
}
