package com.gmail.caioamorais.AloojasApp.model;

import com.gmail.caioamorais.AloojasApp.dto_form.form.UserForm;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "usuarios")
public class User {

    @Id
    @Column(nullable = false, updatable = false)
    private String idUsuario;
    @ManyToOne
    private TipoUser tipoUser;
    private LocalDateTime dataHoraCriacao = LocalDateTime.now();

}
