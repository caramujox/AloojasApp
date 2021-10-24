package com.gmail.caioamorais.AloojasApp.controller;

import com.gmail.caioamorais.AloojasApp.dto_form.dto.EventoDto;
import com.gmail.caioamorais.AloojasApp.dto_form.form.EventoForm;
import com.gmail.caioamorais.AloojasApp.model.Evento;
import com.gmail.caioamorais.AloojasApp.service.EventoService;
import com.gmail.caioamorais.AloojasApp.service.FileService;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;

@AllArgsConstructor
@Controller
@RequestMapping("/eventos")
public class EventoController {
    private final EventoService service;
    private final FileService fileService;

    @GetMapping
    public ResponseEntity<Page<EventoDto>> getAllEvento(@PageableDefault(sort = "horarioEvento", direction = Sort.Direction.ASC, page = 0, size = 4) Pageable paginacao ){
        Page<EventoDto> listEvento = service.findAllEvento(paginacao);
        return new ResponseEntity<>(listEvento, HttpStatus.OK);
    }

    @GetMapping("/export")
    public ResponseEntity<Page<EventoDto>> export(@PageableDefault(sort = "horarioEvento", direction = Sort.Direction.ASC, page = 0, size = 4) Pageable paginacao ) throws Exception {
        fileService.createFile();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping()
    @Transactional
    public ResponseEntity<EventoDto> addEvento(@RequestBody @Valid EventoForm evento){
        Evento newEvento = service.addEvento(evento);
        EventoDto newDto = new EventoDto(newEvento);
        return new ResponseEntity<>(newDto, HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    @Transactional
    public ResponseEntity<EventoDto> updateEvento(@RequestBody @Valid EventoForm evento, @PathVariable("id") String id) throws Exception {
        Evento eventoModel = service.updateEvento(evento, id);
        EventoDto newDto = new EventoDto(eventoModel);
        return new ResponseEntity<>(newDto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<?> deleteEvento(@PathVariable("id") String id) throws Exception{
        service.deleteEvento(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
