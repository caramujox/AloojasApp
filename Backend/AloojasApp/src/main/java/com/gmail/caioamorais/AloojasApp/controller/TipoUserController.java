package com.gmail.caioamorais.AloojasApp.controller;

import com.gmail.caioamorais.AloojasApp.dto_form.dto.TipoUserDto;
import com.gmail.caioamorais.AloojasApp.dto_form.form.TipoUserForm;
import com.gmail.caioamorais.AloojasApp.model.TipoUser;
import com.gmail.caioamorais.AloojasApp.service.TipoUserService;
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
@RequestMapping("/tipousers")
public class TipoUserController {

    @Autowired
    private final TipoUserService service;

    @GetMapping
    @Cacheable(value = "listaTipoUser")
    public ResponseEntity<Page<TipoUserDto>> getAllTipoUser(@PageableDefault(sort = "idTipoUsuario", direction = Sort.Direction.ASC, page = 0, size = 10)Pageable paginacao){
        Page<TipoUserDto> tipoUserDtos = service.findAllTipoUser(paginacao);
        return new ResponseEntity<>(tipoUserDtos, HttpStatus.OK);
    }

    @PostMapping
    @Transactional
    @CacheEvict(value = "listaTipoUser", allEntries = true)
    public ResponseEntity<TipoUserDto> addTipoUser(@RequestBody @Valid TipoUserForm form) {
        TipoUser tipoUser = service.addTipoUser(form);
        TipoUserDto tipoUserDto = new TipoUserDto(tipoUser);
        return new ResponseEntity<>(tipoUserDto, HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    @Transactional
    @CacheEvict(value = "listaTipoUser", allEntries = true)
    public ResponseEntity<TipoUserDto> updateTipoUser(@RequestBody @Valid TipoUserForm form, @PathVariable Long id){
        TipoUser tipoUser = service.updateTipoUser(form, id);
        TipoUserDto tipoUserDto = new TipoUserDto(tipoUser);
        return new ResponseEntity<>(tipoUserDto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Transactional
    @CacheEvict(value = "listaTipoUser", allEntries = true)
    public ResponseEntity<?> deleteTipoUser(@PathVariable Long id){
        service.deleteTipoUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
