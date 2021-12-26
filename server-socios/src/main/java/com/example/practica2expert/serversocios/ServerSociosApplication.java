package com.example.practica2expert.serversocios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient

@SpringBootApplication
public class ServerSociosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerSociosApplication.class, args);
	}

}
