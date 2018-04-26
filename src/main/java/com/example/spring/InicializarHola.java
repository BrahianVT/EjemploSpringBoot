package com.example.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *  Clase que inicialiara el bean Hola
 * */
public class InicializarHola  implements BeanPostProcessor{
	
	public Object postProcessBeforeInitialization(Object bean,String beanName) throws BeansException{
		System.out.println("antes de iniciaizarse : " + beanName);
	      return bean;  // you can return any other object as well
	}

	public Object  postProcessAfterInitialization(Object bean, String beanName) 
		      throws BeansException {
	      
	      System.out.println("despues de inicializarse : " + beanName);
	      return bean;  // you can return any other object as well
	   }
}
