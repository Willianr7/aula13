package aula13;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// Faca um Programa que peca a temperatura em Graus Farenheit, tranforme e mostre a temperatura em graus Celsius.
		
		Scanner scan = new Scanner(System.in);
		char resp;
		
		
		do {
			System.out.print("Digite a temperatura em Farenheit: ");
			
		double C = scan.nextDouble();
		double F = (C * 1.8) + 32;
		
		System.out.printf("Equivalente em Celsius  %.2f%n", C);
		System.out.print("Deseja repetir (s/n)? ");
		resp = scan.next().charAt(0);
		} while (resp != 'n');
		
		scan.close();

	}

}
