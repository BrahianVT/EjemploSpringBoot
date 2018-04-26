package com.example.spring;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

// Clase que se ejecuta al iniciar el applicationContext de una aplicacion
public class CStartEventHandler implements ApplicationListener<ContextStartedEvent>{

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("ContextStartedEvent recibido");

	}
}
