package com.gmail.caioamorais.AloojasApp.model;

import com.gmail.caioamorais.AloojasApp.dto_form.form.TipoUserForm;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name= "tipo_usuario")
public class TipoUser  {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long idTipoUsuario;
    private String nomeTipoUsuario;

    public TipoUser(TipoUserForm form){
        this.nomeTipoUsuario = form.getNomeTipoUsuario();
    }
    }
