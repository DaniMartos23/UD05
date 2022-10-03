package ej10;
import javax.swing.JOptionPane;

public class NumeroVentas {

	public static void main(String[] args) {
		
		String s_ventas;
		int ventas,pventas,i;
		i=0;
		pventas=0;
		
		s_ventas= JOptionPane.showInputDialog("Introduce el numero de ventas");
		ventas=Integer.parseInt(s_ventas);
		
		do {
			s_ventas= JOptionPane.showInputDialog("Introduce las ventas");
			pventas+=Integer.parseInt(s_ventas);
			i++;
		}while(i<ventas);
		
		JOptionPane.showMessageDialog(null, "El número de ventas total es: "+ pventas);

	}

}
