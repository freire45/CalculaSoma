package br.com.erickfreire.calculasoma;

import java.util.Scanner;

/**
 * Desenvolva um programa de computador que efetue a leitura de dois valores numéricos inteiros. 
 * Processe a operação de adição dos dois valores e apresente na sequência a soma obtida com a operação.
 * @author Erick Freire
 * @version 1 - Criada em 11-05-2021 as 00:59
 */

public class CalculaSoma {
	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		int soma;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que calcula a soma de dois valores: ");
		
		System.out.print("Digite o primeiro valor: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		numero2 = entrada.nextInt();
		
		soma = numero1 + numero2;
		
		System.out.println("O valor da soma é de: " + soma);
		
	}

}
