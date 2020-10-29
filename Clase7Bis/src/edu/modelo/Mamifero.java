package edu.modelo;

public abstract class Mamifero {
	private String nombre;
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract void caminar();
	
	public String hablar() {
		return "hola mundo";
	}
}
