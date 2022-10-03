package ej6;
import javax.swing.JOptionPane;

public class CalcularPrecio {

	public static void main(String[] args) {
		
		final double IVA = 0.21;
		
		String s_valor;
		double valor, resultado;
		
		s_valor= JOptionPane.showInputDialog("Introduce valor");
		
		valor= Double.parseDouble(s_valor);
		resultado= valor + valor*IVA;
		
		JOptionPane.showMessageDialog(null, "El precio del producto con IVA es  "+resultado);

	}

}
