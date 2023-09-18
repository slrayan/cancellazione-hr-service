package com.proconsul.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.proconsul.exception.ErrorMessage;
import com.proconsul.exception.InserimentoException;

@RestControllerAdvice
public class ExceptionAdvice {
	
	@ExceptionHandler(InserimentoException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ErrorMessage utenteNonTrovatoException(Exception ex, WebRequest request) {
		
		ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND.value(), new Date(),
				ex.getMessage(), request.getDescription(false)); 
		
		return message;
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public ErrorMessage exceptionHandler(Exception ex, WebRequest request) {
		
		ErrorMessage message = new ErrorMessage(HttpStatus.BAD_REQUEST.value(), new Date(), 
				ex.getMessage(), request.getDescription(false));
		
		return message;
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(value=HttpStatus.BAD_REQUEST)
	public ErrorMessage notValidExceptionHandler(Exception ex, WebRequest request) {
		
		ErrorMessage message = new ErrorMessage(HttpStatus.BAD_REQUEST.value(), new Date(), 
				ex.getMessage(), request.getDescription(false));
		
		return message;
		
	}
}