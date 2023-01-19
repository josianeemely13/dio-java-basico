package br.com.dio.javabasico.teste;

import java.util.Scanner;

public class MediaDeIdade {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);

		int idade1 = leitor.nextInt();
		int idade2 = leitor.nextInt();
		int idade3 = leitor.nextInt();

		int soma = idade1 + idade2 + idade3;
		int media = soma / 3;

		if (media <= 22) {
			System.out.println("Jovem!");
		} else if (media > 22 && media < 60) {
			System.out.println("Adulta!");
		} else {
			System.out.println("Idosa!");
		}
	}

}
