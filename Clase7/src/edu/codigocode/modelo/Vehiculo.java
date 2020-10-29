package edu.codigocode.modelo;

/**
 * 
 * Las interfaces son contratos que al momento de implementarlo se define la
 * funcionalidad Las interfaces tienen todos sus metodos abstractos los metodos
 * pueden ser void como tipos que retornen valores
 * 
 */
public interface Vehiculo {

	public void encender();

	public boolean frenar(double valocidad);

	// sobre-cargar, dice que un metodo pude tener el mismo contrato
	// pero con distinta firma

	public boolean frenar();
	
	public void pilotoAutomatico();

}
