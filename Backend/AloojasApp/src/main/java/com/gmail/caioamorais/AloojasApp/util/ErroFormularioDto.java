package com.gmail.caioamorais.AloojasApp.util;

import com.gmail.caioamorais.AloojasApp.exceptions.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ErroFormularioDto {

    private String campo;
    private String erro;

    public ErroFormularioDto(EventoNotFoundException ex) {
        this.campo = "codigo_evento";
        this.erro = ex.getMessage();
    }
    public ErroFormularioDto(UserNotFoundException ex) {
        this.campo = "idUsuario";
        this.erro = ex.getMessage();
    }
    public ErroFormularioDto(UserAlreadyExistsException ex) {
        this.campo = "idUsuario";
        this.erro = ex.getMessage();
    }
    public ErroFormularioDto(TipoUserAlreadyExistsException ex) {
        this.campo = "idTipoUsuario";
        this.erro = ex.getMessage();
    }
    public ErroFormularioDto(TipoUserNotFoundException ex) {
        this.campo = "idTipoUsuario";
        this.erro = ex.getMessage();
    }

}
