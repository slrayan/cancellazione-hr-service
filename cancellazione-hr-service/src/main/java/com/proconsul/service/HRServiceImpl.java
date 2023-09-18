
package com.proconsul.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.proconsul.entity.UtenteHR;
import com.proconsul.entity.UtenteHRId;
import com.proconsul.exception.InserimentoException;
import com.proconsul.repository.HRRepository;

@Service
public class HRServiceImpl implements HRService{
	
	@Autowired 
	private HRRepository hrRepository;
	
	@Value("${utenteHR.non.esistente}")
	private String message;
	
	@Override
	public Map<String, Boolean> cancellaUserHR(UtenteHRId userId) throws InserimentoException {
		
		Map<String, Boolean> cancellazioneMap = new HashMap<>();
		
		//prova tramite: hrRepository.findById(userId).orElseThrow(null)...
		
		Optional<UtenteHR> utenteHR = hrRepository.findById(userId);
	
		if(!utenteHR.isPresent()) {
			
			throw new InserimentoException(message);
			
		}else {
			
			try {
				hrRepository.deleteById(userId);
				
				cancellazioneMap.put("cancellazione user hr", true);
				
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}

		return cancellazioneMap;
		
		
		
		
	}
}

