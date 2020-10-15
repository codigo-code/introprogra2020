package edu.codigocode.modelo;

public class Persona {

	// crear atributos globales publicos

	public String nombre;
	public String apellido;
	public int edad;

	
	//comportamiento
	
	public void hablar(String idioma) {
		System.out.println(idioma);
	}
	
	public void muestroDatos() {
		System.out.println("Su nombre es " + nombre + ", apellido: "+ apellido + ", edad: " + edad);
	}
	

	
}
