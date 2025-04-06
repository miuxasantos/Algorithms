package algoritmos;

import javax.swing.JOptionPane;

public class atv_4 {

	public static void main (String[] args) {
		int vetor[] = new int[10];
		int i;
		int soma= 0;
		Float media;
		
		for(i=0; i<10; i++){
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
			soma += vetor[i];
		}
		
//		for(int v : vetor) {
//			soma += v;
//		}
		
		media = (float) soma / 10;
		
		System.out.println("A média é: " + media);
	}
	
}
