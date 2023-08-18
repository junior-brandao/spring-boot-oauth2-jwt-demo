package com.devsuperior.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
     /*disabilita a possibilidade de dados salvos na sessão
    , mas como essa é uma api rest(não guarda estado em sessão),logo csrf disabilitado
    */
    http.csrf(csrf -> csrf.disable());
    http.authorizeHttpRequests(auth -> auth.anyRequest().permitAll());
    return http.build();
  }

}
