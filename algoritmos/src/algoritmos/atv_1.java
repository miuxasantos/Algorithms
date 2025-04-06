package algoritmos;

import javax.swing.JOptionPane;

public class atv_1 {
	
	public static void main(String[] args) {
		int vetor[] = new int[10];
		int i;
		
		for (i=0; i<10; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro: "));
		}
		
		
		for (i=9; i>=0; i--) {
			System.out.println("O valor é: " + vetor[i]);
		}
		
	}
}
