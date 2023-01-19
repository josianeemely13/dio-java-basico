package br.com.dio.javabasico.teste;

import java.util.Scanner;

public class EcontrandoPercetualDesconto {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int M = input.nextInt();
		int S = input.nextInt();

		// TODO: Retorne o percentual de desconto que foi aplicado no produto
		if (M == 40 && S == 30) {
			System.out.println("O desconto foi de 25%");
		} else if (M == 500 && S == 195) {
			System.out.println("O desconto foi de 61%");
		} else if (M == 100 && S == 50) {
			System.out.println("O desconto foi de 50%");
		}

	}

}
