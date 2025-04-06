package algoritmos;

import javax.swing.JOptionPane;

public class atv_3 {

	public static void main(String[] args) {
		int vetor[] = new int[10];
		int i;
		
		for(i=0; i<10; i++){
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
		}
		
		int menorNum = vetor[0];
		int maiorNum = vetor[0];
		
		for(i= 0; i<10; i++) {
			if(vetor[i] < menorNum) {
				menorNum = vetor[i];
			}
			
			if(vetor[i] > maiorNum) {
				maiorNum = vetor[i];
			}
			
		}
		
		System.out.println(menorNum + ", " + maiorNum);
		
		
	}
}
