package mx_1.uaemex.fi.paradigmas_i.figuras.principal;

import javax.swing.JFrame;

import mx_1.uaemex.fi.paradigmas_i.figuras.control.*;

import mx_1.uaemex.fi.paradigmas_i.figuras.error.ValorNoValidoException;
import mx_1.uaemex.fi.paradigmas_i.figuras.modelo.Cuadrado;
import mx_1.uaemex.fi.paradigmas_i.figuras.modelo.Figura;
import mx_1.uaemex.fi.paradigmas_i.figuras.modelo.PoligonoRegular;
import mx_1.uaemex.fi.paradigmas_i.figuras.vista.CirculoDataV;
import mx_1.uaemex.fi.paradigmas_i.figuras.vista.CuadradoDataV;
import mx_1.uaemex.fi.paradigmas_i.figuras.vista.PoligonoDataV;
import mx_1.uaemex.fi.paradigmas_i.figuras.vista.RectanguloDataV;
import mx_1.uaemex.fi.paradigmas_i.figuras.vista.VentanaCalculos;


public class Principal {


	public static void main(String[] args) {
		VentanaCalculos vCalc;
		ControlFiguras control = new CtrlFigurasReal();
		CuadradoDataV v4 = new CuadradoDataV();
		RectanguloDataV v2 = new RectanguloDataV();
		PoligonoDataV v1 = new PoligonoDataV();
		CirculoDataV v3 = new CirculoDataV();
		
		
		
		vCalc = new VentanaCalculos();
		vCalc.setBounds(20, 20, 300, 300);
		vCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vCalc.setVisible(true);			
		ControlVentanas controlV = new ControlVentanas(v4,v3,v1,v2, vCalc);
		vCalc.setCtrl(control);
		vCalc.setCtrlVentanas(controlV);
		
		v2.setCtrl(control);
		v2.setCtrlVentanas(controlV);
		
		v4.setCtrl(control);
		v4.setCtrlVentanas(controlV);
		
		v1.setCtrl(control);
		v1.setCtrlVentanas(controlV);
		
		v3.setCtrl(control);
		v3.setCtrlVentanas(controlV);

	}
	}

