package edu.codigocode.modelo;

public class Gato extends Animal {

	public Gato(String nombre, String raza, String sintoma, Dueno dueno) {
		super(nombre, raza, sintoma, dueno);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tipoDeSintoma() {

		System.out.println("El sintoma para el gato es " + getSintoma());

	}

}
