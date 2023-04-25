package mx_1.uaemex.fi.paradigmas_i.figuras.modelo;

import mx_1.uaemex.fi.paradigmas_i.figuras.error.ValorNoValidoException;

public abstract class FiguraDeLadosIguales implements Figura {
	protected double lado;
	protected int numeroLados;

	public FiguraDeLadosIguales(int nL) throws ValorNoValidoException {
		this.setNumeroLados(nL);
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) throws ValorNoValidoException {
		if(lado < 0) {
			throw new ValorNoValidoException("no se pueden definir lados negativos");
		}
		this.lado = lado;
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	public void setNumeroLados(int numeroLados) throws ValorNoValidoException{
		if(numeroLados < 3) {
			throw new ValorNoValidoException("No podemos tener figuras con menos de 3 lados iguales");
		}
		this.numeroLados = numeroLados;
	}

	@Override
	public double perimetro() {
		return this.lado*this.numeroLados;
	}


}
