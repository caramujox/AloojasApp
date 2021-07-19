package com.gmail.caioamorais.AloojasApp.model;

import com.gmail.caioamorais.AloojasApp.dto_form.form.EventoForm;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "eventos")
public class Evento {

    @Id
    @Column(nullable = false, updatable = false)
    private String codigoEvento;
    private String nomeEvento;
    private String pontoEncontro;
    private LocalDateTime horarioEvento;

    public Evento(EventoForm form) {
        this.codigoEvento = UUID.randomUUID().toString();
        this.horarioEvento = form.getHorarioEvento();
        this.nomeEvento = form.getNome();
        this.pontoEncontro = form.getPontoEncontro();
    }

    }

