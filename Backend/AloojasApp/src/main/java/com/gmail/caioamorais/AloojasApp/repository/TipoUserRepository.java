package com.gmail.caioamorais.AloojasApp.repository;

import com.gmail.caioamorais.AloojasApp.model.TipoUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoUserRepository extends JpaRepository<TipoUser, Long> {
        TipoUser findByIdTipoUsuario(Long id);
}
