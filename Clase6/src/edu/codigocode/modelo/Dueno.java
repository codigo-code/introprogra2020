package edu.codigocode.modelo;

public class Dueno {

	private String nombre;
	private int telefono;
	
	// awt ---> java fx --->  swing 
	
	
	
	// getter setter
	public String getNombre() {
		return nombre;
	}
	public Dueno(String nombre, int telefono) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
	}
	 
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	 
	
	

}
