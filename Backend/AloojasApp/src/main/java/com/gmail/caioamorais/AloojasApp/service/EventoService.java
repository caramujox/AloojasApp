package com.gmail.caioamorais.AloojasApp.service;

import com.gmail.caioamorais.AloojasApp.dto_form.dto.EventoDto;
import com.gmail.caioamorais.AloojasApp.dto_form.form.EventoForm;
import com.gmail.caioamorais.AloojasApp.exceptions.EventoNotFoundException;
import com.gmail.caioamorais.AloojasApp.model.Evento;
import com.gmail.caioamorais.AloojasApp.repository.EventoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class EventoService {
    @Autowired
    private final EventoRepository eventoRepository;

    public Page<EventoDto> findAllEvento(Pageable pageable) {return EventoDto.mapListToDtoList(eventoRepository.findAll(pageable));}

    public Evento addEvento(EventoForm form) {
        Evento evento = new Evento(form);
        return eventoRepository.save(evento);
    }

    public Evento updateEvento(EventoForm form, String id) throws EventoNotFoundException{
        Evento evento = new Evento(form);
        if (!eventoRepository.existsById(id)){
            throw new EventoNotFoundException("Evento não Encontrado!");
        }
        return eventoRepository.save(evento);
    }

    public void deleteEvento(String id) throws EventoNotFoundException{
        if (!eventoRepository.existsById(id)){
            throw new EventoNotFoundException("Evento não Encontrado!");
        }
        eventoRepository.deleteById(id);}

}
