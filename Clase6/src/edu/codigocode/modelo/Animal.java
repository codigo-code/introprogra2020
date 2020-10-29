package edu.codigocode.modelo;

public abstract  class Animal {

	private String nombre;
	private String raza; // <---
	private String sintoma;
	private Dueno dueno;

	// mediante el constructor asigno los valores al momento de inicializar el
	// objeto
	public Animal(String nombre, String raza, String sintoma, Dueno dueno) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.sintoma = sintoma;
		this.dueno = dueno;
	}

	// no quiero sobre-escribir los valores asignados a las variables

	public String getNombre() {
		return nombre;
	}

	public String getRaza() {
		return raza;
	}

	public String getSintoma() {
		return sintoma;
	}

	public Dueno getDueno() {
		return dueno;
	}

	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}

	// todos los metodos que se antoponga la palabra reservada abstract ( se va a implementar )
	// en la clase que se extiende
	public abstract void tipoDeSintoma();
}
