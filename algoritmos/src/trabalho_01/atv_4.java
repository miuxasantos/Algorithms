package trabalho_01;

import java.util.Arrays;
import java.util.Scanner;

public class atv_4 {

	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		double vetor[] = new double[10];
		double vetorCopia[] = new double[10];
		double vetorTres[] = new double[10];
		int i;
		double soma= 0d;
		double media;
		
		System.out.println("Preciso que digite 10 números");
		for(i=0; i<10; i++) {
			System.out.print("Digite o número da posição " + i + ": ");
			vetor[i] = scam.nextDouble();
		}
		
		System.out.println(Arrays.toString(vetor));
		
		scam.close();
		
		for(i=0; i<10; i++) {
			vetorCopia[i] = Math.pow(vetor[i], 2);
//			ou vetorTres[i]= vetor[i] * vetor[i];			
		}
		
		System.out.println(Arrays.toString(vetorCopia));
		
//		exercicio 5
		
		for(double vc : vetorCopia) {
			soma += vc;
		}
		
		media = soma / vetorCopia.length;
		
		System.out.println("A média é: " + media);
		
//		exercicio 6
		
		for(i=0; i<10; i++) {
			vetorTres[i] = Math.pow(vetor[i], 3);
//			ou vetorTres[i]= vetor[i] * vetor[i] * vetor[i];
			for(double vt : vetorTres) {
				soma += vt;
			}
		}
		
		media = soma / vetorTres.length;
		
		System.out.println("Vetor ao cubo: "+ Arrays.toString(vetorTres) + "\nA média é ao cubo é: " + media);
		
	}
	
}
