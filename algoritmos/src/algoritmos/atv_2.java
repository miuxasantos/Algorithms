package algoritmos;

import javax.swing.JOptionPane;

public class atv_2 {

	public static void main(String[] args) {
		int vetor[] = new int[10];
		int i;
		int soma= 0;
		
		for(i=0; i<10; i++){
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
			soma += vetor[i];
		}
		
//		for(i=0; i<10; i++){
//			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
//		}
//		
//		for(int v : vetor) {
//			soma += v;
//		}
		
		System.out.println(soma);
	}
}
