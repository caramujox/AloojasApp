package com.gmail.caioamorais.AloojasApp.dto_form.dto;

import com.gmail.caioamorais.AloojasApp.model.User;
import lombok.Getter;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;

@Getter
public class UserDto {

    private String idUsuario;
    private Long idTipoUsuario;
    private LocalDateTime dataHoraCriacao;

    public UserDto(User user){
        this.idUsuario = user.getIdUsuario();
        this.dataHoraCriacao = user.getDataHoraCriacao();
        this.idTipoUsuario = user.getTipoUser().getIdTipoUsuario();
    }

    public static Page<UserDto> mapToModel(Page<User> users){
        return users.map(UserDto::new);
    }
}
