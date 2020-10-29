package edu.codigocode.modelo;

public class Perro extends Animal {

	public Perro(String nombre, String raza, String sintoma, Dueno dueno) {
		super(nombre, raza, sintoma, dueno);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void tipoDeSintoma() {
		System.out.println("El sintoma para el perro es " + getSintoma());
		System.out.println("tener en cuenta de hacer una placa ");
	}

}
