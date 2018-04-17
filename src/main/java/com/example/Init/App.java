package com.example.Init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example.controller")
public class App {
	
    public static void main( String[] args ){
        System.out.println( "Hola mundo !" );
        SpringApplication.run(App.class, args);
    }
}
