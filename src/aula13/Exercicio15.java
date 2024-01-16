package aula13;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// 
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o valor recebido por hora: ");
		double valorUm = scan.nextDouble();
		
		System.out.println("Insira o numero de horas trabalhadas no mes: ");
		double valorDois = scan.nextDouble();
		
		double salarioBruto = valorUm * valorDois;
		double inss = (salarioBruto / 100) * 8;
		double sindi = (salarioBruto / 100) * 5;
		double impostoRenda = (salarioBruto / 100) * 11;
		
		double descontosTotais = inss + sindi + impostoRenda;
		
		double salarioLiquido = salarioBruto - descontosTotais;
		
		
		System.out.println("Salario bruto foi de " + salarioBruto);
		System.out.println("O valor de inss foi de:" + inss);
		System.out.println("O sindicato foi de:  " + sindi);
		System.out.println("O imposto de renda foi de: " + impostoRenda);
		System.out.println("O Total de descontos foi de: " + descontosTotais);
		System.out.println("O Salario liquido foi de: " + salarioLiquido);
	}

}
