package trabalho_01;

import java.util.Scanner;

public class Atv_10 {
	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		double vetor[] = new double[4];
		double soma = 0;
		double media = 0;
		
		System.out.println("Digite as suas notas!");
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Digite a sua nota. ");
			vetor[i] = scam.nextInt();
			soma += vetor[i];
		}
		
		media = soma / vetor.length;
		
		if(media >= 70.0) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado.");
		}
		
//		exercicio 11 e 12
		
		for(double v : vetor) {
			if(v >= 70.00) {
				System.out.println("A nota " + v + " está acima da média.");
			} else {
				System.out.println("A nota " + v + " não está acima da média.");
			}
			
		}
	}
}
