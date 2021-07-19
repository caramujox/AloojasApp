package com.gmail.caioamorais.AloojasApp.dto_form.form;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gmail.caioamorais.AloojasApp.model.TipoUser;
import com.gmail.caioamorais.AloojasApp.model.User;
import com.gmail.caioamorais.AloojasApp.repository.TipoUserRepository;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Setter
@Getter
public class UserForm {
    @NotNull @NotEmpty
    private String idUsuario;
    @NotNull
    private long idTipoUsuario;

    public User converter(TipoUserRepository repo){
        TipoUser tipoUsuario = repo.findByIdTipoUsuario(idTipoUsuario);
        return new User(idUsuario, tipoUsuario, LocalDateTime.now());
    }

}
