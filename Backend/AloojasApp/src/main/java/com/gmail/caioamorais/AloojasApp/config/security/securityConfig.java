package com.gmail.caioamorais.AloojasApp.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class securityConfig extends WebSecurityConfigurerAdapter {

    //configuração de Autorização (Perfil de Acesso)
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers(HttpMethod.GET, "/eventos").permitAll().
                anyRequest().authenticated()
                .and().formLogin();

    }

    //configuração de Autenticação
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
    }

    //Configuração de Recursos Estaticos (Js, css, img)
    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }
}
