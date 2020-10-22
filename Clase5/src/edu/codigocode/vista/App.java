package edu.codigocode.vista;

import java.util.ArrayList;
import java.util.List;

import edu.codigocode.controlador.FactoryController;
import edu.codigocode.modelo.BombonFruta;
import edu.codigocode.modelo.Caramlo;
import edu.codigocode.modelo.Ingredinte;
import edu.codigocode.modelo.enumerable.TipoGolocinas;

public class App {

	
	public static void main(String[] args) {
		
		FactoryController fc = new FactoryController();
		// 3 objetos --> 
		List<Ingredinte> listaGolocionas = new ArrayList<Ingredinte>();
		
		listaGolocionas.add(fc.fabricarGolocina(TipoGolocinas.GOMITA));
		listaGolocionas.add(fc.fabricarGolocina(TipoGolocinas.CARAMELO));
		listaGolocionas.add(fc.fabricarGolocina(TipoGolocinas.GOMITA));
		listaGolocionas.add(fc.fabricarGolocina(TipoGolocinas.BOMBONFRUTA));
		
//		List<Ingredinte> list2 = new ArrayList<Ingredinte>();
//      NO APLICAR!!! DE ESTA MANERA; SIEMPRE PASAR POR UN CONTROLADOR		
//		list2.add(new Caramlo(1, 1, 1, 1, 1));
		
		
		
//		listaGolocionas.add(fc.fabricarGolocina(TipoGolocinas.BOMBONFRUTA));
		
		
		// loop / bucles / ciclos
		
		for (int i = 0; i < listaGolocionas.size(); i++) {
			System.out.println("Para "+listaGolocionas.get(i).getClass().getSimpleName() + ", KG de azucar =  "+  listaGolocionas.get(i).getAzucar());
			
			 
			
			if(listaGolocionas.get(i).getClass().getSimpleName().equals("BombonFruta")) {
				// convertimos el ingrediente nuevamente en un bombonfruta
				
				if (listaGolocionas.get(i) instanceof BombonFruta) {
					BombonFruta obj = (BombonFruta) listaGolocionas.get(i);
					
					System.out.println("Para el BombonFruta lleva Pectina " + obj.isPectina());
				}
			}
			
		
		}
		
		
		
//		List<String> nombres = new ArrayList<String>();
//		
//		nombres.add("dante");
//		nombres.add("Magui");
//		nombres.add("pepe");
		
		
//		// bucle 
//		for (int i = 0; i < nombres.size(); i++) {
//			
//			System.out.println("Su nombre es: " +  nombres.get(i));
//		}
//		
		
	}
}
