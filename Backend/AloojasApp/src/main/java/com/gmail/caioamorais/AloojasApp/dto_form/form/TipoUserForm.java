package com.gmail.caioamorais.AloojasApp.dto_form.form;

import lombok.Getter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
public class TipoUserForm {
    @NotNull@NotEmpty
    private String nomeTipoUsuario;

}
