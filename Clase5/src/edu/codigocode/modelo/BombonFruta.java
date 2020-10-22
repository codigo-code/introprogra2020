package edu.codigocode.modelo;

public class BombonFruta extends Ingredinte {

	private boolean pectina;
	
	public BombonFruta(int azucar, int gelatina, int jarabe, int escencia, int colorante) {
		super(azucar, gelatina, jarabe, escencia, colorante);
		// TODO Auto-generated constructor stub
	}

	public boolean isPectina() {
		return pectina;
	}

	public void setPectina(boolean pectina) {
		this.pectina = pectina;
	}
	
	

}
