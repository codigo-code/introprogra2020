package edu.codigocode.modelo;

public class Camion extends InfoVehiculo implements Vehiculo {

	public Camion(String marca, String modelo, String color,int cc) {
		super(marca, modelo, color,cc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void encender() {
		System.out.println("enciende electronicamente");
		
	}

	@Override
	public boolean frenar(double valocidad) {
		if(valocidad < 100)
		{
			System.out.println("necesito 10 km");
			return true;
		}else {
			System.out.println(" choco");
			return false;
		}
	}

	@Override
	public boolean frenar() {
		System.out.println("No llego a frenar");
		return false;
	}

	@Override
	public void pilotoAutomatico() {
		System.out.println("puede ir durmiendo que yo manejo! soy piloto automatico de los simpson");
		
	}

	
}
