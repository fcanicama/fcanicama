package com.example.practica2expert.serversocios.controller;
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

import com.example.practica2expert.serversocios.entity.Socios;
import com.example.practica2expert.serversocios.service.SocioService;

@RestController
@RequestMapping(path="/socios/mantenimiento")
public class SocioController {


	
	@Value("${server.port}")
	private Integer port;
	
	@Autowired
	private SocioService socioService;
	

	
	@RequestMapping(value="/insertar", method=RequestMethod.POST,
			consumes= MediaType.APPLICATION_JSON_VALUE,
			produces= MediaType.APPLICATION_JSON_VALUE)
	
	public @ResponseBody Socios guardar(@RequestBody Socios entity) {
		return  socioService.guardar(entity);
		
	}
	
	@RequestMapping(value="/actualizar", method=RequestMethod.POST,
			consumes= MediaType.APPLICATION_JSON_VALUE,
			produces= MediaType.APPLICATION_JSON_VALUE)
	
	public @ResponseBody Socios actualizar(@RequestBody Socios entity) {
		return  socioService.actualizar(entity);
		
	}
	
	@RequestMapping(value="/consultarPorId", method=RequestMethod.POST,
			consumes= MediaType.APPLICATION_JSON_VALUE,
			produces= MediaType.APPLICATION_JSON_VALUE)
	
	public @ResponseBody Socios consultarPorId(@RequestBody Socios entity) {
		return  socioService.consultarPorId(entity);
		
	}
	
	@RequestMapping(value="/consultarTodos", method=RequestMethod.POST,
			consumes= MediaType.APPLICATION_JSON_VALUE,
			produces= MediaType.APPLICATION_JSON_VALUE)
	
	public @ResponseBody List<Socios> consultarTodos() {
		return  socioService.consultarTodos();
		
	}
	
	
	
	
	

}
