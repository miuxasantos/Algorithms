package trabalho_01;

import java.util.Arrays;
import java.util.Random;

public class atv_7 {
	public static void main(String[] args) {
		Random random = new Random();
		int numeros[]= new int[15];
		int numerosPar;
		int numerosImpar;
		int somaPar= 0;
		int somaImpar= 0;
		
		for(int i=0; i<15; i++) {
			numeros[i] = random.nextInt(50);
			if(numeros[i]%2==0) {
				somaPar += numeros[i];
			} else {
				somaImpar += numeros[i];
			}
		}
		
		System.out.println("Vetor: " + Arrays.toString(numeros) + "\nSoma Par: " 
				+ somaPar + "\nSoma Impar: " + somaImpar);
		
	}
	
}
