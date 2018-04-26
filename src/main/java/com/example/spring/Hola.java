package com.example.spring;

public class Hola {

	private String mensaje;

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public void init(){
	      System.out.println("Bean sera inicializado.");
	   }
	   public void destroy() {
	      System.out.println("Bean sera destruido.");
	   }
}
