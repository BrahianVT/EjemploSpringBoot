package com.example.Init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.HelloWordConfig;
import com.example.spring.Hola;
import com.example.spring.TextEditor;
import com.example.spring.TextEditorConfig;

@SpringBootApplication
@ComponentScan(basePackages="com.example")
public class App {
	
    public static void main( String[] args ){
        System.out.println( "Hola mundo " );
        SpringApplication.run(App.class, args);
        
        //Cargando el application context y obteniendo un bean definido en Beans.xml
/*        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Hola ver = (Hola) context.getBean("helloWorld");
        ver.setMensaje("Desde objeto 1");
        System.out.println(ver.getMensaje());*/
        
        // Invocando metodos init y destroy
        
        /*AbstractApplicationContext context2 = new ClassPathXmlApplicationContext("Beans.xml");
        System.out.println(context2.getBean("helloWorld"));
        context2.registerShutdownHook();
        Hola ver2 = (Hola)context.getBean("helloWorld");
        System.out.println(ver2.getMensaje());
        
       TextEditor text = (TextEditor)context.getBean("textEditor");
        text.spellCkeck();*/
        
       // con anotaciones obtener el bean
      /*  ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWordConfig.class);
        Hola h = ctx.getBean(Hola.class);
        h.setMensaje("Hola Mundo sin xml");
        System.out.println(h.getMensaje());
        */
        // obtener bean que usa otro bean
       /* ApplicationContext ctx2 = new AnnotationConfigApplicationContext(TextEditorConfig.class);
        TextEditor te = (TextEditor) ctx2.getBean(TextEditor.class);
        te.spellCkeck();*/
        
        // llamar a los start y stop evet handler
        
        ConfigurableApplicationContext ctx2 = new AnnotationConfigApplicationContext(TextEditorConfig.class);
        ctx2.start();
        TextEditor te = (TextEditor) ctx2.getBean(TextEditor.class);
        te.spellCkeck();
        ctx2.stop();
    }
}
