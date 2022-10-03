package ej5;
import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Inserta un valor: ");
		String s_num=sc.nextLine();
		sc.close();
		
		int num=Integer.parseInt(s_num);
		if(num%2==0)
			System.out.println("El numero "+s_num+" es divisible entre 2");
		else
			System.out.println("El numero "+s_num+" no es divisible entre 2");

	}

}
