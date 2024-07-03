package controller;

import java.util.Locale;
import java.util.Scanner;

public class Questao04 {

	/*
	 * 4) Fazer um programa que pergunte um número inteiro e apresente o seu
	 * antecessor e seu sucessor.
	 */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		int num;
		
		System.out.println("Informe um número: "); // escreval
		num = scanner.nextInt(); // leia
		
		System.out.println("O antecessor de " + num + " é " + ( num - 1 ));
		System.out.println("O sucessor de " + num + " é " + ( num + 1 ));
		
		scanner.close();
	}
}
