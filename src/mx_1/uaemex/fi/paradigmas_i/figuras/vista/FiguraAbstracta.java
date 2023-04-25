package mx_1.uaemex.fi.paradigmas_i.figuras.vista;

import mx_1.uaemex.fi.paradigmas_i.figuras.control.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.border.EmptyBorder;

public abstract class FiguraAbstracta  extends JFrame{
	protected ControlVentanas ctrlVentanas;
	protected ControlFiguras ctrl;
	
	 public FiguraAbstracta(String string) {
		// TODO Auto-generated constructor stub
	}

	public void setCtrlVentanas (ControlVentanas ctrlVentanas) {
		this.ctrlVentanas = ctrlVentanas;
	 }
	
	public void setCtrl(ControlFiguras ctrl) {
		this.ctrl = ctrl;
	}


	}

