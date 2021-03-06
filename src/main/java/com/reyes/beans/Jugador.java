package com.reyes.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.reyes.interdaces.IEquipo;

@Component
public class Jugador {
	
	
	private int id;
	@Value("Daniel")
	private String nombre;
	@Autowired
	@Qualifier("barcelona")
	private IEquipo equipo;
	@Autowired
	private Camiseta camiseta;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public IEquipo getEquipo() {
		return equipo;
	}
	
	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}
	
	public Camiseta getCamiseta() {
		return camiseta;
	}
	
	public void setCamiseta(Camiseta camiseta) {
		this.camiseta = camiseta;
	}
	

}
