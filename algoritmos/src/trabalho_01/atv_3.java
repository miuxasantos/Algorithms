package trabalho_01;

import java.util.Arrays;
import java.util.Scanner;

public class atv_3 {
	
	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		int vetor[] = new int[10];
		int i;
		
		System.out.println("Preciso que digite 10 números");
		System.out.print("");
		for(i=0; i<10; i++) {
			System.out.print("Digite o número da posição " + i + ": ");
			vetor[i] = scam.nextInt();
			System.out.println(vetor[i]);
		}
		
		System.out.println(Arrays.toString(vetor));
		
		scam.close();
	}
}
