package aula13;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a sua altura: ");
        double alturaInserida = scan.nextDouble();
        
        System.out.println("Insira o seu sexo 'f' ou 'm': ");
        String sexoInserido = scan.next();

        double pesoIdeal;

        if (sexoInserido == "M" || sexoInserido == "m" || sexoInserido == "m " || sexoInserido == "M ") {
            pesoIdeal = ((72.7 * alturaInserida) - 58);
        } else {
            pesoIdeal = ((62.1 * alturaInserida) - 44.7);
        }

        System.out.println("Digite o seu peso: ");
        double pesoInserido = scan.nextDouble();

        if (pesoInserido > pesoIdeal) {
            System.out.println("Cuide-se! Você está acima do peso.");
        }else if (pesoInserido == pesoIdeal) {
            System.out.println("Parabens! Você está dentro do peso.");
        }else if (pesoInserido < pesoIdeal) {
            System.out.println("Cuide-se! Você está abaixo do peso.");
        }
        scan.close();

		
		

	}

}
