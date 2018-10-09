package com.langltc.pl.models;

import com.langltc.pl.models.utilities.DateUtils;
import lombok.*;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
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
    private long studentId;
    private String level;
    //    private float testScore;
    private Date registerDate;
    private Date finishDate;

    public Student() {

    }

    @Builder
    public Student(long studentId, String firstName, String middleName, String lastName, int age, String address, String phoneNumber, String email,  String level, Date registerDate, Date finishDate) {
        super(firstName, middleName, lastName, age, address, phoneNumber, email);
        this.studentId = studentId;
        this.level = level;
        this.registerDate = registerDate;
        this.finishDate = finishDate;
    }






    public void fillAdmissionForm() {
    }

    public void getEnrolled( Date finishDate) {
        LocalDate today = LocalDate.now();
        if (finishDate.after(DateUtils.asDate(today))) {
            log.info("Not Enrolled he finished his course");
        }else {
            log.info(" Still Enrolled he/she does not finish his course yet");
        }
    }

    public void writeExam() {
    }

    public double totalScore(List<TestPaper> score ,double count) {
        return  count;
    }
}
