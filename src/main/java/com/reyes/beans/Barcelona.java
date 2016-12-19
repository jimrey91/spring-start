package com.reyes.beans;

import org.springframework.stereotype.Component;

import com.reyes.interdaces.IEquipo;

@Component
public class Barcelona implements IEquipo{

	public String mostrar() {
		
		return "FC Barcelona";
	}

}
