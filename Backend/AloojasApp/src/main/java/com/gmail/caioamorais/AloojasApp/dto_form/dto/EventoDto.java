package com.gmail.caioamorais.AloojasApp.dto_form.dto;

import com.gmail.caioamorais.AloojasApp.model.Evento;
import lombok.Getter;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;

@Getter
public class EventoDto {
    private String codigoEvento, nome, pontoEncontro;
    private LocalDateTime horarioEvento;

    public EventoDto(Evento model) {
        this.codigoEvento = model.getCodigoEvento();
        this.horarioEvento = model.getHorarioEvento();
        this.nome = model.getNomeEvento();
        this.pontoEncontro = model.getPontoEncontro();
    }


    public static Page<EventoDto> mapListToDtoList(Page<Evento> eventos) {
        return eventos.map(EventoDto::new);
    }

}
