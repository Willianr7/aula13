package aula13;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		 Scanner scan = new Scanner(System.in);

	        System.out.println("Digite a área em metros da area a pintar:  ");
	        double areaInserida = scan.nextDouble();

	        int metrosAPintar = 3 * 18;
	        int valorDaLataDezoitoL = 80;
	        double quantidadeLatas = Math.ceil(areaInserida / metrosAPintar);
	        double valorTotal = valorDaLataDezoitoL * quantidadeLatas;
	        System.out.println("Quantidade a ser comprada: " + quantidadeLatas + " latas de tinta. Valor total: " + valorTotal);

	        scan.close();

	}

}
