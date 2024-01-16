package aula13;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Faca um Programa que peca um numero e entao mostre a mensagem: O numero informado foi [numero]
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Insira um numero inteiro: ");
		int number = sc.nextInt();
		System.out.println("O numero digitado foi: " + number);
	}

}
