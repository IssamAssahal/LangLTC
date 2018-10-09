package com.langltc.pl.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Issam As-sahal ISA On 10/3/2018
 * 2:14 PM
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Admin {
    private String Id;
    private String name;
    private String password;

    public void login() {
    }

    public void logout() {
    }

    public void addNewTeachers() {
    }

    public void modifyTeachers() {
    }

    public void addNewStudent() {
    }

    public void modifyStudent() {
    }

    public void addNewCourse() {
    }

    public void modifyCourse() {
    }
}
