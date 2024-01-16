package aula13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes formulas:
		//Peca o peso da pessoa e informe se ela estra dentro, acima ou abaixo do peso.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira sua altura: ");
        
		double alturaDoHomem = scan.nextDouble();
		double pesoIdealDoHomem = (72.7 * alturaDoHomem) - 58;
		
		System.out.println("O peso ideal de acordo com o calculo e de: " + pesoIdealDoHomem);
		
		System.out.println("Insira a sua altura se for do sexo feminino: ");
		
		double alturaDaMulher = scan.nextDouble();
		double pesoIdealDaMulher = (62.1 * alturaDaMulher) - 44.7;
		
		System.out.println("O peso ideal de acordo com o calculo e de: " + pesoIdealDaMulher);
		
		
		System.out.println("Insira o seu peso: ");
		
		double pesoDaPessoa = scan.nextDouble();
		
		System.out.println("Parabens, voce esta dentro do peso se for homem! " + pesoIdealDoHomem);
		System.out.println("Parabens, voce esta dentro do peso se for mulher! " + pesoIdealDaMulher);
		System.out.println("Infelizmente, voce esta abaixo ou acima do peso! " + pesoDaPessoa);
		
		
		
		
		
		
		
		
		

	}

}
