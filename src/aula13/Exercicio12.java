package aula13;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a formula:
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira sua altura: ");
		double alturaDaPessoa = scan.nextDouble();
		
		double pesoIdealDaPessoa = (72.7 * alturaDaPessoa) - 58;
		
		System.out.println("O peso ideal de acordo com o calculo e de: " + pesoIdealDaPessoa);
		
		

	}

}
