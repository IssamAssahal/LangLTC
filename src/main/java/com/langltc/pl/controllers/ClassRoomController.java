package com.langltc.pl.controllers;

import com.langltc.pl.models.ClassRoom;
import com.langltc.pl.models.Section;
import com.langltc.pl.repositories.ClassRoomRepository;
import com.langltc.pl.repositories.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Issam As-sahal ISA On 10/5/2018
 * 6:59 PM
 **/

@RestController
@RequestMapping("/ClassRoom")
public class ClassRoomController {
    @Autowired
    ClassRoomRepository classRoomRepository;

    @RequestMapping("/getClassRoom")
    public List<ClassRoom> getClassRoom(){
        return classRoomRepository.findAll() ;
    }

}
