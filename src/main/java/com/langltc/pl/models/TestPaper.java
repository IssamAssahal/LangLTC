package com.langltc.pl.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Issam As-sahal ISA On 10/3/2018
 * 3:12 PM
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class TestPaper {

     @Id
    private  long testPaperId;
    private String name;
    private double duration;
    private long teacherId;
    private  long courseId;

}
