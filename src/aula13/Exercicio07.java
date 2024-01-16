package aula13;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		//Faca um Programa que calcule a area de um quadrado, em seguida mostre o dobro desta area para o usuario.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira o lado do quadrado: ");
		
		double lado = scan.nextDouble();
		double outroLado = scan.nextDouble();
		
		double resultado = lado * outroLado;
		
		System.out.println("O dobro da area do quadrado e: " + resultado * 2);
		

	}

}
