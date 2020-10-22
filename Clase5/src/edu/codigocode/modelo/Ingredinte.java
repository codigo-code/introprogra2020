package edu.codigocode.modelo;

/*
 * Clase abstracta ingredientes
 * 
 * BUENA PRACTICA: el modelo nunca debe tener funcionalidad
 * 
 */
public abstract class Ingredinte {

	//atributos ---> van en privado y se acceden por metodos publicos
	
	private int azucar;
	private int gelatina;
	private int jarabe;
	private int escencia;
	private int colorante;
	
	public Ingredinte(int azucar, int gelatina, int jarabe, int escencia, int colorante) {
		super();
		this.azucar = azucar;
		this.gelatina = gelatina;
		this.jarabe = jarabe;
		this.escencia = escencia;
		this.colorante = colorante;
	}

	public int getAzucar() {
		return azucar;
	}

	public int getGelatina() {
		return gelatina;
	}

	public int getJarabe() {
		return jarabe;
	}

	public int getEscencia() {
		return escencia;
	}

	public int getColorante() {
		return colorante;
	}
	
	
}
