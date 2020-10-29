package edu.codigocode.controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.codigocode.modelo.Auto;
import edu.codigocode.modelo.Camion;
import edu.codigocode.modelo.Moto;
import edu.codigocode.modelo.Vehiculo;

public class VehiculoControlador {

	List<Vehiculo> listaVehiculo = new ArrayList<Vehiculo>();

	public void vehiculoComportamiento() {

		// a raiz de tener un template / modelo/ molde
		// Interfaz , lo que queremos es tener la funcionliada
		// por la clase que hemos implementado

		System.out.println("para salir del while presione s");
		boolean salir = false;
		
		while (!salir) {
			System.out.println("Para crear un auto presion 1 ");
			System.out.println("Para crear un moto presion 2 ");
			System.out.println("Para crear un camion presion 3 ");

			Scanner input = new Scanner(System.in);

			String opcion = input.nextLine();
			System.out.println("Escriba la marca");
			String marca = input.nextLine();
			System.out.println("Escriba el modelo");
			String modelo = input.nextLine();
			System.out.println("Escriba el color Color");
			String color = input.nextLine();
			System.out.println("Escriba las cilindradas");
			int cc = input.nextInt();

			 
			switch (opcion) {
			case "1":

				listaVehiculo.add(new Auto(marca, modelo, color, cc));
				break;
			case "2":

				listaVehiculo.add(new Moto(marca, modelo, color, cc));
				break;
			case "3":
				listaVehiculo.add(new Camion(marca, modelo, color, cc));
				break;
			default:
				break;
			}
			
			
			System.out.println(" Desea salir presione 0 , sino presine 1 ");
			
			int salida = input.nextInt();
			
			if(salida == 0 ) {
				salir = true;
			}
		}

		for (Vehiculo item : listaVehiculo) {
			System.out.println(item.getClass().getSimpleName());

			item.encender();
			if (item.frenar(50)) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
			item.frenar();
			item.pilotoAutomatico();
			System.out.println("===================");
		}

		 
	}

}
