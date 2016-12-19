package com.reyes.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reyes.beans.Barcelona;
import com.reyes.beans.Jugador;
import com.reyes.beans.Juventus;
import com.reyes.beans.Pais;
import com.reyes.beans.Persona;
import com.reyes.interdaces.IEquipo;


public class App {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Elija un equipo: 1- FC Barcelona 2- Juventus ");
		int respuesta = scanner.nextInt(); 
		
//		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/reyes/xml/beans.xml");
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Jugador jug = (Jugador) appContext.getBean("jugador1");
		
		switch (respuesta) {
		case 1:
			jug.setEquipo(new Barcelona());
			break;
		case 2:
			jug.setEquipo(new Juventus());
		default:
			break;
		}
		

		
	//	IEquipo equ = (IEquipo) appContext.getBean("FC-Barcelona");
				
		System.out.println(jug.getNombre() + "-" + jug.getEquipo().mostrar() + "-" + jug.getCamiseta().getNumero() + "-" + jug.getCamiseta().getMarca().getNombre());


//		System.out.println(per.getId() + "-" + per2.getNombre() + "-" + per2.getApodo() + "-" + per2.getPais().getNombre() + " " + per2.getCiudad().getNombre() );
		((ConfigurableApplicationContext) appContext).close();
	}

}
