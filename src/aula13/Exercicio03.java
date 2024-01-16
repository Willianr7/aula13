package aula13;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Faca um programa que peca dois numeros e imprima a soma.
		 
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira o primeiro numero para calcular a soma: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Insira o segundo numero para calcular a soma: ");
		int numero2 = scan.nextInt();
	
	
		int resultadoDaSoma = numero1 + numero2;
		
		System.out.println("A soma dos numeros inseridos sao: " + resultadoDaSoma);
	
		
	}

}
