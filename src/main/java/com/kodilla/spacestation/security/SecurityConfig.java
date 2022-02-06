package com.kodilla.spacestation.security;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("scientist").password("science").roles("SCIENTIST");
        auth.inMemoryAuthentication().withUser("operator").password("operator").roles("OPERATOR");
        auth.inMemoryAuthentication().withUser("officer").password("officer").roles("OFFICER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();

        http.authorizeRequests()
                .mvcMatchers(HttpMethod.GET, "/telescope/**")
                .hasAnyRole("SCIENTIST", "OPERATOR", "OFFICER")
                .mvcMatchers(HttpMethod.POST, "/telescope/**")
                .hasAnyRole("OPERATOR", "OFFICER")
                .mvcMatchers(HttpMethod.DELETE, "/telescope/**")
                .hasAnyRole("OFFICER")
                .anyRequest()
                .fullyAuthenticated()
                .and()
                .httpBasic();
    }
}
