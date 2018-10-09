package com.langltc.pl.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.MappedSuperclass;

/**
 * Created by ISA On 10/2/2018
 * 7:35 PM
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class SchoolMember {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
//    public String id;
    public String firstName;
    public String middleName;
    public String lastName;
    public int age;
    public String address;
    public String phoneNumber;
    public String email;

}
