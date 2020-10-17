package edu.codigocode.vista;

import edu.codigocode.modelo.Persona;
import edu.codigocode.modelo.TipoDeporte;

public class App {
  
	public static void main(String[] args) {
		 
		Persona p = new Persona();
		p.limiteDiario=5;
		p.nombre="dante";
		p.edad=38;
		p.cantAbdominales =15;
		
		p.caminar(20);
		p.deportesHabilitados(TipoDeporte.ABDOMINALES);
		
		
		
		System.out.println("**se incluye otro usuario y se reutiliza la variable p   ej: nada que ver  ссс у  ** ");
		
		p.nombre="pepa";
		p.edad=5;
		p.limiteDiario=4;
		System.out.println("*******");
		p.deportesHabilitados(TipoDeporte.CICLISMO);
		System.out.println("*******");		
		System.out.println("=======================================");
		Persona p1 = new Persona();
		
		p1.limiteDiario=30;
		p1.nombre="pepito";
		p1.edad=20;
		p1.caminar(27.5);
		System.out.println("*******");
		p1.deportesHabilitados(TipoDeporte.CAMINAR);
		System.out.println("*******");
		
		
		Persona p3 = new Persona();
		p3.nombre="Ariel";
		p3.edad=40;
		System.out.println("*******");
		p3.deportesHabilitados(TipoDeporte.CORRER);
		System.out.println("*******");
		
	}
}
