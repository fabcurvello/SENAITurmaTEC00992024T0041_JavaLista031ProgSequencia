package controller;

import util.Teclado;

public class Questao06 {

	/*
	 * 6) Fazer um programa que pergunte uma temperatura ao usuário, em graus
	 * Fahrenheit, e apresente esta temperatura convertida em graus Celsius. A
	 * fórmula da conversão é c = (f – 32) x 5 : 9 , onde c é a temperatura em graus
	 * Celsius e f em Fahrenheit.
	 */

	public static void main(String[] args) {
		
		double c, f;
		
		f = Teclado.lerDouble("Informe uma temperatura em Graus Fahrenheit: ");
		
		//c = (f – 32) x 5 : 9
		c = (f - 32) * 5 / 9;
		
		//System.out.println(f + " em Graus Fahrenheit = " + c + " em Graus Celsius.");
		System.out.printf("%.2f em Graus Fahrenheit = %.2f em Graus Celsius.", f, c);

	}

}









