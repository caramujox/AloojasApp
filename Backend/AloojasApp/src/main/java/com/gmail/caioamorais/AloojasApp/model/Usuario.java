package com.gmail.caioamorais.AloojasApp.model;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "usuarioSpringAuth")
public class Usuario implements UserDetails {

    /* -----------------
    ATENÇÃO: ESSA CLASSE SÓ FOI/ESTA SENDO UTILIZADA PARA FINS DIDATICOS. A IDEIA É IMPLEMENTAR AUTENTICAÇÃO VIA AWS/FIREBASE E REAPROVEITAR O QUE FOR POSSIVEL DESSE BACKEND
     */

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long idUsuario;
    private LocalDateTime dataHoraCriacao = LocalDateTime.now();
    private String email;
    private String senha;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Perfil> perfis = new ArrayList<>();



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.perfis;
    }

    @Override
    public String getPassword() {
        return this.senha;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

