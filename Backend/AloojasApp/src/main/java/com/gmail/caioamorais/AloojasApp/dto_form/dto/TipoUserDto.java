package com.gmail.caioamorais.AloojasApp.dto_form.dto;

import com.gmail.caioamorais.AloojasApp.model.TipoUser;
import lombok.Getter;
import org.springframework.data.domain.Page;

@Getter
public class TipoUserDto {
    private long idTipoUsuario;
    private String nomeTipoUsuario;

    public TipoUserDto(TipoUser tipoUser){
        this.idTipoUsuario = tipoUser.getIdTipoUsuario();
        this.nomeTipoUsuario = tipoUser.getNomeTipoUsuario();
    }

    public static Page<TipoUserDto> converter(Page<TipoUser> tipoUsers){
        return tipoUsers.map(TipoUserDto::new);
    }
}
