package aula13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes formulas:
		//Peca o peso da pessoa e informe se ela estra dentro, acima ou abaixo do peso.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira sua altura: ");
		double alturaInserida = scan.nextDouble();
		
		System.out.println("Insira o seu sexo 'f' ou 'm': ");
		char sexoInserido = scan.next().charAt(0);
		
		double peso;
		
		if (sexoInserido == 'm' || sexoInserido == 'M') {
			peso = (72.7 * alturaInserida) - 58;
			
		} else {
			peso = (62.1 * alturaInserida) - 44.7;
		} 
		
		
		
		
		
	
		

		
		
		
		
		
		
		
		
		

	}

}
