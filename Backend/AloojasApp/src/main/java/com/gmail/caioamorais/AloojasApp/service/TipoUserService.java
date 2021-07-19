package com.gmail.caioamorais.AloojasApp.service;

import com.gmail.caioamorais.AloojasApp.dto_form.dto.TipoUserDto;
import com.gmail.caioamorais.AloojasApp.dto_form.form.TipoUserForm;
import com.gmail.caioamorais.AloojasApp.exceptions.TipoUserNotFoundException;
import com.gmail.caioamorais.AloojasApp.model.TipoUser;
import com.gmail.caioamorais.AloojasApp.repository.TipoUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TipoUserService {
    @Autowired
    private final TipoUserRepository repository;

    public Page<TipoUserDto> findAllTipoUser(Pageable pageable){ return TipoUserDto.converter(repository.findAll(pageable));}

    public TipoUser addTipoUser(TipoUserForm form){
        return repository.save(new TipoUser(form));
    }

    public TipoUser updateTipoUser(TipoUserForm form, Long id) throws TipoUserNotFoundException{
        if(!repository.existsById(id))
            throw new TipoUserNotFoundException("Tipo de Usuário não Existe!");
        return repository.save(new TipoUser(form));
    }

    public void deleteTipoUser(Long id) throws TipoUserNotFoundException{
        if(!repository.existsById(id))
            throw new TipoUserNotFoundException("Tipo de Usuário não existe!");
        repository.deleteById(id);
    }
}
