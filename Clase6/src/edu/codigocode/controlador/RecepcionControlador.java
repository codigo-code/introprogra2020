package edu.codigocode.controlador;

import java.util.ArrayList;
import java.util.List;

import edu.codigocode.modelo.Animal;
import edu.codigocode.modelo.Dueno;
import edu.codigocode.modelo.Gato;
import edu.codigocode.modelo.Perro;
import edu.codigocode.modelo.Veterinario;

public class RecepcionControlador {
		//1) agregar lista de veterinarios
	    //2) verificar que solo existan 5 veterinarios
		//3) asignar un animal a un veterinario si esta disponible
		//4) mostrar sintomas de cada animal
		//5) decir diagnostico / pasos a seguir  <--- modificar la clase animal
	private List<Veterinario> ListaVeterinario = new ArrayList<Veterinario>(); 
	
	
	public List<Veterinario> getListaVeterianrio(){
		return ListaVeterinario;
	}
	
	public void asignoveterinario(Veterinario Pepito) {
		ListaVeterinario.add(Pepito);
	}
	public void cantVeterinarios() {
		if(ListaVeterinario.size() < 5) {
			
		}
	}
	public void atiendoAnimal() {
		Veterinario v1 = ListaVeterinario.get(0); // <--- "valor"´
		Veterinario v2 = ListaVeterinario.get(1); // <--- "valor"´
		
		v1.asignarAnimal(new Perro("Jorge","golden", "dolor de pata",new Dueno("Jorge", 11764)));
		v2.asignarAnimal(new Gato("michifu","siames", "lo atropeyo un auto",new Dueno("Pepino", 11764)));
		
		v1.atendiendo();
		if(v1.getDisponibilidad()) {
			// si es verdadero ( quiere decir que tiene disponibilidad 
			v1.asignarAnimal(new Perro("Jorge","golden", "dolor de pata",new Dueno("Jorge", 11764)));
			
		}else {
			System.out.println("No puede atender a un animal porque esta ocupado");
		}
		
	}
	
	
	public void mostrarAnimalesAtendidosPorVeterinarios() {
		for (Veterinario item : ListaVeterinario) {
			
			System.out.println("El veterinario "+ item.getNombre() + " atendio : ");
			item.mostrarSintomaPorAnimal();
			
			
		}
	}
	
	
	public void recibiroPaciente(Animal animal) {
  
		
	}
	
	
}
