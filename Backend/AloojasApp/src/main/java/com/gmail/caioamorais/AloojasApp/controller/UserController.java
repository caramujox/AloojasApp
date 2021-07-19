package com.gmail.caioamorais.AloojasApp.controller;

import com.gmail.caioamorais.AloojasApp.dto_form.dto.UserDto;
import com.gmail.caioamorais.AloojasApp.dto_form.form.UserForm;
import com.gmail.caioamorais.AloojasApp.model.User;
import com.gmail.caioamorais.AloojasApp.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private final UserService service;

    @GetMapping
    @Cacheable (value = "users")
    public ResponseEntity<Page<UserDto>> getAllUsers(@PageableDefault(sort = "idUsuario", direction = Sort.Direction.ASC, page = 0, size = 10) Pageable paginacao){
        Page<UserDto> userDtos = service.findAllUser(paginacao);
        return new ResponseEntity<>(userDtos, HttpStatus.OK);
    }

    @PostMapping
    @Transactional
    @CacheEvict(value = "users", allEntries = true)
    public ResponseEntity<UserDto> addUser(@RequestBody @Valid UserForm form){
        UserDto userDto = service.addUser(form);
        return new ResponseEntity<>(userDto, HttpStatus.CREATED);
    }


    @PatchMapping("/{idUsuario}")
    @Transactional
    @CacheEvict(value = "users", allEntries = true)
    public ResponseEntity<UserDto> updateUser(@RequestBody @Valid UserForm form, @PathVariable("idUsuario") String id){
        UserDto userDto = service.updateUser(form, id);
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }

    @DeleteMapping("/{idUsuario}")
    @Transactional
    @CacheEvict(value = "users", allEntries = true)
    public ResponseEntity<?> deleteUser(@PathVariable("idUsuario") String id){
        service.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
