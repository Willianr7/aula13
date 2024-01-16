package aula13;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// Faca um Programa que peca 2 numeros inteiros e um numero real.
		// Calcule e mostre: O Produto do dobro do primeiro com metade do segundo
		// a soma do triplo do primeiro com o terceiro.
		// o terceiro elevado ao cubo.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o primeiro numero: ");
		int numeroUm = scan.nextInt();
		System.out.println("Insira o segundo numero: ");
		int numeroDois = scan.nextInt();
		System.out.println("Insira o terceiro numero: ");
		double numeroTres = scan.nextDouble();
		
	    int produto = (numeroUm * 2) * (numeroDois / 2); 
	    double soma = (numeroUm * numeroTres) + numeroTres;
	    double cubo = Math.pow (numeroTres, 3);
		
	    System.out.println("O produto do dobro do primeiro com metade do segundo e: " + produto);
	    System.out.println("A soma do triplo do primeiro com o terceiro e: " + soma);
	    System.out.println("o terceiro elevado ao cubo e: " + cubo);
		
		
		
		
		
	}

}
