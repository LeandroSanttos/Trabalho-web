package com.trabalho.config;

import com.trabalho.domain.entity.PapelEntity;
import com.trabalho.repository.PapelRepository;
import com.trabalho.service.impl.CustomUserDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import java.util.List;

import static com.trabalho.consts.RequestPathConstants.*;

@Configuration
@RequiredArgsConstructor
public class SecurityConfig {

    private final CustomUserDetailService userDetailsService;
    private final PapelRepository papelRepository;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        List<String> papeis = papelRepository.findAll().stream()
            .map(PapelEntity::getPapel)
            .toList();

        return http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/", "/login", "/cadastro", "/css/**", "/js/**", "/img/**", "/error", "/h2-console/**").permitAll()
                        .requestMatchers(HOME, FEDERACAO_CONTINENTAL, FEDERACAO_NACIONAL, CLUBE, JOGADOR, TREINADOR).authenticated()
                        .anyRequest().hasAnyAuthority(papeis.toArray(new String[0])))
                .formLogin(login -> login.loginPage("/login").defaultSuccessUrl("/", true)
                        .permitAll())
                .logout(logout -> logout.logoutSuccessUrl("/login?logout").permitAll())
                .userDetailsService(userDetailsService)
                .csrf(csrf -> csrf.disable())
                .headers(headers -> headers.frameOptions().disable())
                .build();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(passwordEncoder());
        return provider;
    }

    @Bean
    public AuthenticationManager authManager(HttpSecurity http) throws Exception {
        return http.getSharedObject(AuthenticationManagerBuilder.class)
                .authenticationProvider(authenticationProvider())
                .build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
