/*
RESUMO      : Conversor de números decimais para binários usando a diivisão por 2
PROGRAMADORA: Luiza Felix
DATA        : 25/03/2023
 */

package view;



import javax.swing.JOptionPane;

import controller.Conversor;

public class Principal {
	public static void main(String[] args) throws Exception {
		
		Conversor conversor = new Conversor();
		int numero = 0;
		do {
			if(numero > 1000 || numero < 0) {
				System.err.println("ERRO: Digite um numero valido!");
			}
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número decimal para a conversão (limitado ao intervalo de 0 e 1000)"));
		}while(numero > 1000 || numero < 0);
		
		JOptionPane.showMessageDialog(null, "CONVERSÃO PARA BINÁRIO:  "+numero +" → " + conversor.DEZtoDOIS(numero));
		
	}
}
