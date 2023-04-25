package mx_1.uaemex.fi.paradigmas_i.figuras.vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.border.EmptyBorder;

import mx_1.uaemex.fi.paradigmas_i.figuras.error.ValorNoValidoException;
import mx_1.uaemex.fi.paradigmas_i.figuras.modelo.Circulo;

public class CirculoDataV extends FiguraAbstracta implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JSpinner campo;
	
	public CirculoDataV() {
		super("Datos Circulo");
		JButton btn;
		JPanel panel = new JPanel(new GridLayout(2,2));
		panel.setBorder(new EmptyBorder(10,10,10,10));
		
		JLabel etq = new JLabel("Radio: ");
		this.campo = new JSpinner();
		panel.add(etq);
		panel.add(campo);
		
		btn = new JButton("Enviar");
		btn.setActionCommand("Enviar");
		btn.addActionListener(this);
		panel.add(btn);
		
		btn = new JButton("Limpiar");
		btn.setActionCommand("Limpiar");
		btn.addActionListener(this);
		panel.add(btn);
		
		this.getContentPane().add(BorderLayout.CENTER,panel);
		this.pack();
		this.setResizable(false);
	}
	
	public void actionPerformed(ActionEvent e) {
		String comando;
		String nombre = "VentanaCalculos";
		
		comando = e.getActionCommand();
		
		switch(comando) {
		case "Enviar":
			int c = (Integer)this.campo.getValue();
			if(c < 1 ) {
				JOptionPane.showMessageDialog(this,"El valor debe ser un numero superior a cero");
			} else {
				//Enviar el valor
				Circulo i;
				try {
					i = new Circulo();
					i.setRadio(c);
					this.ctrl.setFigura(i);
					this.ctrlVentanas.ManipularVentanas(nombre);
				} catch (ValorNoValidoException e1) {
					JOptionPane.showMessageDialog(this, e1.getMessage());
				}
			}
			break;
		case "Limpiar":
			this.campo.setValue(Integer.parseInt("0"));
			break;
		}
		
	}
}
