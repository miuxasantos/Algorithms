package trabalho_01;

import java.util.Random;

public class Atv_08 {
	public static void main(String[] args) {
		Random random = new Random();
		int vetor[] = new int[15];
		int par = 0;
		int impar = 0;
		
		for(int i=0; i<15; i++) {
			vetor[i] = random.nextInt(50);
			if(vetor[i]%2==0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("Par: " + par + " Impar: " + impar);
		
	}
}
