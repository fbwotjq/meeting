package com.meeting;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by Administrator on 2016-12-17.
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
        //.antMatchers("/account/changePassword").permitAll()
        //.antMatchers("/", "/home").permitAll().anyRequest().authenticated()
        .and().formLogin().loginPage("/account/login").permitAll()
        .and().logout().permitAll();
    }
}
