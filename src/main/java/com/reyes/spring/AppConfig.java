package com.reyes.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.reyes.beans.Barcelona;
import com.reyes.beans.Camiseta;
import com.reyes.beans.Jugador;
import com.reyes.beans.Marca;

@Configuration
public class AppConfig {
	
	@Bean
	public Jugador jugador1() {
		return new Jugador();
	}
	
	@Bean
	public Barcelona barcelona(){
		return new Barcelona();
	}
	
	
	@Bean
	public Camiseta camiseta(){
		return new Camiseta();
	}
	
	@Bean
	public Marca marca(){
		return new Marca();
	}

}
