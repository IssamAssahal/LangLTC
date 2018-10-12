package com.langltc.pl.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Issam As-sahal ISA On 10/12/2018
 * 7:37 PM
 **/
@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {
}
