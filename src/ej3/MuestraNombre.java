package ej3;

import javax.swing.JOptionPane;

public class MuestraNombre {

	public static void main(String[] args) {

		String nombre;
		
		nombre= JOptionPane.showInputDialog("Introduce tu nombre");
		
		JOptionPane.showMessageDialog(null, "Bienvenido "+nombre);

	}

}
