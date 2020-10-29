package edu.codigocode.vista;

import edu.codigocode.controlador.RecepcionControlador;
import edu.codigocode.modelo.Conejo;
import edu.codigocode.modelo.Dueno;
import edu.codigocode.modelo.Gato;
import edu.codigocode.modelo.Perro;
import edu.codigocode.modelo.Veterinario;

public class App {

	 public static void main(String[] args) {
		
		 RecepcionControlador rc = new RecepcionControlador();
		 Veterinario v1 = new Veterinario();
		 v1.setNombre("pepe");
		 Veterinario v2 = new Veterinario();
		 v2.setNombre("pepa");
		 Veterinario v3 = new Veterinario();
		 v3.setNombre("pepito");
		 
		 rc.asignoveterinario(v1);
		 rc.asignoveterinario(v2);
		 rc.asignoveterinario(v3);
		 
		 // si asignamos un objeto sin inicializar el nombre, obtener
		 // el indice del arreglo y asginarle valores
		 // lista.get(indice)--> retorna el objeto del tipo de la lista
		 // ListaVeterinario.get(1) ---> obj de tipo Veterinario
		 // Veterinario v1 = ListaVeterinario.get(1); // posicion 2 
		 //rc.getListaVeterianrio().get(0).setNombre("pepito");
	
		 // posicion 1 2 3 4 5 
		 // indice   0 1 2 3 4 
		 
		 
		 rc.atiendoAnimal();
		 rc.mostrarAnimalesAtendidosPorVeterinarios();

		 
		 


	 
	 }

}
