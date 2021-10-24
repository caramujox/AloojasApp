package com.gmail.caioamorais.AloojasApp.service;

import com.gmail.caioamorais.AloojasApp.model.Usuario;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MyTokenService {

    @Value("${aloojas.jwt.expiration}")
    private String expiration;

    @Value("${aloojas.jwt.secret}")
    private String secret;

    public String gerarToken(Authentication authentication) {
        Usuario logado = (Usuario) authentication.getPrincipal();
        Date hoje = new Date();
        Date exp = new Date(hoje.getTime() + Long.parseLong(expiration));
        return Jwts.builder().setIssuer("API AloojasApp")
                .setSubject(logado.getIdUsuario().toString())
                .setIssuedAt(hoje)
                .setExpiration(exp)
                .signWith(SignatureAlgorithm.HS256, secret).
                compact();
    }

    public boolean isTokenValido(String token) {
        try {
            Jwts.parser().setSigningKey(this.secret).parseClaimsJws(token);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public Long getIdUsuario(String token) {
        Claims claim = Jwts.parser().setSigningKey(this.secret).parseClaimsJws(token).getBody();
        return Long.parseLong(claim.getSubject());
    }
}
