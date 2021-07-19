package com.gmail.caioamorais.AloojasApp.repository;

import com.gmail.caioamorais.AloojasApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
        }
