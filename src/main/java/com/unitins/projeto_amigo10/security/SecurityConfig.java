package com.unitins.projeto_amigo10.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration
@EnableWebSecurity
public class SecurityConfig {


	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and().authorizeHttpRequests()
                .antMatchers(HttpMethod.POST, "/endereco/cadastro")
                .permitAll()
				.antMatchers(HttpMethod.GET, "/doador/historico/{id}")
                .permitAll()
                .antMatchers(HttpMethod.PUT, "/doador/editar/{id}")
                .permitAll()
                .antMatchers(HttpMethod.PATCH, "/voluntario/ativar/{id}")
                .permitAll()
                .antMatchers(HttpMethod.GET, "/home")
                .permitAll()
                .anyRequest().authenticated()
                .and()
                .build();
    }


	@Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
	

}
