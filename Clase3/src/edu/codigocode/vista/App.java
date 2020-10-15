package edu.codigocode.vista;

import edu.codigocode.modelo.Persona;

public class App {

	public static void main(String[] args) {
		System.out.println("hola mundo 3 ");
		
		String nombre =" valor";
		
		// Me creo el objeto per1 ---> que tiene el comportamiento de la persona
		Persona per1 = new Persona();
		
		//Asigno los valores al objeto per1
		per1.nombre="dante";
		per1.apellido="panella";
		per1.edad=38;
		
		
		// creo el objeto per2
		Persona per2 = new Persona();
		
		// asigno los valores al objeto per2
		per2.nombre="Laura";
		per2.apellido="Riquelme / Barrio";
		per2.edad=21;
		
	
		Persona per3= new Persona();
		per3.nombre="peppa";
		per3.apellido="pig";
		per3.edad=7;
		
		
		
		per1.muestroDatos();
		per1.hablar("obj: per1 -> hello how are you?");
		
		per2.muestroDatos();
		per2.hablar("obj: per2 -> ola como vai");
		
		per3.muestroDatos();
		per3.hablar("obj: per3 -> hola como estas?");
		
		
		
		
		

		
	}
}
