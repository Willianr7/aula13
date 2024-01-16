package aula13;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// Faca um Programa que peca as 4 notas bimestrais e mostre a media
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira a primeira nota do bimestre para calcular a media: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Insira a segunda nota do bimestre para calcular a media: ");
		double nota2 = scan.nextDouble();
		
		System.out.println("Insira a terceira nota do bimestre para calcular a media: ");
		double nota3 = scan.nextDouble();
		
		System.out.println("Insira a quarta nota do bimestre para calcular a media: ");
		double nota4 = scan.nextDouble();
 
		double resultado = nota1 + nota2 + nota3 + nota4 / 4;
		
		System.out.println("O resultado da soma das notas do bimestre e: " + resultado);

		
		
	}

}
