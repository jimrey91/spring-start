package com.reyes.beans;

import org.springframework.stereotype.Component;

import com.reyes.interdaces.IEquipo;

@Component
public class Juventus implements IEquipo{

	public String mostrar() {
		// TODO Auto-generated method stub
		return "Juventus";
	}

}
