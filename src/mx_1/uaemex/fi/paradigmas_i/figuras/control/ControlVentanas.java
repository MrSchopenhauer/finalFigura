package mx_1.uaemex.fi.paradigmas_i.figuras.control;

import javax.swing.JOptionPane;

import mx_1.uaemex.fi.paradigmas_i.figuras.vista.*;

public class ControlVentanas  {
	private CirculoDataV ventanaCirculo;
	private VentanaCalculos ventanaCalculos;
	private CuadradoDataV ventanaCuadrado;
	private RectanguloDataV ventanaRectangulo;
	private PoligonoDataV ventanaPoligono;
	
	public ControlVentanas (CuadradoDataV cuadrado, CirculoDataV circulo, PoligonoDataV poligono, RectanguloDataV rectangulo, VentanaCalculos ventanaCalculos) {
		this.ventanaCuadrado = cuadrado;
		this.ventanaCalculos = ventanaCalculos;
		this.ventanaRectangulo = rectangulo;
		this.ventanaPoligono = poligono;
		this.ventanaCirculo = circulo;
	}
	

	public void setVentanaCirculo(CirculoDataV ventanaCirculo) {
		this.ventanaCirculo = ventanaCirculo;
	}
	public void setVentanaPoligono(PoligonoDataV ventanaPoligono) {
		this.ventanaPoligono = ventanaPoligono;}
	
	public void setVentanaRectangulo(RectanguloDataV ventanaRectangulo) {
		this.ventanaRectangulo = ventanaRectangulo;
		}

	public void setVentanaCalculos(VentanaCalculos ventanaCalculos) {
		this.ventanaCalculos = ventanaCalculos;
	}
	
	public void setVentanaCuadrado(CuadradoDataV ventanaCuadrado) {
		this.ventanaCuadrado = ventanaCuadrado; 
		}
	
	public void ManipularVentanas(String nombre) {
		switch(nombre) {
		case ("Cuadrado"):
			this.ventanaCuadrado.setVisible(true);
			this.ventanaCalculos.setVisible(false);
			break;
		
		case ("Rectangulo"):
			this.ventanaRectangulo.setVisible(true);
			this.ventanaCalculos.setVisible(false);
			break;
			
		case ("Pentagono"):
		case ("Hexagono"):
		case ("Heptagono"):
			this.ventanaPoligono.setVisible(true);
			this.ventanaCalculos.setVisible(false);
			break;
		
		case ("Circulo"):
			this.ventanaCirculo.setVisible(true);
			this.ventanaCalculos.setVisible(false);
			break;
			
		case ("VentanaCalculos"):
			this.ventanaCuadrado.setVisible(false);
			this.ventanaRectangulo.setVisible(false);
			this.ventanaPoligono.setVisible(false);
			this.ventanaCirculo.setVisible(false);
		    this.ventanaCalculos.setVisible(true);
		    break;
		default:
			System.out.println(nombre);
			break;
		
		}
	}

	


}
