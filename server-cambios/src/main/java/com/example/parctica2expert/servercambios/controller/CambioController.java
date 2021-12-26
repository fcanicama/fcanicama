package com.example.parctica2expert.servercambios.controller;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.parctica2expert.servercambios.entity.Cambios;
import com.example.parctica2expert.servercambios.service.CambioService;

@RestController
@RequestMapping(path="/cambio/mantenimiento")
public class CambioController {


	
	@Value("${server.port}")
	private Integer port;
	
	@Autowired
	private CambioService cambioService;
	

	
	@RequestMapping(value="/insertar", method=RequestMethod.POST,
			consumes= MediaType.APPLICATION_JSON_VALUE,
			produces= MediaType.APPLICATION_JSON_VALUE)
	
	public @ResponseBody Cambios guardar(@RequestBody Cambios entity) {
		return  cambioService.guardar(entity);
		
	}
	
	
	
	

}
