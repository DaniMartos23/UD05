package ej11;
import java.util.Scanner;
public class Laboral {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Boolean comp;
		
		do {
			comp=false;
			System.out.print("Introduce dia de la semana: ");
			
			String dia= sc.nextLine();
			dia=dia.toLowerCase();
			
			
			switch(dia){
			
				case "lunes":
					System.out.println("Es un dia laboral");
					break;
					
				case "martes":
					System.out.println("Es un dia laboral");
					break;
					
				case "miercoles":
					System.out.println("Es un dia laboral");
					break;
					
				case "jueves":
					System.out.println("Es un dia laboral");
					break;
					
				case "viernes":
					System.out.println("Es un dia laboral");
					break;
					
				case "sabado":
					System.out.println("Es un dia festivo");
					break;
					
				case "domingo":
					System.out.println("Es un dia festivo");
					break;
					
				default:
					System.out.println("No es un dia de la semana");
					comp=true;
					break;
				
				
			}
		}while(comp);
		
		sc.close();

	}


}
