package com.gmail.caioamorais.AloojasApp.service;

import com.gmail.caioamorais.AloojasApp.dto_form.dto.UsuarioDto;
import com.gmail.caioamorais.AloojasApp.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Page<UsuarioDto> findAll(Pageable pageable){return UsuarioDto.mapToModel(repository.findAll(pageable));}

}
