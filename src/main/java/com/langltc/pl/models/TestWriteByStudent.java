package com.langltc.pl.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * Created by Issam As-sahal ISA On 10/11/2018
 * 8:50 PM
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class TestWriteByStudent {
    @Id
    private long testPaperId;
    private long studentId;
    private double testScore;
    private LocalDate testDate;

}
