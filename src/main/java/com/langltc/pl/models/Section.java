package com.langltc.pl.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Issam As-sahal ISA On 10/3/2018
 * 3:28 PM
 **/

@Data
@AllArgsConstructor
//@NoArgsConstructor
@Builder
@Entity
//@Table(name= "section", schema = "langltc")
public class Section {
    @Id
//    @Column(name = "section_id")
    private long sectionId;
    private String name;
    private int classNumber;

    public Section() {
    }
}
