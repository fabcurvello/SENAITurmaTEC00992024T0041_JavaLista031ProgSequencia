package controller;

import util.Teclado;

public class Questao02 {
	
	/*
	 * 2)	Elaborar um programa que pergunte quatro valores 
	 * inteiros e apresente 2 resultados: 
			a)	Resultado de suas adições
			b)	Resultado de suas multiplicações

	 */

	public static void main(String[] args) {
		int n1, n2, n3, n4, soma, mult;
		
		n1 = Teclado.lerInt("Informe o primeiro número: ");
		n2 = Teclado.lerInt("Informe o segundo número: ");
		n3 = Teclado.lerInt("Informe o terceiro número: ");
		n4 = Teclado.lerInt("Informe o quarto número: ");
		
		soma = n1 + n2 + n3 + n4;
		mult = n1 * n2 * n3 * n4;
		
		System.out.println("Soma = " + soma);
		System.out.println("Multiplicação = " + mult);
	}
}
