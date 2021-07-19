package com.gmail.caioamorais.AloojasApp.dto_form.form;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gmail.caioamorais.AloojasApp.model.Evento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EventoForm {

    @NotNull @NotEmpty
    private String nome, pontoEncontro;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime horarioEvento;

    public EventoForm(Evento model) {
        this.horarioEvento = model.getHorarioEvento();
        this.nome = model.getNomeEvento();
        this.pontoEncontro = model.getPontoEncontro();
    }

}
