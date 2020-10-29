package edu.vista;

import java.util.ArrayList;
import java.util.List;

import edu.modelo.Humano;
import edu.modelo.Mamifero;
import edu.modelo.Perro;

public class App {

	public static void main(String[] args) {

		List<String> nombres = new ArrayList<String>();
		nombres.add("pepe");
		nombres.add("fulano");
		nombres.add("fulano2");
		nombres.add("fulano3");
		nombres.add("fulano4");

		int cont = nombres.size() - 1;

		// while ejecuta siempre y cuando la condicion ( ) sea verdadera
		while (cont >= 0) {

			System.out.println(nombres.get(cont));
			;
			cont--;

		}
		cont = nombres.size() - 1;
		// do - while / ejecuta aunque la concion sea falta ( la primera vez ejecuta el
		// codigo )
		do {

			System.out.println(nombres.get(cont));
			;
			cont--;
		} while (cont < 0);

		int i = 0;

//		while(true) {
//			System.out.println(i);
//			i++;
//		}

		Mamifero m1 = new Humano();
		m1.setNombre("pepe");
		Mamifero m2 = new Perro();
		m2.setNombre("Boby");
		m1.caminar();

		System.out.println(m1.getNombre() + "  " + m1.hablar());
		m2.caminar();
		System.out.println(m2.getNombre() + "  " + m2.hablar());

	}

}
