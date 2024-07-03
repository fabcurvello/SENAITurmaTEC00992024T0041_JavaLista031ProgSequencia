package controller;

import util.Teclado;

public class Questao07 {

	/*
	 * 7) Fazer um algoritmo que pergunte 3 números e apresente a média aritmética
	 * entre estes 3 números.
	 */

	public static void main(String[] args) {
		
		double n1, n2, n3, media;
		
		n1 = Teclado.lerDouble("Informe o primeiro número: ");
		n2 = Teclado.lerDouble("Informe o segundo número: ");
		n3 = Teclado.lerDouble("Informe o terceiro número: ");
		
		media = (n1 + n2 + n3) / 3;
		
		System.out.printf("A média é: %.1f", media);
	}

}
