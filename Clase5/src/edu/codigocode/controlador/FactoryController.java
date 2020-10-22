package edu.codigocode.controlador;

import edu.codigocode.modelo.BombonFruta;
import edu.codigocode.modelo.Caramlo;
import edu.codigocode.modelo.Gomita;
import edu.codigocode.modelo.Ingredinte;
import edu.codigocode.modelo.enumerable.TipoGolocinas;

/*
 * El controlador se ocupa de decir el "COMO" va a trabajar el comdelo
 * 
 */
public class FactoryController {

	// void --> procedimiento --> que no retorna valores
	// Ingrediente ---> funcion ---> retorna un objeto de tipo Ingrediente ---> siendo una golosina (ej Caramelo, bf, gomita)
	
	public Ingredinte fabricarGolocina(TipoGolocinas tg) {
		Ingredinte g1 =null;
		
		switch (tg) {
		case CARAMELO:
			g1 =new Caramlo(80, 12, 50, 1, 1);
			break;

		case GOMITA:
			g1 =new Gomita(50, 12, 50, 1, 1);
			break;

		case BOMBONFRUTA:
			g1 =new BombonFruta(60, 0, 50, 1, 1);
			// cast ---> conversion de un objeto en otro siempre y cuando
			// sea de la misma familia
			// Ingrediente ---> BomboFruta / Gomita /Caramelo
			
			// comprobacion de instancia
			
			if (g1 instanceof BombonFruta) {
				
				BombonFruta objBF = (BombonFruta) g1;
				objBF.setPectina(true);
				
			}
			
			break;

		}
//		System.out.println(g1);
		
		return g1;

	}
}
