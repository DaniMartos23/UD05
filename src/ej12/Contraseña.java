package ej12;
import java.util.Scanner;

public class Contraseña {

	public static void main(String[] args) {
		
		String contrasena="dani";
		Scanner sc= new Scanner(System.in);
		String contra;
		Boolean comp=false;
		int i=0;
		do {
			System.out.print("Introduce contraseña ");
			contra=sc.nextLine();
			i++;
			if(contra.equals(contrasena))
				comp=true;
		}while(i<3 && !comp);		
		if(comp) {
			System.out.println("Enhorabuena");
		}
		else
			System.out.println("Se ha llegado al máximo de intentos permitidos");
		
		sc.close();

	}

}
