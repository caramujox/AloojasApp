package com.gmail.caioamorais.AloojasApp.exceptions;

public class TipoUserAlreadyExistsException extends RuntimeException{
    public TipoUserAlreadyExistsException(String message){
        super(message);
    }
}
