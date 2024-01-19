package aula13;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira o peso do peixe ");
		double pesoDoPeixe = scan.nextDouble();
		double multaPorExcesso = 4;
		
		if(pesoDoPeixe >= 50) {
			System.out.println("o peso do peixe esta com excesso! Voce devera pagar por quilo excedente: " + multaPorExcesso);
		    multaPorExcesso = pesoDoPeixe - 50;
		} else {
			System.out.println("Zero!");
		}
		
	}

}
