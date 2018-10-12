package com.langltc.pl.models;

import com.langltc.pl.models.utilities.DateUtils;
import lombok.*;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 * Created by Issam As-sahal ISA On 10/3/2018
 * 2:22 PM
 **/

@Data
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Log
@XmlRootElement()
@Component
@Entity
//@Table (name= "student", schema = "langltc")
public class Student extends SchoolMember {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long studentId;

    private long teacherId;

    private  long courseId;

    //simple validation
    @NotNull(message = "Student level is required")
    private String level;
    //    private float testScore;
    @NotNull(message = "Student register date is required")
    private LocalDate registerDate;
    @NotNull(message = "Student finish date is required")
    private LocalDate finishDate;

    public Student() {

    }

    @Builder
    public Student(long studentId, String firstName, String middleName, String lastName, int age, String address, String phoneNumber, String email, String level, LocalDate registerDate, LocalDate finishDate) {
        super(firstName, middleName, lastName, age, address, phoneNumber, email);
        this.studentId = studentId;
        this.level = level;
        this.registerDate = registerDate;
        this.finishDate = finishDate;
    }


    public void fillAdmissionForm() {
    }

    public boolean stillEnrolled(LocalDate finishDate) {
        LocalDate today = LocalDate.now();
        if (finishDate.isBefore(today)) {
            log.info("Not Enrolled he finished his course");
            return false;
        } else {
            log.info(" Still Enrolled he/she does not finish his/her course yet");
            return true;
        }
    }

    public void writeExam() {
    }

    public double totalScore(List<TestPaper> score, double count) {
        return count;
    }
}
