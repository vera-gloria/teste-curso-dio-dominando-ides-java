package com.dio.Calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Digite o primeiro valor: ");		
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("soma " + soma);
		System.out.println("subtra��o " + subtracao);
		System.out.println("multiplica��o " + multiplicacao);
		System.out.println("divis�o " + divisao);
	}
	
	private static double soma(double a, double b) {
		return a + b;
	}
	
	private static double subtracao(double a, double b) {
		return a - b;
	}
	
	private static double multiplicacao(double a, double b) {
		return a * b;
	}
	
	private static double divisao(double a, double b) {
		return a / b;
	}
 }
