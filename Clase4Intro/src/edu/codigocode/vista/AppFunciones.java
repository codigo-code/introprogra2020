package edu.codigocode.vista;

import edu.codigocode.modelo.Persona;

public class AppFunciones {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		
		if(p.caloriasAQuemarDiarias(10000)) {
			System.out.println("  : )    Felicidades cumpliste tu objetivo diario  :) ");
		}else {
			System.out.println(":( BUUUUUUUUUUUUUUUUUUUU MUERTO! :(");
		}
		
		
	}
}
