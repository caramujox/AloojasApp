package com.gmail.caioamorais.AloojasApp.dto_form.dto;

import com.gmail.caioamorais.AloojasApp.model.Perfil;
import com.gmail.caioamorais.AloojasApp.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class UsuarioDto {

    private Long idUsuario;
    private LocalDateTime horarioCriacao;
    private String email;
    private List<Perfil> prefis;

    public UsuarioDto(Usuario usuario){
        this.email = usuario.getEmail();
        this.horarioCriacao = usuario.getDataHoraCriacao();
        this.idUsuario = usuario.getIdUsuario();
        this.prefis = usuario.getPerfis();
    }

    public static Page<UsuarioDto> mapToModel(Page<Usuario> usuarios){
        return usuarios.map(UsuarioDto::new);
    }
}
