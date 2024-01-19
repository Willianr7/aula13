package aula13;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira o tamanho do arquivo para download em 'MB': ");
		double arquivoSize = scan.nextDouble();
		
		System.out.println("Insira a velocidade de um link de Internet em 'Mbps': ");
		double internetSpeedDownload = scan.nextDouble();
		
		double tempoAproximadoDeDownload = arquivoSize / internetSpeedDownload;
		System.out.println("O tempo aproximado de download e de: " + tempoAproximadoDeDownload);

	}

}
