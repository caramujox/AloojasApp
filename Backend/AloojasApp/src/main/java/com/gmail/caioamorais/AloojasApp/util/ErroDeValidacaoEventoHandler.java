package com.gmail.caioamorais.AloojasApp.util;

import com.gmail.caioamorais.AloojasApp.exceptions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ErroDeValidacaoEventoHandler {

    @Autowired
    private MessageSource message;

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public List<ErroFormularioDto> handle(MethodArgumentNotValidException ex){
        List<ErroFormularioDto> dtos = new ArrayList<>();
        List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
        fieldErrors.forEach(e -> {
            String msg = message.getMessage(e, LocaleContextHolder.getLocale());
            ErroFormularioDto erro = new ErroFormularioDto(e.getField(),msg);
        });
        return dtos;
    }

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ExceptionHandler(EventoNotFoundException.class)
    public ErroFormularioDto handleEventoNotFound(EventoNotFoundException ex){
        return new ErroFormularioDto(ex);
    }

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(TipoUserAlreadyExistsException.class)
    public ErroFormularioDto handleTipoUserExists(TipoUserAlreadyExistsException ex) { return new ErroFormularioDto(ex);}

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ExceptionHandler(TipoUserNotFoundException.class)
    public ErroFormularioDto handleTipoUserNotFound(TipoUserNotFoundException ex) {return new ErroFormularioDto(ex);}

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(UserAlreadyExistsException.class)
    public ErroFormularioDto handleUserExists(UserAlreadyExistsException ex) { return new ErroFormularioDto(ex);}

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ExceptionHandler(UserNotFoundException.class)
    public ErroFormularioDto handleUserNotFound(UserNotFoundException ex){ return new ErroFormularioDto(ex);}


}
