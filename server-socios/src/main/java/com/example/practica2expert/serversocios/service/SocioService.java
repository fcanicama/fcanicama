package com.example.practica2expert.serversocios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.practica2expert.serversocios.entity.Socios;
import com.example.practica2expert.serversocios.repository.SocioRepository;


@Service
public class SocioService {
	@Autowired
	SocioRepository  sociorepository;
	
	@Autowired
	private RestTemplate clienteRest;
	
	
	
	public Socios guardar(Socios entity) {
		return sociorepository.save(entity);
	}

	
	public Socios actualizar(Socios entity) {
		return sociorepository.save(entity);
	}
	
	public Socios consultarPorId(Socios entity) {
		return sociorepository.findById(entity.getId()).orElse(null);
	}
	
	public List<Socios>consultarTodos() {
		return sociorepository.findAll();
	}
}
