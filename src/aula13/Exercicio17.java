package aula13;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a área em metros da area a pintar: ");
        double area = scan.nextDouble();

        int metrosLata = 6 * 18;
        int metrosLata2 = (3600 * 18);
        int valorLata = 80;
        int valorLata2 = 25;
        double quantidade = Math.ceil(area / metrosLata);
        double valorTotal = valorLata * quantidade;

        System.out.println("Você precisará comprar " + quantidade + " latas de tinta. Total pago: " + valorTotal);

        scan.close();

	}

}
