package ej1;

public class NumMayor {

	public static void main(String[] args) {
		
		int num1=0, num2=10, i=0;
		
		while(i<10) {
			System.out.println("Iteración número "+i+ ": valor primer número es "+num1+ " y el valor del segundo número es "+num2);
			if(num1>num2) 
				System.out.println("El número "+ num1 + " es major que "+ num2);
			else if (num1<num2)
				System.out.println("El número "+ num2 + " es major que "+ num1);
			else
				System.out.println("El número "+ num1 + " es igual que "+ num2);
			num1++;
			num2--;
			i++;
		}

	}

}
