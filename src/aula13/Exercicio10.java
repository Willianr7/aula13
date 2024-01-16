package aula13;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// Faca um Programa que peca a temperatura em Graus Celsius, tranforme e mostre em graus Farenheit.
		
		Scanner sc = new Scanner(System.in);
		char resp;
		
		
		do {
			System.out.print("Digite a temperatura em celsius: ");
		
		double C = sc.nextDouble();
		double F = 9.0 * C / 5.0 + 32.0;
		System.out.printf("Equivalente em Fahrenheit  %.2f%n", F);
		System.out.print("Deseja repetir (s/n)? ");
		resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		sc.close();

	}

}
