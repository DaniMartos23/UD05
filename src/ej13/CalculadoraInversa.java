package ej13;
import java.util.Scanner;

public class CalculadoraInversa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce operando 1: ");
		String s_operando1= sc.nextLine();
		int operando1=Integer.parseInt(s_operando1);
		
		System.out.print("Introduce operando 2: ");
		String s_operando2= sc.nextLine();
		int operando2=Integer.parseInt(s_operando2);
		
		System.out.print("Introduce operación: ");
		String operacion= sc.nextLine();
		
		switch(operacion){
		
			case "+":
				System.out.println(operando1 + " + " + operando2 + " = " + (operando1+operando2));
				break;
				
			case "-":
				System.out.println(operando1 + " - " + operando2 + " = " + (operando1-operando2));
				break;
				
			case "*":
				System.out.println(operando1 + " * " + operando2 + " = " + (operando1*operando2));
				break;
				
			case "/":
				System.out.println(operando1 + " / " + operando2 + " = " + ((double)operando1/(double)operando2));
				break;
				
			case "^":
				System.out.println(operando1 + " ^ " + operando2 + " = " + (Math.pow(operando1, operando2)));
				break;
				
			case "%":
				System.out.println(operando1 + " % " + operando2 + " = " + (operando1%operando2));
				break;
				
			default:
				System.out.println("No es una operación");
				break;
				
		}
		sc.close();

	}

}
