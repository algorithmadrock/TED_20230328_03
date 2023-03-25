/*
RESUMO      : Conversor de números decimais para binários usando a diivisão por 2
PROGRAMADORA: Luiza Felix
DATA        : 25/03/2023
 */

package controller;

import br.edu.fateczl.pilhas.IntPilha;

public class Conversor {

	public Conversor() {

	}

	public String DEZtoDOIS(int decimal) throws Exception {
		IntPilha pilha = new IntPilha();
		while (decimal != 0) {
			pilha.push(decimal % 2);
			decimal /= 2; // decimal = decimal/2
		}

		if (pilha.top() == 0) {
			pilha.pop();
		}

		return pilha.toString();

	}

}
