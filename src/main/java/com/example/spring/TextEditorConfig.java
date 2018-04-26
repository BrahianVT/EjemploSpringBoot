package com.example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextEditorConfig {

	@Bean
	/*
	 * atributos de un bean pueden ser 
	 *  @Bean(initMethod = "init", destroyMethod = "cleanup" )
	 *  @Scope("prototype") 
	 **/
	public TextEditor textEditor(){
		TextEditor beanTextEditor = new TextEditor();
		beanTextEditor.setSpellChecker(spellChecker());
		return beanTextEditor;
	}
	@Bean
	public SpellChecker spellChecker(){
		return new SpellChecker();
	}
	
	@Bean
	public CStartEventHandler comenzarEventHandler(){
		return new CStartEventHandler();
	}
	
	@Bean public CStopEventHandler terminarEventHandler(){
		return new CStopEventHandler();
	}
}
