package aula13;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// Faca um Programa que pergunte quanto voce ganha por hora e o numero de horas trabalhadas no mes. Calcule e mostre o totaldo seu salario no referido mes.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o valor recebido por hora: ");
		double valorUm = scan.nextDouble();
		
		System.out.println("Insira o numero de horas trabalhadas no mes: ");
		double valorDois = scan.nextDouble();
		
		double resultado = valorUm * valorDois;
		
		System.out.println("O total do salario no mes foi de: " + resultado);
		
		
		
		
		

	}

}
