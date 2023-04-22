package Lista_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {

	/*5. Implemente um programa que leia uma quantidade não determinada 
	 * de números positivos. Calcule a quantidade de números pares e 
	 * ímpares, a média de valores pares e a média geral dos números 
	 * lidos. O número que encerrará a leitura será zero.
	 */
	
	protected ArrayList<Integer> valorRecebido;
	protected int qtdPar= 0;
	protected int qtdImpar = 0;
	protected double mediaPares= 0.0;
	protected double mediaGeral= 0.0;
	
	public Ex5 () {
		this.valorRecebido = new ArrayList<Integer>();
	}
	
	public void receberValor() {
		Scanner input = new Scanner(System.in);

		int numero;

        do {
            System.out.println("Digite um número (ou zero para encerrar): ");
            numero = input.nextInt();

            if (numero != 0) {
                valorRecebido.add(numero);
            }
        } while (numero != 0); // fim for
	}// FIM METODO
	
	public void qtdParImpar(ArrayList<Integer> valorRecebido) {
		
		for (int numero : valorRecebido) {
            if (numero % 2 == 0) {
                qtdPar++;
            } else {
            	qtdImpar++;
            }// fim if else
        }//fim for
	}// FIM METODO
	
	public void mediaParGeral(ArrayList<Integer> valorRecebido) {
		int soma = 0;

        for (int numero : valorRecebido) {
            soma += numero;

            if (numero % 2 == 0) {
                this.mediaPares += numero;
            }
        }

        mediaGeral = (double) soma / valorRecebido.size();

        if (qtdPar > 0) {
        	mediaPares /= qtdPar;
        }
	}// FIM METODO
	
	public void exibirResultados() {
		if (valorRecebido.isEmpty()) {
	        System.out.println("Nenhum valor foi informado.");
	        return;
	    }

	    System.out.println("\nValores informados: " + valorRecebido);
	    System.out.println("Quantidade de números pares: " + qtdPar);
	    System.out.println("Quantidade de números ímpares: " + qtdImpar);
	    System.out.println("Média geral: " + mediaGeral);
	    System.out.println("Média dos números pares: " + mediaPares);
	}// FIM METODO
	
}











