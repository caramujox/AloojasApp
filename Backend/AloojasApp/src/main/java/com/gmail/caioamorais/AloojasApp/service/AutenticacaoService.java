package com.gmail.caioamorais.AloojasApp.service;

import com.gmail.caioamorais.AloojasApp.exceptions.UserNotFoundException;
import com.gmail.caioamorais.AloojasApp.model.Usuario;
import com.gmail.caioamorais.AloojasApp.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AutenticacaoService implements UserDetailsService {

    @Autowired
    private final UsuarioRepository repository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Usuario usuario = repository.findByEmail(s).orElseThrow(() -> new UserNotFoundException("Dados invalidos - tente novamente!"));
        return usuario;
    }
}
