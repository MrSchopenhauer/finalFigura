package mx_1.uaemex.fi.paradigmas_i.figuras.modelo;

import mx_1.uaemex.fi.paradigmas_i.figuras.error.ValorNoValidoException;

public class Rectangulo implements Figura{
	
	private double base;
	private double altura;
	
	public Rectangulo() throws ValorNoValidoException {
		this.base=0;
		this.altura=0;	
	}

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
		

	public void setBase(double base) {
		this.base = base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	

	@Override
	public double perimetro() {
		return this.base*2+this.altura*2;
	}

	@Override
	public double area() {
		return this.base*this.altura;
	}

}
