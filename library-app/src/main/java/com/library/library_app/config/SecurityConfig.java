package com.library.library_app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration

public class SecurityConfig {
  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
        .authorizeHttpRequests(authorizeRequests -> authorizeRequests
            .requestMatchers("/swagger-ui/**", "/v3/api-docs*/**").permitAll() // Allow Swagger UI
            .requestMatchers("/**").permitAll() // Allow read-only access to API
        )
        .csrf(csrf -> csrf.disable()); // Disable CSRF for REST API

    return http.build();
  }
}