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
import mx_1.uaemex.fi.paradigmas_i.figuras.modelo.PoligonoRegular;

public class PoligonoDataV extends FiguraAbstracta implements ActionListener {


	private static final long serialVersionUID = 1L;
	private JSpinner lado;
	private JSpinner apotema;
	
	public PoligonoDataV() {
		super("Datos Poligono");
		JButton btn;
		JPanel panel = new JPanel(new GridLayout(3,2));
		panel.setBorder(new EmptyBorder(10,10,10,10));
		
		JLabel etq = new JLabel("Lado: ");
		this.lado = new JSpinner();
		panel.add(etq);
		panel.add(lado);
		
		etq = new JLabel("Apotema: ");
		this.apotema = new JSpinner();
		panel.add(etq);
		panel.add(apotema);
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando;
		String nombre = "VentanaCalculos";
		
		comando = e.getActionCommand();
		
		switch(comando) {
		case "Enviar":
			int ln = (Integer)this.lado.getValue();
			int aptma = (Integer)this.apotema.getValue();
			if(ln < 1 && aptma < 1) {
				JOptionPane.showMessageDialog(this,"El valor debe ser un numero superior a cero");
			} else {
				//Enviar el valor
				PoligonoRegular p;
				try {
					p = new PoligonoRegular();
					p.setLado(ln);
					p.setApotema(aptma);
					this.ctrl.setFigura(p);
					this.ctrlVentanas.ManipularVentanas(nombre);
				} catch (ValorNoValidoException e1) {
					JOptionPane.showMessageDialog(this, e1.getMessage());
				}
			}
			
			
			break;
		case "Limpiar":
			this.lado.setValue(Integer.parseInt("0"));
			this.apotema.setValue(Integer.parseInt("0"));
			break;
		}
		
	}

}
