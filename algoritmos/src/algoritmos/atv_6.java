package algoritmos;

import javax.swing.JOptionPane;

public class atv_6 {

	public static void main(String[] args) {
		int vetor[] = new int[10];
		int i;
		double soma = 0d;
		double media = 0d;
		int contador = 0;
		
		for(i=0; i<10; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
			if(vetor[i]%2==0) {
				soma += vetor[i];
				contador++;
			} 
		}
		
		
//		for(i=0; i<10; i++){
//			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
//			if(vetor[i]%2==0) {
//				vetorPar[i] = vetor[i];
//				soma += vetorPar[i];
//			}
//			contador++;
//		}
		
		media = soma / contador;
		
		System.out.println(soma + ", "+ media);
	}
}
