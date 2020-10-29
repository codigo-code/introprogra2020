package edu.codigocode.modelo;

import java.util.ArrayList;
import java.util.List;

public class Veterinario {

	// regla de negocio (( nos piden que el veterinario solo puede atender
	// 5 animlaes x dia))

	// inicializamos la lista de animales

	private List<Animal> listaAnimales = new ArrayList<Animal>();
	private String nombre;
	private boolean disponibilidad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// verificar que la lista de animales no superen los 5 elementos

	public void asignarAnimal(Animal animal) {
		if (listaAnimales.size() < 5) {
			listaAnimales.add(animal);
		} else {
			System.out.println("no puede atender mas animales por el dia este veterinario");
		}
	}

	public void mostrarCantidadDeAnimalesAtendidos() {

		System.out.println("mostrar cantidad de animales atendidos " + listaAnimales.size());
	}

	public void mostrarSintomaPorAnimal() {
		// foreach ---> objetos
		int cont = 1;
		for (Animal animal : listaAnimales) {
			System.out.println("=============ANIMAL N " + cont + " ======================");
			System.out.println("Tipo de mascota atendida: " + animal.getClass().getSimpleName());
			System.out.println("Nombre de la mascota " + animal.getNombre());
			System.out.println("Sintoma de la mascota " + animal.getSintoma());
			cont++;
		}
	}

	public void atendiendo() {
		disponibilidad = false;
	}

	public void liberarPaciente() {
		disponibilidad = true;
	}

	public boolean getDisponibilidad() {
		return disponibilidad;
	}
}
