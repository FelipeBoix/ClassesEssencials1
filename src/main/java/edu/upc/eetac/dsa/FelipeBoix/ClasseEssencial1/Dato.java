package edu.upc.eetac.dsa.FelipeBoix.ClasseEssencial1;

import java.io.Serializable;

public class Dato implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int numero;
	String nombre;
	char var;
	Dato(){
		
		
	}
	Dato(int a, String nombre, char j){
		this.numero = a;
		this.nombre = nombre;
		this.var = j;
	}
	
}
