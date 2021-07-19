package com.gmail.caioamorais.AloojasApp.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Perfil implements GrantedAuthority {
        /* -----------------
    ATENÇÃO: ESSA CLASSE SÓ FOI/ESTA SENDO UTILIZADA PARA FINS DIDATICOS. A IDEIA É IMPLEMENTAR AUTENTICAÇÃO VIA AWS/FIREBASE E REAPROVEITAR O QUE FOR POSSIVEL DESSE BACKEND
     */
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(nullable = false, updatable = false)
        private long idTipoUsuario;
        private String nomeTipoUsuario;

    @Override
    public String getAuthority() {
        return nomeTipoUsuario;
    }
}
