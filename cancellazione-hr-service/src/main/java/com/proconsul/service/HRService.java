package com.proconsul.service;

import java.util.Map;

import com.proconsul.entity.UtenteHRId;
import com.proconsul.exception.InserimentoException;



public interface HRService {
	
	public Map<String, Boolean> cancellaUserHR(UtenteHRId id) throws InserimentoException;

}
