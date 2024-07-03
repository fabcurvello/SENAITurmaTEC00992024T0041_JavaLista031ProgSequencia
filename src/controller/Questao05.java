package controller;

import java.util.Locale;
import java.util.Scanner;

/*
 * 5)	Fazer um programa que pergunte o salário de um funcionário e 
 * apresente este salário com um aumento de 15%.
 */

public class Questao05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		double salario, aumento;
		
		System.out.println("Informe o seu salário:");
		salario = scanner.nextDouble();

		aumento = salario * (15.0 / 100); // no scanner.nextDouble, devo usar 15.0 (e não somente 15).
		
		//System.out.println("Salário com 15% de aumento = R$ " + (salario + aumento) );
		System.out.printf("Salário com 15 por cento de aumento = R$ %.2f", (salario + aumento));
		
		scanner.close();
	}
}
