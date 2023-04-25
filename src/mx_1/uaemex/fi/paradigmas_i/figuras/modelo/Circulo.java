package mx_1.uaemex.fi.paradigmas_i.figuras.modelo;

import mx_1.uaemex.fi.paradigmas_i.figuras.error.ValorNoValidoException;

public class Circulo implements Figura {
	private double radio;

	public Circulo() {
		this.radio= 0.0;
	}

	public Circulo(double r) throws ValorNoValidoException {
		this.setRadio(r);
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) throws ValorNoValidoException {
		if(radio<0) {
			throw new ValorNoValidoException();
		}
		this.radio = radio;
	}

	@Override
	public double perimetro() {
		return this.radio*2*Math.PI;
	}

	@Override
	public double area() {
		return Math.pow(this.radio, 2)*Math.PI;
	}

}
