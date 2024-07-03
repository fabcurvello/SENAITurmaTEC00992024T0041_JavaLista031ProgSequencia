package controller;

import java.util.Locale;
import java.util.Scanner;

public class Questao01 {

	/*
	 * 1)	Desenvolver um programa que pergunte ao usuário o 
	 * seu nome completo e seu sexo. Em seguida, o programa 
	 * deve apresentar os dados anteriormente informados.
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		String nome, sexo;
		
		System.out.println("Informe o seu nome:");
		nome = scanner.nextLine();
		
		System.out.println("Informe o seu sexo:");
		sexo = scanner.nextLine();
		
		System.out.println("Nome informado: " + nome);
		System.out.println("Sexo informado: " + sexo);
				
		scanner.close();
	}// fim do método main
}// fim da classe
