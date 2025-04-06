package trabalho_01;

import java.util.Arrays;

public class atv_1 {
	
	public static void main(String[] args) {
		int vetor[] = {1, 2, 3, 4, 5};
		
		System.out.println(Arrays.toString(vetor));
		
// 		exercicio 2
		
		for(int i=4; i>=0; i--) {
			System.out.println("Ordem inversa: " + vetor[i]);
		}
		
	}
}
