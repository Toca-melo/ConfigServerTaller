package com.zamora.microservicio.eureka;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroServicioController {
	@Autowired
	Configuration configuration;
	
	@GetMapping("/endpoint")
	public String retrieveLimits() {
		return configuration.getValue();
	}
}
