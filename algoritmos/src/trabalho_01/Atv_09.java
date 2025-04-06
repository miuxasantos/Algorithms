package trabalho_01;

import java.util.Scanner;

public class Atv_09 {
	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		int vetor[] = new int[10];
		int i;
		boolean encontrado = false;
		int posicao = 0;
		
		System.out.println("Digite 10 números");

		for (i = 0; i < 10; i++) {
			System.out.println("Digite o valor da posição " + i + ": ");
			vetor[i] = scam.nextInt();
			if (vetor[i] == 2) {
				encontrado = true;
				posicao = vetor[i];
			}
		}

		if (encontrado) {
			System.out.println("O valor 2 está localizado na posição: " + posicao);
		} else {
			System.out.println("O valor 2 não foi encontrado.");
		}

	}
}
