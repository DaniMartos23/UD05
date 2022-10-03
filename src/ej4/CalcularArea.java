package ej4;
import java.util.Scanner;
public class CalcularArea {

	public static void main(String[] args) {
		
		String s_radio;
		double radio,resultado;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Introduce radio: ");
		
		s_radio = sc.nextLine();
		sc.close();
		
		radio= Double.parseDouble(s_radio);
		
		resultado= Math.PI*Math.pow(radio, 2);
		
		System.out.println("El área de un circulo con radio "+s_radio+ " es igual a "+resultado);
			
	}

}
