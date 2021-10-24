package com.gmail.caioamorais.AloojasApp.dto_form.form;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class UsuarioForm {
    @NotNull @NotEmpty
    private Long idUsuario;

    @NotNull @NotEmpty
    private String email, senha;

}
