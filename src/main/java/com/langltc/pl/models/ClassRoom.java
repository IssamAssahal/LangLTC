package com.langltc.pl.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Issam As-sahal ISA On 10/3/2018
 * 3:23 PM
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Log
//@XmlRootElement()
//@Component
@Entity
@Builder
public class ClassRoom {
    @Id
    private long classRoomId;
    private String name;
    private int capacity;

    public void displayCourse() {
    }
}
