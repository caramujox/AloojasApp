package com.gmail.caioamorais.AloojasApp.service;

import com.gmail.caioamorais.AloojasApp.dto_form.dto.UserDto;
import com.gmail.caioamorais.AloojasApp.dto_form.form.UserForm;
import com.gmail.caioamorais.AloojasApp.exceptions.TipoUserAlreadyExistsException;
import com.gmail.caioamorais.AloojasApp.exceptions.TipoUserNotFoundException;
import com.gmail.caioamorais.AloojasApp.exceptions.UserAlreadyExistsException;
import com.gmail.caioamorais.AloojasApp.exceptions.UserNotFoundException;
import com.gmail.caioamorais.AloojasApp.repository.TipoUserRepository;
import com.gmail.caioamorais.AloojasApp.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private final TipoUserRepository tipoUserRepository;

    public Page<UserDto> findAllUser(Pageable pageable){ return UserDto.mapToModel(userRepository.findAll(pageable)); }

    public UserDto addUser(UserForm form) {
        if(userRepository.existsById(form.getIdUsuario()))
            throw new UserAlreadyExistsException("Não foi possivel efetuar o cadastro - Usuário já existente!");
        else if (!tipoUserRepository.existsById(form.getIdTipoUsuario()))
            throw new TipoUserAlreadyExistsException("Não foi possivel efetuar o cadastro - Classificação de Usuário inexistente!");
        return new UserDto (userRepository.save(form.converter(tipoUserRepository)));
    }

    public UserDto updateUser(UserForm form, String id) throws TipoUserNotFoundException, UserNotFoundException{
        if(!userRepository.existsById(id))
            throw new UserNotFoundException("Usuário não existente!");
        else if (!tipoUserRepository.existsById(form.getIdTipoUsuario()))
            throw new TipoUserNotFoundException("Tipo de Usuário não existe!");
        return new UserDto (userRepository.save(form.converter(tipoUserRepository)));
    }

    public void deleteUser(String id) throws TipoUserNotFoundException, UserNotFoundException{
        if(!userRepository.existsById(id))
            throw new UserNotFoundException("Usuário não existente!");
        userRepository.deleteById(id);
    }

}
