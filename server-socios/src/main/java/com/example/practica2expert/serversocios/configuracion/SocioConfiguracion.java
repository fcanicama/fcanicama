package com.example.practica2expert.serversocios.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SocioConfiguracion {

	
	
	@Bean("CambioRest")
	public RestTemplate registrarRestTemplate() {
		return new RestTemplate();
	}
}
