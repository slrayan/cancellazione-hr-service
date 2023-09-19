package com.proconsul.controller;

import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proconsul.entity.UtenteHRId;
import com.proconsul.exception.InserimentoException;
import com.proconsul.service.HRService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;


/*
 * DELETE    http://localhost:8206/rest/api/hr/cancellazione/{email}/{password}
 */


@RestController
@RequestMapping("/rest/api/hr")
public class HRController {
	
	@Autowired 
	private HRService hrService;
	
	@DeleteMapping("/cancellazione/{email}/{password}")
	public Map<String,Boolean> cancellazioneUserHR( @PathVariable String email, @PathVariable String password) throws InserimentoException{
	
			return hrService.cancellaUserHR(new UtenteHRId(email, password));
		// delete
		
	}
	
}
