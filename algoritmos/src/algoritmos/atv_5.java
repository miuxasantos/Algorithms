package algoritmos;

import javax.swing.JOptionPane;

public class atv_5 {
	
	public static void main(String[] args) {
		int vetor[] = new int[10];
		int vetorCopia[] = new int[vetor.length];
		int i;
		
		for(i=0; i<10; i++){
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
			vetorCopia[i] = vetor[i];
			System.out.println(vetorCopia[i]);
		}
		
//		for(i=0; i<vetor.length; i++) {
//			vetorCopia[i] = vetor[i];
//		}
//		
//		for(i=0; i<10; i++) {
//			System.out.println(vetorCopia[i]);
//		}
	}
}
