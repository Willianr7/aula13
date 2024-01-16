package aula13;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// Faca um programa que converta metros para centimetros:
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira o valor do metro para ser convertido em centimetros: ");
		double metros = scan.nextDouble();
		double resultado = metros * 100;
		
		System.out.println("O valor convertido do metro para centimetros e:  " + resultado);
		

	}

}
