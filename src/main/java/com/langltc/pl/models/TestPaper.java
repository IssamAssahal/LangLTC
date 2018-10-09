package com.langltc.pl.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Issam As-sahal ISA On 10/3/2018
 * 3:12 PM
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TestPaper {

    private  long id;
    private String name;

}
