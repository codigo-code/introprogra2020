package edu.codigocode.modelo;

public abstract class InfoVehiculo {

	private String marca;
	private String modelo;
	private String color;
	private int cc;

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public InfoVehiculo(String marca, String modelo, String color, int cc) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.cc = cc;
	}

}
