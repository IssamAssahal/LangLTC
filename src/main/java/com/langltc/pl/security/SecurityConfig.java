package com.langltc.pl.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * Created by Issam As-sahal ISA On 10/12/2018
 * 2:58 PM
 **/
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    public final String[] PUBLIC_ENDPOINTS={
            "/api/v1/admin",
            "/api/v1/students"
    };
    @Override
    protected void configure(HttpSecurity http) throws Exception {
             http
            .cors().and().csrf().disable()
            .sessionManagement()
                     .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
            .authorizeRequests()
                     .antMatchers(PUBLIC_ENDPOINTS).permitAll()
                     .anyRequest().authenticated()
            .and()
            .httpBasic();
    }
}
