package com.example.parctica2expert.servercambios.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.parctica2expert.servercambios.entity.Cambios;
import com.example.parctica2expert.servercambios.repository.CambioRepository;

@Service
public class CambioService {
	@Autowired
	CambioRepository  cambiorepository;
	
	public Cambios guardar(Cambios entity) {
		return cambiorepository.save(entity);
	}

}