package com.store.cep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.store.cep.dto.CepDto;

@Service
public class CepService {
	
	private final String VIACEP_URL = "http://viacep.com.br/ws/"; 
	
	@Autowired
	private RestTemplate restTemplate; // Podem usar o WebClient
	
	public CepDto getOne(String cep) {
		return restTemplate.getForObject(VIACEP_URL + cep + "/json", CepDto.class);
	}
	
}
