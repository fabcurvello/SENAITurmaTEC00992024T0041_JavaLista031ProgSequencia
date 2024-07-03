package controller;

import util.Teclado;

public class Questao03 {

	/*
	 * 3) Fazer um programa que pergunte um valor em Dólares e apresente o
	 * equivalente em Reais. Considere U$1,00 = R$5,43.
	 */

	public static void main(String[] args) {
		
		double dolar, real;
		
		dolar = Teclado.lerDouble("Informe um valor em Dólares: ");
		
		real = dolar * 5.43;
		
		System.out.println("Você possui " + real + " Reais");

	}

}
