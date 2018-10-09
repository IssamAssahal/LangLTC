package com.langltc.pl.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by Issam As-sahal ISA On 10/3/2018
 * 3:17 PM
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {

    private long id;
    private String name;
    private float hoursNumber;
    private float price;
    private Date startDate;
    private Date finishDate;

    public void displayCourse() {
    }

}
