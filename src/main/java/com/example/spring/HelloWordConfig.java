package com.example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWordConfig {

	@Bean
	public Hola hola(){
		return new Hola();
	}
}
