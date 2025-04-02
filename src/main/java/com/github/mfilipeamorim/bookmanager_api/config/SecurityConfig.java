package com.github.mfilipeamorim.bookmanager_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable() // desabilita CSRF (opcional em APIs REST)
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // libera todos os endpoints
                );

        return http.build();
    }
}
