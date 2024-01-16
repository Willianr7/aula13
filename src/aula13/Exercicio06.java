package aula13;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// Faca um Programa que peca o raio de um circulo, calcule e mostre sua area.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira o raio do circulo para ser calculado a area: ");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow (raio, 2);
		
		System.out.println(" A area do circulo e: " + area);

	}

}
