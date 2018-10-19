package com.langltc.pl.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Issam As-sahal ISA On 10/19/2018
 * 5:16 PM
 **/
@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
    @Autowired
    UserService userService;

    @GetMapping("/AllAdmins")
    public List<Admin> getAdmin (){
        return userService.findAllAdmin();
    }

    @PostMapping("/AddAdmin")
    public Admin AddAdmin(@RequestBody Admin admin){
        return userService.saveAdmin(admin);
    }
}

