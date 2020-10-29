package edu.codigocode.modelo;

import java.io.Serializable;

public class Auto extends InfoVehiculo implements Vehiculo {

	public Auto(String marca, String modelo, String color,int cc) {
		super(marca, modelo, color,cc);
	}

	@Override
	public void encender() {
		System.out.println("El auto marca " + getMarca() +" necesita cebador ");

	}

	@Override
	public boolean frenar(double velocidad) {
		if (velocidad <= 10) {
			System.out.println("freno sin derrapar utilizando abs");
			return true;
		} else if (velocidad > 10 && velocidad < 100) {
			System.out.println("freno con abs pero necesito 100 mts");
			return true;
		} else {
			System.out.println(" no freno y voy a chocar !!!");
			return false;
		}
	}

	@Override
	public boolean frenar() {
		System.out.println(" freno pero no puedo calcular el espacio en metros");
		return true;
	}

	@Override
	public void pilotoAutomatico() {
		System.out.println(getModelo() +  " pilo automatico encendido!" );

	}

}
