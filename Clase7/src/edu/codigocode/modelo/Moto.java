package edu.codigocode.modelo;

public class Moto extends InfoVehiculo implements Vehiculo {

	public Moto(String marca, String modelo, String color,int cc) {
		super(marca, modelo, color,cc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void encender() {
		System.out.println("es a patada");

	}

	@Override
	public boolean frenar(double valocidad) {
		if (valocidad < 200) {
			System.out.println("frena con abs");
			return true;
		} else {
			System.out.println("estas tocando el arpa....");
			return false;
		}
	}

	@Override
	public boolean frenar() {
		System.out.println("la moto no puede frenar");
		return false;
	}

	@Override
	public void pilotoAutomatico() {

		System.out.println("la moto " + getModelo() + "  tiene piloto automatico ");
	}

}
