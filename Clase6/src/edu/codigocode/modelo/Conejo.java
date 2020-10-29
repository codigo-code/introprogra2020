package edu.codigocode.modelo;

public class Conejo extends Animal {

	public Conejo(String nombre, String raza, String sintoma, Dueno dueno) {
		super(nombre, raza, sintoma, dueno);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public void tipoDeSintoma() {
		System.out.println("El sintoma para el conejo es " + getSintoma());
		System.out.println("hacer reposo obligatorio por 72 hs  ");
	}

}
